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
-- Table structure for table `disfood`
--

DROP TABLE IF EXISTS `disfood`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `disfood` (
  `disID` int(11) NOT NULL,
  `food1ID` int(11) NOT NULL,
  `food2ID` int(11) NOT NULL,
  `food3ID` int(11) NOT NULL,
  `food4ID` int(11) NOT NULL,
  `food5ID` int(11) NOT NULL,
  `link` varchar(500) NOT NULL,
  PRIMARY KEY (`disID`),
  KEY `foodDis_f_FK_idx` (`food1ID`),
  KEY `foodDis_f2_FK_idx` (`food2ID`),
  KEY `foodDis_f3_FK_idx` (`food3ID`),
  KEY `foodDis_f4_FK_idx` (`food4ID`),
  KEY `foodDis_f5_FK_idx` (`food5ID`),
  CONSTRAINT `foodDis_d_FK` FOREIGN KEY (`disID`) REFERENCES `disease` (`id`),
  CONSTRAINT `foodDis_f2_FK` FOREIGN KEY (`food2ID`) REFERENCES `foods` (`id`),
  CONSTRAINT `foodDis_f3_FK` FOREIGN KEY (`food3ID`) REFERENCES `foods` (`id`),
  CONSTRAINT `foodDis_f4_FK` FOREIGN KEY (`food4ID`) REFERENCES `foods` (`id`),
  CONSTRAINT `foodDis_f5_FK` FOREIGN KEY (`food5ID`) REFERENCES `foods` (`id`),
  CONSTRAINT `foodDis_f_FK` FOREIGN KEY (`food1ID`) REFERENCES `foods` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disfood`
--

LOCK TABLES `disfood` WRITE;
/*!40000 ALTER TABLE `disfood` DISABLE KEYS */;
INSERT INTO `disfood` VALUES (1,17,72,53,4,18,'https://www.healthline.com/nutrition/16-best-foods-for-diabetics#section13'),(2,2,3,72,27,79,'https://www.everydayhealth.com/celiac-disease/guide/diet/'),(3,79,2,75,100,1,'https://www.health.harvard.edu/heart-health/11-foods-that-lower-cholesterol'),(4,5,1,18,74,70,'https://www.davita.com/diet-nutrition/articles/advice/top-15-healthy-foods-for-people-with-kidney-disease'),(5,8,16,75,80,28,'https://www.healthline.com/nutrition/best-diet-for-gout#section4'),(6,11,17,18,3,80,'https://www.healthline.com/health/foods-good-for-high-blood-pressure#foods-to-try');
/*!40000 ALTER TABLE `disfood` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-20 21:28:12
