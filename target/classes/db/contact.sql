
CREATE TABLE `contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `email` varchar(256) DEFAULT NULL,
    `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


INSERT INTO `contact` (`first_name`,`last_name`,`email`,phone) VALUES ('Roland','Minova','test@123.com','+1-408-575-1317');
INSERT INTO `contact` (`first_name`,`last_name`,`email`, phone) VALUES ('Arnold','Minova','test@323.com','+1-408-128-1317');