use dbsimi;

-- ------------------------------------------------------------
-- INSERT INTO TMSEDE
-- ------------------------------------------------------------
INSERT INTO `tmsede` (NOM_SEDE, DESC_SEDE, DIR_SEDE)  VALUES ('Sede de Ciudad Universitaria','Ciudad Universitaria','Calle Germán Amézaga N° 375 - Facultad de Letras y Ciencias Humanas');
INSERT INTO `tmsede` (NOM_SEDE, DESC_SEDE, DIR_SEDE)  VALUES ('Sede de San Juan de Lurigancho','San Juan de Lurigancho','Av. Fernando Wiesse KM 10.5 (complejo IPD - Bayovar) - SJL');

-- ------------------------------------------------------------
-- IONSERT INTO TMAULA
-- ------------------------------------------------------------
INSERT INTO `tmaula` (NOM_AULA, REF_AULA, FK_ID_SEDE) VALUES ('101', 'Primer piso', 1);
INSERT INTO `tmaula` (NOM_AULA, REF_AULA, FK_ID_SEDE) VALUES ('102', 'Primer piso', 1);
INSERT INTO `tmaula` (NOM_AULA, REF_AULA, FK_ID_SEDE) VALUES ('103', 'Primer piso', 1);
INSERT INTO `tmaula` (NOM_AULA, REF_AULA, FK_ID_SEDE) VALUES ('104', 'Primer piso', 1);
INSERT INTO `tmaula` (NOM_AULA, REF_AULA, FK_ID_SEDE) VALUES ('105', 'Primer piso', 1);

-- ------------------------------------------------------------
-- INSERT INTO NIVEL
-- ------------------------------------------------------------
INSERT INTO `txnivel`(NOM_NIVEL) VALUES ('Basico');
INSERT INTO `txnivel`(NOM_NIVEL) VALUES ('Intermedio');
INSERT INTO `txnivel`(NOM_NIVEL) VALUES ('Avanzado');
INSERT INTO `txnivel`(NOM_NIVEL) VALUES ('Posgrado');

-- INSERT INTO IDIOMA
INSERT INTO `tmidioma`(NOM_IDIOMA, DESC_IDIOMA) VALUES ('Ingles', 'El inglés es considerado uno de los idiomas más importantes para la comunicación debido a su presencia universal');
INSERT INTO `tmidioma`(NOM_IDIOMA, DESC_IDIOMA) VALUES ('Portugues', 'El portugués es un idioma de gran presencia en Sudamérica y parte de Europa');
INSERT INTO `tmidioma`(NOM_IDIOMA, DESC_IDIOMA) VALUES ('Frances', 'El francés es una de las lenguas más prestigiosas por sus avances científicos');
INSERT INTO `tmidioma`(NOM_IDIOMA, DESC_IDIOMA) VALUES ('Italiano', 'El italiano es una de las lenguas que recoge el legado de la cultura romana');
INSERT INTO `tmidioma`(NOM_IDIOMA, DESC_IDIOMA) VALUES ('Quechua', 'El quechua es la lengua originaria más representativa de nuestro país. Su importancia radica en mantener la identidad ancestral');
INSERT INTO `tmidioma`(NOM_IDIOMA, DESC_IDIOMA) VALUES ('Aleman', 'El idioma alemán en uno de los más imponentes en Europa por su presencia en el sector económico, científico y comercial');
INSERT INTO `tmidioma`(NOM_IDIOMA, DESC_IDIOMA) VALUES ('Coreano', 'El idioma coreano en los últimos años se ha vuelto importante debido a su presencia en la economía mundial');
INSERT INTO `tmidioma`(NOM_IDIOMA, DESC_IDIOMA) VALUES ('Japones', 'La potencia económica de Japón hace que su idioma sea importante en el campo de la tecnología y del comercio internacional');

-- ------------------------------------------------------------
-- Insert curso
-- --------------------------------------------------------------
-- Inglés
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 1, 1, 'English File: Elementary 3rd Edition (6), English File: Pre intermediate (6)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 1, 2, 'English File: Elementary 3rd Edition (6), English File: Pre intermediate (6)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 1, 3, 'English File: Elementary 3rd Edition (6), English File: Pre intermediate (6)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 1, 4, 'English File: Elementary 3rd Edition (6), English File: Pre intermediate (6)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 1, 5, 'English File: Elementary 3rd Edition (6), English File: Pre intermediate (6)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 1, 6, 'English File: Elementary 3rd Edition (6), English File: Pre intermediate (6)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 1, 7, 'English File: Elementary 3rd Edition (6), English File: Pre intermediate (6)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 1, 8, 'English File: Elementary 3rd Edition (6), English File: Pre intermediate (6)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 1, 9, 'English File: Elementary 3rd Edition (6), English File: Pre intermediate (6)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 1, 10, 'English File: Elementary 3rd Edition (6), English File: Pre intermediate (6)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 1, 11, 'English File: Elementary 3rd Edition (6), English File: Pre intermediate (6)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 1, 12, 'English File: Elementary 3rd Edition (6), English File: Pre intermediate (6)');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 2, 1, 'English File: Intermediate (5), English File: Upper-intermediate (5)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 2, 2, 'English File: Intermediate (5), English File: Upper-intermediate (5)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 2, 3, 'English File: Intermediate (5), English File: Upper-intermediate (5)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 2, 4, 'English File: Intermediate (5), English File: Upper-intermediate (5)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 2, 5, 'English File: Intermediate (5), English File: Upper-intermediate (5)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 2, 6, 'English File: Intermediate (5), English File: Upper-intermediate (5)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 2, 7, 'English File: Intermediate (5), English File: Upper-intermediate (5)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 2, 8, 'English File: Intermediate (5), English File: Upper-intermediate (5)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 2, 9, 'English File: Intermediate (5), English File: Upper-intermediate (5)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 2, 10, 'English File: Intermediate (5), English File: Upper-intermediate (5)');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 3, 1, 'English File: Advanced');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 3, 2, 'English File: Advanced');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 3, 3, 'English File: Advanced');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 3, 4, 'English File: Advanced');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 3, 5, 'English File: Advanced');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 3, 6, 'English File: Advanced');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 3, 7, 'English File: Advanced');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 3, 8, 'English File: Advanced');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 4, 1, 'Smart Choice 1 y 2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 4, 2, 'Smart Choice 1 y 2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 4, 3, 'Smart Choice 1 y 2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 4, 4, 'Smart Choice 1 y 2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 4, 5, 'Smart Choice 1 y 2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 4, 6, 'Smart Choice 1 y 2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 4, 7, 'Smart Choice 1 y 2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (1, 4, 8, 'Smart Choice 1 y 2');
-- Portugués
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 1, 1, 'Ben vindo! (Libro + cuaderno de ejercicios)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 1, 2, 'Ben vindo! (Libro + cuaderno de ejercicios)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 1, 3, 'Ben vindo! (Libro + cuaderno de ejercicios)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 1, 4, 'Ben vindo! (Libro + cuaderno de ejercicios)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 1, 5, 'Ben vindo! (Libro + cuaderno de ejercicios)');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 2, 1, 'Ben vindo! (Libro + cuaderno de ejercicios)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 2, 2, 'Ben vindo! (Libro + cuaderno de ejercicios)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 2, 3, 'Ben vindo! (Libro + cuaderno de ejercicios)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 2, 4, 'Ben vindo! (Libro + cuaderno de ejercicios)');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 3, 1, 'Ben vindo! (Libro + cuaderno de ejercicios)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 3, 2, 'Ben vindo! (Libro + cuaderno de ejercicios)');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 3, 3, 'Ben vindo! (Libro + cuaderno de ejercicios)');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 4, 1, 'Fale Português 1 y 2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 4, 2, 'Fale Português 1 y 2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 4, 3, 'Fale Português 1 y 2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 4, 4, 'Fale Português 1 y 2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 4, 5, 'Fale Português 1 y 2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (2, 4, 6, 'Fale Português 1 y 2');
-- Francés
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 1, 1, 'Alter Ego Plus 1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 1, 2, 'Alter Ego Plus 1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 1, 3, 'Alter Ego Plus 1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 1, 4, 'Alter Ego Plus 1');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 2, 1, 'Alter Ego Plus 2 , Alter Ego Plus 3');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 2, 2, 'Alter Ego Plus 2 , Alter Ego Plus 3');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 2, 3, 'Alter Ego Plus 2 , Alter Ego Plus 3');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 2, 4, 'Alter Ego Plus 2 , Alter Ego Plus 3');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 2, 5, 'Alter Ego Plus 2 , Alter Ego Plus 3');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 2, 6, 'Alter Ego Plus 2 , Alter Ego Plus 3');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 2, 7, 'Alter Ego Plus 2 , Alter Ego Plus 3');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 2, 8, 'Alter Ego Plus 2 , Alter Ego Plus 3');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 3, 1, 'Alter Ego Plus 4');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 3, 2, 'Alter Ego Plus 4');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 3, 3, 'Alter Ego Plus 4');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (3, 3, 4, 'Alter Ego Plus 4');
-- Italiano
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (4, 1, 1, 'Nuovo Progetto Italiano');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (4, 1, 2, 'Nuovo Progetto Italiano');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (4, 1, 3, 'Nuovo Progetto Italiano');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (4, 1, 4, 'Nuovo Progetto Italiano');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (4, 1, 5, 'Nuovo Progetto Italiano');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (4, 1, 6, 'Nuovo Progetto Italiano');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (4, 2, 1, 'Nuovo Progetto Italiano');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (4, 2, 2, 'Nuovo Progetto Italiano');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (4, 2, 3, 'Nuovo Progetto Italiano');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (4, 3, 1, 'Nuovo Progetto Italiano');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (4, 3, 2, 'Nuovo Progetto Italiano');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (4, 3, 3, 'Nuovo Progetto Italiano');
-- Quechua
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 1, 1, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 1, 2, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 1, 3, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 1, 4, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 1, 5, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 1, 6, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 2, 1, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 2, 2, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 2, 3, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 2, 4, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 2, 5, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 2, 6, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 3, 1, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 3, 2, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 3, 3, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (5, 3, 4, 'Texto único: Manual de enseñanza "Clodoaldo Soto Ruiz"');
-- Alemán
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 1, 1, 'Tangram A1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 1, 2, 'Tangram A1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 1, 3, 'Tangram A1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 1, 4, 'Tangram A1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 1, 5, 'Tangram A1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 1, 6, 'Tangram A1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 1, 7, 'Tangram A1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 1, 8, 'Tangram A1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 1, 9, 'Tangram A1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 1, 10, 'Tangram A1');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 2, 1, 'Tangram B1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 2, 2, 'Tangram B1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 2, 3, 'Tangram B1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 2, 4, 'Tangram B1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 2, 5, 'Tangram B1');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 2, 6, 'Tangram B1');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 3, 1, 'Tangram B2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 3, 2, 'Tangram B2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 3, 3, 'Tangram B2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 3, 4, 'Tangram B2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 3, 5, 'Tangram B2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 3, 6, 'Tangram B2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 3, 7, 'Tangram B2');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (6, 3, 8, 'Tangram B2');
-- Coreano
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (7, 1, 1, 'Easy Korean');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (7, 1, 2, 'Easy Korean');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (7, 1, 3, 'Easy Korean');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (7, 2, 1, 'Easy Korean');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (7, 2, 2, 'Easy Korean');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (7, 2, 3, 'Easy Korean');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (7, 2, 4, 'Easy Korean');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (7, 2, 5, 'Easy Korean');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (7, 3, 1, 'Easy Korean');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (7, 3, 2, 'Easy Korean');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (7, 3, 3, 'Easy Korean');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (7, 3, 4, 'Easy Korean');
-- Japonés
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 1, 1, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 1, 2, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 1, 3, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 1, 4, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 1, 5, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 1, 6, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 1, 7, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 1, 8, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 1, 9, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 1, 10, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 1, 11, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 1, 12, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 1, 13, 'Material de uso interno');

INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 2, 1, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 2, 2, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 2, 3, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 2, 4, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 2, 5, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 2, 6, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 2, 7, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 2, 8, 'Material de uso interno');
INSERT INTO `tmcurso`(FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) VALUES (8, 2, 9, 'Material de uso interno');

-- ------------------------------------------------------------
-- Insert dias clase
-- --------------------------------------------------------------
INSERT INTO `txdias_clase`(NOM_DIA) VALUES ('Lunes');
INSERT INTO `txdias_clase`(NOM_DIA) VALUES ('Martes');
INSERT INTO `txdias_clase`(NOM_DIA) VALUES ('Miercoles');
INSERT INTO `txdias_clase`(NOM_DIA) VALUES ('Jueves');
INSERT INTO `txdias_clase`(NOM_DIA) VALUES ('Viernes');
INSERT INTO `txdias_clase`(NOM_DIA) VALUES ('Sabado');
INSERT INTO `txdias_clase`(NOM_DIA) VALUES ('Domingo');

-- ------------------------------------------------------------
-- Insert horas clase
-- --------------------------------------------------------------
INSERT INTO `txhoras_clase`(HORA_INICIO, HORA_SALIDA) VALUES ('8:00 a.m.', '12:00 p.m.');
INSERT INTO `txhoras_clase`(HORA_INICIO, HORA_SALIDA) VALUES ('2:00 p.m.', '6:00 p.m.');
INSERT INTO `txhoras_clase`(HORA_INICIO, HORA_SALIDA) VALUES ('6:00 p.m.', '10:00 p.m.');
INSERT INTO `txhoras_clase`(HORA_INICIO, HORA_SALIDA) VALUES ('8:00 a.m.', '11:00 p.m.');
INSERT INTO `txhoras_clase`(HORA_INICIO, HORA_SALIDA) VALUES ('3:00 p.m.', '6:00 p.m.');
INSERT INTO `txhoras_clase`(HORA_INICIO, HORA_SALIDA) VALUES ('7:00 p.m.', '10:00 p.m.');

-- ------------------------------------------------------------
-- Insert grupo horario
-- --------------------------------------------------------------
INSERT INTO `tmgrupo_horario`(NOM_GRUPOHORARIO) VALUES ('L - Mi');
INSERT INTO `tmgrupo_horario`(NOM_GRUPOHORARIO) VALUES ('L - Mi - V');
INSERT INTO `tmgrupo_horario`(NOM_GRUPOHORARIO) VALUES ('Ma - J');
INSERT INTO `tmgrupo_horario`(NOM_GRUPOHORARIO) VALUES ('Sa - D');

-- ------------------------------------------------------------
-- Insert grupo dia
-- --------------------------------------------------------------
INSERT INTO `tmgrupo_dia`(FK_ID_GRUPOHORARIO, FK_ID_DIA) VALUES (1, 1);
INSERT INTO `tmgrupo_dia`(FK_ID_GRUPOHORARIO, FK_ID_DIA) VALUES (1, 3);
INSERT INTO `tmgrupo_dia`(FK_ID_GRUPOHORARIO, FK_ID_DIA) VALUES (2, 1);
INSERT INTO `tmgrupo_dia`(FK_ID_GRUPOHORARIO, FK_ID_DIA) VALUES (2, 3);
INSERT INTO `tmgrupo_dia`(FK_ID_GRUPOHORARIO, FK_ID_DIA) VALUES (2, 5);
INSERT INTO `tmgrupo_dia`(FK_ID_GRUPOHORARIO, FK_ID_DIA) VALUES (3, 2);
INSERT INTO `tmgrupo_dia`(FK_ID_GRUPOHORARIO, FK_ID_DIA) VALUES (3, 4);
INSERT INTO `tmgrupo_dia`(FK_ID_GRUPOHORARIO, FK_ID_DIA) VALUES (4, 6);
INSERT INTO `tmgrupo_dia`(FK_ID_GRUPOHORARIO, FK_ID_DIA) VALUES (4, 7);

-- ------------------------------------------------------------
-- Insert horario grupo horario
-- --------------------------------------------------------------
INSERT INTO `tmhorario_grupo_horario`(FK_ID_GRUPOHORARIO, FK_ID_HORA) VALUES (1, 1);
INSERT INTO `tmhorario_grupo_horario`(FK_ID_GRUPOHORARIO, FK_ID_HORA) VALUES (1, 2);
INSERT INTO `tmhorario_grupo_horario`(FK_ID_GRUPOHORARIO, FK_ID_HORA) VALUES (1, 3);

INSERT INTO `tmhorario_grupo_horario`(FK_ID_GRUPOHORARIO, FK_ID_HORA) VALUES (2, 4);
INSERT INTO `tmhorario_grupo_horario`(FK_ID_GRUPOHORARIO, FK_ID_HORA) VALUES (2, 5);
INSERT INTO `tmhorario_grupo_horario`(FK_ID_GRUPOHORARIO, FK_ID_HORA) VALUES (2, 6);

INSERT INTO `tmhorario_grupo_horario`(FK_ID_GRUPOHORARIO, FK_ID_HORA) VALUES (3, 1);
INSERT INTO `tmhorario_grupo_horario`(FK_ID_GRUPOHORARIO, FK_ID_HORA) VALUES (3, 2);
INSERT INTO `tmhorario_grupo_horario`(FK_ID_GRUPOHORARIO, FK_ID_HORA) VALUES (3, 3);

INSERT INTO `tmhorario_grupo_horario`(FK_ID_GRUPOHORARIO, FK_ID_HORA) VALUES (4, 1);
INSERT INTO `tmhorario_grupo_horario`(FK_ID_GRUPOHORARIO, FK_ID_HORA) VALUES (4, 2);

-- ------------------------------------------------------------
-- Insert periodo academico
-- --------------------------------------------------------------
INSERT INTO `tmperiodo_academico`(NOM_PERIODO, FECHA_INICIO, FECHA_FIN) VALUES ('2019-10', STR_TO_DATE('06/10/2019', '%d/%m/%Y'), STR_TO_DATE('27/10/2019', '%d/%m/%Y'));
INSERT INTO `tmperiodo_academico`(NOM_PERIODO, FECHA_INICIO, FECHA_FIN) VALUES ('2019-11', STR_TO_DATE('06/11/2019', '%d/%m/%Y'), STR_TO_DATE('27/11/2019', '%d/%m/%Y'));
INSERT INTO `tmperiodo_academico`(NOM_PERIODO, FECHA_INICIO, FECHA_FIN) VALUES ('2019-12', STR_TO_DATE('06/12/2019', '%d/%m/%Y'), STR_TO_DATE('27/12/2019', '%d/%m/%Y'));
INSERT INTO `tmperiodo_academico`(NOM_PERIODO, FECHA_INICIO, FECHA_FIN) VALUES ('2020-1', STR_TO_DATE('06/01/2020', '%d/%m/%Y'), STR_TO_DATE('02/02/2020', '%d/%m/%Y'));
INSERT INTO `tmperiodo_academico`(NOM_PERIODO, FECHA_INICIO, FECHA_FIN) VALUES ('2020-2', STR_TO_DATE('06/02/2020', '%d/%m/%Y'), STR_TO_DATE('28/02/2020', '%d/%m/%Y'));

-- ------------------------------------------------------------
-- Insert persona
-- --------------------------------------------------------------
INSERT INTO `tmpersona` (NOMBRE, APELLIDO_PAT, APELLIDO_MAT, DNI, GENERO, EDAD) VALUES ('Nataly', 'Vasquez', 'Saenz', '87654321', 2, 22);
INSERT INTO `tmpersona` (NOMBRE, APELLIDO_PAT, APELLIDO_MAT, DNI, GENERO, EDAD) VALUES ('Miguel', 'Velasquez', 'Yzquierdo', '87654323', 1, 24);
INSERT INTO `tmpersona` (NOMBRE, APELLIDO_PAT, APELLIDO_MAT, DNI, GENERO, EDAD) VALUES ('Brandon', 'Saenz', 'Falcon', '87654324', 1, 21);
INSERT INTO `tmpersona` (NOMBRE, APELLIDO_PAT, APELLIDO_MAT, DNI, GENERO, EDAD) VALUES ('Joel', 'Trujillo', 'Cruz', '87654325', 1, 21);
INSERT INTO `tmpersona` (NOMBRE, APELLIDO_PAT, APELLIDO_MAT, DNI, GENERO, EDAD) VALUES ('Jose', 'Soto', 'Diaz', '12345678', 1, 40);
INSERT INTO `tmpersona` (NOMBRE, APELLIDO_PAT, APELLIDO_MAT, DNI, GENERO, EDAD) VALUES ('Diego', 'Soto', 'Bejar', '12345679', 1, 40);

-- ------------------------------------------------------------
-- Insert rol
-- --------------------------------------------------------------
INSERT INTO `tmrol` (NOM_ROL, DESC_ROL) VALUES ('Estudiante', 'Estudiante del Centro de Idiomas');
INSERT INTO `tmrol` (NOM_ROL, DESC_ROL) VALUES ('Docente', 'Docente del Centro de Idiomas');

-- ------------------------------------------------------------
-- Insert usuario
-- --------------------------------------------------------------
INSERT INTO `tmusuario` (FK_ID_PERSONA, EMAIL, PASSWORD, FK_ID_ROL, ESTADO) VALUES ( 1, 'nataly@unmsm.edu.pe','passwd', 1, 1);
INSERT INTO `tmusuario` (FK_ID_PERSONA, EMAIL, PASSWORD, FK_ID_ROL, ESTADO) VALUES ( 2, 'miguel@unmsm.edu.pe','passwd', 1, 1);
INSERT INTO `tmusuario` (FK_ID_PERSONA, EMAIL, PASSWORD, FK_ID_ROL, ESTADO) VALUES ( 3, 'duvan@unmsm.edu.pe','passwd', 1, 1);
INSERT INTO `tmusuario` (FK_ID_PERSONA, EMAIL, PASSWORD, FK_ID_ROL, ESTADO) VALUES ( 4, 'joel@unmsm.edu.pe','passwd', 1, 1);
INSERT INTO `tmusuario` (FK_ID_PERSONA, EMAIL, PASSWORD, FK_ID_ROL, ESTADO) VALUES ( 5, 'jose@unmsm.edu.pe','passwd', 2, 1);
INSERT INTO `tmusuario` (FK_ID_PERSONA, EMAIL, PASSWORD, FK_ID_ROL, ESTADO) VALUES ( 6, 'diego@unmsm.edu.pe','passwd',2, 1);

-- ------------------------------------------------------------
-- Insert tipo estudiante
-- --------------------------------------------------------------
INSERT INTO `tmtipo_estudiante` (NOM_TIPO_ESTUDIANTE) VALUES ('Interno');
INSERT INTO `tmtipo_estudiante` (NOM_TIPO_ESTUDIANTE) VALUES ('Externo');

-- ------------------------------------------------------------
-- Insert estudiante
-- --------------------------------------------------------------
INSERT INTO `tmestudiante` (COD_ESTUDIANTE_CI, FK_ID_USUARIO, FK_ID_TIPO_ESTUDIANTE) VALUES ('EST00001', 1, 1);
INSERT INTO `tmestudiante` (COD_ESTUDIANTE_CI, FK_ID_USUARIO, FK_ID_TIPO_ESTUDIANTE) VALUES ('EST00002', 2, 1);
INSERT INTO `tmestudiante` (COD_ESTUDIANTE_CI, FK_ID_USUARIO, FK_ID_TIPO_ESTUDIANTE) VALUES ('EST00003', 3, 1);
INSERT INTO `tmestudiante` (COD_ESTUDIANTE_CI, FK_ID_USUARIO, FK_ID_TIPO_ESTUDIANTE) VALUES ('EST00004', 4, 1);


-- ------------------------------------------------------------
-- Insert docente
-- --------------------------------------------------------------
INSERT INTO `tmdocente` (COD_DOCENTE_CI, FK_ID_USUARIO, DEPARTAMENTO) VALUES ('DOC00001', 5, 'Ingles');
INSERT INTO `tmdocente` (COD_DOCENTE_CI, FK_ID_USUARIO, DEPARTAMENTO) VALUES ('DOC00002', 6, 'Portugues');

-- ------------------------------------------------------------
-- Insert prog_doc_curso
-- --------------------------------------------------------------
INSERT INTO `tpprog_doc_curso` (FK_ID_DOCENTE, FK_ID_CURSO, FK_ID_PERIODO) VALUES ('DOC00001', 1, 2);
INSERT INTO `tpprog_doc_curso` (FK_ID_DOCENTE, FK_ID_CURSO, FK_ID_PERIODO) VALUES ('DOC00001', 1, 3);
INSERT INTO `tpprog_doc_curso` (FK_ID_DOCENTE, FK_ID_CURSO, FK_ID_PERIODO) VALUES ('DOC00001', 2, 3);
INSERT INTO `tpprog_doc_curso` (FK_ID_DOCENTE, FK_ID_CURSO, FK_ID_PERIODO) VALUES ('DOC00001', 1, 4);
INSERT INTO `tpprog_doc_curso` (FK_ID_DOCENTE, FK_ID_CURSO, FK_ID_PERIODO) VALUES ('DOC00001', 2, 4);
INSERT INTO `tpprog_doc_curso` (FK_ID_DOCENTE, FK_ID_CURSO, FK_ID_PERIODO) VALUES ('DOC00001', 3, 4);

INSERT INTO `tpprog_doc_curso` (FK_ID_DOCENTE, FK_ID_CURSO, FK_ID_PERIODO) VALUES ('DOC00001', 1, 5);
INSERT INTO `tpprog_doc_curso` (FK_ID_DOCENTE, FK_ID_CURSO, FK_ID_PERIODO) VALUES ('DOC00001', 2, 5);
INSERT INTO `tpprog_doc_curso` (FK_ID_DOCENTE, FK_ID_CURSO, FK_ID_PERIODO) VALUES ('DOC00001', 3, 5);
INSERT INTO `tpprog_doc_curso` (FK_ID_DOCENTE, FK_ID_CURSO, FK_ID_PERIODO) VALUES ('DOC00001', 4, 5);

INSERT INTO `tpprog_doc_curso` (FK_ID_DOCENTE, FK_ID_CURSO, FK_ID_PERIODO) VALUES ('DOC00002', 39, 5);
INSERT INTO `tpprog_doc_curso` (FK_ID_DOCENTE, FK_ID_CURSO, FK_ID_PERIODO) VALUES ('DOC00002', 40, 5);
INSERT INTO `tpprog_doc_curso` (FK_ID_DOCENTE, FK_ID_CURSO, FK_ID_PERIODO) VALUES ('DOC00002', 73, 5);
INSERT INTO `tpprog_doc_curso` (FK_ID_DOCENTE, FK_ID_CURSO, FK_ID_PERIODO) VALUES ('DOC00002', 57, 5);


-- ------------------------------------------------------------
-- Insert estado prog_curso
-- --------------------------------------------------------------
INSERT INTO `txestado_progcurso` (NOM_ESTADO) VALUES ('Deshabilitado');
INSERT INTO `txestado_progcurso` (NOM_ESTADO) VALUES ('Habilitado');
INSERT INTO `txestado_progcurso` (NOM_ESTADO) VALUES ('Abierto');

-- ------------------------------------------------------------
-- Insert prog_curso
-- --------------------------------------------------------------
INSERT INTO `tpprog_curso` (FK_ID_PROG_DOC_CUR, FK_ID_HORARIO_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) VALUES (1, 1, 3);
INSERT INTO `tpprog_curso` (FK_ID_PROG_DOC_CUR, FK_ID_HORARIO_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) VALUES (2, 7, 3);
INSERT INTO `tpprog_curso` (FK_ID_PROG_DOC_CUR, FK_ID_HORARIO_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) VALUES (3, 10, 3);
INSERT INTO `tpprog_curso` (FK_ID_PROG_DOC_CUR, FK_ID_HORARIO_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) VALUES (4, 1, 3);
INSERT INTO `tpprog_curso` (FK_ID_PROG_DOC_CUR, FK_ID_HORARIO_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) VALUES (5, 7, 3);
INSERT INTO `tpprog_curso` (FK_ID_PROG_DOC_CUR, FK_ID_HORARIO_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) VALUES (6, 10, 3);

INSERT INTO `tpprog_curso` (FK_ID_PROG_DOC_CUR, FK_ID_HORARIO_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) VALUES (7, 1, 2);
INSERT INTO `tpprog_curso` (FK_ID_PROG_DOC_CUR, FK_ID_HORARIO_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) VALUES (8, 7, 2);
INSERT INTO `tpprog_curso` (FK_ID_PROG_DOC_CUR, FK_ID_HORARIO_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) VALUES (9, 10, 2);
INSERT INTO `tpprog_curso` (FK_ID_PROG_DOC_CUR, FK_ID_HORARIO_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) VALUES (10, 9, 2);

INSERT INTO `tpprog_curso` (FK_ID_PROG_DOC_CUR, FK_ID_HORARIO_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) VALUES (11, 1, 2);
INSERT INTO `tpprog_curso` (FK_ID_PROG_DOC_CUR, FK_ID_HORARIO_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) VALUES (12, 7, 2);
INSERT INTO `tpprog_curso` (FK_ID_PROG_DOC_CUR, FK_ID_HORARIO_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) VALUES (13, 10, 2);
INSERT INTO `tpprog_curso` (FK_ID_PROG_DOC_CUR, FK_ID_HORARIO_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) VALUES (14, 10, 2);

-- ------------------------------------------------------------
-- Insert estado matricula
-- --------------------------------------------------------------
INSERT INTO `txestado_matricula` (NOM_ESTADO_MATRICULA) VALUES ('Pre-matricula');
INSERT INTO `txestado_matricula` (NOM_ESTADO_MATRICULA) VALUES ('Activo');
INSERT INTO `txestado_matricula` (NOM_ESTADO_MATRICULA) VALUES ('Anulado');
INSERT INTO `txestado_matricula` (NOM_ESTADO_MATRICULA) VALUES ('Culminado');
INSERT INTO `txestado_matricula` (NOM_ESTADO_MATRICULA) VALUES ('Cambiado');


-- Insertar antes los vouchers, solo cambiar de ordern la columna sec con cod y copiar desde el excel


-- ------------------------------------------------------------
-- Insert matricula
-- --------------------------------------------------------------
INSERT INTO TPMATRICULA (FK_COD_ESTUDIANTE_CI, FK_ID_PROGCURSO, FK_SEC_VOUCHER, FK_ID_ESTADO_MATRICULA) VALUES ('EST00004', 1, 1754, 4);

INSERT INTO TPMATRICULA (FK_COD_ESTUDIANTE_CI, FK_ID_PROGCURSO, FK_SEC_VOUCHER, FK_ID_ESTADO_MATRICULA) VALUES ('EST00002', 2, 1756, 4);
INSERT INTO TPMATRICULA (FK_COD_ESTUDIANTE_CI, FK_ID_PROGCURSO, FK_SEC_VOUCHER, FK_ID_ESTADO_MATRICULA) VALUES ('EST00004', 3, 1755, 4);

INSERT INTO TPMATRICULA (FK_COD_ESTUDIANTE_CI, FK_ID_PROGCURSO, FK_SEC_VOUCHER, FK_ID_ESTADO_MATRICULA) VALUES ('EST00001', 4, 1759, 4);
INSERT INTO TPMATRICULA (FK_COD_ESTUDIANTE_CI, FK_ID_PROGCURSO, FK_SEC_VOUCHER, FK_ID_ESTADO_MATRICULA) VALUES ('EST00003', 4, 1760, 4);
INSERT INTO TPMATRICULA (FK_COD_ESTUDIANTE_CI, FK_ID_PROGCURSO, FK_SEC_VOUCHER, FK_ID_ESTADO_MATRICULA) VALUES ('EST00002', 1, 1758, 4);
INSERT INTO TPMATRICULA (FK_COD_ESTUDIANTE_CI, FK_ID_PROGCURSO, FK_SEC_VOUCHER, FK_ID_ESTADO_MATRICULA) VALUES ('EST00004', 1, 1757, 4);


-- ------------------------------------------------------------
-- Insert APERTURA
-- --------------------------------------------------------------
INSERT INTO TPSOLICITUD_APERTURA (FK_COD_ESTUDIANTE_CI, FK_ID_CURSO, FK_ID_HORARIO_GRUPOHORARIO) VALUES ('EST00002', 51, 7);
INSERT INTO TPSOLICITUD_APERTURA (FK_COD_ESTUDIANTE_CI, FK_ID_CURSO, FK_ID_HORARIO_GRUPOHORARIO) VALUES ('EST00003', 137, 7);
INSERT INTO TPSOLICITUD_APERTURA (FK_COD_ESTUDIANTE_CI, FK_ID_CURSO, FK_ID_HORARIO_GRUPOHORARIO) VALUES ('EST00004', 137, 7);

-- ------------------------------------------------------------
-- Insert nota
-- --------------------------------------------------------------
INSERT INTO TPNOTA (FK_ID_MATRICULA, PROMEDIO) VALUES (1, 16);
INSERT INTO TPNOTA (FK_ID_MATRICULA, PROMEDIO) VALUES (2, 16);
INSERT INTO TPNOTA (FK_ID_MATRICULA, PROMEDIO) VALUES (3, 16);
INSERT INTO TPNOTA (FK_ID_MATRICULA, PROMEDIO) VALUES (4, 16);
INSERT INTO TPNOTA (FK_ID_MATRICULA, PROMEDIO) VALUES (5, 16);
INSERT INTO TPNOTA (FK_ID_MATRICULA, PROMEDIO) VALUES (6, 16);
INSERT INTO TPNOTA (FK_ID_MATRICULA, PROMEDIO) VALUES (7, 16);

-- ------------------------------------------------------------
-- Insert detalle nota
-- --------------------------------------------------------------
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (1, "Speaking", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (1, "Reading", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (1, "Writing", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (1, "Exam", 40, 16);

INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (2, "Speaking", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (2, "Reading", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (2, "Writing", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (2, "Exam", 40, 16);

INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (3, "Speaking", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (3, "Reading", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (3, "Writing", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (3, "Exam", 40, 16);

INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (4, "Speaking", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (4, "Reading", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (4, "Writing", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (4, "Exam", 40, 16);

INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (5, "Speaking", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (5, "Reading", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (5, "Writing", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (5, "Exam", 40, 16);

INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (6, "Speaking", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (6, "Reading", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (6, "Writing", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (6, "Exam", 40, 16);

INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (7, "Speaking", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (7, "Reading", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (7, "Writing", 20, 16);
INSERT INTO TPDETALLE_NOTA (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA) VALUES (7, "Exam", 40, 16);
