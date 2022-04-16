-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.6.5-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- instagram 데이터베이스 구조 내보내기
DROP DATABASE IF EXISTS `instagram`;
CREATE DATABASE IF NOT EXISTS `instagram` /*!40100 DEFAULT CHARACTER SET utf8mb3 */;
USE `instagram`;

-- 테이블 instagram.board_mst 구조 내보내기
DROP TABLE IF EXISTS `board_mst`;
CREATE TABLE IF NOT EXISTS `board_mst` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `board_img` varchar(100) NOT NULL,
  `board_content` text NOT NULL,
  `user_id` int(11) NOT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb3;

-- 테이블 데이터 instagram.board_mst:~22 rows (대략적) 내보내기
DELETE FROM `board_mst`;
/*!40000 ALTER TABLE `board_mst` DISABLE KEYS */;
INSERT INTO `board_mst` (`id`, `board_img`, `board_content`, `user_id`, `create_date`, `update_date`) VALUES
	(1, 'board_img\\ff3ea6349a3d4480ac825e3b79ba790c_logo1.png', '안녕하세요. 유투브 사진입니다.', 5, '2021-12-31 17:22:24', '2021-12-31 17:22:24'),
	(2, 'board_img\\2b57ccc222e64987b535f2edb8b2f129_blog-post-05.jpg', 'test1', 5, '2022-01-03 16:33:01', '2022-01-03 16:33:01'),
	(3, 'board_img\\39e759c8ff67428498b0134e1f567848_1.jpg', 'test2', 5, '2022-01-03 16:33:10', '2022-01-03 16:33:10'),
	(4, 'board_img\\e6ea7e8d0967444ba26ee824b930dd0e_blog-post-08.jpg', 'test3', 5, '2022-01-03 16:33:20', '2022-01-03 16:33:20'),
	(5, 'board_img\\dba621cf79da45d4b08e09414dab33c3_img_html.png', 'aaaatest1', 6, '2022-01-03 16:38:34', '2022-01-03 16:38:34'),
	(6, 'board_img\\2bcc8d4a5ba04e02af6ba4a6eebc8f82_blog-post-06.jpg', 'aaaatest2', 6, '2022-01-03 16:38:45', '2022-01-03 16:38:45'),
	(35, 'board_img\\dba621cf79da45d4b08e09414dab33c3_img_html.png', 'test', 5, '2022-01-04 16:37:26', '2022-01-04 16:37:26'),
	(36, 'board_img\\dba621cf79da45d4b08e09414dab33c3_img_html.png', 'test', 5, '2022-01-04 16:37:27', '2022-01-04 16:37:27'),
	(37, 'board_img\\dba621cf79da45d4b08e09414dab33c3_img_html.png', 'test', 5, '2022-01-04 16:37:27', '2022-01-04 16:37:27'),
	(38, 'board_img\\dba621cf79da45d4b08e09414dab33c3_img_html.png', 'test', 5, '2022-01-04 16:37:27', '2022-01-04 16:37:27'),
	(39, 'board_img\\dba621cf79da45d4b08e09414dab33c3_img_html.png', 'test', 5, '2022-01-04 16:37:27', '2022-01-04 16:37:27'),
	(40, 'board_img\\dba621cf79da45d4b08e09414dab33c3_img_html.png', 'test', 5, '2022-01-04 16:37:27', '2022-01-04 16:37:27'),
	(41, 'board_img\\dba621cf79da45d4b08e09414dab33c3_img_html.png', 'test', 5, '2022-01-04 16:37:28', '2022-01-04 16:37:28'),
	(42, 'board_img\\dba621cf79da45d4b08e09414dab33c3_img_html.png', 'test', 5, '2022-01-04 16:37:28', '2022-01-04 16:37:28'),
	(43, 'board_img\\dba621cf79da45d4b08e09414dab33c3_img_html.png', 'test', 5, '2022-01-04 16:37:28', '2022-01-04 16:37:28'),
	(44, 'board_img\\dba621cf79da45d4b08e09414dab33c3_img_html.png', 'test', 5, '2022-01-04 16:37:28', '2022-01-04 16:37:28'),
	(45, 'board_img\\dba621cf79da45d4b08e09414dab33c3_img_html.png', 'test', 5, '2022-01-04 16:37:28', '2022-01-04 16:37:28'),
	(46, 'board_img\\dba621cf79da45d4b08e09414dab33c3_img_html.png', 'test', 5, '2022-01-04 16:37:28', '2022-01-04 16:37:28'),
	(47, 'board_img\\4e98fec918aa4737a3656a21cca46a27_blog-post-04.jpg', 'test', 5, '2022-01-04 17:46:45', '2022-01-04 17:46:45'),
	(48, 'board_img\\dc6f0e6156084c3e8acad9d67e664c75_blog-post-02.jpg', 'test', 5, '2022-01-04 17:46:53', '2022-01-04 17:46:53'),
	(49, 'board_img\\071274e6a6f943fc840d07042c9c73d3_blog-post-09.jpg', 'test', 5, '2022-01-04 17:47:01', '2022-01-04 17:47:01'),
	(50, 'board_img\\00547949115442179fc8d9bddb034a58_background.png', 'test', 5, '2022-01-04 17:47:08', '2022-01-04 17:47:08'),
	(51, 'board_img\\f91803ffbac1453ea20ff558be8dd891_blog-post-05.jpg', 'test', 5, '2022-01-04 17:47:16', '2022-01-04 17:47:16'),
	(52, 'board_img\\f52ff9b350e546e7a1fac1fc36ebb05d_blog-post-08.jpg', 'test', 7, '2022-01-06 17:59:22', '2022-01-06 17:59:22');
/*!40000 ALTER TABLE `board_mst` ENABLE KEYS */;

-- 테이블 instagram.user_dtl 구조 내보내기
DROP TABLE IF EXISTS `user_dtl`;
CREATE TABLE IF NOT EXISTS `user_dtl` (
  `id` int(11) NOT NULL,
  `website` varchar(50) DEFAULT NULL,
  `introduction` text DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL COMMENT '1=남성, 2=여성, 3=맞춤성별, 4=밝히고 싶지 않음',
  `profile_img` varchar(100) NOT NULL DEFAULT 'profile_img\\default.png',
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- 테이블 데이터 instagram.user_dtl:~2 rows (대략적) 내보내기
DELETE FROM `user_dtl`;
/*!40000 ALTER TABLE `user_dtl` DISABLE KEYS */;
INSERT INTO `user_dtl` (`id`, `website`, `introduction`, `phone`, `gender`, `profile_img`, `create_date`, `update_date`) VALUES
	(4, NULL, NULL, NULL, NULL, 'profile_img\\default.png', '2021-12-28 15:29:52', '2021-12-28 15:29:52'),
	(5, 'http://www.naver.com', '안녕하세요.\n김준일입니다.', '01099881916', '남성', 'profile_img\\ecf8ef95a5a44142b1643ac8d6b7d441_logo1.png', '2021-12-28 16:21:05', '2021-12-30 15:25:17'),
	(6, NULL, NULL, NULL, NULL, 'profile_img\\default.png', '2022-01-03 16:38:18', '2022-01-03 16:38:18'),
	(7, '', '', '', '', 'profile_img\\default.png', '2022-01-06 17:56:07', '2022-01-06 17:58:49'),
	(8, NULL, NULL, NULL, NULL, 'profile_img\\default.png', '2022-01-07 14:41:47', '2022-01-07 14:41:47');
/*!40000 ALTER TABLE `user_dtl` ENABLE KEYS */;

-- 테이블 instagram.user_mst 구조 내보내기
DROP TABLE IF EXISTS `user_mst`;
CREATE TABLE IF NOT EXISTS `user_mst` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `oauth2_username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `provider` varchar(20) NOT NULL,
  `role` varchar(20) NOT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;

-- 테이블 데이터 instagram.user_mst:~1 rows (대략적) 내보내기
DELETE FROM `user_mst`;
/*!40000 ALTER TABLE `user_mst` DISABLE KEYS */;
INSERT INTO `user_mst` (`id`, `email`, `name`, `username`, `oauth2_username`, `password`, `provider`, `role`, `create_date`, `update_date`) VALUES
	(7, 'skjil1218@gmail.com', '김준일', 'junil', 'naver_RWELRPBLJfskpM0YVY-6SSUdjVDsJRAjADQi0xOq1zs', '$2a$10$xmQJuS2Ag/KVwU.bRtRHP.avTU5XuqpJkZgr11jZrGBQROiV6ShQW', 'naver', 'ROLE_USER', '2022-01-06 17:56:07', '2022-01-06 17:59:04'),
	(8, 'skjil1218@gmail.com', 'Julius Kim', 'google_107503745689993553322', 'google_107503745689993553322', '$2a$10$9x4RSP5takIvG2EnGgBzke6W6oYIz4Y70.uYV98qZ/3TFGFt3aATi', 'google', 'ROLE_USER', '2022-01-07 14:41:47', '2022-01-07 14:41:47');
/*!40000 ALTER TABLE `user_mst` ENABLE KEYS */;

-- 트리거 instagram.user_mst_after_insert 구조 내보내기
DROP TRIGGER IF EXISTS `user_mst_after_insert`;
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `user_mst_after_insert` AFTER INSERT ON `user_mst` FOR EACH ROW BEGIN
	INSERT into
		user_dtl(
			id,
			create_date,
			update_date
		)
	VALUES(
		NEW.id,
		NOW(),
		NOW()
	);
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
