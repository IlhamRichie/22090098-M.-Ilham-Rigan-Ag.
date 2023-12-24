-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 24, 2022 at 01:51 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `ctransactions`
--

CREATE TABLE `ctransactions` (
  `CTransactionID` int(11) NOT NULL,
  `productName` varchar(32) NOT NULL,
  `Quantity` float NOT NULL,
  `totalAmount` varchar(32) NOT NULL,
  `UserID` int(11) NOT NULL,
  `Date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ctransactions`
--

INSERT INTO `ctransactions` (`CTransactionID`, `productName`, `Quantity`, `totalAmount`, `UserID`, `Date`) VALUES
(1, 'Ariel', 1, '15', 13, 'Wed, May 25 2022'),
(2, 'Kopeko 3-in-1', 4, '20', 13, 'Wed, May 25 2022'),
(3, 'Salt', 5, '45', 13, 'Wed, May 25 2022'),
(4, 'Jo-an', 5, '11', 13, 'Wed, May 25 2022'),
(5, 'Oyster Sauce', 4, '50', 13, 'Wed, May 25 2022'),
(6, 'Sprite', 1, '35', 13, 'Wed, May 25 2022'),
(7, 'Dove', 2, '100', 13, 'Wed, May 25 2022'),
(8, 'Patis', 2, '14', 13, 'Wed, May 25 2022'),
(9, 'Head and Shoulder', 1, '5', 13, 'Fri, May 27 2022'),
(10, 'Coke', 2, '70', 13, 'Sat, May 28 2022'),
(11, 'KreamStik', 2, '90', 13, 'Sat, May 28 2022'),
(12, 'Sugar', 3, '195', 13, 'Sat, May 28 2022'),
(13, 'Sugar', 5, '325', 13, 'Sat, May 28 2022'),
(14, 'Patis', 2, '24', 13, 'Sat, May 28 2022'),
(15, 'Sugar', 3, '195', 13, 'Sat, May 28 2022'),
(16, 'Sugar', 3, '195', 13, 'Sat, May 28 2022'),
(17, 'Head and Shoulder', 5, '35', 13, 'Sat, May 28 2022'),
(18, 'Safeguard', 10, '250', 13, 'Sat, May 28 2022'),
(19, 'Sunsilk', 2, '12', 13, 'Sat, May 28 2022'),
(20, 'Dove', 1, '50', 13, 'Mon, May 30 2022'),
(21, 'Vitsin', 5, '30', 13, 'Mon, May 30 2022'),
(22, 'Perla', 2, '48', 10, 'Mon, May 30 2022'),
(23, 'Oyster Sauce', 2, '24', 10, 'Tue, May 31 2022'),
(24, 'Niscafe Stick', 5, '500', 10, 'Tue, May 31 2022'),
(25, 'Salt', 5, '80', 10, 'Tue, May 31 2022'),
(26, 'Silka', 5, '250', 10, 'Tue, May 31 2022'),
(27, 'Magic Sarap', 3, '18', 10, 'Tue, May 31 2022'),
(28, 'ambut', 10, '460', 13, 'Tue, May 31 2022'),
(29, 'Safeguard', 4, '100', 10, 'Tue, May 31 2022'),
(30, 'Cream Silk', 4, '32', 13, 'Tue, May 31 2022'),
(31, 'Tide', 5, '135', 10, 'Tue, May 31 2022'),
(32, 'Dove', 9, '450', 13, 'Tue, May 31 2022'),
(33, 'Kopeko 3-in-1', 2, '16', 13, 'Tue, May 31 2022'),
(34, 'Sprite', 2, '70', 10, 'Tue, May 31 2022'),
(35, 'Patis', 2, '24', 13, 'Tue, May 31 2022'),
(36, 'dfcdfc', 2, '88', 10, 'Tue, May 31 2022'),
(38, 'Surf', 1, '28', 3, 'Tue, May 31 2022'),
(39, 'Head and Shoulder', 1, '28', 3, 'Tue, May 31 2022'),
(40, 'Coke', 2, '70', 3, 'Tue, May 31 2022'),
(41, 'Bearbrand', 5, '1000', 13, 'Wed, Jun 01 2022');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `InventoryID` int(11) NOT NULL,
  `ProductName` varchar(50) NOT NULL,
  `Description` varchar(250) NOT NULL,
  `BuyingPrice` float NOT NULL,
  `SellingPrice` float NOT NULL,
  `Quantity` float NOT NULL,
  `UnitOfMeasure` varchar(50) NOT NULL,
  `stockThreshold` varchar(32) NOT NULL,
  `thresholdStatus` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`InventoryID`, `ProductName`, `Description`, `BuyingPrice`, `SellingPrice`, `Quantity`, `UnitOfMeasure`, `stockThreshold`, `thresholdStatus`) VALUES
(1, 'Niscafe Stick', 'Bangon, Sulong, Tara kape', 85, 100, 95, 'Pack', '10', 'Active'),
(2, 'Kopeko 3-in-1', 'Three in one coffee', 6, 8, 48, 'Piece', '10', 'Active'),
(3, 'Ariel', 'Powder detergent', 12, 15, 35, 'Peice', '10', 'Active'),
(4, 'Salt', 'salty', 15, 16, 20, 'Kilos', '10', 'Active'),
(5, 'Silka', 'Pampaputi', 45, 50, 18, 'Piece', '10', 'Active'),
(6, 'Jo-an', 'with baki2 inside', 1, 2, 23, 'Pack', '10', 'Active'),
(8, 'Sugar', 'sweeter', 60, 65, 20, 'Kilos', '10', 'Active'),
(9, 'Patis', 'Sukang Puti', 10, 12, 21, 'Small Pouch', '10', 'Active'),
(10, 'Suka(Tuba)', 'Pure suka tuba', 50, 60, 23, 'Gallon', '10', 'Active'),
(11, 'Safeguard', 'Safe from germs with safeguard', 23, 25, 9, 'Piece', '10', 'Active'),
(12, 'Head and Shoulder', 'For smoother hair', 6, 7, 17, 'Piece', '10', 'Active'),
(13, 'Sunsilk', 'For longer hair', 5, 6, 21, 'Piece', '10', 'Active'),
(14, 'Cream Silk', 'For strong and long hair', 6, 8, 19, 'Piece', '10', 'Active'),
(15, 'Perla', 'Bar Detergent', 21, 24, 21, 'Bar', '10', 'Active'),
(16, 'Surf', 'Bar detergent', 24, 28, 19, 'Bar', '10', 'Active'),
(17, 'Tide', 'Gulat ka no!', 25, 27, 18, 'Bar', '10', 'Active'),
(18, 'Magic Sarap', 'Mas mulami!', 5, 6, 17, 'Piece', '10', 'Active'),
(19, 'Vitsin', 'For cooking', 5, 6, 0, 'Smallest Pack', '10', 'Low Inventory'),
(20, 'Oyster Sauce', 'Mamasitas', 10, 12, 21, 'Small Pack', '10', 'Active'),
(22, 'dfcdfc', 'efcefcdfcd', 43, 44, 21, 'efcef', '10', 'Active'),
(23, 'ambut', 'fbbb', 45, 46, 13, 'gfbfb', '10', 'Active'),
(29, 'KreamStik', 'Yummy', 35, 45, 23, 'Piece', '10', 'Active'),
(41, 'Dove', 'For smoother skin charootttt', 45, 50, 40, 'Piece', '10', 'Active'),
(43, 'Coke', 'Masarap', 30, 35, 48, 'Liter', '10', 'Active'),
(44, 'Royal', 'tru orange', 30, 35, 50, 'Liter', '10', 'Active'),
(45, 'Sprite', 'tru citrus', 30, 35, 48, 'Liter', '10', 'Active'),
(46, 'Bearbrand', 'blablabla', 150, 200, 10, 'Kilo', '10', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `stransactions`
--

CREATE TABLE `stransactions` (
  `STransactionID` int(11) NOT NULL,
  `InventoryID` int(11) NOT NULL,
  `productName` varchar(64) NOT NULL,
  `Quantity` float NOT NULL,
  `TypeOfTransaction` varchar(50) NOT NULL COMMENT 'Add, Edit, Disable, Enable',
  `UserID` int(11) NOT NULL,
  `TransactionDate` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stransactions`
--

INSERT INTO `stransactions` (`STransactionID`, `InventoryID`, `productName`, `Quantity`, `TypeOfTransaction`, `UserID`, `TransactionDate`) VALUES
(3, 26, ' n hnb', 56, 'Add Inventory', 7, 'Mon, May 23 2022'),
(4, 27, 'cdvfvd', 10, 'Add Inventory', 7, 'Mon, May 23 2022'),
(5, 28, 'wefwdc', 12, 'Add Inventory', 7, 'Mon, May 23 2022'),
(6, 30, 'decw', 56, 'Add Inventory', 7, 'Mon, May 23 2022'),
(7, 32, 'dfec', 25, 'Add Inventory', 7, 'Mon, May 23 2022'),
(8, 33, 'ffds', 44, 'Add Inventory', 7, 'Mon, May 23 2022'),
(9, 34, 'jhbdfj', 50, 'Add Inventory', 7, 'Mon, May 23 2022'),
(10, 35, 'fvdb', 40, 'Add Inventory', 7, 'Mon, May 23 2022'),
(11, 36, 'gfbf', 45, 'Add Inventory', 7, 'Mon, May 23 2022'),
(12, 38, 'kjnfvjk', 52, 'Add Inventory', 7, 'Mon, May 23 2022'),
(13, 40, 'fs', 54, 'Add Inventory', 7, 'Mon, May 23 2022'),
(14, 39, 'fdsf', 56, 'Delete Inventory', 7, 'Mon, May 23 2022'),
(15, 38, 'Rice', 52, 'Update Inventory', 7, 'Mon, May 23 2022'),
(16, 37, 'vergb', 4, 'Delete Inventory', 7, 'Mon, May 23 2022'),
(17, 34, 'jhbdfj', 50, 'Delete Inventory', 7, 'Tue, May 24 2022'),
(18, 39, 'Richel', 1, 'Added Inventory', 7, 'Tue, May 24 2022'),
(19, 36, 'gfbf', 45, 'Delete Inventory', 7, 'Tue, May 24 2022'),
(20, 35, 'bacayan', 40, 'Update Inventory', 7, 'Tue, May 24 2022'),
(21, 40, 'chuchu', 32, 'Added Inventory', 24, 'Tue, May 24 2022'),
(22, 26, ' n hnb', 56, 'Delete Inventory', 7, 'Tue, May 24 2022'),
(23, 39, 'Richel Bacayan', 1, 'Update Inventory', 7, 'Tue, May 24 2022'),
(24, 39, 'Richel Bacayan', 1, 'Update Inventory', 7, 'Tue, May 24 2022'),
(25, 40, 'chuchu', 50, 'Update Inventory', 7, 'Tue, May 24 2022'),
(26, 39, 'Richel Bacayan', 100000, 'Delete Inventory', 7, 'Tue, May 24 2022'),
(27, 34, 'iskolbukol', 20, 'Added Inventory', 7, 'Tue, May 24 2022'),
(28, 32, 'Calla', 25, 'Update Inventory', 7, 'Tue, May 24 2022'),
(29, 35, 'bacayan', 80, 'Update Inventory', 24, 'Tue, May 24 2022'),
(30, 28, 'wefwdc', 12, 'Delete Inventory', 24, 'Tue, May 24 2022'),
(31, 41, 'Dove', 50, 'Added Inventory', 7, 'Tue, May 24 2022'),
(32, 29, 'KreamStik', 40, 'Update Inventory', 24, 'Tue, May 24 2022'),
(33, 27, 'YipYap', 100, 'Update Inventory', 24, 'Tue, May 24 2022'),
(34, 31, 'rfvrtg', 56, 'Delete Inventory', 7, 'Tue, May 24 2022'),
(35, 32, 'Calla', 25, 'Delete Inventory', 7, 'Tue, May 24 2022'),
(36, 33, 'ffds', 44, 'Delete Inventory', 7, 'Tue, May 24 2022'),
(37, 35, 'bacayan', 80, 'Delete Inventory', 7, 'Tue, May 24 2022'),
(38, 34, 'iskolbukol', 20, 'Delete Inventory', 7, 'Tue, May 24 2022'),
(39, 38, 'Rice', 79, 'Delete Inventory', 7, 'Tue, May 24 2022'),
(40, 45, 'Sprite', 50, 'Added Inventory', 7, 'Wed, May 25 2022'),
(41, 1, 'Niscafe Stick', 100, 'Update Inventory', 7, 'Wed, May 25 2022'),
(42, 2, 'Kopeko 3-in-1', 50, 'Update Inventory', 7, 'Wed, May 25 2022'),
(43, 40, 'chuchu', 23, 'Delete Inventory', 7, 'Wed, May 25 2022'),
(44, 3, 'Ariel', 35, 'Update Inventory', 7, 'Wed, May 25 2022'),
(45, 4, 'Salt', 25, 'Update Inventory', 7, 'Wed, May 25 2022'),
(46, 41, 'Dove', 50, 'Update Inventory', 7, 'Wed, May 25 2022'),
(47, 25, 'dc d ', 23, 'Delete Inventory', 7, 'Wed, May 25 2022'),
(48, 24, 'efcdfv', 23, 'Delete Inventory', 7, 'Wed, May 25 2022'),
(49, 27, 'YipYap', 23, 'Delete Inventory', 7, 'Wed, May 25 2022'),
(50, 18, 'Magic Sarap', 20, 'Update Inventory', 24, 'Mon, May 30 2022'),
(51, 19, 'Vitsin', 5, 'Update Inventory', 24, 'Mon, May 30 2022'),
(52, 7, 'ghbfhnh', 23, 'Delete Inventory', 2, 'Mon, May 30 2022'),
(53, 42, 'Aly', 20, 'Delete Inventory', 6, 'Tue, May 31 2022'),
(54, 21, 'dcd', 23, 'Delete Inventory', 24, 'Tue, May 31 2022'),
(55, 23, 'ambut', 23, 'Update Inventory', 7, 'Tue, May 31 2022'),
(56, 46, 'Bearbrand', 15, 'Added Inventory', 7, 'Wed, Jun 01 2022');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `UserID` int(11) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Role` varchar(50) NOT NULL COMMENT 'Admin, Staff, Cashier',
  `Status` varchar(32) NOT NULL COMMENT 'Active, InActive'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`UserID`, `FirstName`, `LastName`, `Email`, `Password`, `Role`, `Status`) VALUES
(1, 'Juls', 'Estorco', '21103811@usc.edu.ph', 'estorco', 'Admin', 'Active'),
(2, 'Grace', 'Vellina', 'grace@gmail.com', 'vellina', 'Staff', 'Active'),
(3, 'Juspher', 'Balangs', 'jus@gmail.com', 'balangyao', 'Cashier', 'Active'),
(6, 'Clint', 'Savilla', 'clint@gmail.com', 'clintoy123', 'Staff', 'Active'),
(7, 'Soseit', 'Bedors', 'soseit@gmail.com', 'bedors', 'Staff', 'Active'),
(10, 'Jan', 'Baoc', 'jan@gmail.com', 'baoc123', 'Cashier', 'Active'),
(11, 'Fe', 'Cabando', 'fe@gmail.com', 'pnguard', 'Admin', 'InActive'),
(13, 'Christy', 'Toquero', 'toko@gmail.com', 'toqs', 'Cashier', 'Active'),
(20, 'Christian', 'Maderazo', 'cris@gmail.com', 'gwapo', 'Admin', 'Active'),
(24, 'Jecil', 'Entoma', 'jecil@gmail.com', 'cel123', 'Staff', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ctransactions`
--
ALTER TABLE `ctransactions`
  ADD PRIMARY KEY (`CTransactionID`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`InventoryID`);

--
-- Indexes for table `stransactions`
--
ALTER TABLE `stransactions`
  ADD PRIMARY KEY (`STransactionID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`UserID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ctransactions`
--
ALTER TABLE `ctransactions`
  MODIFY `CTransactionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `InventoryID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT for table `stransactions`
--
ALTER TABLE `stransactions`
  MODIFY `STransactionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
