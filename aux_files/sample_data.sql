INSERT INTO public.client (id, name) VALUES
(1, 'Chang-Fisher'),
(2, 'Sheppard-Tucker'),
(3, 'Faulkner-Howard'),
(4, 'Wagner LLC'),
(5, 'Campos PLC'),
(6, 'Archer-Patel'),
(7, 'Patrick, Barrera and Collins'),
(8, 'Jones, Jefferson and Rivera'),
(9, 'Garcia, Hamilton and Carr'),
(10, 'Levy Group');
INSERT INTO public.users (id, email, name) VALUES
(1, 'bryan80@gmail.com', 'Jennifer Summers'),
(2, 'vclayton@cross.com', 'Keith Allen'),
(3, 'udavis@bolton.com', 'Kimberly Olsen'),
(4, 'sean96@johnston-roberts.com', 'Amanda Zavala'),
(5, 'rjones@gmail.com', 'Tammy Kirby'),
(6, 'aimee33@hotmail.com', 'Tiffany Riley'),
(7, 'skeller@yahoo.com', 'Louis Tucker'),
(8, 'johndennis@gmail.com', 'Jacqueline Jackson'),
(9, 'garciadustin@hotmail.com', 'Robert Walters'),
(10, 'martinezjacob@wilson.com', 'Alex Woodward');
INSERT INTO public.status (id, name) VALUES
(1, 'Status 1'),
(2, 'Status 2'),
(3, 'Status 3'),
(4, 'Status 4'),
(5, 'Status 5');
INSERT INTO public.task_type (id, name) VALUES
(1, 'TaskType 1'),
(2, 'TaskType 2'),
(3, 'TaskType 3'),
(4, 'TaskType 4'),
(5, 'TaskType 5');
INSERT INTO public.project (id, name, client_id) VALUES
(1, 'Reinvent 24/7 info-mediaries', 7),
(2, 'Architect leading-edge methodologies', 7),
(3, 'Utilize cutting-edge e-business', 1),
(4, 'Transform back-end partnerships', 5),
(5, 'Enhance intuitive experiences', 9),
(6, 'Monetize cross-media e-commerce', 8),
(7, 'Reinvent leading-edge mindshare', 7),
(8, 'Target revolutionary metrics', 5),
(9, 'Transform impactful solutions', 8),
(10, 'Morph synergistic info-mediaries', 6);
INSERT INTO public.project_responsible_users (project_id, responsible_users_id) VALUES
(10, 4),
(9, 3),
(5, 3),
(2, 10),
(5, 9),
(10, 3),
(5, 2),
(2, 6),
(8, 9),
(2, 6),
(7, 6),
(10, 4),
(9, 8),
(8, 9),
(5, 1),
(9, 1),
(2, 7),
(1, 10),
(8, 6),
(4, 6);
INSERT INTO public.task (id, name, real_total_time, scheduled_total_time, project_id, status_id, task_type_id) VALUES
(1, 'Re-contextualized composite standardization', 70.66, 7.24, 10, 2, 2),
(2, 'Synergistic demand-driven throughput', 80.53, 15.11, 9, 4, 1),
(3, 'Centralized zero tolerance service-desk', 8.96, 32.69, 9, 4, 1),
(4, 'Diverse cohesive Graphical User Interface', 30.84, 29.82, 2, 5, 3),
(5, 'Progressive eco-centric capability', 81.63, 54.49, 10, 5, 5),
(6, 'Right-sized leadingedge secured line', 29.48, 10.07, 7, 3, 5),
(7, 'Enhanced 24/7 leverage', 24.97, 19.2, 3, 1, 5),
(8, 'Synergized incremental open system', 98.15, 26.75, 2, 1, 2),
(9, 'Profound fault-tolerant projection', 87.8, 92.41, 2, 5, 4),
(10, 'Multi-channeled human-resource protocol', 83.95, 52.93, 9, 2, 2),
(11, 'Function-based coherent open architecture', 89.61, 59.39, 7, 5, 3),
(12, 'Team-oriented 24/7 knowledgebase', 45.61, 66.36, 6, 1, 3),
(13, 'User-centric attitude-oriented groupware', 61.67, 49.16, 6, 2, 2),
(14, 'User-centric 6thgeneration moratorium', 2.6, 27.83, 4, 3, 2),
(15, 'Grass-roots client-driven encoding', 33.92, 81.78, 2, 2, 2),
(16, 'Virtual mission-critical help-desk', 5.48, 57.81, 9, 5, 1),
(17, 'Seamless executive service-desk', 3.64, 63.86, 10, 5, 1),
(18, 'Multi-channeled optimizing productivity', 39.73, 37.64, 2, 1, 5),
(19, 'Secured clear-thinking structure', 3.14, 96.14, 3, 1, 4),
(20, 'Integrated human-resource synergy', 21.85, 80.27, 1, 5, 4),
(21, 'Operative solution-oriented artificial intelligence', 62.44, 83.75, 2, 2, 1),
(22, 'Adaptive radical core', 65.05, 35.68, 3, 1, 5),
(23, 'Total full-range complexity', 47.25, 60.05, 7, 2, 3),
(24, 'Front-line directional productivity', 36.5, 73.43, 10, 2, 2),
(25, 'Organized homogeneous strategy', 96.69, 6.75, 3, 2, 3);
INSERT INTO public.task_assigned_users (task_id, assigned_users_id) VALUES
(17, 5),
(4, 10),
(15, 3),
(1, 8),
(22, 7),
(19, 9),
(10, 6),
(13, 5),
(5, 9),
(23, 1),
(15, 2),
(11, 1),
(18, 5),
(5, 4),
(25, 8),
(12, 10),
(10, 6),
(19, 10),
(5, 5),
(13, 7),
(21, 2),
(1, 10),
(7, 6),
(6, 4),
(8, 8),
(13, 10),
(14, 1),
(13, 10),
(14, 1),
(6, 8);
INSERT INTO public.time_record (id, datetime, dedicated_hours, task_id) VALUES
(1, '2025-05-08 20:47:04', 2.44, 6),
(2, '2025-04-26 20:47:04', 4.46, 16),
(3, '2025-04-11 20:47:04', 4.71, 25),
(4, '2025-05-10 20:47:04', 7.13, 16),
(5, '2025-04-30 20:47:04', 2.84, 15),
(6, '2025-05-09 20:47:04', 6.57, 14),
(7, '2025-05-04 20:47:04', 4.61, 21),
(8, '2025-05-08 20:47:04', 6.78, 5),
(9, '2025-05-10 20:47:04', 3.51, 22),
(10, '2025-04-27 20:47:04', 2.87, 7),
(11, '2025-05-10 20:47:04', 5.88, 1),
(12, '2025-04-14 20:47:04', 5.57, 20),
(13, '2025-05-07 20:47:04', 1.93, 20),
(14, '2025-04-20 20:47:04', 1.99, 10),
(15, '2025-05-02 20:47:04', 5.66, 6),
(16, '2025-05-07 20:47:04', 4.07, 13),
(17, '2025-04-20 20:47:04', 1.11, 9),
(18, '2025-04-11 20:47:04', 3.9, 4),
(19, '2025-04-13 20:47:04', 2.42, 21),
(20, '2025-04-24 20:47:04', 6.63, 21),
(21, '2025-04-29 20:47:04', 1.36, 5),
(22, '2025-05-02 20:47:04', 6.88, 2),
(23, '2025-05-09 20:47:04', 2.04, 9),
(24, '2025-04-23 20:47:04', 2.86, 12),
(25, '2025-04-10 20:47:04', 4.76, 2),
(26, '2025-04-13 20:47:04', 6.12, 23),
(27, '2025-04-21 20:47:04', 5.42, 23),
(28, '2025-04-20 20:47:04', 7.27, 21),
(29, '2025-04-27 20:47:04', 3.29, 18),
(30, '2025-05-05 20:47:04', 2.06, 19),
(31, '2025-05-01 20:47:04', 0.57, 5),
(32, '2025-05-02 20:47:04', 3.0, 12),
(33, '2025-04-18 20:47:04', 1.2, 25),
(34, '2025-04-21 20:47:04', 0.77, 9),
(35, '2025-05-05 20:47:04', 1.62, 19),
(36, '2025-05-01 20:47:04', 3.21, 18),
(37, '2025-05-06 20:47:04', 2.7, 16),
(38, '2025-04-17 20:47:04', 2.3, 2),
(39, '2025-05-01 20:47:04', 1.85, 17),
(40, '2025-04-17 20:47:04', 1.03, 13),
(41, '2025-04-14 20:47:04', 2.96, 14),
(42, '2025-05-07 20:47:04', 1.25, 16),
(43, '2025-04-25 20:47:04', 3.03, 11),
(44, '2025-05-07 20:47:04', 4.09, 23),
(45, '2025-04-25 20:47:04', 3.7, 10),
(46, '2025-04-30 20:47:04', 6.01, 5),
(47, '2025-04-11 20:47:04', 1.75, 19),
(48, '2025-04-28 20:47:04', 6.55, 21),
(49, '2025-05-08 20:47:04', 0.99, 3),
(50, '2025-05-04 20:47:04', 6.12, 2);
