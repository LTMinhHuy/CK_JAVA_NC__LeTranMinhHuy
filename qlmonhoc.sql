-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th4 02, 2022 lúc 05:19 AM
-- Phiên bản máy phục vụ: 10.4.21-MariaDB
-- Phiên bản PHP: 7.3.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlmonhoc`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `diemdk`
--

CREATE TABLE `diemdk` (
  `masv` varchar(50) DEFAULT NULL,
  `malhp` varchar(50) DEFAULT NULL,
  `diem` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `diemdk`
--

INSERT INTO `diemdk` (`masv`, `malhp`, `diem`) VALUES
('191150531022104', '221003', NULL),
('191150531022102', '221001', 10),
('191150531022102', '221003', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `gv`
--

CREATE TABLE `gv` (
  `magv` varchar(50) NOT NULL,
  `hoten` varchar(50) DEFAULT NULL,
  `mk` varchar(50) DEFAULT NULL,
  `khoa` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `gv`
--

INSERT INTO `gv` (`magv`, `hoten`, `mk`, `khoa`) VALUES
('123123123', 'Đỗ Phú Huy', '123', 'Dien Dien Tu'),
('123123124', 'Lê Thiện Nhật Quan', '123', 'Dien Dien Tu');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ki`
--

CREATE TABLE `ki` (
  `maki` varchar(50) NOT NULL,
  `ten ki` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `ki`
--

INSERT INTO `ki` (`maki`, `ten ki`) VALUES
('121', 'ki 121'),
('221', 'ki 221');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lhp`
--

CREATE TABLE `lhp` (
  `malhp` varchar(50) NOT NULL,
  `matc` varchar(50) DEFAULT NULL,
  `magv` varchar(50) DEFAULT NULL,
  `maki` varchar(50) DEFAULT NULL,
  `tenlhp` varchar(50) DEFAULT NULL,
  `tg` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `lhp`
--

INSERT INTO `lhp` (`malhp`, `matc`, `magv`, `maki`, `tenlhp`, `tg`) VALUES
('221001', '221123', '123123123', '221', 'Java NC', 'T4 (1-2)'),
('221002', '221124', '123123124', '221', 'TH Java NC', 'T4 (1-2)'),
('221003', '221125', '123123124', '221', 'Lập trình C#', 'T4 (3-4)');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sv`
--

CREATE TABLE `sv` (
  `masv` varchar(50) NOT NULL,
  `hoten` varchar(50) DEFAULT NULL,
  `mk` varchar(50) DEFAULT NULL,
  `lop` varchar(50) DEFAULT NULL,
  `khoa` varchar(50) DEFAULT NULL,
  `nsinh` date DEFAULT NULL,
  `cmnn` varchar(50) DEFAULT NULL,
  `tknn` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `sv`
--

INSERT INTO `sv` (`masv`, `hoten`, `mk`, `lop`, `khoa`, `nsinh`, `cmnn`, `tknn`) VALUES
('191150531022102', 'Le Tran Minh Huy', '1234', '19T2', 'Dien Dien Tu', '2001-10-17', '09051231342', '3143215465345'),
('191150531022104', 'Le Tran A', '123', '19T2', 'Dien Dien Tu', '2001-10-17', '09051231342', '3143215465345'),
('191150531022105', 'Le Tran S', '123', '19T2', 'Dien Dien Tu', '2001-10-17', '09051231342', '3143215465345'),
('191150531022106', 'Le Tran M', '123', '19T2', 'Dien Dien Tu', '2001-10-17', '09051231342', '3143215465345'),
('191150531022107', 'Le Tran H', '123', '19T2', 'Dien Dien Tu', '2001-10-17', '09051231342', '3143215465345'),
('191150531022108', 'Le Tran G', '123', '19T2', 'Dien Dien Tu', '2001-10-17', '09051231342', '3143215465345');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tinchi`
--

CREATE TABLE `tinchi` (
  `matc` varchar(50) NOT NULL,
  `tentc` varchar(50) DEFAULT NULL,
  `nd` varchar(50) DEFAULT NULL,
  `sotc` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `tinchi`
--

INSERT INTO `tinchi` (`matc`, `tentc`, `nd`, `sotc`) VALUES
('221123', 'Lập trình hướng đối tượng java nâng cao', 'Lập trình hướng đối tượng java nâng cao', 2),
('221124', 'TH Lập trình hướng đối tượng java nâng cao', 'TH Lập trình hướng đối tượng java nâng cao', 1),
('221125', 'Lập trình C#', 'Lập trình C#', 2);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `diemdk`
--
ALTER TABLE `diemdk`
  ADD KEY `masv` (`masv`),
  ADD KEY `malhp` (`malhp`);

--
-- Chỉ mục cho bảng `gv`
--
ALTER TABLE `gv`
  ADD PRIMARY KEY (`magv`);

--
-- Chỉ mục cho bảng `ki`
--
ALTER TABLE `ki`
  ADD PRIMARY KEY (`maki`);

--
-- Chỉ mục cho bảng `lhp`
--
ALTER TABLE `lhp`
  ADD PRIMARY KEY (`malhp`),
  ADD KEY `matc` (`matc`),
  ADD KEY `magv` (`magv`),
  ADD KEY `maki` (`maki`);

--
-- Chỉ mục cho bảng `sv`
--
ALTER TABLE `sv`
  ADD PRIMARY KEY (`masv`);

--
-- Chỉ mục cho bảng `tinchi`
--
ALTER TABLE `tinchi`
  ADD PRIMARY KEY (`matc`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `diemdk`
--
ALTER TABLE `diemdk`
  ADD CONSTRAINT `diemdk_ibfk_1` FOREIGN KEY (`masv`) REFERENCES `sv` (`masv`) ON DELETE CASCADE,
  ADD CONSTRAINT `diemdk_ibfk_2` FOREIGN KEY (`malhp`) REFERENCES `lhp` (`malhp`) ON DELETE CASCADE;

--
-- Các ràng buộc cho bảng `lhp`
--
ALTER TABLE `lhp`
  ADD CONSTRAINT `lhp_ibfk_1` FOREIGN KEY (`matc`) REFERENCES `tinchi` (`matc`) ON DELETE CASCADE,
  ADD CONSTRAINT `lhp_ibfk_2` FOREIGN KEY (`magv`) REFERENCES `gv` (`magv`) ON DELETE CASCADE,
  ADD CONSTRAINT `lhp_ibfk_3` FOREIGN KEY (`maki`) REFERENCES `ki` (`maki`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
