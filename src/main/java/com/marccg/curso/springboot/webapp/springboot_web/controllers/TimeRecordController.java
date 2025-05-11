package com.marccg.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marccg.curso.springboot.webapp.springboot_web.Models.TimeRecord;
import com.marccg.curso.springboot.webapp.springboot_web.services.TimeRecordService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;


@RestController
@RequestMapping("/api/time_records")
public class TimeRecordController {
    
    private final TimeRecordService timeRecordService;

    public TimeRecordController(TimeRecordService timeRecordService) {
        this.timeRecordService = timeRecordService;
    }

    @GetMapping
    public Page<TimeRecord> getAllTimeRecords(@PageableDefault(size = 10, sort = "id") Pageable pageable) {
        return timeRecordService.findAll(pageable);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TimeRecord> getTimeRecordById(@PathVariable Long id) {
        return timeRecordService.findById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TimeRecord createTimeRecord(@RequestBody TimeRecord timerRecord) {
        return timeRecordService.save(timerRecord);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TimeRecord> updateTimeRecord(@PathVariable Long id, @RequestBody TimeRecord updatedTimeRecord) {
        return timeRecordService.findById(id).map(timeRecord -> {
            timeRecord.setDatetime(updatedTimeRecord.getDatetime());
            timeRecord.setDedicatedHours(updatedTimeRecord.getDedicatedHours());
            return ResponseEntity.ok(timeRecordService.save(timeRecord));
        })
        .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTimeRecord(@PathVariable Long id) {
        if (timeRecordService.findById(id).isPresent()) {
            timeRecordService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
    
}
