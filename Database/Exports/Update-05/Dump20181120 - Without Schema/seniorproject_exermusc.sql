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
-- Table structure for table `exermusc`
--

DROP TABLE IF EXISTS `exermusc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `exermusc` (
  `exerID` int(11) NOT NULL,
  `mus1` tinyint(4) DEFAULT NULL,
  `mus2` tinyint(4) DEFAULT NULL,
  `mus3` tinyint(4) DEFAULT NULL,
  `mus4` tinyint(4) DEFAULT NULL,
  `mus5` tinyint(4) DEFAULT NULL,
  `mus6` tinyint(4) DEFAULT NULL,
  `mus7` tinyint(4) DEFAULT NULL,
  `mus8` tinyint(4) DEFAULT NULL,
  `mus9` tinyint(4) DEFAULT NULL,
  `mus10` tinyint(4) DEFAULT NULL,
  `mus11` tinyint(4) DEFAULT NULL,
  `link` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`exerID`),
  CONSTRAINT `ExerMusc_FK` FOREIGN KEY (`exerID`) REFERENCES `exercises` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exermusc`
--

LOCK TABLES `exermusc` WRITE;
/*!40000 ALTER TABLE `exermusc` DISABLE KEYS */;
INSERT INTO `exermusc` VALUES (1,1,0,0,1,1,1,1,1,1,1,1,'https://www.pinterest.com/pin/560205641138773899/?lp=true'),(2,0,0,0,0,0,0,0,0,1,1,1,'https://www.livestrong.com/article/540231-hiking-muscles-vs-running-muscles/'),(3,1,1,1,1,1,1,1,1,1,1,1,'https://www.myactivesg.com/Sports/Swimming/How-To-Play/Swimming-facts/What-muscle-groups-do-swimming-develop'),(4,0,0,0,0,0,0,0,0,1,1,1,'https://adventure.howstuffworks.com/outdoor-activities/running/training/leg-workouts-for-runners1.htm'),(5,0,0,0,0,0,0,0,0,1,1,0,'http://www.fitnesshealth101.com/fitness/weight-loss/programs/jogging'),(6,1,1,1,1,1,1,1,1,1,1,1,'http://www.fitnesshealth101.com/fitness/weight-loss/programs/tai-chi'),(7,0,1,0,0,1,0,1,0,1,1,1,'https://www.msn.com/en-us/health/exercise/strength/walking-high-knees/ss-BBtO4Xy'),(8,0,0,0,0,0,0,0,0,0,0,1,'https://www.healthline.com/human-body-maps/foot-muscles#2'),(9,0,0,0,0,0,0,0,0,1,0,0,'https://www.yogauonline.com/yogau-wellness-blog/yoga-practice-tips-steps-stability-refining-one-legged-standing-poses'),(10,1,1,1,1,1,1,1,1,1,1,1,'https://www.webmd.com/fitness-exercise/a-z/yoga-workouts'),(11,0,1,0,0,0,0,0,0,1,1,0,'https://www.drgourmet.com/exercise/no-equipment/superman.shtml'),(12,0,0,1,1,1,1,1,0,0,0,0,'https://orthoinfo.aaos.org/en/recovery/rotator-cuff-and-shoulder-conditioning-program/'),(13,0,0,0,0,0,0,0,0,0,1,1,'https://www.acefitness.org/fitness-certifications/resource-center/exam-preparation-blog/3594/muscles-that-move-the-leg'),(14,0,0,0,0,0,0,0,0,1,1,1,'https://www.breakthroughpt.com/physical-therapy/sports-injury-physical-therapy/marching-performerdrum-corps-physical-therapy/'),(15,0,1,0,1,0,0,0,1,1,1,0,'https://barbend.com/ultimate-squat-guide/'),(16,0,0,0,0,0,0,0,0,1,1,0,'https://www.msn.com/en-ph/health/exercise/strength/knee-raises/ss-BBtOf0P'),(17,0,0,0,0,1,0,0,0,0,0,0,'https://www.verywellfit.com/how-to-do-the-biceps-arm-curl-3498604'),(18,0,1,0,1,0,1,1,1,0,1,0,'https://www.pinterest.com/pin/275352964691242256/?lp=true'),(19,1,0,0,1,1,0,1,0,0,0,0,'https://www.livestrong.com/article/456937-what-muscle-do-you-work-when-you-do-front-raises/'),(20,1,0,0,0,1,1,1,0,0,0,0,'https://breakingmuscle.com/fitness/the-overhead-press-the-difference-between-seated-standing-dumbbell-and-barbell'),(21,0,0,0,0,0,0,0,0,0,0,0,'https://www.darkironfitness.com/what-are-the-benefits-of-wrist-curls/');
/*!40000 ALTER TABLE `exermusc` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-20  1:48:11
