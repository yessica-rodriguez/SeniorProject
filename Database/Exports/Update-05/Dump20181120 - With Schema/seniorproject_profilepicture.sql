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
INSERT INTO `profilepicture` VALUES (1,_binary 'ÿ\Øÿ\à\0JFIF\0\0\0\0\0\0ÿ\Û\0„\0	( \Z%!1!%)+...383-7(-.+\n\n\n\r-%+--+-+----------+-----------+----+--------------+-ÿÀ\0\0Ÿ>\"\0ÿ\Ä\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0ÿ\Ä\0A\0\0\0\0\0\0!1AQ\"aq‘¡±2BÁ\Ñð#‚CRbr¢\Â\Ò\áñ3Ss’ÿ\Ä\0\0\0\0\0\0\0\0\0\0\0\0\0\0ÿ\Ä\0\"\0\0\0\0\0\0\0\0\0!1A\"Qaqÿ\Ú\0\0\0?\0O\ÐvQó(ÀbE›\ÕK(¶Lcˆ¸rº¡\Ç\Æ\Ç5\Û\ê«ŽjK u¹…Ç­wk\×ñU‚Ð¯§G\à6½\Å\Ï;^\ê›\ÅØ‡oU#\î´\äo“tú\ÝtZŠ|:YF\ía·÷­aó!r«l\Õ\Ã,X´\Ó,X€&\Ðn\ÄP\ng\Ù¦—d³CÀŸ‘*V¡m\nu,„(H¼B­=S0H\n’\Æ)²¨~\"¦E\â£@Á\ÕIº©±’$µ\Â\É%6XuðKdea´3,7Ul3\ì\ë%\0w\\#z\Î Á\\\Ý·Qj!\ï5\ÃqvŸŸÈ€}1J™,\Ðõ§\Æ@µ¡\êb8C,5\Ñ\Z\Åa\Ì\ç4\ê»AY\ÚÉ—¦–]k‡žú^ðyóG¯EE\â(ê®\Æÿ\05h\Å\ëE<c\ÉS\ëq‘\'Š\"¾›&tl#\ÙôE\Z\Ä3†ñIQ—J.\r-\äO%eHh\ÆE°\ÄöU°\Ô\0\ÐbPbt1(5`\rµ‰A‰ÀÔ Õ€ 58Ö¥¥† \Ñ-ju­[kS­j\0©\àÔ®\rkœ<Q9´R\\\Ûh¢Ö,­v-ñŠV\ÊÃ›o\Éq¬f\Ù\Èn\×U\Øq°DVnö?5Èª n·$}U±ð›\éu\ây‹0†·ÿ\0#\Ø\ßAw•s5Õ¸\â…\Ç\naÑ½Ž>Dý\\)DF1bÅ‰€Å‹ \r‚‹\á\ÂöBÛ›+y@$ô<:LK‡U\r\Ò·3´µ\Î\×\é~¾\n;ñ\Ø\ÛöAqö5-•ô—K:) žZªt˜\ìòh\Ð\Ös\î$Jw½ýˆdù³‡cCùƒwþb\ÞK?2Aø§pôE)±‚	·B.¼?‚ª\Ü3>zf²×° ¤w.d²þª¡\Ë/ \ÅM8n\æ&IK(ò\ì_“ü\'\Ég\åMý¿\Ñp¬«h\Ï]J€;À\â\nW\Ä\ØOfù.K[\Ø\Ê.ð7$JÁ‘\í\å~\éðæ›©\âŒð\0Û‡‡l@\Ê\0\èü\×$ô\Ê~÷šü~&\íN\Íh%\ÇN@ \Õ\\D÷74\ë[\î¾„¡œ=9©¶ÅŽ¹qv½¡\Ó$o\ä#\Z’\Ñöˆ¸\0+¯\ÄsNò\ÇE+Ÿ¦œÅO$ñ\ÅöI\æræŠ•,\Õu\Æ\ÉC·³/oN¡W\ë\áu·lÑ½üòkc\â6n \\Çº3!\Ê	¸i6>6½”H\Å\ÈüõWH…«ñ©jAwEôI±\Â\Ú_[ú$8ƒ4P\ã\Ìuœ\Ñ{g\0\í\"þbút°S)¨Ì.mõ[ÁXg\áõ[»Lœ—ZkW)øLD\æ\ãšë«›7JC‚RƒR\ì”\Z¥ceY•;•o*\0l°Ô Ô \0Ô €J\0$5,5(°¦µ8À\0T›¨S6\ï–‰Š¹\Þ%·$R8n•¸)_\Å@e#Cª¢É‡¶LB\×\ÐYtüF?²§a¸	mK\åuõ*‘–„’.UXk%§tû/aaõ¯8\ÔÀc{£v\ìsš|\ÚH?E\é=\Åp\Î=\Ã\r=t\í:‡¼\Ê<¤%Àzj=´3+«\ÊÀªa¤\ë)\Ü|<ÓŒ—û§L\ÖÐ¶j\Ã\rþ\Ñö\nK\ëŸ\Ê\Ã\È~%Fk¯°N2w>\ÈÑ©IŒT\Ì\çó‰\Öú’wÿ\0…ºh{G€Mô½úXl‰\Ó\Ð0\î/\æTI)rXl\ë\ÛòK\é=á®Im\Ü\ß\é\î—IV&6Ü²\Î9ž\Ì•§WžZ\Û\Â\é\Ê:Q{¼^Ü¹z6,®}õ¥…ý\ï²\ÏK\ë5\ÅüE÷þ¥8S˜–i`KH#B\rüW/¨™Ä’wG±:L\Ýò.@M\0\0X´÷v\ÚEª.\ÈŒ’]•Å¾et\ZN§’\ÂÜ®¶Ž\ê9õT«~ô\Í\Ã\Ø[ý%_ð\\Gªži4•ÁÛ²‹Y‚JÇ˜;ñ\ê\ísy8¸\Ó\ê§6€¾2\çX?>f°hÖ‹\\Ù¿t\\\Ø[xÙ–du@\Û9_ÿ\0­ú|oþŠ£kš\Ò^.‚³ö~l\ÏÁzh©>ž™™\Ü\ãs˜÷A<²=\ÑlZ„KÙ˜€\ri+@\0zþ1†ö’4ö‡ø›¡C\êŽaø_dÍ¶ºozLƒ‹M¢¡Ä¸H\í\ák¤iÿ\025\Ã c2¸lœ¤„\Ô\Õvÿ\0v\å/cþ£\èP¥\Ö\â\â+„[\àR\"`Áµdªÿ\0•s¾	©\íj^\ïº=”²thpM–\ì”U”\Æe–KÊ·d\0‹%¥Y(B@J(°€%€°¦„¶„\à@\'\0A€I(p%L\Ë` \ÕÕ€ÀðŸu[r}Â¦\Ì\Õ\ã­c\ËI\ÙA8\ìB\æ\áUøš•\ÓH\â\ÓmU7¡©rHð]\Z¢^·‡«›-\Ëv\Õs¯ŒT%µL’\×G\è\ÂA\Ä+\Â&»²%\×\Ü\îžø\Ë@_H\ÉE¯õZñ”\ÛÈ€}\Ò\ÇS¡ûƒ\r%,P1’Gži\0‘\ï\Ö\ìV°\Øhu\Ò÷P*06¸\Þ7Xt<”\ãy\ÚN¡\Íc¼\Æ@&ª°™3X­ô¿€\Öz\ßNŸ\n¸Vªð—0\\j\èr¹\ÓH¶ ª\Þ+G\Ù\Ê\æò&\ã\È\ê©	^™Â¶‰˜m\Ø\nš\Ê%\'	h5NhR”Ý•ŒU\é\é¹$\â47hp,9…·\ÓpˆFB\n~\ÚcøM¨\àŠVµ\í\çÓ‘\æ\n7G…7¥ü\Ô1B\"y|.ksj\æ8fÇ¨\0‚\Ó\â¢™!8Ñ±FO\"$}½FAoš\Æ\ïŒÔš\ê%\â”\Ìk-m\ê§\\Í°¯Tf¹\Õr‹½\ÑF:49ÿ\0RB05q/#b\ëXy Mú,¯úR]ò\ç\"Àj±\á/»œ>˜‘™¦˜Gªi»j‹\å4!ñ˜\ä\Íp±\\ò!WÛ‚\ÉF\â)§Ž7\ì\'s\í\Ô~¯tG\Ç\â-9EE[\'vƒ@ýW:mqOev¢¢¬ŽÓ°‡÷d;I^o\ËA\Ùøõ\ä¢\Ñ\âõ•²ˆ¦\"y¶!b\áÐ½\×>\Ê\ç ÷m¡\ÑEÄ¨\Î4V\Ç$\×Lñ©i¨\"Š,‘45 hÌ“¹\'©\ÕPñjH\ç[\ÅZ0\ÌTKˆ;]\n\áz®\ÖI\ÖÄ„Ñµl‹ØŽÁ»\'9\ÖÜ«Õ“4\Ô\á»)\nr•»*F€[²Å´£Q«-¬X°\r¥\0´¶€J$%„´°’‚\0PN†§9…>2@Nº*þ)\ÆY#cA\Ö\È=eiŽ•¬n\ÆÊ¥+‰:®\åB\Û:F‹6i\Z„•}¯ÀXö^\Ãe\Èøl~ú:\Ýw¶\à\ny4ô46V¸6“³k…­ª•Æ´m’Žpmq\È\'‘\r?…\Ñ\nr“\â¤U@$c˜EÃujœ¿•”KTp^›´kÞŒ9‡\ÊÄ´û\\z(ø³³œ»\ê—\r;è« 71\"Ü€q¼g\Ëa\êQh†|\à® òNõ+/\ê4#§\ra¾÷Û¢ƒÄ°\ß+ý?$VxKM\Úo~ŸˆMOiXôòX¥ü¬\ÙGø\Ð#	©·w®\È\Û«QG•\×|\Ñ\Øpºl‹\è˜Þ¨”žŽB£%5\ê-A8€;©Ô¶j‘\\‘•Dš\Îð6TüFù¬E•ÉR˜‘Ú•°•%eCö¢\Ö\åm®5\nž\Z‰N—>\rµ•\ÖzÝ»G°R0š`Ç‹U4¾qlƒ\à\ïsIsˆ-Ð´}¢zt\nÓƒ\á¦¸¸’\îº\åL­\Èü\ànl\ï\Í¹\n2vV:ƒ\í\Ç_ög[¢U4–>«|]3fw’\Ü]9ÿ\0\È\é@\àüH±’0žª\0T^ª^—T\Ì\"ª\Ïq*\ãÀ\Ô\ä=\Ï\Í\×\\Ö™\ÉN\ë¯¸O®B\Æ\ÂÅ ¶ƒM¬Z[X(-„”‚PI[a,$°€Ô°Ô°ƒ8bµ\r0°û*\ã\ÊzyM€º™z$\Ñx+\n/trK²0h‚\çŸ$k ñ ¶Pt\\¹]²Z7e°´VÂ˜\ç4øË€g‰µl\èû¯·õ	\0Cor¨N84l»úÿ\0{\Ç\Åz£l\Ñ>\'‹µ\í-w‘^m\â\ZJI£Q³¹9¼œ¡RT\ÌRqv‹H¯7;i¾Ý €>õÂ¬\àõ$;%Í§‘E»\"ö+)—Y-;Äƒ§\ÑJŽ,©@¥t­Ù‰	+M:§#	bQ\Ép8)‘È…\Ä\ë)q¿’V‡R&¾¦\Â\ÝV	ÎŠ3£¹\è£UÁ7\Ü\rõuˆôBF6d—N)\Ç­\Þ<ú*É¦ª~…\Íhð$ŸÁ¢\Âß»¿Š\ß Vù_\ØÑ·ð3ü\ä\ßišù\éù\Ð\àð €6ô)Ø°\ÊvÛ¸\Ð|u?5>±‡\ÐY+òQ­\n£ª\í/`[¡µÅŠ®ñN.\ã‡¢µŒÙ‚U€	\Z\ám\îŸVqÿ\0‘ð\äô•\r\×PøsT×°ƒ\ÍQ1\Ì\r\Ñ8€øO0J\Zt®©/H\å];\ì1\Ø\'<2¤IpR\×,)b\Ð+µµ¥‹\0RPHeÀnƒGPP%\Ä9¦Œ°nB\Ð° S\âv\ÅMc\Ù`„°›	aM½\Ò^·²\È\ãsš.½Hºü:\Ä^\ÂZ6]6Ž­Ù\\¿€)\\\Ù{\Í .\ÍKAj†J³bM‰\×N&¡m…“¡@¡´/À ©–6»KE\ÈòE!:\Íü]€\ËEPZ\æ€\Òo›|¤—\ç\Õˆ‡1¯À?%Ø±ü\n\È\Ìs6÷\Øýæž­<Š\æž\nia|Á›8ói\Ô}lª\ç\éS [Ž«y\Ò&Q„\Ë*\Çn™69\Ün µú©Q²Æ†R\nP˜\Þ÷L¹\ÉEa˜ªº©O±\Z ”Ï±EXû\î\Ú) ‡\r“±—\"\0\ß4Bœ·5€Kc‚ã¦‘Çº\Óô\èµñ¿°F$³®ž—YHö¹·º\Æ\Í\Ú\Ã\Ä#x|B\Ç\Î\èP77\ÆþÚ¢”.°!4xs\å{cX^\âl¸\æ/FYP\æŽF\ë\ÐsL\Ñ{®cQ‡6Z\Ç;ª\è\Å&sM>y4\í¿@¬hvL#fPˆ(\É\ìu\ÃaeÖ–%4U\Ö\ÒVžû”’J©*»\Äx\Èh³N¥\ãuÀ\åaT\Ø1G\Èl\ãr(\èdY\rk\ÝbM¯t*ºi	\Ñ\Å7\å\Îewp\î±*eP§c\Ãnõ\ÕÃƒ8¸Jr<Ø®uˆ¸¹D •Ñ¼9¦\Ä*ùM}=\Ç.T¸#ý¡™O\Ún\ê\ÚZ <\íI\Âooª¹p\ß†\êB½\á¸CC@’3\rEyf\'e)\Ø\0V„W\0ªÝ‡pŽ\ÔCm\Õ^Q\Ù\ÔlRzôoš,iA2\ÙXxJ0µ‹WMTT5.{ƒZ7$\Ø\0\é+™qs*ù°qgžCkú\ï\ê‹q/À\èŸ\r4ò	n\Ío=zòõ\\\îŸ—1\Ú5\ÆþGkþº*\ÇófFiJ‡f¨˜SfrŒ÷\"%$C\í\íºPªZ™€¨¯ŠÊš Ú¯±2ªØõGô\Ze@J‡·5\\\í\Ö	\Ê\Ç\0ö[c\ÄQJ,Böó\ä¨\ÔÎý–’Œ\áÔ•Ù–\Úpñ*r‚)³¡ÅŠ1\Í7\émP³Z\Ömžˆ?òl¼˜7@l\Ð]ó6\é\Ñ4ñE\Ægž¯7\ÃD‹¯-Œ¯<…\Äò³}w*\Å<¹u\Ìp\ÌE\Ùó`ú\ìrñ\îŸÁ&ö\ÄW\ã„\Ì\ne\Í1ÉŸª\Ã\íT\ïÖª\í‹a\ítfÜ“:Z\'·°\Î0t`©\ÈG³,V\èŠ\ÝAôª±&\ë.°¡\\GW\Ù\Â\ã}l‰fTŸˆ5e­°Ø­Kf¢‰>*\\Ir^G—r)·¼8[š\ÎÀõ\Ýt¨£dªl_¼-\ÕJÄ±0\\rgj¥\Ê\ì\ÖZñ«1M\Ñad­sT9\Ènª=ÓµQ’“\Í1®\ÑføsZYQk\è\íe\íGU\Ã8u¥¯k‡\"b¼d\æ;(\ä¥%r\Ð=+:~ \È.¦\ZÖN\nò‚[jõ¹+™¶\ËùH²\ÔJUC©n$Z*\ák]T1\é\ÎrV\ÆÂv|D†\æ\Ê>\'¼¥9…=¯fW,¯Á£c{Camn©\×BXï…ª:––æ½…®I\ä¹w\Ä|yÒ°†\r€\Û7ö¿$¬_{›\Ù4\Û\ÏÌª\Æ6ü\ÑØM´]0Ž\ì\å“\á5±>\Ñ&þ=‹S%\ÓT’\Øô¹M\ÈWO\Â?G\é«\Ü\Í­\é\Ó\ÉŽ@\ápoø $\Ý*‹M\Çü¤”l¬eA²\Ô\Û\ã[¤©kô\ØôS{/\×\ä¥Â‹`\ÃK (›\â	q\Ó-ôAp\Ð\"”X@\æˆ\ÒR¢\ÐSX$–F4`F££\r\ØY¦ˆ\r”hX4	¬ce<d\îóp\Öõ?’Ž\ä\Ê\é ~7Už¡\ÌF1?\Þ7wÐ„\Å53GŠM+Žgw>\î\'©Y1Ëš¬±Ê©†H½°TZ›(¨u­t\äuÀƒtj“˜ù§\Çô\\•ð³`U‚7\\•t§\Ç\Z\æ‘}\ì¹==A%\á¹\Ü\éN¢\é\ÜH6v<\Ý\Å2ICEÊ†Œ¬\Õ1%Gh\ë\r—+-Þ‘•X¡(qcúØ«0F¹ºª7\á+¹„‹%SM\ÑYa¥¦])*ƒ\Ûp¨Ÿ&!\àŠòöØR>!\Â\×@o¸TJ¤B\Î=¤©b£U0“õ€pº…lI)Mu”hN¶R$Œ‡-03‡NÑº# \Ì.\ÕZ…£Ep\á¦F/º„õ²\Ø×§Cœ<qº¯ñM¦pWH©\Ã]p¨¼Y\ïÍ’\âw1òÆ t9ñp6+tø‰r¡P\Ö5F\è«mªœ±Q‹%—Šy	¡ø£\åwŽ\è\ÓkŸ\Éª\Ä\äs¬^Mõ\×ý‘M˜ò/x±„\Ø\í\É3ˆcÏ‘½\çôÔ Nt\É>\ÃE¤“}>g\è­i–F\Ç\äª7ð¿=ÁP\çsŸ®–º¦!¿\×ô’K½\É7ù\ÙZ¨˜6v–ºýn›.S\äŒ<¨\×>¡—L™¢\ÖÖš–ƒ\Ñ¡\Åò÷dna×˜ü\Ð\â9 Û¡¤\ÍN‹l%’\ÆC‡>£Ï¢|CnJ£O+˜\ì\Ì$~º+F‹‰;§Go\à|º(N\rp¬gd\èe-\Úþ\Ê\\.s·\Ó\Í1,\Í`»¶\Ý¯\â\':\í‹N§Ÿ¢šƒ—\n9$Xqe\ëIÉ£ñ<‚¨T\Õ>Wn\ãË“G@£w‰½õ\æy”û[mF\Ü\×D1¨œó\È\ä*˜\å=y¦±\Z`xÍŽ¤~)gB˜T÷ai:^	¤,Ar™%Ÿ\n¹a±\èv>¼‰¢-6:„\Æ&a\Ñ^\å\\ø†\î.²®` ›«\Ïº\×Sœº3Ž“-x„ù\"\'Á\á\Êö’I(Ž*3Fà¹£«_\ÜUH®)ù‘\ÚY4\rJU¶f‘\æªL’Yb¸u½T\Ü\Ý\Æ\ê>(\ê»øÀqOPXtDx»\í[”!\Ø\å\Î7C…A¶ª÷t\Ñ\È\áNŠ\Ô\ì\Êl°\Ú\ÈsT#¢\éN\É45\ïL\È\Æ:\Æ\é\Ø\Ýr†0¡nq¢²p“ò‚Ò„\á´\Ú]N\Ãf\Êõ	»T^\Z\ÙgšK¨ud\Í3¼¦®¯º|!€—Ÿ¸õl|Ž\éÿ\Ù'),(2,NULL),(3,NULL),(4,NULL);
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

-- Dump completed on 2018-11-20  1:47:10
