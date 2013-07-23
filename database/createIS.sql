-- MySQL dump 10.13  Distrib 5.1.69, for debian-linux-gnu (i686)
--
-- Host: localhost    Database: insidesales
-- ------------------------------------------------------
-- Server version	5.1.69-0ubuntu0.11.10.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roll1` datetime DEFAULT NULL,
  `roll2` datetime DEFAULT NULL,
  `roll3` datetime DEFAULT NULL,
  `qamessage` varchar(1024) DEFAULT NULL,
  `test_api_key` varchar(256) DEFAULT NULL,
  `modified_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `daily_tracking`
--

DROP TABLE IF EXISTS `daily_tracking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `daily_tracking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `on_test` int(11) DEFAULT NULL,
  `ready_for_beta` int(11) DEFAULT NULL,
  `on_beta` int(11) DEFAULT NULL,
  `ready_for_prod` int(11) DEFAULT NULL,
  `on_prod` int(11) DEFAULT NULL,
  `bug_did_not_pass` int(11) DEFAULT NULL,
  `bug_returned` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=161 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `external_links`
--

DROP TABLE IF EXISTS `external_links`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `external_links` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(256) DEFAULT NULL,
  `site_type_id` int(11) DEFAULT NULL,
  `name` varchar(256) DEFAULT NULL,
  `case_num` int(11) DEFAULT NULL,
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modified_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `hourly_tracking`
--

DROP TABLE IF EXISTS `hourly_tracking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hourly_tracking` (
  `id` int(11) NOT NULL,
  `on_test` int(11) DEFAULT NULL,
  `ready_for_beta` int(11) DEFAULT NULL,
  `on_beta` int(11) DEFAULT NULL,
  `ready_for_prod` int(11) DEFAULT NULL,
  `on_prod` int(11) DEFAULT NULL,
  `bug_did_not_pass` int(11) DEFAULT NULL,
  `bug_returned` int(11) DEFAULT NULL,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `log_errors`
--

DROP TABLE IF EXISTS `log_errors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `log_errors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `job_id` int(11) NOT NULL,
  `test_classname` varchar(256) DEFAULT NULL,
  `test_name` varchar(256) DEFAULT NULL,
  `test_time` decimal(60,2) DEFAULT '0.00',
  `error_type` varchar(256) DEFAULT NULL,
  `error_message` text,
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `log_failures`
--

DROP TABLE IF EXISTS `log_failures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `log_failures` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `job_id` int(11) NOT NULL,
  `test_classname` varchar(256) DEFAULT NULL,
  `test_name` varchar(256) DEFAULT NULL,
  `test_time` decimal(60,2) DEFAULT '0.00',
  `failure_type` varchar(256) DEFAULT NULL,
  `failure_message` text,
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `log_queue`
--

DROP TABLE IF EXISTS `log_queue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `log_queue` (
  `job_id` int(11) NOT NULL AUTO_INCREMENT,
  `testcase_id` int(11) NOT NULL,
  `subtest_id` int(11) NOT NULL,
  `cloud_id` int(11) NOT NULL,
  `browser_id` int(11) DEFAULT NULL,
  `os_id` int(11) DEFAULT NULL,
  `hostname` varchar(256) DEFAULT NULL,
  `num_tests` int(11) DEFAULT NULL,
  `num_errors` int(11) DEFAULT NULL,
  `num_failures` int(11) DEFAULT NULL,
  `username` varchar(256) DEFAULT NULL,
  `url` varchar(256) DEFAULT NULL,
  `environment` varchar(256) DEFAULT NULL,
  `git_commit_version` varchar(256) DEFAULT NULL,
  `time` decimal(60,2) DEFAULT '0.00',
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`job_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sel_fail2browser`
--

DROP TABLE IF EXISTS `sel_fail2browser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sel_fail2browser` (
  `selenium_failures_id` int(10) unsigned NOT NULL,
  `vm_browser_id` int(10) unsigned NOT NULL,
  `tested_once` tinyint(1) DEFAULT '1',
  `failed` tinyint(1) DEFAULT '1',
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modified_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`selenium_failures_id`,`vm_browser_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sel_fail2os`
--

DROP TABLE IF EXISTS `sel_fail2os`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sel_fail2os` (
  `selenium_failures_id` int(10) unsigned NOT NULL,
  `vm_os_id` int(10) unsigned NOT NULL,
  `tested_once` tinyint(1) DEFAULT '1',
  `failed` tinyint(1) DEFAULT '1',
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modified_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`selenium_failures_id`,`vm_os_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `selenium_failures`
--

DROP TABLE IF EXISTS `selenium_failures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `selenium_failures` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tested_master` tinyint(1) DEFAULT '0',
  `tested_beta` tinyint(1) DEFAULT '0',
  `tested_prod` tinyint(1) DEFAULT '0',
  `failed_master` tinyint(1) DEFAULT '0',
  `failed_beta` tinyint(1) DEFAULT '0',
  `failed_prod` tinyint(1) DEFAULT '0',
  `testcase_id` int(11) DEFAULT NULL,
  `subtest_id` int(11) DEFAULT NULL,
  `individual_test` varchar(256) DEFAULT NULL,
  `message` text,
  `case_num` varchar(256) DEFAULT NULL,
  `case_closed` tinyint(1) DEFAULT '0',
  `case_completed` tinyint(1) DEFAULT '0',
  `case_createdby` varchar(256) DEFAULT NULL,
  `notes` text,
  `created_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `modified_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `site_type`
--

DROP TABLE IF EXISTS `site_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `site_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `site_type` varchar(256) DEFAULT NULL,
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modified_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `vm_browsers`
--

DROP TABLE IF EXISTS `vm_browsers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vm_browsers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(256) DEFAULT NULL,
  `version` varchar(256) DEFAULT NULL,
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modified_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `vm_cloud`
--

DROP TABLE IF EXISTS `vm_cloud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vm_cloud` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hostname` varchar(256) DEFAULT NULL,
  `ip_address` varchar(256) DEFAULT NULL,
  `vm_os_id` int(11) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  `inQueue` tinyint(1) DEFAULT '0',
  `time` decimal(60,2) DEFAULT '0.00',
  `num_jobs` int(11) DEFAULT '0',
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modified_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `vm_cloud2browser`
--

DROP TABLE IF EXISTS `vm_cloud2browser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vm_cloud2browser` (
  `vm_cloud_id` int(10) unsigned NOT NULL,
  `vm_browser_id` int(10) unsigned NOT NULL,
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modified_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`vm_cloud_id`,`vm_browser_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `vm_os`
--

DROP TABLE IF EXISTS `vm_os`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vm_os` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(256) DEFAULT NULL,
  `arch` varchar(256) DEFAULT NULL,
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modified_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `vm_subtests`
--

DROP TABLE IF EXISTS `vm_subtests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vm_subtests` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vm_testcase_id` int(11) DEFAULT NULL,
  `name` varchar(256) DEFAULT NULL,
  `time_t_firefox` decimal(30,2) NOT NULL DEFAULT '1.00',
  `time_t_chrome` decimal(30,2) NOT NULL DEFAULT '1.00',
  `time_t_ie` decimal(30,2) NOT NULL DEFAULT '1.00',
  `time_b_firefox` decimal(30,2) NOT NULL DEFAULT '1.00',
  `time_b_chrome` decimal(30,2) NOT NULL DEFAULT '1.00',
  `time_b_ie` decimal(30,2) NOT NULL DEFAULT '1.00',
  `time_p_firefox` decimal(30,2) NOT NULL DEFAULT '1.00',
  `time_p_chrome` decimal(30,2) NOT NULL DEFAULT '1.00',
  `time_p_ie` decimal(30,2) NOT NULL DEFAULT '1.00',
  `error_t_firefox` int(11) NOT NULL DEFAULT '0',
  `error_t_chrome` int(11) NOT NULL DEFAULT '0',
  `error_t_ie` int(11) NOT NULL DEFAULT '0',
  `error_b_firefox` int(11) NOT NULL DEFAULT '0',
  `error_b_chrome` int(11) NOT NULL DEFAULT '0',
  `error_b_ie` int(11) NOT NULL DEFAULT '0',
  `error_p_firefox` int(11) NOT NULL DEFAULT '0',
  `error_p_chrome` int(11) NOT NULL DEFAULT '0',
  `error_p_ie` int(11) NOT NULL DEFAULT '0',
  `failure_t_firefox` int(11) NOT NULL DEFAULT '0',
  `failure_t_chrome` int(11) NOT NULL DEFAULT '0',
  `failure_t_ie` int(11) NOT NULL DEFAULT '0',
  `failure_b_firefox` int(11) NOT NULL DEFAULT '0',
  `failure_b_chrome` int(11) NOT NULL DEFAULT '0',
  `failure_b_ie` int(11) NOT NULL DEFAULT '0',
  `failure_p_firefox` int(11) NOT NULL DEFAULT '0',
  `failure_p_chrome` int(11) NOT NULL DEFAULT '0',
  `failure_p_ie` int(11) NOT NULL DEFAULT '0',
  `num_testcases` int(11) NOT NULL DEFAULT '0',
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modified_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=77 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `vm_testcases`
--

DROP TABLE IF EXISTS `vm_testcases`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vm_testcases` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(256) DEFAULT NULL,
  `platform` varchar(256) DEFAULT NULL,
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modified_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-07-16 15:53:41
