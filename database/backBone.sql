DROP SCHEMA IF EXISTS `ha2s_ecommerce`;

CREATE SCHEMA `ha2s_ecommerce`;

use `ha2s_ecommerce`;

DROP TABLE IF EXISTS `ha2s_user`;

CREATE TABLE `ha2s_user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `name_user` varchar(128) DEFAULT NULL,
  `telephone_user` varchar(16) DEFAULT NULL,
  `email_user` varchar(255) DEFAULT NULL,
  `created_at` timestamp DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `ha2s_user_addressha2s_user_address`;

CREATE TABLE `ha2s_user_address` (
  `id_user_adress` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(128) DEFAULT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`id_user_adress`),
  
  KEY `FK_USER_idx` (`id_user`),
   
  CONSTRAINT `FK_USER` FOREIGN KEY (`id_user`) REFERENCES `ha2s_user` (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
