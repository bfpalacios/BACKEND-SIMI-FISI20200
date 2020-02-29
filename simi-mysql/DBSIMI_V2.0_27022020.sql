CREATE SCHEMA IF NOT EXISTS `dbsimi` DEFAULT CHARACTER SET latin1 ;
USE `dbsimi` ;
-- drop database dbsimi;

-- -----------------------------------------------------
-- Table `dbsimi`.`sede`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmsede` (
  `ID_SEDE` INT NOT NULL AUTO_INCREMENT,
  `NOM_SEDE` VARCHAR(30) NULL DEFAULT NULL,
  `DESC_SEDE` VARCHAR(100) NOT NULL,
  `DIR_SEDE` VARCHAR(150) NULL DEFAULT NULL,
  PRIMARY KEY (`ID_SEDE`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`aula`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmaula` (
  `ID_AULA` INT NOT NULL AUTO_INCREMENT,
  `NOM_AULA` VARCHAR(10) NOT NULL,
  `REF_AULA` VARCHAR(150) NULL DEFAULT NULL,
  `FK_ID_SEDE` INT NOT NULL,
  `AULA_SEDE` VARCHAR(10) UNIQUE,
  PRIMARY KEY (`ID_AULA`),
  FOREIGN KEy (`FK_ID_SEDE`) REFERENCES `TMSEDE` (`ID_SEDE`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`nivel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`txnivel` (
  `ID_NIVEL` INT NOT NULL AUTO_INCREMENT,
  `NOM_NIVEL` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`ID_NIVEL`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`idioma`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmidioma` (
  `ID_IDIOMA` INT NOT NULL AUTO_INCREMENT,
  `NOM_IDIOMA` VARCHAR(50) NULL DEFAULT NULL,
  `DESC_IDIOMA` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`ID_IDIOMA`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`curso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmcurso` (
  `ID_CURSO` INT NOT NULL AUTO_INCREMENT,
  `FK_ID_IDIOMA` INT NOT NULL,
  `FK_ID_NIVEL` INT NOT NULL,
  `CICLO` INT NOT NULL,
  `LIBRO` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`ID_CURSO`),
  FOREIGN KEY (`FK_ID_IDIOMA`) REFERENCES `TMIDIOMA`(`ID_IDIOMA`),
  FOREIGN KEY (`FK_ID_NIVEL`) REFERENCES `TXNIVEL`(`ID_NIVEL`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`dias_clase`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`txdias_clase` (
  `ID_DIA` INT NOT NULL AUTO_INCREMENT,
  `NOM_DIA` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`ID_DIA`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`horas_clase`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`txhoras_clase` (
  `ID_HORA` INT NOT NULL AUTO_INCREMENT,
  `HORA_INICIO` VARCHAR(100) NOT NULL,
  `HORA_SALIDA` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`ID_HORA`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`grupo_horario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmgrupo_horario` (
  `ID_GRUPOHORARIO` INT NOT NULL AUTO_INCREMENT,
  `NOM_GRUPOHORARIO` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`ID_GRUPOHORARIO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`grupo_dia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmgrupo_dia` (
  `FK_ID_GRUPOHORARIO` INT NOT NULL,
  `FK_ID_DIA` INT NOT NULL,
 FOREIGN KEY (`FK_ID_GRUPOHORARIO`) REFERENCES `TMGRUPO_HORARIO`(`ID_GRUPOHORARIO`),
 FOREIGN KEY (`FK_ID_DIA`) REFERENCES `TXDIAS_CLASE`(`ID_DIA`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`horario_grupo_horario_`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmhorario_grupo_horario` (
  `ID_HORARIO_GRUPOHORARIO` INT NOT NULL AUTO_INCREMENT,
  `FK_ID_GRUPOHORARIO` INT NOT NULL,
  `FK_ID_HORA` INT NOT NULL,
  PRIMARY KEY (`ID_HORARIO_GRUPOHORARIO`),
  FOREIGN KEY (`FK_ID_HORA`) REFERENCES `TXHORAS_CLASE`(`ID_HORA`),
  FOREIGN KEY (`FK_ID_GRUPOHORARIO`) REFERENCES `TMGRUPO_HORARIO`(`ID_GRUPOHORARIO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`periodo_academico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmperiodo_academico` (
  `ID_PERIODO` INT NOT NULL AUTO_INCREMENT,
  `NOM_PERIODO` VARCHAR(100) NOT NULL,
  `FECHA_INICIO` DATE NOT NULL,
  `FECHA_FIN` DATE NOT NULL,
  PRIMARY KEY (`ID_PERIODO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`PERSONA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmpersona` (
  `ID_PERSONA` INT NOT NULL AUTO_INCREMENT,
  `NOMBRE` VARCHAR(50) NOT NULL,
  `APELLIDO_PAT` VARCHAR(50) NOT NULL,
  `APELLIDO_MAT` VARCHAR(50) NOT NULL,
  `DNI` VARCHAR(10) NOT NULL,
  `GENERO` INT(1) NOT NULL,
  `EDAD`INT NOT NULL,
  `FECHA_ALTA` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `FECHA_MOD` DATETIME ON UPDATE CURRENT_TIMESTAMP,
`university` varchar(128),
`FECHA_NACIMIENTO`varchar(64), 
`LUGAR_NAC_DIST` varchar(128), 
`LUGAR_NAC_PROV` varchar(128), 
`LUGAR_NAC_DEP` varchar(128), 
`NACIONALIDAD` varchar(64), 
`ADDRESS` varchar(128), 
`PHONE` varchar(16),
  PRIMARY KEY (`ID_PERSONA`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`rol`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmrol` (
  `ID_ROL` INT NOT NULL AUTO_INCREMENT,
  `NOM_ROL` VARCHAR(45) NOT NULL,
  `DESC_ROL` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`ID_ROL`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`PERMISO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmpermiso` (
  `ID_PERMISO` INT NOT NULL AUTO_INCREMENT,
  `NOM_PERMISO` VARCHAR(45) NOT NULL,
  `DESC_PERMISO` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`ID_PERMISO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`rol_permiso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmrol_permiso` (
  `ID_ROL` INT NOT NULL,
  `ID_PERMISO`INT NOT NULL,
  FOREIGN KEY(`ID_ROL`) REFERENCES `TMROL`(`ID_ROL`),
  FOREIGN KEY(`ID_PERMISO`) REFERENCES `TMPERMISO`(`ID_PERMISO`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`usuario`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `dbsimi`.`tmusuario` (
  `ID_USUARIO` INT NOT NULL AUTO_INCREMENT,
  `FK_ID_PERSONA` INT NOT NULL,
  `EMAIL` VARCHAR(150) NOT NULL,
  `PASSWORD` VARCHAR(256) NOT NULL,
  `FK_ID_ROL` INT NOT NULL,
  `ESTADO`INT NOT NULL,
  `FECHA_ALTA` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `FECHA_BAJA` DATETIME,
  `FECHA_MOD` DATETIME ON UPDATE CURRENT_TIMESTAMP,
  `FK_ID_USUARIO_MOD` INT,
  PRIMARY KEY (`ID_USUARIO`),
  FOREIGN KEY(`FK_ID_ROL`) REFERENCES `TMROL`(`ID_ROL`),
  FOREIGN KEY(`FK_ID_PERSONA`) REFERENCES `TMPERSONA`(`ID_PERSONA`),
  FOREIGN KEY(`FK_ID_USUARIO_MOD`) REFERENCES `TMUSUARIO`(`ID_USUARIO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`TIPO contrato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmtipo_contrato` (
  `ID_TIPO_CONTRATO` INT NOT NULL AUTO_INCREMENT,
  `NOM_TIPO`VARCHAR(50) NOT NULL,
  PRIMARY KEY (`ID_TIPO_CONTRATO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`contrato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmcontrato` (
  `ID_CONTRATO` INT NOT NULL AUTO_INCREMENT,
  `FK_ID_PERSONA` INT NOT NULL,
  `FK_ID_TIPO_CONTRATO` INT NOT NULL,
  `FECHA_INICIO_CONTRATO` DATE NOT NULL,
  `FECHA_FIN_CONTRATO` DATE NOT NULL,
  `SUELDO` INT NOT NULL,
  `FECHA_MOD` DATETIME ON UPDATE CURRENT_TIMESTAMP,
  `FK_ID_USUARIO_MOD` INT DEFAULT 0,
  PRIMARY KEY (`ID_CONTRATO`),
  FOREIGN KEY(`FK_ID_PERSONA`) REFERENCES `TMPERSONA`(`ID_PERSONA`),
  FOREIGN KEY(`FK_ID_USUARIO_MOD`) REFERENCES `TMUSUARIO`(`ID_USUARIO`),
  FOREIGN KEY (`FK_ID_TIPO_CONTRATO`) REFERENCES `TMTIPO_CONTRATO`(`ID_TIPO_CONTRATO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`estado_asm`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`vwestado_asm` (
  `ID_ESTADO_ASM` INT NOT NULL AUTO_INCREMENT,
  `NOM_ESTADO_AMS` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`ID_ESTADO_ASM`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`alumnos_sm`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`vwmalumnos_sm` (
  `CODIGO_ASM` INT NOT NULL,
  `DNI_ASM` INT NOT NULL,
  `NOMBRE_ASM` VARCHAR(50) NOT NULL,
  `APELLIDOPAT_ASM` VARCHAR(50) NOT NULL,
  `APELLIDOMAT_ASM` VARCHAR(50) NOT NULL,
  `EMAIL_ASM` VARCHAR(150) NOT NULL,
  `FACULTAD_ASM` VARCHAR(100) NOT NULL,
  `GENERO_ASM` INT NOT NULL,
  `FK_ID_ESTADO_ASM` INT NOT NULL,
  PRIMARY KEY (`CODIGO_ASM`),
  FOREIGN KEY (`FK_ID_ESTADO_ASM`) REFERENCES `VWESTADO_ASM`(`ID_ESTADO_ASM`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`tipo estudiante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmtipo_estudiante` (
  `ID_TIPO_ESTUDIANTE` INT NOT NULL AUTO_INCREMENT,
  `NOM_TIPO_ESTUDIANTE` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID_TIPO_ESTUDIANTE`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`estudiante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmestudiante` (
  `COD_ESTUDIANTE_CI` VARCHAR(10) NOT NULL,
  `FK_ID_USUARIO` INT NOT NULL,
  `FK_ID_TIPO_ESTUDIANTE` INT NOT NULL,
  PRIMARY KEY (`COD_ESTUDIANTE_CI`),
  FOREIGN KEY (`FK_ID_USUARIO`) REFERENCES `TMUSUARIO` (`ID_USUARIO`),
  FOREIGN KEY (`FK_ID_TIPO_ESTUDIANTE`) REFERENCES `TMTIPO_ESTUDIANTE` (`ID_TIPO_ESTUDIANTE`)
)  
ENGINE=INNODB 
DEFAULT CHARACTER SET=LATIN1;

-- -----------------------------------------------------
-- Table `dbsimi`.`administrativo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmadministrativo` (
  `COD_ADMINISTRATIVO_CI` VARCHAR(10) NOT NULL,
  `FK_ID_USUARIO` INT NOT NULL,
  PRIMARY KEY (`COD_ADMINISTRATIVO_CI`),
  FOREIGN KEY (`FK_ID_USUARIO`) REFERENCES `TMUSUARIO` (`ID_USUARIO`)
)  
ENGINE=INNODB
DEFAULT CHARACTER SET=LATIN1;

-- -----------------------------------------------------
-- Table `dbsimi`.`docente
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmdocente` (
  `COD_DOCENTE_CI` VARCHAR(10) NOT NULL,
  `FK_ID_USUARIO` INT NOT NULL,
  `DEPARTAMENTO` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`COD_DOCENTE_CI`),
  FOREIGN KEY (`FK_ID_USUARIO`) REFERENCES `TMUSUARIO` (`ID_USUARIO`)
)  
ENGINE=INNODB
DEFAULT CHARACTER SET=LATIN1;

-- -----------------------------------------------------
-- Table `dbsimi`.`prog_doc_curso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tpprog_doc_curso` (
  `ID_PROG_DOC_CUR` INT NOT NULL AUTO_INCREMENT,
  `FK_ID_DOCENTE` VARCHAR(10) NOT NULL,
  `FK_ID_CURSO` INT NOT NULL,
  `FK_ID_PERIODO` INT NOT NULL,
  PRIMARY KEY (`ID_PROG_DOC_CUR`),
  FOREIGN KEY (`FK_ID_DOCENTE`) REFERENCES `TMDOCENTE`(`COD_DOCENTE_CI`),
  FOREIGN KEY (`FK_ID_CURSO`) REFERENCES `TMCURSO`(`ID_CURSO`),
  FOREIGN KEY (`FK_ID_PERIODO`) REFERENCES `TMPERIODO_ACADEMICO`(`ID_PERIODO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`estado porgcurso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`txestado_progcurso` (
  `ID_ESTADO_PROGCURSO` INT NOT NULL AUTO_INCREMENT,
  `NOM_ESTADO` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID_ESTADO_PROGCURSO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`prog_curso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tpprog_curso` (
  `ID_PROGCURSO` INT NOT NULL AUTO_INCREMENT,
  `FK_ID_PROG_DOC_CUR` INT DEFAULT NULL,
  `FK_ID_AULA` INT DEFAULT NULL,
  `FK_ID_HORARIO_GRUPOHORARIO` INT DEFAULT NULL,
  `FK_ID_ESTADO_PROGCURSO` INT DEFAULT NULL,
  PRIMARY KEY (`ID_PROGCURSO`),
  FOREIGN KEY (`FK_ID_PROG_DOC_CUR`) REFERENCES `TPPROG_DOC_CURSO`(`ID_PROG_DOC_CUR`),
  FOREIGN KEY (`FK_ID_HORARIO_GRUPOHORARIO`) REFERENCES `TMHORARIO_GRUPO_HORARIO`(`ID_HORARIO_GRUPOHORARIO`),
  FOREIGN KEY (`FK_ID_AULA`) REFERENCES `TMAULA`(`ID_AULA`),
  FOREIGN KEY (`FK_ID_ESTADO_PROGCURSO`) REFERENCES `TXESTADO_PROGCURSO`(`ID_ESTADO_PROGCURSO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`voucher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tmvoucher` (
  `COD`INT NOT NULL,
  `SEC` INT NOT NULL,
  `DESCRIPCION` VARCHAR(256),
  `T` INT,
  `NRODOCUMENTO` VARCHAR(11),
  `NR` INT,
  `IMPORTE` FLOAT NOT NULL,
  `COMILLA` INT(2),
  `FECHA` VARCHAR(128),
  `HORA` VARCHAR(128),
  `C` INT,
  `AGENCIA` INT,
  `CAJERO` INT,
  `FILLER` INT,
  `MOD_MANUAL` INT,
  PRIMARY KEY (`SEC`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`estado_matricula`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`txestado_matricula` (
  `ID_ESTADO_MATRICULA` INT NOT NULL AUTO_INCREMENT,
  `NOM_ESTADO_MATRICULA` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`ID_ESTADO_MATRICULA`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`matricula`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tpmatricula` (
  `ID_MATRICULA` INT NOT NULL AUTO_INCREMENT,
  `FK_COD_ESTUDIANTE_CI` VARCHAR(10) NOT NULL,
  `FK_ID_PROGCURSO` INT NOT NULL,
  `FK_SEC_VOUCHER` INT NOT NULL,
  `FK_ID_ESTADO_MATRICULA`INT NOT NULL,
  `FECHA_MATRICULA` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `FECHA_MOD` DATETIME ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID_MATRICULA`),
  FOREIGN KEY (`FK_COD_ESTUDIANTE_CI`) REFERENCES `TMESTUDIANTE`(`COD_ESTUDIANTE_CI`),
  FOREIGN KEY (`FK_ID_PROGCURSO`) REFERENCES `TPPROG_CURSO`(`ID_PROGCURSO`),
  FOREIGN KEY (`FK_SEC_VOUCHER`) REFERENCES `TMVOUCHER`(`SEC`),
  FOREIGN KEY (`FK_ID_ESTADO_MATRICULA`) REFERENCES `TXESTADO_MATRICULA`(`ID_ESTADO_MATRICULA`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`nota`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tpnota` (
  `ID_NOTA` INT NOT NULL AUTO_INCREMENT,
  `FK_ID_MATRICULA` INT NOT NULL,
  `PROMEDIO`INT DEFAULT 0,
  PRIMARY KEY (`ID_NOTA`),
  FOREIGN KEY (`FK_ID_MATRICULA`) REFERENCES `TPMATRICULA`(`ID_MATRICULA`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`DETALLE nota`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tpdetalle_nota` (
  `ID_DETALLE_NOTA` INT NOT NULL AUTO_INCREMENT,
  `FK_ID_NOTA` INT NOT NULL,
  `NOTA_DESC` VARCHAR(50) NOT NULL,
  `PORCENTAJE` INT NOT NULL,
  `NOTA`INT DEFAULT 0,
  PRIMARY KEY (`ID_DETALLE_NOTA`),
  FOREIGN KEY (`FK_ID_NOTA`) REFERENCES `TPNOTA`(`ID_NOTA`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`solicitud apertura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`tpsolicitud_apertura` (
  `ID_SOLICITUD` INT NOT NULL AUTO_INCREMENT,
  `FK_COD_ESTUDIANTE_CI` VARCHAR(10) NOT NULL,
  `FK_ID_CURSO` INT NOT NULL,
  `FK_ID_HORARIO_GRUPOHORARIO` INT NOT NULL,
  PRIMARY KEY (`ID_SOLICITUD`),
  FOREIGN KEY (`FK_COD_ESTUDIANTE_CI`) REFERENCES `TMESTUDIANTE`(`COD_ESTUDIANTE_CI`),
  FOREIGN KEY (`FK_ID_CURSO`) REFERENCES `TMCURSO`(`ID_CURSO`),
  FOREIGN KEY (`FK_ID_HORARIO_GRUPOHORARIO`) REFERENCES `TMHORARIO_GRUPO_HORARIO`(`ID_HORARIO_GRUPOHORARIO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `dbsimi`.`txmodulo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`txmodulo` (
  `CModulo` INT NOT NULL AUTO_INCREMENT,
  `Modulo` VARCHAR(128) NULL DEFAULT NULL,
  PRIMARY KEY (`CModulo`)
)  
ENGINE=INNODB 
DEFAULT CHARACTER SET=LATIN1;

-- -----------------------------------------------------
-- Table `dbsimi`.`txsubmodulo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbsimi`.`txsubmodulo` (
  `CSubModulo` INT NOT NULL AUTO_INCREMENT,
  `CModulo` INT NOT NULL,
  `SubModulo` VARCHAR(128) NULL DEFAULT NULL,
  PRIMARY KEY (`CSubModulo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


create table IF NOT EXISTS conceptosPago (
CCONCEPTOPAGO INT NOT NULL AUTO_INCREMENT,
DESCRIPCION VARCHAR(128),
IMPORTE DECIMAL,
CODIGO VARCHAR(8),
CONSTRAINT PK_CONCEPTO PRIMARY KEY (CCONCEPTOPAGO)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;