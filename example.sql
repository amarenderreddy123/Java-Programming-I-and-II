-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 15, 2013 at 01:57 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `example`
--
CREATE DATABASE `example` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `example`;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE IF NOT EXISTS `product` (
  `vin` char(6) NOT NULL,
  `make` varchar(16) NOT NULL,
  `model` varchar(16) NOT NULL,
  `year` int(4) NOT NULL,
  `color` varchar(12) NOT NULL,
  `price` decimal(9,2) NOT NULL,
  PRIMARY KEY (`vin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`vin`, `make`, `model`, `year`, `color`, `price`) VALUES
('12345A', 'Chevrolet', 'Volt', 2013, 'silver', 34000.00),
('22222V', 'Chevrolet', 'Malibu', 2013, 'red', 24000.00),
('35542C', 'Cadillac', 'Escalade', 2012, 'black', 72000.00),
('49879X', 'Buick', 'Lacrosse', 2013, 'white', 38000.00),
('58932H', 'Chevrolet', 'Camaro SS', 2012, 'yellow', 33000.00),
('60842G', 'Buick', 'Enclave', 2013, 'silver', 42000.00),
('77776M', 'Cadillac', 'CTS-V Coupe', 2013, 'blue', 40000.00),
('88789T', 'GMC', 'Terrain', 2012, 'red', 31000.00),
('90201K', 'Bugatti', 'Veyron', 2013, 'red', 1900000.00),
('99090P', 'Chevrolet', 'Spark', 2013, 'green', 14000.00);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
