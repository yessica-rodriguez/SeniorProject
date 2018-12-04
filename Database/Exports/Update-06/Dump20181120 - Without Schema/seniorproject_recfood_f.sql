-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: seniorproject
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `recfood_f`
--

DROP TABLE IF EXISTS `recfood_f`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `recfood_f` (
  `age_l` int(11) NOT NULL,
  `age_h` int(11) NOT NULL,
  `sedentary` int(11) NOT NULL,
  `moderately active` int(11) NOT NULL,
  `active` int(11) NOT NULL,
  PRIMARY KEY (`age_l`,`age_h`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recfood_f`
--

LOCK TABLES `recfood_f` WRITE;
/*!40000 ALTER TABLE `recfood_f` DISABLE KEYS */;
INSERT INTO `recfood_f` VALUES (2,2,1000,1000,1000),(3,3,1000,1200,1400),(4,4,1200,1400,1400),(5,5,1200,1400,1600),(6,6,1200,1400,1600),(7,7,1200,1600,1800),(8,8,1400,1600,1800),(9,9,1400,1600,1800),(10,10,1400,1800,2000),(11,11,1600,1800,2000),(12,12,1600,2000,2200),(13,13,1800,2000,2200),(14,14,1800,2000,2400),(15,15,1800,2000,2400),(16,16,1800,2000,2400),(17,17,1800,2000,2400),(18,18,1800,2000,2400),(19,20,2000,2200,2400),(21,25,2000,2200,2400),(26,30,1800,2000,2400),(31,35,1800,2000,2200),(36,40,1800,2000,2200),(41,45,1800,2000,2200),(46,50,1800,2000,2200),(51,55,1600,1800,2200),(56,60,1600,1800,2200),(61,65,1600,1800,2000),(66,70,1600,1800,2000),(71,75,1600,1800,2000),(76,120,1600,1800,2000);
/*!40000 ALTER TABLE `recfood_f` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-20 21:28:19
