
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
INSERT INTO test (name, test_type, reference, price, active, created_at, updated_at, test_category_id)VALUES ('TGP (ALT)', 'QUANTITATIVE', 'hasta 35 U/L', 16.30, 0,  '2026-09-18 09:15:00', '2026-09-26 09:15:00', 5);

-- ============
-- Patients
-- ============
INSERT INTO patients (code, gender, first_name, middle_name, father_last_name, mother_last_name, date_of_birth, primary_phone_number, optional_phone_number, city, created_at, updated_at) VALUES ('PAC-000001', 'MALE', 'Carlos', 'Alberto', 'Gómez', 'López', '1990-05-15', '55123456', '+50222345678', 'Guatemala', '2026-01-10 08:30:00', '2026-03-22 09:15:00');

INSERT INTO patients (code, gender, first_name, middle_name, father_last_name, mother_last_name, date_of_birth, primary_phone_number, optional_phone_number, city, created_at, updated_at) VALUES ('PAC-000002', 'FEMALE', 'María', 'Isabel', 'Hernández', 'Pérez', '1985-09-22', '41234567', '+50224567890', 'Quetzaltenango', '2026-01-15 10:20:00', '2026-03-18 14:45:00');

INSERT INTO patients (code, gender, first_name, middle_name, father_last_name, mother_last_name, date_of_birth, primary_phone_number, optional_phone_number, city, created_at, updated_at) VALUES ('PAC-000003', 'MALE', 'Juan', 'José', 'Ramírez', 'Castillo', '1978-02-10', '51234567', NULL, 'Escuintla', '2026-02-01 11:10:00', '2026-03-20 16:30:00');

INSERT INTO patients (code, gender, first_name, middle_name, father_last_name, mother_last_name, date_of_birth, primary_phone_number, optional_phone_number, city, created_at, updated_at) VALUES ('PAC-000004', 'FEMALE', 'Ana', 'Lucía', 'Morales', 'García', '1995-11-03', '32345678', '+50278345678', 'Antigua Guatemala', '2026-02-12 09:00:00', '2026-03-10 13:25:00');

INSERT INTO patients (code, gender, first_name, middle_name, father_last_name, mother_last_name, date_of_birth, primary_phone_number, optional_phone_number, city, created_at, updated_at) VALUES ('PAC-000005', 'MALE', 'Pedro', 'Alejandro', 'Martínez', 'Fuentes', '2026-08-15', '45345678', NULL, 'Cobán', '2026-03-05 15:40:00', '2026-03-22 09:15:00');
