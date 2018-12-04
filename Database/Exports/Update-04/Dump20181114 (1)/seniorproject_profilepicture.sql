CREATE DATABASE  IF NOT EXISTS `seniorproject` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `seniorproject`;
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
-- Table structure for table `profilepicture`
--

DROP TABLE IF EXISTS `profilepicture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `profilepicture` (
  `userID` int(11) NOT NULL,
  `image` longblob,
  PRIMARY KEY (`userID`),
  CONSTRAINT `ppUSERFK` FOREIGN KEY (`userID`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profilepicture`
--

LOCK TABLES `profilepicture` WRITE;
/*!40000 ALTER TABLE `profilepicture` DISABLE KEYS */;
INSERT INTO `profilepicture` VALUES (1,_binary '�\��\�\0JFIF\0\0\0\0\0\0�\�\0�\0	( \Z%!1!%)+...383-7(-.+\n\n\n\r-%+--+-+----------+-----------+----+--------------+-��\0\0�>\"\0�\�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0�\�\0A\0\0\0\0\0\0!1AQ\"aq����2B�\��#�CRbr�\�\�\��3Ss��\�\0\0\0\0\0\0\0\0\0\0\0\0\0\0�\�\0\"\0\0\0\0\0\0\0\0\0!1A\"Qaq�\�\0\0\0?\0O\�vQ�(�bE�\�K�(��Lc��r��\�\�\�5\�\���jK u��ǭwk\��U�Я�G\�6�\�\�;^\�\�؇oU#�\�\�o�t�\�tZ�|:YF\�a���a�!r�l\�\�,X�\�,X�&\�n�\�P\ng\���d�C���*V�m\nu,�(H�B��=S0H\n�\�)��~\"�E\�@�\�I�����$�\�\�%6Xu�Kdea�3,7Ul3\�\�%\0w\\#z\� ��\\\��Qj!\�5\�qv��Ȁ}1J�,\���\�@���\�b8C,5\�\Z\�a\�\�4\�AY\�ɗ��]k���^�y�G�EE\�(ꁮ\��\05h\�\�E<c\�S\�q�\'�\"��&tl#\��E\Z\�3��IQ�J.\r-\�O%eHh\�E�\��U�\�\0\�bPbt1(5`\r��A��ԠՀ 58֥���\�-ju�[kS�j\0�\�Ԯ\rk�<Q9�R\\\�h�֝,�v-�V\�Ûo\�q�f\�\�n\�U\�q�DVn�?5Ȫ�n�$}U��\�u\�y�0���\0#\�\�Aw�s5ո\�\�\naѽ�>D�\\)DF1bŉ�ŋ \r��\�\��Bۛ+y@$�<:L�K�U\r\��3��\�\�\�~�\n;�\�\��Aq�5-���K:) �Z�t�\��h\�\�s\�$Jw���d���cC��w�b\�K?2A��p�E)��	�B.�?��\�3>zf�װ��w.d�����\�/ \�M8n\�&IK(�\�_��\'\�g\�M��\�p��h�\�]J�;�\�\n�W�\�\�Of�.K[\�\�.�7$J��\�\�~\��曩\��\0ۇ�l@\�\0\��\�$�\�~����~&�\�N\�h%\�N@ \�\\D�74\�[\�����=9��Ŏ�qv��\�$o\�#\Z�\����\0+�\�sN�\�E+���ŏO$�\��I\�r投,\�u\�\�C��/oN�W\�\�u�lѽ��kc\�6n \\Ǻ3!\�	�i6>6��H\�\���WH���jAwE�I�\�\�_[�$8�4P\�\�u�\�{g\0\�\"�b�t�S)�̍.m�[�Xg\��[�L��ZkW)�LD\�\�끫�7JC�R�R\�\Z�c�eY�;�o*\0l�ԠԠ\0�Ԡ�J\0$5,5(���8��\0T��S6\�����\�%�$R8n��)_\�@e#C��ɇ�LB\�\�Yt�F�?��a�	mK\�u�*����.UXk%�t�/aa��8\��c{�v\�s�|\�H?E\�=\�p\�=\�\r=t\�:��\�<�%�zj=��3+�\���a�\�)\�|<ӌ���L�\�жj\�\r�\��\nK\�\�\�\�~%Fk��N2w>\�ѩI�T\�\��\���w�\0��h{G�M���Xl�\�\�0\�/\�TI)rXl\�\��K\�=ᮏIm\�\�\�\�IV&6ܲ\�9�\���W�Z\�\�\�\�:Q{�^ܹz6,�}����\�\�K\�5\��E���8S���i`KH#B\r�W/��ĒwG�:L\��.@M\0\0X��v\�E�.\���]�žet\ZN��\�ܮ��\�9�T�~�\�\�\�[�%_�\\G��i4��۲�Y�Jǘ;�\�\�sy8�\�\�6��2\�X?>f�h֋\\ٿt\\\��[xٖdu@\�9_�\0��|�o���k�\�^.���~l\��zh�>����\�\�s��A<��=\�lZ�K٘�\ri+@\0z�1���4�����C\�a�_dͶ�ozL��M��ĸH\�\�k�i�\025\� c2�l���\�\�v�\0v\�/c��\�P�\�\�\�+�[\�R\"`��d��\0�s�	�\�j^\��=��thpM�\�U�\�e�Kʷd\0�%�Y(B@J(��%������\�@\'\0A�I(�p%L\�`�\�Հ��u[r}¦\�\�\�c\�I\�A8\�B\�\�U���\�H\�\�mU7���rH�]\Z�^������-\�v\�s��T%�L�\�G\�\�A\�+\�&��%\�\�\��\�@_H\�E��Z�\�Ȁ}\�\�S���\r%,P1�G�i\0�\�\�\�V�\�hu\��P*06�\�7Xt<�\�y\�N�\�c�\�@&���3X����\�z\�N�\n�V��0\\j\�r�\�H���\�+G\�\�\��&\�\�\�	^�¶��m\�\n�\�%\'	h5NhR�ݕ�U\�\�$\�47hp,9��\�p�FB�\n~\�c�M�\��V�\�\�ӑ\�\n7G�7��\�1B\"y|.ksj\�8f�Ǩ\0�\�\���!8ѱFO\"$}�FAo�\�\�Ԛ\�%\�\�k-m\�\\Ͱ�Tf�\�r��\�F:49�\0RB05q/#b\�Xy�M�,��R]�\�\"�j�\�/���>�����G�i�j�\�4!�\�\�p�\\�!Wۂ\�F\�)��7\�\'s�\�\�~�tG\�\�-9�EE[\'v�@�W:mqOev����Ӱ��d;I^o\�A\���\�\�\������\"y�!b\�н\�>\�\� �m�\�EĨ\�4V\�$\�L�i�\"�,�45�h̓�\'�\�P�jH\�[\�Z0\�TK�;]\n\�z�\�I\�Ąѵl�؎��\'9\�ܫՓ4\�\�)\nr��*F�[�Ŵ�Q�-�X�\r�\0���J$%�����\0PN��9�>2@N�*�)\�Y#cA\�\�=ei���n\�ʥ+�:�\�B\�:F�6i\Z��}��X�^\�e\��l~�:\�w�\�\ny4�46V�6��k����ƴm��pmq\�\'�\r?�\�\nr�\�U@$c�EÁuj����KTp^��kތ9�\�Ĵ�\\z(�����\�\r;諝�71\"܀q�g\�a\�Qh�|\�����N�+/\�4#�\ra��ۢ�İ\�+�?$VxKM\�o~��MOiX��X���\�G�\�#	��w�\�\��QG�\�|\�\�p�l�\�ި���B�%5\�-A8�;�Զj�\\��D�\��6T�F���E�ɏR���ڕ��%eC��\�\�m�5\n�\Z�N�>\r��\�zݻG�R0�`ǋU4�ql�\�\�sIs�-д}�zt\nӃ\����\�\�L�\��\�nl\�\��\n2vV:�\�\�_�g[�U4�>�|]3fw�\�]9�\0\�\�@\��H��0��\0T^�^�T\�\"�\�q*\��\�\�=\�\�\�\\֙\��N\���O�B\�\�Š��M�Z[X(-����PI[a,$��԰�԰�8b�\r0��*\�\�zyM����z$\�x+\n/trK�0h�\�$k����Pt\\�]��Z7e��V\�4�ˀg��l\�����	\0Cor�N84l����\0{\�\�z�l\�>\'��\�-w�^m\�\ZJI��Q��9���RT\�Rqv�H��7;i�ݠ�>�¬\��$;%͝��E�\"�+)�Y-;ă�\�J�,�@�t�ى	+M:�#	bQ\�p8)�ȅ\�\�)q��V�R&��\�\�V	Ί3��\�U�7\�\r�u��BF6d�N)\��\�<�*ɦ�~�\�h�$���\�߻��\� V�_\�ѷ�3�\�\�i��\��\�\�����6�)ذ\�v۸\�|u?5>���\�Y+�Q�\n��\�/`[��Ŋ��N.\�����قU�	\Z\�m\�Vq�\0��\���\r\�P�sTװ�\�Q1\�\r\�8��O0J\Zt��/H\�];\�1\�\'<2�IpR\�,)b\�+����\0RPHe�n�GPP%\�9����nB\���S\�v\�Mc�\�`���	aM�\�^��\�\�s��.�H��:\�^\�Z6]6��ف\\��)\\\�{\� .\�KAj�J�bM�\�N&�m���@��/����6�KE\��E!:\��]�\�EPZ\�\�o�|��\�\���1��?%ر�\n\�\�s6�\��枭<�\��\nia|��8�i\�}l�\�\��S�[��y\�&Q�\�*\�n�69\�n����Q�ƆR\nP�\��L�\�Ea����O�\Z �ϱEX�\�\�) �\r���\"\0\�4B��5�Kc�㦑Ǻ\��\��F$����YH����\�\�\�\�\�#x|B\�\�\�P7�7\��ڢ�.�!4xs\�{cX^\�l�\�/FYP\�F\�\�sL\�{�cQ�6Z\�;�\�\�&sM>y4\�@�hvL#fP�(\�\�u\�ae֖%4U\�\�V����J�*�\�x\�h�N�\�u�\�aT\�1G\�l\�r(\�dY\rk\�bM�t*�i	\�\�7\�\�ewp\�*eP�c\�n�\�Ã8�Jr<خu���D��Ѽ9�\�*�M}=\�.�T�#���O\�n\�\�Z�<\�I\�o�o��p\��\�B�\�CC@�3\rEyf\'e)\�\0�V�W\0�݇p�\�Cm\�^Q\�\�lRz�o�,iA2\�XxJ0��WMTT5�.{�Z7$\�\0\�+�qs*��qg�Ck�\�\�q/�\�\r4��	n\�o=z��\\\��1\�5\��Gk��*\��fFiJ�f���Sfr��\"%$C\�\�P�Z�����ʚ گ�2�ؐ�G��\Ze@J��5\\\�\�	\�\�\0�[c\�QJ,B��\�\�ΐ����\�ԕٖ\�p�*r�)��Ŋ1\�7\�mP�Z\�m��?�l���7@l\�]�6\�\�4�E\�g��7\�D��-��<�\��}w*\�<�u\�p\�E\��`�\�r�\��&�\�W\�\�\ne\�1ɟ�\�\�T\�֪\�a\�tfܓ:Z\'��\�0t`�\�G�,V\�\�A���&\�.��\\GW\�\�\�}l�fT��5e��حKf��>*\\Ir^G�r)��8[�\���\�t��d�l_�-\�Jı0\\rgj�\�\�\�Z�1M\�ad�sT9\�n�=ӵQ��\�1�\�f�sZYQk\�\�e\�GU\�8u��k�\"�b�d\�;(\�%r\�=+:~ \�.�\Z֍N\n��[j��+��\��H�\�JUC�n$Z*\�k]T1\�\�rV\�v|D�\��\�>\'���9�=�fW,���c{Camn�\�BX:��潅�I\�w\�|yҰ�\r�\�7��$�_{�\�4�\�\�̪\�6�\�؝M�]0�\�\�\�5�>\�&�=�S%\�T�\���M\�WO\�?G\�\�\��\�\�\��@\�po� $\�*�M\����l�eA�\�\�\�[��k�\��S{/\�\�`\�K�(�\�	q\�-�Ap\�\"�X@\�\�R�\�SX$�F4`F��\r\�Y��\r�hX4	�ce<d\��p\��?��\�\�\� ~7U��\�F1�?\�7wЄ\�53G�M+�gw>\�\'�Y1˚��ʩ�H���TZ�(�u�t\�u��tj����\��\\��`U�7\\�t�\�\Z\�}\�==A%\�\�\�N�\�\�H6v<\�\�2ICEʁ���\�1%Gh\�\r�+-ޑ�X�(qc�ث0F���7\�+���%SM\�Ya��])*�\�p��&!�\����؝R>!\�\�@o�TJ�B\�=��b�U0���p��lI)Mu�hN�R$��-03�NѺ# \�.\�Z���Ep\�F/����\�קC�<q���M�pWH�\�]p��Y\�͒\�w1�Ơt9�p6+t��r�P\�5F\�m���Q�%��y	���\�w�\�\�k�\��\�\�s�^M�\���M��/�x��\�\�\�3�cϑ�\��ԠNt\�>\�E��}>g\�i�F\�\�7�=�P\�s�����!�\���K�\�7�\�Z��6v���n�.S\�<��\�>��L��\�֚��\��\���dnaט�\�\�9�ۡ�\�N�l%�\�C�>�Ϣ|CnJ�O+�\�\�$~�+F��;�Go\�|�(N\rp�gd\�e-\��\�\\.s�\�\�1,\�`��\��\�\':\�N������\n9$Xqe�\�Iɣ�<��T\�>Wn\�˓G@�w���\�y��[mF\�\�D1���\�\�*�\�=y��\Z`x͎�~)gB�T�ai:�^	�,Ar�%�\n�a�\�v>����-6:�\�&a\�^\�\\��\�.��` ��\��\�S��3��-x��\"\'�\�\���I(�*3F๣�_\�UH�)��\�Y�4\rJ�U�f�\�L�Yb�u�T\�\�\�\�>(\���qOPXtDx�\�[�!\�\�\�7C�A���t\�\�\�N�\�\�\�l��\�\�sT#�\�N\�45\�L\�\�:\�\�\�\�r��0�nq��p��҄\�\�]N\�f\��	�T^\Z\�g�K�ud\�3�����|�!�����l|�\��\�'),(2,NULL),(3,NULL),(4,NULL),(5,NULL),(6,NULL),(7,NULL),(8,NULL);
/*!40000 ALTER TABLE `profilepicture` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-14 23:22:58
