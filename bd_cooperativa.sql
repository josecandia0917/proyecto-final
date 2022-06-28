/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 100421
 Source Host           : localhost:3306
 Source Schema         : bd_coope

 Target Server Type    : MySQL
 Target Server Version : 100421
 File Encoding         : 65001

 Date: 28/06/2022 10:01:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cargos
-- ----------------------------
DROP TABLE IF EXISTS `cargos`;
CREATE TABLE `cargos`  (
  `idCa` int(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `ncargo` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idCa`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci;

-- ----------------------------
-- Records of cargos
-- ----------------------------
BEGIN;
INSERT INTO `cargos` VALUES (1, 'PRECIDENTE'), (2, 'VICEPRECIDENTE'), (3, 'TESORERO'), (4, 'DEPORTES'), (5, 'VIGILANCIA'), (6, 'PRECIDENTE'), (7, 'ACTA1'), (11, 'ACTA3');
COMMIT;

-- ----------------------------
-- Table structure for gestiones
-- ----------------------------
DROP TABLE IF EXISTS `gestiones`;
CREATE TABLE `gestiones`  (
  `idGe` int(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `gestion` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idGe`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci;

-- ----------------------------
-- Records of gestiones
-- ----------------------------
BEGIN;
INSERT INTO `gestiones` VALUES (1, '2015'), (2, '2016'), (3, '2017'), (4, '2018'), (5, '2019'), (6, '2020'), (7, '2021'), (8, '2022'), (12, '2021');
COMMIT;

-- ----------------------------
-- Table structure for historial
-- ----------------------------
DROP TABLE IF EXISTS `historial`;
CREATE TABLE `historial`  (
  `idHi` int(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `ingreso` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `aporte` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `participaciones` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idHi`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci;

-- ----------------------------
-- Records of historial
-- ----------------------------
BEGIN;
INSERT INTO `historial` VALUES (1, 'compra de accion', '30000$', '80'), (2, 'trabajo al inicio de la cooperativa', '70000$', '120');
COMMIT;

-- ----------------------------
-- Table structure for informe
-- ----------------------------
DROP TABLE IF EXISTS `informe`;
CREATE TABLE `informe`  (
  `idIn` int(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `socioid` int(50) NULL DEFAULT NULL,
  `cargoid` int(50) NULL DEFAULT NULL,
  `repoid` int(50) NULL DEFAULT NULL,
  `finf` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idIn`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci;

-- ----------------------------
-- Records of informe
-- ----------------------------
BEGIN;
INSERT INTO `informe` VALUES (1, 1, 2, 3, '17-09-2021'), (3, 2, 4, 3, '17-09-2021'), (4, 1, 1, 1, '1213'), (5, 6, 9, 3, '123');
COMMIT;

-- ----------------------------
-- Table structure for reportecoo
-- ----------------------------
DROP TABLE IF EXISTS `reportecoo`;
CREATE TABLE `reportecoo`  (
  `idRe` int(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `gsemana` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `fecha` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `hora` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lugar` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idRe`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci;

-- ----------------------------
-- Records of reportecoo
-- ----------------------------
BEGIN;
INSERT INTO `reportecoo` VALUES (1, '20kg', '03-06-2022', '6:00 PM', 'lugar A'), (2, '10kg', '05-09-2022', '8:00 AM', 'lugar B'), (3, '5kg', '10-10-2022', '6:30 PM', 'lugar C');
COMMIT;

-- ----------------------------
-- Table structure for socios
-- ----------------------------
DROP TABLE IF EXISTS `socios`;
CREATE TABLE `socios`  (
  `idSo` int(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `apaterno` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `amaterno` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nombres` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `fnac` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ci` int(25) NULL DEFAULT NULL,
  `celular` int(25) NULL DEFAULT NULL,
  `correo` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idSo`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci;

-- ----------------------------
-- Records of socios
-- ----------------------------
BEGIN;
INSERT INTO `socios` VALUES (1, 'SUAREZ', 'FLORES', 'JUAN', '01-10-1968', 666778, 7865123, 'juan@gmail.com'), (2, 'MIRANDA', 'QUINTERO', 'LUISA', '08-12-1970', 853234, 72345123, 'luisa@gmail.com'), (3, 'FERNANDEZ', 'QUINTERO', 'MARIA', '12-12-1971', 67341234, 72345312, 'maria@gmail.com'), (4, 'CHAMBI', 'PANTIGOZO', 'MARGOT', '20-03-1990', 9078563, 67545423, 'margot@gmail.com'), (5, 'MONTERO', 'PIZARRO', 'KEVIN', '25-01-1990', 8967541, 67876700, 'kevin@gmail.com'), (6, 'RODRIGUEZ', 'CANDIA', 'JUVENAL', '11-07-1986', 5678650, 78686750, 'juve@gmail.com');
COMMIT;

-- ----------------------------
-- Table structure for usuarios
-- ----------------------------
DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;

-- ----------------------------
-- Records of usuarios
-- ----------------------------
BEGIN;
INSERT INTO `usuarios` VALUES (1, 'admin@gmail.com', '7c4a8d09ca3762af61e59520943dc26494f8941b'), (2, 'tesorero@gmail.com', '6ea195bd5fcd5964c0ea76262c6fbc31b48273d4'), (3, 'secre@gmail.com', '460d24c71a99443ecabefdcec9eec85a4ab3cd8f');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
