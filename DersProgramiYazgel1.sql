-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: dersprogrami
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ders_programi`
--

DROP TABLE IF EXISTS `ders_programi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ders_programi` (
  `program_id` int NOT NULL AUTO_INCREMENT,
  `ders_id` int DEFAULT NULL,
  `hoca_id` int DEFAULT NULL,
  `sinif_id` varchar(5) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `gun_id` int DEFAULT NULL,
  `baslangic_saat` time DEFAULT NULL,
  `bitis_saat` time DEFAULT NULL,
  PRIMARY KEY (`program_id`),
  KEY `ders_id` (`ders_id`),
  KEY `hoca_id` (`hoca_id`),
  KEY `sinif_id` (`sinif_id`),
  KEY `gun_id` (`gun_id`),
  CONSTRAINT `ders_programi_ibfk_1` FOREIGN KEY (`ders_id`) REFERENCES `dersler` (`ders_id`),
  CONSTRAINT `ders_programi_ibfk_2` FOREIGN KEY (`hoca_id`) REFERENCES `hocalar` (`hoca_id`),
  CONSTRAINT `ders_programi_ibfk_3` FOREIGN KEY (`sinif_id`) REFERENCES `siniflar` (`sinif_id`),
  CONSTRAINT `ders_programi_ibfk_4` FOREIGN KEY (`gun_id`) REFERENCES `gunler` (`gun_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ders_programi`
--

LOCK TABLES `ders_programi` WRITE;
/*!40000 ALTER TABLE `ders_programi` DISABLE KEYS */;
INSERT INTO `ders_programi` VALUES (1,1,1,'bsm-1',2,'10:01:00','12:01:00'),(2,2,2,'bsm-2',2,'11:01:00','13:01:00'),(3,2,1,'bsm-1',2,'13:01:00','15:01:00'),(4,1,2,'bsm-3',1,'07:01:00','11:01:00');
/*!40000 ALTER TABLE `ders_programi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dersler`
--

DROP TABLE IF EXISTS `dersler`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dersler` (
  `ders_id` int NOT NULL AUTO_INCREMENT,
  `ders_isim` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  PRIMARY KEY (`ders_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dersler`
--

LOCK TABLES `dersler` WRITE;
/*!40000 ALTER TABLE `dersler` DISABLE KEYS */;
INSERT INTO `dersler` VALUES (1,'Ayrık Matematik'),(2,'Bilgisayar Mimarisi');
/*!40000 ALTER TABLE `dersler` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gunler`
--

DROP TABLE IF EXISTS `gunler`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gunler` (
  `gun_id` int NOT NULL AUTO_INCREMENT,
  `gun` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`gun_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gunler`
--

LOCK TABLES `gunler` WRITE;
/*!40000 ALTER TABLE `gunler` DISABLE KEYS */;
INSERT INTO `gunler` VALUES (1,'Pazartesi'),(2,'Salı'),(3,'Çarşamba'),(4,'Perşembe'),(5,'Cuma'),(6,'Cumartesi'),(7,'Pazar');
/*!40000 ALTER TABLE `gunler` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hocalar`
--

DROP TABLE IF EXISTS `hocalar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hocalar` (
  `hoca_id` int NOT NULL AUTO_INCREMENT,
  `isim` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `soyisim` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  PRIMARY KEY (`hoca_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hocalar`
--

LOCK TABLES `hocalar` WRITE;
/*!40000 ALTER TABLE `hocalar` DISABLE KEYS */;
INSERT INTO `hocalar` VALUES (1,'Fevzi Eren','Çiçek'),(2,'Lionel','Messi');
/*!40000 ALTER TABLE `hocalar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `siniflar`
--

DROP TABLE IF EXISTS `siniflar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `siniflar` (
  `sinif_id` varchar(5) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `sinif_aciklama` varchar(55) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`sinif_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `siniflar`
--

LOCK TABLES `siniflar` WRITE;
/*!40000 ALTER TABLE `siniflar` DISABLE KEYS */;
INSERT INTO `siniflar` VALUES ('bsm-1','1.kat 1 nolu sınıf'),('bsm-2','2. kat 2 nolu sınıf'),('bsm-3','1.kat 3 nolu sınıf'),('bsm-4','2.kat 4 nolu oda');
/*!40000 ALTER TABLE `siniflar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'dersprogrami'
--

--
-- Dumping routines for database 'dersprogrami'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-06 13:43:00
