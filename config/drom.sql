/*
SQLyog Ultimate v8.32 
MySQL - 5.5.28 : Database - drommanager
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`drommanager` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `drommanager`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(12) NOT NULL,
  `mgpower` varchar(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

/*Data for the table `admin` */

insert  into `admin`(`id`,`username`,`password`,`mgpower`) values (1,'admin','123','3');

/*Table structure for table `bbsreply` */

DROP TABLE IF EXISTS `bbsreply`;

CREATE TABLE `bbsreply` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `rtid` int(11) NOT NULL,
  `tuid` int(11) NOT NULL,
  `rcontent` varchar(500) NOT NULL,
  `rreplydate` datetime DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `bbsreply` */

/*Table structure for table `bbssection` */

DROP TABLE IF EXISTS `bbssection`;

CREATE TABLE `bbssection` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(30) NOT NULL,
  `snumber` varchar(3) NOT NULL,
  `sclickcount` int(11) DEFAULT NULL,
  `sreplycount` int(11) DEFAULT NULL,
  `spicture` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `bbssection` */

/*Table structure for table `bbstopic` */

DROP TABLE IF EXISTS `bbstopic`;

CREATE TABLE `bbstopic` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `tsid` int(11) NOT NULL,
  `tuid` int(11) NOT NULL,
  `ttitle` varchar(60) NOT NULL,
  `tcontent` varchar(500) NOT NULL,
  `tflag` varchar(8) DEFAULT NULL,
  `tclickcount` int(11) DEFAULT NULL,
  `tfdate` date DEFAULT NULL,
  `tldate` date DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `bbstopic` */

/*Table structure for table `bbsuser` */

DROP TABLE IF EXISTS `bbsuser`;

CREATE TABLE `bbsuser` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(16) NOT NULL,
  `upassword` varchar(16) NOT NULL,
  `usex` varchar(4) DEFAULT NULL,
  `uemail` varchar(16) DEFAULT NULL,
  `utopicnum` int(11) DEFAULT NULL,
  `upicture` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `bbsuser` */

/*Table structure for table `stubuild` */

DROP TABLE IF EXISTS `stubuild`;

CREATE TABLE `stubuild` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `bname` varchar(8) NOT NULL,
  `btype` varchar(4) NOT NULL,
  `bdetail` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

/*Data for the table `stubuild` */

insert  into `stubuild`(`bid`,`bname`,`btype`,`bdetail`) values (1,'1','女','创建于2017年十一月'),(2,'2','女','创建于2017年十一月'),(3,'3','男','该宿舍主要为环境学院学生'),(4,'4','男','该栋以电工学院为主'),(5,'5','男','隶属于计算机学院'),(6,'6','男','计算机学院'),(7,'7','女','该宿舍区环境优雅,具有良好的娱乐环境!'),(8,'8','女','概述社区背靠青龙山,环境优雅!');

/*Table structure for table `studressing` */

DROP TABLE IF EXISTS `studressing`;

CREATE TABLE `studressing` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `dstuid` varchar(13) NOT NULL,
  `dname` varchar(8) NOT NULL,
  `dsex` varchar(4) DEFAULT NULL,
  `ddromnum` varchar(5) NOT NULL,
  `dcollege` varchar(12) DEFAULT NULL,
  `dmajor` varchar(12) DEFAULT NULL,
  `ddatial` varchar(50) DEFAULT NULL,
  `ddate` date DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `studressing` */

insert  into `studressing`(`did`,`dstuid`,`dname`,`dsex`,`ddromnum`,`dcollege`,`dmajor`,`ddatial`,`ddate`) values (1,'201440460138','王庆平','男','6102','计算机学院','物联网工程','使用吹风机','2017-11-06'),(2,'201440460139','方 波','男','6102','计算机','物联网','宿舍做饭','2017-11-06'),(3,'20144045044','方水盛','男','5427','计算机学院','环境工程','晚归','2017-11-06');

/*Table structure for table `studrom` */

DROP TABLE IF EXISTS `studrom`;

CREATE TABLE `studrom` (
  `drid` int(11) NOT NULL AUTO_INCREMENT,
  `drbuildid` varchar(2) NOT NULL,
  `drdromid` varchar(5) NOT NULL,
  `drnum` int(2) DEFAULT NULL,
  `drcount` int(2) DEFAULT NULL,
  `drtel` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`drid`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4;

/*Data for the table `studrom` */

insert  into `studrom`(`drid`,`drbuildid`,`drdromid`,`drnum`,`drcount`,`drtel`) values (1,'1','101',4,0,'13597661080'),(2,'1','102',6,0,'15902267571'),(3,'1','103',4,0,'13650288555'),(4,'1','104',4,0,'18271653265'),(5,'1','105',4,0,'13597634634'),(6,'1','106',4,0,'13234355432'),(7,'1','107',4,0,'13597661234'),(8,'1','109',4,0,'13597661023'),(9,'1','110',4,0,'13597661083'),(10,'1','205',4,0,'13523413234'),(11,'1','206',4,0,'13234525432'),(12,'1','207',4,0,'13597124454'),(13,'1','210',4,0,'13597321343'),(14,'1','208',4,0,'13597645234'),(15,'1','209',4,0,'15053467872'),(16,'1','204',4,0,'13397661234'),(17,'1','203',4,0,'13457661083'),(18,'2','205',4,0,'13523413234'),(19,'2','206',4,0,'13234525432'),(20,'2','207',4,0,'13597124454'),(21,'2','210',4,0,'13597321343'),(22,'2','208',4,0,'13597645234'),(23,'2','209',4,0,'15053467872'),(24,'2','204',4,0,'13397661234'),(25,'2','203',4,0,'13457661083'),(26,'3','205',4,0,'13523413234'),(27,'3','206',4,0,'13234525432'),(28,'3','207',4,0,'13597124454'),(29,'3','210',4,0,'13597321343'),(30,'3','208',4,0,'13597645234'),(31,'3','209',4,0,'15053467872'),(32,'3','204',4,0,'13397661234'),(33,'3','203',4,4,'13457661083'),(34,'4','205',4,0,'13523413234'),(35,'4','206',4,0,'13234525432'),(36,'4','207',4,0,'13597124454'),(37,'4','210',4,0,'13597321343'),(38,'4','208',4,0,'13597645234'),(39,'4','209',4,0,'15053467872'),(40,'4','204',4,0,'13397661234'),(41,'4','203',4,1,'13457661083');

/*Table structure for table `stumanager` */

DROP TABLE IF EXISTS `stumanager`;

CREATE TABLE `stumanager` (
  `mgid` int(11) NOT NULL AUTO_INCREMENT,
  `mgstuid` varchar(13) NOT NULL,
  `mgname` varchar(16) NOT NULL,
  `mgpassword` varchar(16) NOT NULL,
  `mgbuildnum` varchar(2) NOT NULL,
  `mgmyname` varchar(8) DEFAULT NULL,
  `mgsex` varchar(4) DEFAULT NULL,
  `mgtel` varchar(11) DEFAULT NULL,
  `mgpower` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`mgid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

/*Data for the table `stumanager` */

insert  into `stumanager`(`mgid`,`mgstuid`,`mgname`,`mgpassword`,`mgbuildnum`,`mgmyname`,`mgsex`,`mgtel`,`mgpower`) values (1,'201440460138','一条会飞的鱼','jisuanji','3','占煜炜','男','18271652073','2'),(2,'201440460139','花儿为什么开的那么红','renminweizhong','4','王小兵','男','15902267571','2'),(3,'201440450144','还是躺着舒服!','woshishagua','5','黎春晖','男','18271656954','2'),(4,'201440450123','枫叶飘零后的冬季','dongtianhenmei','1','徐芳婷','女','18271652073','1'),(5,'201440460106','页面未找到404','daimahaonan','2','方雨婷','女','13697661070','2'),(6,'201440460155','天总是很蓝','lantian','6','陈麒年','男','13697669835','2'),(7,'201440460154','名字好难取','nannan','6','吴宝玉','男','13657665492','1');

/*Table structure for table `stumy` */

DROP TABLE IF EXISTS `stumy`;

CREATE TABLE `stumy` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `mstuid` varchar(13) NOT NULL,
  `mname` varchar(8) NOT NULL,
  `mpassword` varchar(16) NOT NULL,
  `msex` varchar(4) DEFAULT NULL,
  `mage` date DEFAULT NULL,
  `mbuildnum` varchar(2) NOT NULL,
  `mdrom` varchar(5) NOT NULL,
  `mcollege` varchar(12) NOT NULL,
  `mmajor` varchar(12) NOT NULL,
  `mtel` varchar(11) DEFAULT NULL,
  `mparenttel` varchar(11) DEFAULT NULL,
  `mpicture` varchar(30) DEFAULT NULL,
  `maddress` varchar(50) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  `mstate` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

/*Data for the table `stumy` */

insert  into `stumy`(`mid`,`mstuid`,`mname`,`mpassword`,`msex`,`mage`,`mbuildnum`,`mdrom`,`mcollege`,`mmajor`,`mtel`,`mparenttel`,`mpicture`,`maddress`,`mdate`,`mstate`) values (1,'201440460138','占煜炜','jisuanji','男','1995-07-21','4','203','计算机','物联网','18271652073','15902267571','/pic/1509969797094.jpg','湖北省黄石市下陆区','2017-11-06','1'),(2,'201440460139','王轶翔','asdfasdf','男','1995-08-11','3','203','计算机学院','软件工程','13697661080','13697661080','/pic/1.png','湖北省咸宁市','2017-11-06','0'),(3,'201440460140','李海森','asdfasdf','男','1995-04-29','3','203','计算机学院','物联网工程','13697661080','13697661080','/pic/1509970047568.jpg','湖北省黄石市下陆区','2017-11-06',''),(4,'201440460141','王庆平','zxasqw','男','1995-11-06','3','203','计算机学院','物联网工程','18276489898','18276489898','/pic/1509970145204.PNG','湖北省浠水县','2017-11-06','1'),(5,'201440460142','黄卫廷','jisuanji','男','1995-09-27','3','203','计算机学院','物联网工程','18271652073','18271652073','/pic/1509970244280.jpg','湖北省黄石市下陆区湖北理工学院','2017-11-06','0');

/*Table structure for table `stunotic` */

DROP TABLE IF EXISTS `stunotic`;

CREATE TABLE `stunotic` (
  `nid` int(11) NOT NULL AUTO_INCREMENT,
  `ndromnum` varchar(5) NOT NULL,
  `nwater` int(4) DEFAULT NULL,
  `nelectric` int(4) DEFAULT NULL,
  `ndate` date DEFAULT NULL,
  `nstate` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

/*Data for the table `stunotic` */

insert  into `stunotic`(`nid`,`ndromnum`,`nwater`,`nelectric`,`ndate`,`nstate`) values (1,'6102',50,45,'2017-11-06','0'),(2,'5427',89,56,'2017-11-06','0'),(3,'5429',12,32,'2017-11-06','1'),(4,'6612',45,62,'2017-11-06','0'),(5,'6003',56,65,'2017-11-06','0'),(6,'6104',45,56,'2017-11-06','1'),(7,'5428',12,46,'2017-11-06','1'),(8,'4402',35,42,'2017-11-06','1');

/*Table structure for table `sturecord` */

DROP TABLE IF EXISTS `sturecord`;

CREATE TABLE `sturecord` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `rdromnum` varchar(5) NOT NULL,
  `rname` varchar(8) NOT NULL,
  `rnote` varchar(50) NOT NULL,
  `rdate` date DEFAULT NULL,
  `rstate` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `sturecord` */

/*Table structure for table `stuscore` */

DROP TABLE IF EXISTS `stuscore`;

CREATE TABLE `stuscore` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sdromnum` varchar(5) NOT NULL,
  `shygiene` int(3) NOT NULL,
  `sculture` int(3) NOT NULL,
  `ssave` int(3) NOT NULL,
  `sgrade` varchar(4) NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

/*Data for the table `stuscore` */

insert  into `stuscore`(`sid`,`sdromnum`,`shygiene`,`sculture`,`ssave`,`sgrade`) values (1,'6102',99,99,99,'A'),(2,'5427',59,90,70,'C'),(3,'5428',68,98,88,'C'),(4,'6103',59,78,99,'C'),(5,'6104',88,88,88,'C'),(6,'6105',90,90,90,'B'),(7,'6105',89,89,89,'C'),(8,'6106',99,90,90,'B'),(9,'6107',99,90,95,'A'),(10,'6107',89,89,89,'C');

/*Table structure for table `stuvisitor` */

DROP TABLE IF EXISTS `stuvisitor`;

CREATE TABLE `stuvisitor` (
  `vid` int(11) NOT NULL AUTO_INCREMENT,
  `vcdate` date DEFAULT NULL,
  `vldate` date DEFAULT NULL,
  `vname` varchar(8) DEFAULT NULL,
  `vdrom` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

/*Data for the table `stuvisitor` */

insert  into `stuvisitor`(`vid`,`vcdate`,`vldate`,`vname`,`vdrom`) values (4,'2017-11-06',NULL,'李二狗','5427'),(5,'2017-11-06',NULL,'二狗子','6102'),(6,'2017-11-06',NULL,'铁蛋','4305');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
insert into `drommanager`.`sturecord` values ( NULL,'5427','石头','断电','2017-06-06','1');
insert into `drommanager`.`sturecord` values ( NULL,'5426','二丫','断电','2017-04-06','0');
insert into `drommanager`.`sturecord` values ( NULL,'5431','铁蛋','断电','2017-05-06','1');
insert into `drommanager`.`sturecord` values ( NULL,'5444','二狗子','断电','2017-07-06','1');