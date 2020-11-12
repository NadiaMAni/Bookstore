# MySQL-Front 3.2  (Build 6.11)

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES 'utf8mb4' */;

# Host: localhost    Database: bookstore
# ------------------------------------------------------
# Server version 5.5.5-10.4.14-MariaDB

#
# Table structure for table book
#

DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(30) NOT NULL,
  `Author` varchar(30) NOT NULL,
  `releaseDate` date NOT NULL,
  `pricebook` double(20,0) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;

#
# Dumping data for table book
#

INSERT INTO `book` (`id`,`Title`,`Author`,`releaseDate`,`pricebook`) VALUES (1,'la vie','loulou','2020-09-11',80);
INSERT INTO `book` (`id`,`Title`,`Author`,`releaseDate`,`pricebook`) VALUES (2,'ggg','nn','1970-01-01',20);
INSERT INTO `book` (`id`,`Title`,`Author`,`releaseDate`,`pricebook`) VALUES (3,'fvf','vvv','1970-01-01',30);
INSERT INTO `book` (`id`,`Title`,`Author`,`releaseDate`,`pricebook`) VALUES (4,'kkk','ggg','1970-01-01',50);
INSERT INTO `book` (`id`,`Title`,`Author`,`releaseDate`,`pricebook`) VALUES (5,'uuu','iii','1970-01-01',90);
INSERT INTO `book` (`id`,`Title`,`Author`,`releaseDate`,`pricebook`) VALUES (6,'yyyy','uuu','1970-01-01',40);
INSERT INTO `book` (`id`,`Title`,`Author`,`releaseDate`,`pricebook`) VALUES (7,'ggg','lll','1970-01-01',20);
INSERT INTO `book` (`id`,`Title`,`Author`,`releaseDate`,`pricebook`) VALUES (8,'hhhh','jjjj','1970-01-01',20);
INSERT INTO `book` (`id`,`Title`,`Author`,`releaseDate`,`pricebook`) VALUES (9,'mmm','ppp','1970-01-01',10);
INSERT INTO `book` (`id`,`Title`,`Author`,`releaseDate`,`pricebook`) VALUES (10,'gg','hhh','1970-01-01',10);
INSERT INTO `book` (`id`,`Title`,`Author`,`releaseDate`,`pricebook`) VALUES (11,'nadia','mani','1970-01-01',20);
INSERT INTO `book` (`id`,`Title`,`Author`,`releaseDate`,`pricebook`) VALUES (12,'manii','nadiia','1970-01-01',10);
INSERT INTO `book` (`id`,`Title`,`Author`,`releaseDate`,`pricebook`) VALUES (13,'jjk','df','2020-10-10',10);

#
# Table structure for table commandline
#

DROP TABLE IF EXISTS `commandline`;
CREATE TABLE `commandline` (
  `idcmdline` int(11) NOT NULL AUTO_INCREMENT,
  `idBook` int(20) NOT NULL,
  `pricebook` double(20,0) NOT NULL,
  `quantity` int(20) NOT NULL,
  `totprice` double(20,0) NOT NULL,
  PRIMARY KEY (`idcmdline`),
  KEY `idBook` (`idBook`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

#
# Dumping data for table commandline
#

INSERT INTO `commandline` (`idcmdline`,`idBook`,`pricebook`,`quantity`,`totprice`) VALUES (1,1,0,1,0);
INSERT INTO `commandline` (`idcmdline`,`idBook`,`pricebook`,`quantity`,`totprice`) VALUES (2,2,0,1,0);
INSERT INTO `commandline` (`idcmdline`,`idBook`,`pricebook`,`quantity`,`totprice`) VALUES (3,1,80,1,80);
INSERT INTO `commandline` (`idcmdline`,`idBook`,`pricebook`,`quantity`,`totprice`) VALUES (4,2,20,1,20);

#
# Table structure for table user
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `idUser` int(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `lastName` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `phone` int(30) NOT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

#
# Dumping data for table user
#

INSERT INTO `user` (`idUser`,`name`,`lastName`,`password`,`phone`) VALUES (1111,'mmmml','dddd','jkjkjk',22222);

#
#  Foreign keys for table commandline
#

ALTER TABLE `commandline`
  ADD FOREIGN KEY (`idBook`) REFERENCES `book` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
