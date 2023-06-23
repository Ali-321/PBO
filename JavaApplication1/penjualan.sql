-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 23, 2023 at 02:20 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualan`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `no_brg` int(11) NOT NULL,
  `kd_brg` varchar(25) DEFAULT NULL,
  `nm_brg` varchar(25) DEFAULT NULL,
  `satuan` varchar(25) DEFAULT NULL,
  `stok_brg` int(11) DEFAULT NULL,
  `stok_min` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`no_brg`, `kd_brg`, `nm_brg`, `satuan`, `stok_brg`, `stok_min`) VALUES
(45, 'brg01', 'Pulpen', 'pack', 5, 1),
(46, 'brg02', 'Pensil', 'pack', 2, 1),
(47, 'brg03', 'Penghapus', 'pack', 5, 1),
(48, 'brg04', 'Buku', 'pack', 10, 1),
(49, 'brg05', 'Tas', 'unit', 10, 1),
(50, 'brg06', 'Sepatu', 'pasang', 15, 1),
(51, 'brg07', 'Kaos Kaki', 'pasang', 10, 2),
(52, 'brg08', 'Topi Merah Putih', 'unit', 10, 2),
(53, 'brg09', 'Topi Pramuka', 'unit', 15, 2),
(54, 'brg10', 'Topi PasKibra', 'unit', 20, 2),
(55, 'brg11', 'Penggaris', 'unit', 5, 2),
(56, 'brg12', 'Bujur Sangkar', 'unit', 5, 2),
(57, 'brg13', 'Stempel', 'unit', 5, 2),
(58, 'brg14', 'Sempoa', 'unit', 20, 2),
(59, 'brg15', 'Kalkulator', 'unit', 20, 2),
(60, 'brg16', 'Jam Tangan', 'unit', 5, 2),
(61, 'brg17', 'Jam kaki', 'unit', 10, 1),
(64, 'brg19', 'Ular Python', 'ekor', 1000, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`no_brg`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `no_brg` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=65;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
