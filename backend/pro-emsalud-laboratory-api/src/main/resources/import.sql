
-- ============
-- Test Category
-- ============


INSERT INTO test_category (name, active, created_at, updated_at)VALUES ('SANGUINEO', 0, '2026-03-21 09:15:00', '2026-03-21 09:15:00');

INSERT INTO test_category (name, active, created_at, updated_at)VALUES ('HEMOGRAMA', 1, '2026-03-21 09:15:00', '2026-03-21 09:15:00');

INSERT INTO test_category (name, active, created_at, updated_at)VALUES ('SEROLOGIA', 1, '2026-03-21 09:15:00', '2026-03-21 09:15:00');

INSERT INTO test_category (name, active, created_at, updated_at)VALUES ('HECES', 1, '2026-03-21 09:15:00', '2026-03-21 09:15:00');

INSERT INTO test_category (name, active, created_at, updated_at)VALUES ('QUIMICAS', 1, '2026-03-21 09:15:00', '2026-03-21 09:15:00');

-- ============
-- Tests
-- ============
INSERT INTO test (name, test_type, reference, price, active, created_at, updated_at, test_category_id)VALUES ('sanguineo', 'RAPID', NULL, 20.30, 1,  '2026-03-21 09:15:00', '2026-03-22 09:15:00', 1);
INSERT INTO test (name, test_type, reference, price, active, created_at, updated_at, test_category_id)VALUES ('hemoglobina', 'QUANTITATIVE', '11.5 - 16.5 g/dl', 20.30, 1,  '2026-04-21 09:15:00', '2026-04-24 09:15:00', 2);
INSERT INTO test (name, test_type, reference, price, active, created_at, updated_at, test_category_id)VALUES ('proteina c reactiva (PCR)', 'QUANTITATIVE', 'menor a 10 mg/L', 10.30, 1,  '2026-05-21 09:15:00', '2026-05-28 09:15:00', 3);
INSERT INTO test (name, test_type, reference, price, active, created_at, updated_at, test_category_id)VALUES ('chicongunya / IgM', 'RAPID', NULL, 5.30, 1,  '2026-06-21 09:15:00', '2026-06-22 09:15:00', 3);
INSERT INTO test (name, test_type, reference, price, active, created_at, updated_at, test_category_id)VALUES ('dengue IgG', 'RAPID', NULL, 8.30, 1,  '2026-07-15 09:15:00', '2026-07-20 09:15:00', 3);
INSERT INTO test (name, test_type, reference, price, active, created_at, updated_at, test_category_id)VALUES ('helicobacter pylori (sangre)', 'RAPID', NULL, 11.30, 1,  '2026-08-01 09:15:00', '2026-08-10 09:15:00', 4);
INSERT INTO test (name, test_type, reference, price, active, created_at, updated_at, test_category_id)VALUES ('TGP (ALT)', 'QUANTITATIVE', 'hasta 35 U/L', 16.30, 1,  '2026-09-18 09:15:00', '2026-09-26 09:15:00', 5);
