-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 23 Des 2023 pada 09.27
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.2.0

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
-- Struktur dari tabel `ctransactions`
--

CREATE TABLE `ctransactions` (
  `CTransactionID` int(11) NOT NULL,
  `productName` varchar(32) NOT NULL,
  `Quantity` float NOT NULL,
  `totalAmount` varchar(32) NOT NULL,
  `UserID` int(11) NOT NULL,
  `Date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `ctransactions`
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
(41, 'Bearbrand', 5, '1000', 13, 'Wed, Jun 01 2022'),
(42, 'Sugar', 5, '325', 3, 'Jum, Des 22 2023'),
(43, 'Sugar', 5, '325', 3, 'Jum, Des 22 2023'),
(44, 'Sugar', 5, '325', 3, 'Jum, Des 22 2023'),
(45, 'Sugar', 5, '325', 3, 'Jum, Des 22 2023'),
(46, 'Sugar', 5, '325', 3, 'Jum, Des 22 2023'),
(47, 'Sugar', 5, '325', 3, 'Jum, Des 22 2023'),
(48, 'Sugar', 5, '325', 3, 'Jum, Des 22 2023'),
(49, 'Sunsilk', 3, '18', 3, 'Sab, Des 23 2023'),
(50, 'UMKM Beras A', 2, '27980', 3, 'Sab, Des 23 2023'),
(51, 'UMKM Tas Selempang', 2, '39980', 3, 'Sab, Des 23 2023');

-- --------------------------------------------------------

--
-- Struktur dari tabel `inventory`
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `inventory`
--

INSERT INTO `inventory` (`InventoryID`, `ProductName`, `Description`, `BuyingPrice`, `SellingPrice`, `Quantity`, `UnitOfMeasure`, `stockThreshold`, `thresholdStatus`) VALUES
(1, 'UMKM Beras A', 'Beras premium untuk masakan sehari-hari', 9000, 13990, 118, 'Kg', '50', 'Active'),
(2, 'UMKM Sikat Gigi Soft', 'Sikat gigi dengan bulu lembut', 3000, 5990, 150, 'Piece', '40', 'Active'),
(3, 'UMKM Kopi Bubuk', 'Kopi bubuk pilihan dengan aroma khas', 15000, 24990, 80, 'Pack', '30', 'Active'),
(4, 'UMKM Pisau Dapur', 'Pisau dapur sederhana namun tajam', 12000, 19990, 100, 'Piece', '35', 'Active'),
(5, 'UMKM Topi Sport', 'Topi sporty untuk gaya aktif', 18000, 29990, 70, 'Piece', '25', 'Active'),
(6, 'UMKM Gantungan Kunci Lucu', 'Gantungan kunci dengan desain lucu', 5000, 8990, 200, 'Piece', '60', 'Active'),
(7, 'UMKM Sarung Tangan Wol', 'Sarung tangan hangat dari wol', 25000, 39990, 40, 'Pair', '15', 'Active'),
(8, 'UMKM Lemari Plastik', 'Lemari plastik praktis untuk penyimpanan', 35000, 57990, 30, 'Unit', '10', 'Active'),
(9, 'UMKM Tas Selempang', 'Tas selempang simpel untuk kegiatan sehari-hari', 12000, 19990, 88, 'Piece', '30', 'Active'),
(10, 'UMKM Snack Renyah', 'Snack renyah untuk camilan ringan', 7500, 12990, 120, 'Pack', '50', 'Active'),
(11, 'UMKM Teh Hijau', 'Teh hijau segar untuk kesehatan', 10000, 16990, 60, 'Pack', '25', 'Active'),
(12, 'UMKM Buku Catatan Mini', 'Buku catatan kecil untuk catatan cepat', 4000, 7990, 100, 'Piece', '30', 'Active'),
(13, 'UMKM Kain Lap Multiguna', 'Kain lap serbaguna untuk kebersihan', 6000, 9990, 150, 'Piece', '40', 'Active'),
(14, 'UMKM Sikat Rambut', 'Sikat rambut anti kusut', 8000, 14990, 80, 'Piece', '35', 'Active'),
(15, 'UMKM Speaker Mini', 'Speaker mini portable untuk musik', 25000, 42990, 40, 'Unit', '15', 'Active'),
(16, 'UMKM Gelang Warna', 'Gelang dengan warna cerah', 3500, 6990, 200, 'Piece', '60', 'Active'),
(17, 'UMKM Sapu Tangan Kecil', 'Sapu tangan kecil untuk kebersihan', 2000, 3990, 200, 'Piece', '70', 'Active'),
(18, 'UMKM Lampu Tidur LED', 'Lampu tidur hemat energi dengan LED', 12000, 20990, 50, 'Unit', '20', 'Active'),
(19, 'UMKM Gelas Plastik', 'Gelas plastik untuk minuman dingin', 5000, 8990, 120, 'Piece', '40', 'Active'),
(20, 'UMKM Penyiram Tanaman', 'Penyiram tanaman praktis', 7000, 11990, 80, 'Piece', '25', 'Active'),
(21, 'UMKM Shampoo Herbal', 'Shampoo alami untuk rambut sehat', 12000, 19990, 100, 'Bottle', '35', 'Active'),
(22, 'UMKM Balsem Hangat', 'Balsem untuk meredakan pegal-pegal', 8000, 12990, 80, 'Jar', '30', 'Active'),
(23, 'UMKM Sabun Mandi Aromaterapi', 'Sabun mandi dengan aroma menenangkan', 6000, 9990, 120, 'Bar', '50', 'Active'),
(24, 'UMKM Hand Sanitizer', 'Hand sanitizer untuk kebersihan tangan', 5000, 8990, 150, 'Bottle', '40', 'Active'),
(25, 'UMKM Pillowcase Lucu', 'Bantal dengan desain lucu untuk tidur nyenyak', 18000, 29990, 70, 'Piece', '25', 'Active'),
(26, 'UMKM Gantungan Kunci Musikal', 'Gantungan kunci berbentuk alat musik', 3000, 5990, 200, 'Piece', '60', 'Active'),
(27, 'UMKM Topi Rajut', 'Topi rajut hangat untuk musim dingin', 25000, 39990, 40, 'Piece', '15', 'Active'),
(28, 'UMKM Pembersih Wajah Organik', 'Pembersih wajah alami tanpa bahan kimia', 35000, 57990, 30, 'Bottle', '10', 'Active'),
(29, 'UMKM Tote Bag Ramah Lingkungan', 'Tote bag yang ramah lingkungan', 12000, 19990, 90, 'Piece', '30', 'Active'),
(30, 'UMKM Cemilan Sehat', 'Cemilan sehat untuk camilan ringan', 7500, 12990, 120, 'Pack', '50', 'Active'),
(31, 'UMKM Body Lotion Aloe Vera', 'Body lotion dengan ekstrak aloe vera', 10000, 16990, 60, 'Bottle', '25', 'Active'),
(32, 'UMKM Buku Cerita Anak', 'Buku cerita anak dengan ilustrasi menarik', 4000, 7990, 100, 'Piece', '30', 'Active'),
(33, 'UMKM Kain Sarung Tenun', 'Kain sarung tradisional dengan tenunan indah', 6000, 9990, 150, 'Meter', '40', 'Active'),
(34, 'UMKM Lip Balm Organik', 'Lip balm organik untuk bibir lembut', 8000, 14990, 80, 'Stick', '35', 'Active'),
(35, 'UMKM Portable Charger', 'Portable charger untuk perangkat seluler', 25000, 42990, 40, 'Unit', '15', 'Active'),
(36, 'UMKM Gelang Batik', 'Gelang dengan motif batik tradisional', 3500, 6990, 200, 'Piece', '60', 'Active'),
(37, 'UMKM Kaus Tangan Rajut', 'Kaus tangan rajut untuk hangat', 2000, 3990, 200, 'Pair', '70', 'Active'),
(38, 'UMKM Lampu Hias Kreatif', 'Lampu hias dengan desain kreatif', 12000, 20990, 50, 'Piece', '20', 'Active'),
(39, 'UMKM Gelas Keramik Handmade', 'Gelas keramik handmade dengan motif unik', 5000, 8990, 120, 'Piece', '40', 'Active'),
(40, 'UMKM Pupuk Organik', 'Pupuk organik untuk tanaman sehat', 7000, 11990, 80, 'Kg', '25', 'Active');

-- --------------------------------------------------------

--
-- Struktur dari tabel `stransactions`
--

CREATE TABLE `stransactions` (
  `STransactionID` int(11) NOT NULL,
  `InventoryID` int(11) NOT NULL,
  `productName` varchar(64) NOT NULL,
  `Quantity` float NOT NULL,
  `TypeOfTransaction` varchar(50) NOT NULL COMMENT 'Add, Edit, Disable, Enable',
  `UserID` int(11) NOT NULL,
  `TransactionDate` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `stransactions`
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
-- Struktur dari tabel `users`
--

CREATE TABLE `users` (
  `UserID` int(11) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Role` varchar(50) NOT NULL COMMENT 'Admin, Staff, Cashier',
  `Status` varchar(32) NOT NULL COMMENT 'Active, InActive'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `users`
--

INSERT INTO `users` (`UserID`, `FirstName`, `LastName`, `Email`, `Password`, `Role`, `Status`) VALUES
(1, 'Ilham', 'Rigan', 'ilhmrgn22@gmail.com', 'rigan22', 'Admin', 'Active'),
(2, 'Rojer', 'Vellina', 'grace@gmail.com', 'memenyo', 'Staff', 'Active'),
(3, 'Jamprut', 'Muiz', 'jus@gmail.com', 'ratu123', 'Cashier', 'Ganti Status'),
(6, 'Clint', 'santano', 'clint@gmail.com', 'clintoy123', 'Staff', 'Active'),
(7, 'Soseit', 'beron', 'sosisbakar@gmail.com', 'bedors', 'Staff', 'Active'),
(10, 'Jan', 'Krik', 'jangkrik@gmail.com', 'baoc123', 'Cashier', 'Active'),
(11, 'Fe', 'Nirose', 'feni@gmail.com', 'pnguard', 'Admin', 'Change Status'),
(13, 'Yanto', 'Kopling', 'yangko@gmail.com', 'toqs', 'Cashier', 'Active'),
(20, 'Christian', 'Sugiono', 'cris@gmail.com', 'gwaponyo', 'Admin', 'Ganti Status'),
(24, 'Joko', 'Susanto', 'josus@gmail.com', 'cel123', 'Staff', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `ctransactions`
--
ALTER TABLE `ctransactions`
  ADD PRIMARY KEY (`CTransactionID`);

--
-- Indeks untuk tabel `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`InventoryID`);

--
-- Indeks untuk tabel `stransactions`
--
ALTER TABLE `stransactions`
  ADD PRIMARY KEY (`STransactionID`);

--
-- Indeks untuk tabel `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`UserID`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `ctransactions`
--
ALTER TABLE `ctransactions`
  MODIFY `CTransactionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT untuk tabel `inventory`
--
ALTER TABLE `inventory`
  MODIFY `InventoryID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT untuk tabel `stransactions`
--
ALTER TABLE `stransactions`
  MODIFY `STransactionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;

--
-- AUTO_INCREMENT untuk tabel `users`
--
ALTER TABLE `users`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
