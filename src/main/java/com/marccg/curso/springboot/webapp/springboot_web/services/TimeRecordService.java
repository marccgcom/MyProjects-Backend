package com.marccg.curso.springboot.webapp.springboot_web.services;

import com.marccg.curso.springboot.webapp.springboot_web.Models.TimeRecord;
import com.marccg.curso.springboot.webapp.springboot_web.repositories.TimeRecordRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class TimeRecordService {

    private final TimeRecordRepository timeRecordRepository;

    public TimeRecordService(TimeRecordRepository timeRecordRepository) {
        this.timeRecordRepository = timeRecordRepository;
    }

    public Page<TimeRecord> findAll(Pageable pageable) {
        return timeRecordRepository.findAll(pageable);
    }

    public Optional<TimeRecord> findById(Long id) {
        return timeRecordRepository.findById(id);
    }

    public TimeRecord save(TimeRecord task) {
        return timeRecordRepository.save(task);
    }

    public void deleteById(Long id) {
        timeRecordRepository.deleteById(id);
    }
}
