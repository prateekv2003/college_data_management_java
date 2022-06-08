-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 08, 2022 at 07:14 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `college_data_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance_student`
--

CREATE TABLE `attendance_student` (
  `rollno` varchar(20) DEFAULT NULL,
  `Date` varchar(30) DEFAULT NULL,
  `first` varchar(10) DEFAULT NULL,
  `second` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `attendance_student`
--

INSERT INTO `attendance_student` (`rollno`, `Date`, `first`, `second`) VALUES
('15338424', 'Tue Oct 26 16:59:42 IST 2021', 'Absent', 'Present'),
('15335955', 'Fri Dec 03 14:47:18 IST 2021', 'Present', 'Present'),
('15335955', 'Fri Dec 03 15:29:11 IST 2021', 'Present', 'Present'),
('15335955', 'Fri Dec 03 15:34:27 IST 2021', 'Present', 'Present'),
('120', 'Tue Dec 07 14:11:50 IST 2021', 'Present', 'Absent');

-- --------------------------------------------------------

--
-- Table structure for table `attendance_teacher`
--

CREATE TABLE `attendance_teacher` (
  `emp_id` varchar(20) DEFAULT NULL,
  `Date` varchar(30) DEFAULT NULL,
  `first` varchar(10) DEFAULT NULL,
  `second` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `fee`
--

CREATE TABLE `fee` (
  `rollno` varchar(20) DEFAULT NULL,
  `name` varchar(25) DEFAULT NULL,
  `fathers_name` varchar(25) DEFAULT NULL,
  `course` varchar(10) DEFAULT NULL,
  `branch` varchar(20) DEFAULT NULL,
  `semester` varchar(10) DEFAULT NULL,
  `fee_paid` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fee`
--

INSERT INTO `fee` (`rollno`, `name`, `fathers_name`, `course`, `branch`, `semester`, `fee_paid`) VALUES
('120', 'Veer Pariawala', 'Rajesh', 'B.Tech', 'Mechanical', '1st', '188791'),
('120', 'Veer Pariawala', 'Rajesh', 'B.Tech', 'IT', '3rd', '188791');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('TSEC2024', 'TSEC2024');

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `rollno` varchar(15) DEFAULT NULL,
  `marks1` varchar(20) DEFAULT NULL,
  `marks2` varchar(20) DEFAULT NULL,
  `marks3` varchar(20) DEFAULT NULL,
  `marks4` varchar(20) DEFAULT NULL,
  `marks5` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`rollno`, `marks1`, `marks2`, `marks3`, `marks4`, `marks5`) VALUES
('15335955', '99', '98', '97', '96', '95');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `name` varchar(30) DEFAULT NULL,
  `fathers_name` varchar(30) DEFAULT NULL,
  `age` varchar(5) DEFAULT NULL,
  `dob` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `class_x` varchar(10) DEFAULT NULL,
  `class_xii` varchar(10) DEFAULT NULL,
  `aadhar` varchar(12) DEFAULT NULL,
  `rollno` varchar(15) DEFAULT NULL,
  `course` varchar(20) DEFAULT NULL,
  `branch` varchar(25) DEFAULT NULL,
  `Semester` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`name`, `fathers_name`, `age`, `dob`, `address`, `phone`, `email`, `class_x`, `class_xii`, `aadhar`, `rollno`, `course`, `branch`, `Semester`) VALUES
('Veer Pariawala', 'Rajesh', '19', '10/06/2002', 'Mumbai,400004', '9833693702', 'pariawalaveer@gmail.com', '97.4', '93', '830234283752', '120', 'B.Tech', 'Information Technology', '3rd'),
('Prateek Vishwakarma', 'Shivlal', '18', '18/08/2003', 'Mumbai', '9920153264', 'pratz@gmail.com', '92', '90', '89182912812', '122', 'B.Tech', 'Information Technology', '3rd'),
('Swapnil Vishwakarma', 'Subash', '20', '26/03/2001', 'Mumbai', '9298192121', 'swapnil@gmail.com', '91', '92', '18929189291', '123', 'B.Tech', 'Information Technology', '3rd');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `rollno` varchar(15) DEFAULT NULL,
  `subject1` varchar(20) DEFAULT NULL,
  `subject2` varchar(20) DEFAULT NULL,
  `subject3` varchar(20) DEFAULT NULL,
  `subject4` varchar(20) DEFAULT NULL,
  `subject5` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`rollno`, `subject1`, `subject2`, `subject3`, `subject4`, `subject5`) VALUES
('15335955', 'Jbd', 'asa', 'daaaf', 'ararwa', 'wradad');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `name` varchar(20) DEFAULT NULL,
  `fathers_name` varchar(20) DEFAULT NULL,
  `age` varchar(5) DEFAULT NULL,
  `dob` varchar(20) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `years_of_exp` varchar(10) DEFAULT NULL,
  `class_xii` varchar(10) DEFAULT NULL,
  `aadhar` varchar(15) DEFAULT NULL,
  `education` varchar(10) DEFAULT NULL,
  `emp_id` varchar(15) DEFAULT NULL,
  `dept` varchar(20) DEFAULT NULL,
  `Subject` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
