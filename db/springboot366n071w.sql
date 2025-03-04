-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springboot366n071w
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `springboot366n071w`
--

/*!40000 DROP DATABASE IF EXISTS `springboot366n071w`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springboot366n071w` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springboot366n071w`;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问',
  `reply` longtext COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8 COMMENT='在线留言';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (121,'2030-06-01 09:30:17',1,1,'提问1','回复1',1),(122,'2030-06-01 09:30:17',2,2,'提问2','回复2',2),(123,'2030-06-01 09:30:17',3,3,'提问3','回复3',3),(124,'2030-06-01 09:30:17',4,4,'提问4','回复4',4),(125,'2030-06-01 09:30:17',5,5,'提问5','回复5',5),(126,'2030-06-01 09:30:17',6,6,'提问6','回复6',6),(127,'2030-06-01 09:30:17',7,7,'提问7','回复7',7),(128,'2030-06-01 09:30:17',8,8,'提问8','回复8',8);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  `url` varchar(500) DEFAULT NULL COMMENT 'url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg',NULL),(2,'picture2','upload/picture2.jpg',NULL),(3,'picture3','upload/picture3.jpg',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gonggaoxinxi`
--

DROP TABLE IF EXISTS `gonggaoxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gonggaoxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `jianjie` longtext COMMENT '简介',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `fengmian` longtext COMMENT '封面',
  `neirong` longtext COMMENT '内容',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8 COMMENT='公告信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gonggaoxinxi`
--

LOCK TABLES `gonggaoxinxi` WRITE;
/*!40000 ALTER TABLE `gonggaoxinxi` DISABLE KEYS */;
INSERT INTO `gonggaoxinxi` VALUES (111,'2030-06-01 09:30:17','标题1','简介1','2030-06-01','upload/gonggaoxinxi_fengmian1.jpg,upload/gonggaoxinxi_fengmian2.jpg,upload/gonggaoxinxi_fengmian3.jpg','内容1',1),(112,'2030-06-01 09:30:17','标题2','简介2','2030-06-01','upload/gonggaoxinxi_fengmian2.jpg,upload/gonggaoxinxi_fengmian3.jpg,upload/gonggaoxinxi_fengmian4.jpg','内容2',2),(113,'2030-06-01 09:30:17','标题3','简介3','2030-06-01','upload/gonggaoxinxi_fengmian3.jpg,upload/gonggaoxinxi_fengmian4.jpg,upload/gonggaoxinxi_fengmian5.jpg','内容3',3),(114,'2030-06-01 09:30:17','标题4','简介4','2030-06-01','upload/gonggaoxinxi_fengmian4.jpg,upload/gonggaoxinxi_fengmian5.jpg,upload/gonggaoxinxi_fengmian6.jpg','内容4',4),(115,'2030-06-01 09:30:17','标题5','简介5','2030-06-01','upload/gonggaoxinxi_fengmian5.jpg,upload/gonggaoxinxi_fengmian6.jpg,upload/gonggaoxinxi_fengmian7.jpg','内容5',5),(116,'2030-06-01 09:30:17','标题6','简介6','2030-06-01','upload/gonggaoxinxi_fengmian6.jpg,upload/gonggaoxinxi_fengmian7.jpg,upload/gonggaoxinxi_fengmian8.jpg','内容6',6),(117,'2030-06-01 09:30:17','标题7','简介7','2030-06-01','upload/gonggaoxinxi_fengmian7.jpg,upload/gonggaoxinxi_fengmian8.jpg,upload/gonggaoxinxi_fengmian9.jpg','内容7',7),(118,'2030-06-01 09:30:17','标题8','简介8','2030-06-01','upload/gonggaoxinxi_fengmian8.jpg,upload/gonggaoxinxi_fengmian9.jpg,upload/gonggaoxinxi_fengmian10.jpg','内容8',8);
/*!40000 ALTER TABLE `gonggaoxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `haichejilu`
--

DROP TABLE IF EXISTS `haichejilu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `haichejilu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanbianhao` varchar(200) DEFAULT NULL COMMENT '订单编号',
  `chepaihao` varchar(200) DEFAULT NULL COMMENT '车牌号',
  `qichexinghao` varchar(200) DEFAULT NULL COMMENT '电动车型号',
  `pinpai` varchar(200) DEFAULT NULL COMMENT '品牌',
  `yajin` double DEFAULT NULL COMMENT '押金',
  `fengmian` longtext COMMENT '封面',
  `jianchazhuangtai` varchar(200) DEFAULT NULL COMMENT '检查状态',
  `guihairiqi` date DEFAULT NULL COMMENT '归还日期',
  `guihaibeizhu` longtext COMMENT '归还备注',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8 COMMENT='还车记录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `haichejilu`
--

LOCK TABLES `haichejilu` WRITE;
/*!40000 ALTER TABLE `haichejilu` DISABLE KEYS */;
INSERT INTO `haichejilu` VALUES (61,'2030-06-01 09:30:17','订单编号1','车牌号1','电动车型号1','品牌1',1,'upload/haichejilu_fengmian1.jpg,upload/haichejilu_fengmian2.jpg,upload/haichejilu_fengmian3.jpg','已检查','2030-06-01','归还备注1','账号1','姓名1','13823888881','身份证1'),(62,'2030-06-01 09:30:17','订单编号2','车牌号2','电动车型号2','品牌2',2,'upload/haichejilu_fengmian2.jpg,upload/haichejilu_fengmian3.jpg,upload/haichejilu_fengmian4.jpg','已检查','2030-06-01','归还备注2','账号2','姓名2','13823888882','身份证2'),(63,'2030-06-01 09:30:17','订单编号3','车牌号3','电动车型号3','品牌3',3,'upload/haichejilu_fengmian3.jpg,upload/haichejilu_fengmian4.jpg,upload/haichejilu_fengmian5.jpg','已检查','2030-06-01','归还备注3','账号3','姓名3','13823888883','身份证3'),(64,'2030-06-01 09:30:17','订单编号4','车牌号4','电动车型号4','品牌4',4,'upload/haichejilu_fengmian4.jpg,upload/haichejilu_fengmian5.jpg,upload/haichejilu_fengmian6.jpg','已检查','2030-06-01','归还备注4','账号4','姓名4','13823888884','身份证4'),(65,'2030-06-01 09:30:17','订单编号5','车牌号5','电动车型号5','品牌5',5,'upload/haichejilu_fengmian5.jpg,upload/haichejilu_fengmian6.jpg,upload/haichejilu_fengmian7.jpg','已检查','2030-06-01','归还备注5','账号5','姓名5','13823888885','身份证5'),(66,'2030-06-01 09:30:17','订单编号6','车牌号6','电动车型号6','品牌6',6,'upload/haichejilu_fengmian6.jpg,upload/haichejilu_fengmian7.jpg,upload/haichejilu_fengmian8.jpg','已检查','2030-06-01','归还备注6','账号6','姓名6','13823888886','身份证6'),(67,'2030-06-01 09:30:17','订单编号7','车牌号7','电动车型号7','品牌7',7,'upload/haichejilu_fengmian7.jpg,upload/haichejilu_fengmian8.jpg,upload/haichejilu_fengmian9.jpg','已检查','2030-06-01','归还备注7','账号7','姓名7','13823888887','身份证7'),(68,'2030-06-01 09:30:17','订单编号8','车牌号8','电动车型号8','品牌8',8,'upload/haichejilu_fengmian8.jpg,upload/haichejilu_fengmian9.jpg,upload/haichejilu_fengmian10.jpg','已检查','2030-06-01','归还备注8','账号8','姓名8','13823888888','身份证8');
/*!40000 ALTER TABLE `haichejilu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jianchaxinxi`
--

DROP TABLE IF EXISTS `jianchaxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jianchaxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanbianhao` varchar(200) DEFAULT NULL COMMENT '订单编号',
  `chepaihao` varchar(200) DEFAULT NULL COMMENT '车牌号',
  `qichexinghao` varchar(200) DEFAULT NULL COMMENT '电动车型号',
  `pinpai` varchar(200) DEFAULT NULL COMMENT '品牌',
  `yajin` double DEFAULT NULL COMMENT '押金',
  `fengmian` longtext COMMENT '封面',
  `jianchajieguo` varchar(200) NOT NULL COMMENT '检查结果',
  `jianchariqi` date DEFAULT NULL COMMENT '检查日期',
  `jianchaxiangqing` longtext COMMENT '检查详情',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `jianyanyuanzhanghao` varchar(200) DEFAULT NULL COMMENT '检验员账号',
  `jianyanyuanxingming` varchar(200) DEFAULT NULL COMMENT '检验员姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8 COMMENT='检查信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jianchaxinxi`
--

LOCK TABLES `jianchaxinxi` WRITE;
/*!40000 ALTER TABLE `jianchaxinxi` DISABLE KEYS */;
INSERT INTO `jianchaxinxi` VALUES (71,'2030-06-01 09:30:17','订单编号1','车牌号1','电动车型号1','品牌1',1,'upload/jianchaxinxi_fengmian1.jpg,upload/jianchaxinxi_fengmian2.jpg,upload/jianchaxinxi_fengmian3.jpg','通过','2030-06-01','检查详情1','账号1','姓名1','13823888881','身份证1','检验员账号1','检验员姓名1'),(72,'2030-06-01 09:30:17','订单编号2','车牌号2','电动车型号2','品牌2',2,'upload/jianchaxinxi_fengmian2.jpg,upload/jianchaxinxi_fengmian3.jpg,upload/jianchaxinxi_fengmian4.jpg','通过','2030-06-01','检查详情2','账号2','姓名2','13823888882','身份证2','检验员账号2','检验员姓名2'),(73,'2030-06-01 09:30:17','订单编号3','车牌号3','电动车型号3','品牌3',3,'upload/jianchaxinxi_fengmian3.jpg,upload/jianchaxinxi_fengmian4.jpg,upload/jianchaxinxi_fengmian5.jpg','通过','2030-06-01','检查详情3','账号3','姓名3','13823888883','身份证3','检验员账号3','检验员姓名3'),(74,'2030-06-01 09:30:17','订单编号4','车牌号4','电动车型号4','品牌4',4,'upload/jianchaxinxi_fengmian4.jpg,upload/jianchaxinxi_fengmian5.jpg,upload/jianchaxinxi_fengmian6.jpg','通过','2030-06-01','检查详情4','账号4','姓名4','13823888884','身份证4','检验员账号4','检验员姓名4'),(75,'2030-06-01 09:30:17','订单编号5','车牌号5','电动车型号5','品牌5',5,'upload/jianchaxinxi_fengmian5.jpg,upload/jianchaxinxi_fengmian6.jpg,upload/jianchaxinxi_fengmian7.jpg','通过','2030-06-01','检查详情5','账号5','姓名5','13823888885','身份证5','检验员账号5','检验员姓名5'),(76,'2030-06-01 09:30:17','订单编号6','车牌号6','电动车型号6','品牌6',6,'upload/jianchaxinxi_fengmian6.jpg,upload/jianchaxinxi_fengmian7.jpg,upload/jianchaxinxi_fengmian8.jpg','通过','2030-06-01','检查详情6','账号6','姓名6','13823888886','身份证6','检验员账号6','检验员姓名6'),(77,'2030-06-01 09:30:17','订单编号7','车牌号7','电动车型号7','品牌7',7,'upload/jianchaxinxi_fengmian7.jpg,upload/jianchaxinxi_fengmian8.jpg,upload/jianchaxinxi_fengmian9.jpg','通过','2030-06-01','检查详情7','账号7','姓名7','13823888887','身份证7','检验员账号7','检验员姓名7'),(78,'2030-06-01 09:30:17','订单编号8','车牌号8','电动车型号8','品牌8',8,'upload/jianchaxinxi_fengmian8.jpg,upload/jianchaxinxi_fengmian9.jpg,upload/jianchaxinxi_fengmian10.jpg','通过','2030-06-01','检查详情8','账号8','姓名8','13823888888','身份证8','检验员账号8','检验员姓名8');
/*!40000 ALTER TABLE `jianchaxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jianyanyuan`
--

DROP TABLE IF EXISTS `jianyanyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jianyanyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jianyanyuanzhanghao` varchar(200) NOT NULL COMMENT '检验员账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `jianyanyuanxingming` varchar(200) NOT NULL COMMENT '检验员姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `touxiang` longtext COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `jianyanyuanzhanghao` (`jianyanyuanzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='检验员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jianyanyuan`
--

LOCK TABLES `jianyanyuan` WRITE;
/*!40000 ALTER TABLE `jianyanyuan` DISABLE KEYS */;
INSERT INTO `jianyanyuan` VALUES (21,'2030-06-01 09:30:17','检验员账号1','123456','检验员姓名1','男','13823888881','upload/jianyanyuan_touxiang1.jpg'),(22,'2030-06-01 09:30:17','检验员账号2','123456','检验员姓名2','男','13823888882','upload/jianyanyuan_touxiang2.jpg'),(23,'2030-06-01 09:30:17','检验员账号3','123456','检验员姓名3','男','13823888883','upload/jianyanyuan_touxiang3.jpg'),(24,'2030-06-01 09:30:17','检验员账号4','123456','检验员姓名4','男','13823888884','upload/jianyanyuan_touxiang4.jpg'),(25,'2030-06-01 09:30:17','检验员账号5','123456','检验员姓名5','男','13823888885','upload/jianyanyuan_touxiang5.jpg'),(26,'2030-06-01 09:30:17','检验员账号6','123456','检验员姓名6','男','13823888886','upload/jianyanyuan_touxiang6.jpg'),(27,'2030-06-01 09:30:17','检验员账号7','123456','检验员姓名7','男','13823888887','upload/jianyanyuan_touxiang7.jpg'),(28,'2030-06-01 09:30:17','检验员账号8','123456','检验员姓名8','男','13823888888','upload/jianyanyuan_touxiang8.jpg');
/*!40000 ALTER TABLE `jianyanyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qichefenlei`
--

DROP TABLE IF EXISTS `qichefenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qichefenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `qichefenlei` varchar(200) DEFAULT NULL COMMENT '电动车分类',
  PRIMARY KEY (`id`),
  UNIQUE KEY `qichefenlei` (`qichefenlei`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='电动车分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qichefenlei`
--

LOCK TABLES `qichefenlei` WRITE;
/*!40000 ALTER TABLE `qichefenlei` DISABLE KEYS */;
INSERT INTO `qichefenlei` VALUES (31,'2030-06-01 09:30:17','电动车分类1'),(32,'2030-06-01 09:30:17','电动车分类2'),(33,'2030-06-01 09:30:17','电动车分类3'),(34,'2030-06-01 09:30:17','电动车分类4'),(35,'2030-06-01 09:30:17','电动车分类5'),(36,'2030-06-01 09:30:17','电动车分类6'),(37,'2030-06-01 09:30:17','电动车分类7'),(38,'2030-06-01 09:30:17','电动车分类8');
/*!40000 ALTER TABLE `qichefenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qichexinxi`
--

DROP TABLE IF EXISTS `qichexinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qichexinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chepaihao` varchar(200) NOT NULL COMMENT '车牌号',
  `qichexinghao` varchar(200) DEFAULT NULL COMMENT '电动车型号',
  `qichefenlei` varchar(200) NOT NULL COMMENT '电动车分类',
  `pinpai` varchar(200) DEFAULT NULL COMMENT '品牌',
  `yanse` varchar(200) DEFAULT NULL COMMENT '颜色',
  `huandangfangshi` varchar(200) DEFAULT NULL COMMENT '换挡方式',
  `fengmian` longtext COMMENT '封面',
  `zhuangtai` varchar(200) DEFAULT NULL COMMENT '状态',
  `zujin` double DEFAULT NULL COMMENT '租金',
  `yajin` double DEFAULT NULL COMMENT '押金',
  `cheliangpailiang` varchar(200) DEFAULT NULL COMMENT '车辆排量',
  `youhao` varchar(200) DEFAULT NULL COMMENT '电池规格',
  `zaizhong` int(11) DEFAULT NULL COMMENT '载重',
  `zulinxuzhi` longtext COMMENT '租赁须知',
  `guihaibiaozhun` longtext COMMENT '归还标准',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  `cheliangxiangqing` longtext COMMENT '车辆详情',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `chepaihao` (`chepaihao`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='电动车信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qichexinxi`
--

LOCK TABLES `qichexinxi` WRITE;
/*!40000 ALTER TABLE `qichexinxi` DISABLE KEYS */;
INSERT INTO `qichexinxi` VALUES (41,'2030-06-01 09:30:17','车牌号1','电动车型号1','电动车分类1','品牌1','颜色1','手动挡','upload/qichexinxi_fengmian1.jpg,upload/qichexinxi_fengmian2.jpg,upload/qichexinxi_fengmian3.jpg','已租赁',1,1,'车辆排量1','电池规格1',1,'租赁须知1','归还标准1','2030-06-01','车辆详情1','2030-06-01 17:30:17',1,1),(42,'2030-06-01 09:30:17','车牌号2','电动车型号2','电动车分类2','品牌2','颜色2','手动挡','upload/qichexinxi_fengmian2.jpg,upload/qichexinxi_fengmian3.jpg,upload/qichexinxi_fengmian4.jpg','已租赁',2,2,'车辆排量2','电池规格2',2,'租赁须知2','归还标准2','2030-06-01','车辆详情2','2030-06-01 17:30:17',2,2),(43,'2030-06-01 09:30:17','车牌号3','电动车型号3','电动车分类3','品牌3','颜色3','手动挡','upload/qichexinxi_fengmian3.jpg,upload/qichexinxi_fengmian4.jpg,upload/qichexinxi_fengmian5.jpg','已租赁',3,3,'车辆排量3','电池规格3',3,'租赁须知3','归还标准3','2030-06-01','车辆详情3','2030-06-01 17:30:17',3,3),(44,'2030-06-01 09:30:17','车牌号4','电动车型号4','电动车分类4','品牌4','颜色4','手动挡','upload/qichexinxi_fengmian4.jpg,upload/qichexinxi_fengmian5.jpg,upload/qichexinxi_fengmian6.jpg','已租赁',4,4,'车辆排量4','电池规格4',4,'租赁须知4','归还标准4','2030-06-01','车辆详情4','2030-06-01 17:30:17',4,4),(45,'2030-06-01 09:30:17','车牌号5','电动车型号5','电动车分类5','品牌5','颜色5','手动挡','upload/qichexinxi_fengmian5.jpg,upload/qichexinxi_fengmian6.jpg,upload/qichexinxi_fengmian7.jpg','已租赁',5,5,'车辆排量5','电池规格5',5,'租赁须知5','归还标准5','2030-06-01','车辆详情5','2030-06-01 17:30:17',5,5),(46,'2030-06-01 09:30:17','车牌号6','电动车型号6','电动车分类6','品牌6','颜色6','手动挡','upload/qichexinxi_fengmian6.jpg,upload/qichexinxi_fengmian7.jpg,upload/qichexinxi_fengmian8.jpg','已租赁',6,6,'车辆排量6','电池规格6',6,'租赁须知6','归还标准6','2030-06-01','车辆详情6','2030-06-01 17:30:17',6,6),(47,'2030-06-01 09:30:17','车牌号7','电动车型号7','电动车分类7','品牌7','颜色7','手动挡','upload/qichexinxi_fengmian7.jpg,upload/qichexinxi_fengmian8.jpg,upload/qichexinxi_fengmian9.jpg','已租赁',7,7,'车辆排量7','电池规格7',7,'租赁须知7','归还标准7','2030-06-01','车辆详情7','2030-06-01 17:30:17',7,7),(48,'2030-06-01 09:30:17','车牌号8','电动车型号8','电动车分类8','品牌8','颜色8','手动挡','upload/qichexinxi_fengmian8.jpg,upload/qichexinxi_fengmian9.jpg,upload/qichexinxi_fengmian10.jpg','已租赁',8,8,'车辆排量8','电池规格8',8,'租赁须知8','归还标准8','2030-06-01','车辆详情8','2030-06-01 17:30:17',8,8);
/*!40000 ALTER TABLE `qichexinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qichezulin`
--

DROP TABLE IF EXISTS `qichezulin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qichezulin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanbianhao` varchar(200) DEFAULT NULL COMMENT '订单编号',
  `chepaihao` varchar(200) DEFAULT NULL COMMENT '车牌号',
  `qichexinghao` varchar(200) DEFAULT NULL COMMENT '电动车型号',
  `qichefenlei` varchar(200) DEFAULT NULL COMMENT '电动车分类',
  `pinpai` varchar(200) DEFAULT NULL COMMENT '品牌',
  `fengmian` longtext COMMENT '封面',
  `zujin` varchar(200) DEFAULT NULL COMMENT '租金',
  `qizuriqi` date DEFAULT NULL COMMENT '起租日期',
  `guihairiqi` date DEFAULT NULL COMMENT '归还日期',
  `zulintianshu` int(11) DEFAULT NULL COMMENT '租赁天数',
  `yajin` double DEFAULT NULL COMMENT '押金',
  `zongjia` double DEFAULT NULL COMMENT '总价',
  `zulinzhuangtai` varchar(200) DEFAULT NULL COMMENT '租赁状态',
  `xiadanshijian` date DEFAULT NULL COMMENT '下单时间',
  `beizhu` longtext COMMENT '备注',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dingdanbianhao` (`dingdanbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COMMENT='电动车租赁';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qichezulin`
--

LOCK TABLES `qichezulin` WRITE;
/*!40000 ALTER TABLE `qichezulin` DISABLE KEYS */;
INSERT INTO `qichezulin` VALUES (51,'2030-06-01 09:30:17','1111111111','车牌号1','电动车型号1','电动车分类1','品牌1','upload/qichezulin_fengmian1.jpg,upload/qichezulin_fengmian2.jpg,upload/qichezulin_fengmian3.jpg','租金1','2030-06-01','2030-06-01',1,1,1,'已归还','2030-06-01','备注1','账号1','姓名1','13823888881','身份证1','是','','未支付'),(52,'2030-06-01 09:30:17','2222222222','车牌号2','电动车型号2','电动车分类2','品牌2','upload/qichezulin_fengmian2.jpg,upload/qichezulin_fengmian3.jpg,upload/qichezulin_fengmian4.jpg','租金2','2030-06-01','2030-06-01',2,2,2,'已归还','2030-06-01','备注2','账号2','姓名2','13823888882','身份证2','是','','未支付'),(53,'2030-06-01 09:30:17','3333333333','车牌号3','电动车型号3','电动车分类3','品牌3','upload/qichezulin_fengmian3.jpg,upload/qichezulin_fengmian4.jpg,upload/qichezulin_fengmian5.jpg','租金3','2030-06-01','2030-06-01',3,3,3,'已归还','2030-06-01','备注3','账号3','姓名3','13823888883','身份证3','是','','未支付'),(54,'2030-06-01 09:30:17','4444444444','车牌号4','电动车型号4','电动车分类4','品牌4','upload/qichezulin_fengmian4.jpg,upload/qichezulin_fengmian5.jpg,upload/qichezulin_fengmian6.jpg','租金4','2030-06-01','2030-06-01',4,4,4,'已归还','2030-06-01','备注4','账号4','姓名4','13823888884','身份证4','是','','未支付'),(55,'2030-06-01 09:30:17','5555555555','车牌号5','电动车型号5','电动车分类5','品牌5','upload/qichezulin_fengmian5.jpg,upload/qichezulin_fengmian6.jpg,upload/qichezulin_fengmian7.jpg','租金5','2030-06-01','2030-06-01',5,5,5,'已归还','2030-06-01','备注5','账号5','姓名5','13823888885','身份证5','是','','未支付'),(56,'2030-06-01 09:30:17','6666666666','车牌号6','电动车型号6','电动车分类6','品牌6','upload/qichezulin_fengmian6.jpg,upload/qichezulin_fengmian7.jpg,upload/qichezulin_fengmian8.jpg','租金6','2030-06-01','2030-06-01',6,6,6,'已归还','2030-06-01','备注6','账号6','姓名6','13823888886','身份证6','是','','未支付'),(57,'2030-06-01 09:30:17','7777777777','车牌号7','电动车型号7','电动车分类7','品牌7','upload/qichezulin_fengmian7.jpg,upload/qichezulin_fengmian8.jpg,upload/qichezulin_fengmian9.jpg','租金7','2030-06-01','2030-06-01',7,7,7,'已归还','2030-06-01','备注7','账号7','姓名7','13823888887','身份证7','是','','未支付'),(58,'2030-06-01 09:30:17','8888888888','车牌号8','电动车型号8','电动车分类8','品牌8','upload/qichezulin_fengmian8.jpg,upload/qichezulin_fengmian9.jpg,upload/qichezulin_fengmian10.jpg','租金8','2030-06-01','2030-06-01',8,8,8,'已归还','2030-06-01','备注8','账号8','姓名8','13823888888','身份证8','是','','未支付');
/*!40000 ALTER TABLE `qichezulin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext COMMENT '图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'admin','users','管理员','ns5zcwnrsy802ob17xcttcouw2okj9hk','2030-06-01 09:33:59','2030-06-01 10:33:59');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `image` varchar(200) DEFAULT NULL COMMENT '头像',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','upload/image1.jpg','管理员','2030-06-01 09:30:17');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weizhangdengji`
--

DROP TABLE IF EXISTS `weizhangdengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `weizhangdengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `weiguizhaopian` longtext COMMENT '违规照片',
  `weizhangriqi` date DEFAULT NULL COMMENT '违章日期',
  `fakuanjine` int(11) DEFAULT NULL COMMENT '罚款金额',
  `weizhangqingkuang` longtext COMMENT '违章情况',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8 COMMENT='违章登记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weizhangdengji`
--

LOCK TABLES `weizhangdengji` WRITE;
/*!40000 ALTER TABLE `weizhangdengji` DISABLE KEYS */;
INSERT INTO `weizhangdengji` VALUES (101,'2030-06-01 09:30:17','账号1','姓名1','upload/weizhangdengji_weiguizhaopian1.jpg,upload/weizhangdengji_weiguizhaopian2.jpg,upload/weizhangdengji_weiguizhaopian3.jpg','2030-06-01',1,'违章情况1','未支付'),(102,'2030-06-01 09:30:17','账号2','姓名2','upload/weizhangdengji_weiguizhaopian2.jpg,upload/weizhangdengji_weiguizhaopian3.jpg,upload/weizhangdengji_weiguizhaopian4.jpg','2030-06-01',2,'违章情况2','未支付'),(103,'2030-06-01 09:30:17','账号3','姓名3','upload/weizhangdengji_weiguizhaopian3.jpg,upload/weizhangdengji_weiguizhaopian4.jpg,upload/weizhangdengji_weiguizhaopian5.jpg','2030-06-01',3,'违章情况3','未支付'),(104,'2030-06-01 09:30:17','账号4','姓名4','upload/weizhangdengji_weiguizhaopian4.jpg,upload/weizhangdengji_weiguizhaopian5.jpg,upload/weizhangdengji_weiguizhaopian6.jpg','2030-06-01',4,'违章情况4','未支付'),(105,'2030-06-01 09:30:17','账号5','姓名5','upload/weizhangdengji_weiguizhaopian5.jpg,upload/weizhangdengji_weiguizhaopian6.jpg,upload/weizhangdengji_weiguizhaopian7.jpg','2030-06-01',5,'违章情况5','未支付'),(106,'2030-06-01 09:30:17','账号6','姓名6','upload/weizhangdengji_weiguizhaopian6.jpg,upload/weizhangdengji_weiguizhaopian7.jpg,upload/weizhangdengji_weiguizhaopian8.jpg','2030-06-01',6,'违章情况6','未支付'),(107,'2030-06-01 09:30:17','账号7','姓名7','upload/weizhangdengji_weiguizhaopian7.jpg,upload/weizhangdengji_weiguizhaopian8.jpg,upload/weizhangdengji_weiguizhaopian9.jpg','2030-06-01',7,'违章情况7','未支付'),(108,'2030-06-01 09:30:17','账号8','姓名8','upload/weizhangdengji_weiguizhaopian8.jpg,upload/weizhangdengji_weiguizhaopian9.jpg,upload/weizhangdengji_weiguizhaopian10.jpg','2030-06-01',8,'违章情况8','未支付');
/*!40000 ALTER TABLE `weizhangdengji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yajintuihai`
--

DROP TABLE IF EXISTS `yajintuihai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yajintuihai` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tuihaibianhao` varchar(200) DEFAULT NULL COMMENT '退还编号',
  `chepaihao` varchar(200) DEFAULT NULL COMMENT '车牌号',
  `qichexinghao` varchar(200) DEFAULT NULL COMMENT '电动车型号',
  `fengmian` longtext COMMENT '封面',
  `yajin` double DEFAULT NULL COMMENT '押金',
  `kouchuyajin` double DEFAULT NULL COMMENT '扣除押金',
  `tuihaiyajin` double DEFAULT NULL COMMENT '退还押金',
  `tuihairiqi` date DEFAULT NULL COMMENT '退还日期',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `crossuserid` bigint(20) DEFAULT NULL COMMENT '跨表用户id',
  `crossrefid` bigint(20) DEFAULT NULL COMMENT '跨表主键id',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tuihaibianhao` (`tuihaibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8 COMMENT='押金退还';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yajintuihai`
--

LOCK TABLES `yajintuihai` WRITE;
/*!40000 ALTER TABLE `yajintuihai` DISABLE KEYS */;
INSERT INTO `yajintuihai` VALUES (81,'2030-06-01 09:30:17','1111111111','车牌号1','电动车型号1','upload/yajintuihai_fengmian1.jpg,upload/yajintuihai_fengmian2.jpg,upload/yajintuihai_fengmian3.jpg',1,1,1,'2030-06-01','账号1','姓名1','13823888881','身份证1',1,1,'未支付'),(82,'2030-06-01 09:30:17','2222222222','车牌号2','电动车型号2','upload/yajintuihai_fengmian2.jpg,upload/yajintuihai_fengmian3.jpg,upload/yajintuihai_fengmian4.jpg',2,2,2,'2030-06-01','账号2','姓名2','13823888882','身份证2',2,2,'未支付'),(83,'2030-06-01 09:30:17','3333333333','车牌号3','电动车型号3','upload/yajintuihai_fengmian3.jpg,upload/yajintuihai_fengmian4.jpg,upload/yajintuihai_fengmian5.jpg',3,3,3,'2030-06-01','账号3','姓名3','13823888883','身份证3',3,3,'未支付'),(84,'2030-06-01 09:30:17','4444444444','车牌号4','电动车型号4','upload/yajintuihai_fengmian4.jpg,upload/yajintuihai_fengmian5.jpg,upload/yajintuihai_fengmian6.jpg',4,4,4,'2030-06-01','账号4','姓名4','13823888884','身份证4',4,4,'未支付'),(85,'2030-06-01 09:30:17','5555555555','车牌号5','电动车型号5','upload/yajintuihai_fengmian5.jpg,upload/yajintuihai_fengmian6.jpg,upload/yajintuihai_fengmian7.jpg',5,5,5,'2030-06-01','账号5','姓名5','13823888885','身份证5',5,5,'未支付'),(86,'2030-06-01 09:30:17','6666666666','车牌号6','电动车型号6','upload/yajintuihai_fengmian6.jpg,upload/yajintuihai_fengmian7.jpg,upload/yajintuihai_fengmian8.jpg',6,6,6,'2030-06-01','账号6','姓名6','13823888886','身份证6',6,6,'未支付'),(87,'2030-06-01 09:30:17','7777777777','车牌号7','电动车型号7','upload/yajintuihai_fengmian7.jpg,upload/yajintuihai_fengmian8.jpg,upload/yajintuihai_fengmian9.jpg',7,7,7,'2030-06-01','账号7','姓名7','13823888887','身份证7',7,7,'未支付'),(88,'2030-06-01 09:30:17','8888888888','车牌号8','电动车型号8','upload/yajintuihai_fengmian8.jpg,upload/yajintuihai_fengmian9.jpg,upload/yajintuihai_fengmian10.jpg',8,8,8,'2030-06-01','账号8','姓名8','13823888888','身份证8',8,8,'未支付');
/*!40000 ALTER TABLE `yajintuihai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `touxiang` longtext COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2030-06-01 09:30:17','账号1','123456','姓名1','男','13823888881','440300199101010001','upload/yonghu_touxiang1.jpg'),(12,'2030-06-01 09:30:17','账号2','123456','姓名2','男','13823888882','440300199202020002','upload/yonghu_touxiang2.jpg'),(13,'2030-06-01 09:30:17','账号3','123456','姓名3','男','13823888883','440300199303030003','upload/yonghu_touxiang3.jpg'),(14,'2030-06-01 09:30:17','账号4','123456','姓名4','男','13823888884','440300199404040004','upload/yonghu_touxiang4.jpg'),(15,'2030-06-01 09:30:17','账号5','123456','姓名5','男','13823888885','440300199505050005','upload/yonghu_touxiang5.jpg'),(16,'2030-06-01 09:30:17','账号6','123456','姓名6','男','13823888886','440300199606060006','upload/yonghu_touxiang6.jpg'),(17,'2030-06-01 09:30:17','账号7','123456','姓名7','男','13823888887','440300199707070007','upload/yonghu_touxiang7.jpg'),(18,'2030-06-01 09:30:17','账号8','123456','姓名8','男','13823888888','440300199808080008','upload/yonghu_touxiang8.jpg');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuqitixing`
--

DROP TABLE IF EXISTS `yuqitixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuqitixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tixingbiaoti` varchar(200) NOT NULL COMMENT '提醒标题',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `fengmian` longtext COMMENT '封面',
  `tixingshijian` datetime DEFAULT NULL COMMENT '提醒时间',
  `tixingneirong` longtext COMMENT '提醒内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8 COMMENT='逾期提醒';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuqitixing`
--

LOCK TABLES `yuqitixing` WRITE;
/*!40000 ALTER TABLE `yuqitixing` DISABLE KEYS */;
INSERT INTO `yuqitixing` VALUES (91,'2030-06-01 09:30:17','提醒标题1','账号1','姓名1','upload/yuqitixing_fengmian1.jpg,upload/yuqitixing_fengmian2.jpg,upload/yuqitixing_fengmian3.jpg','2030-06-01 17:30:17','提醒内容1'),(92,'2030-06-01 09:30:17','提醒标题2','账号2','姓名2','upload/yuqitixing_fengmian2.jpg,upload/yuqitixing_fengmian3.jpg,upload/yuqitixing_fengmian4.jpg','2030-06-01 17:30:17','提醒内容2'),(93,'2030-06-01 09:30:17','提醒标题3','账号3','姓名3','upload/yuqitixing_fengmian3.jpg,upload/yuqitixing_fengmian4.jpg,upload/yuqitixing_fengmian5.jpg','2030-06-01 17:30:17','提醒内容3'),(94,'2030-06-01 09:30:17','提醒标题4','账号4','姓名4','upload/yuqitixing_fengmian4.jpg,upload/yuqitixing_fengmian5.jpg,upload/yuqitixing_fengmian6.jpg','2030-06-01 17:30:17','提醒内容4'),(95,'2030-06-01 09:30:17','提醒标题5','账号5','姓名5','upload/yuqitixing_fengmian5.jpg,upload/yuqitixing_fengmian6.jpg,upload/yuqitixing_fengmian7.jpg','2030-06-01 17:30:17','提醒内容5'),(96,'2030-06-01 09:30:17','提醒标题6','账号6','姓名6','upload/yuqitixing_fengmian6.jpg,upload/yuqitixing_fengmian7.jpg,upload/yuqitixing_fengmian8.jpg','2030-06-01 17:30:17','提醒内容6'),(97,'2030-06-01 09:30:17','提醒标题7','账号7','姓名7','upload/yuqitixing_fengmian7.jpg,upload/yuqitixing_fengmian8.jpg,upload/yuqitixing_fengmian9.jpg','2030-06-01 17:30:17','提醒内容7'),(98,'2030-06-01 09:30:17','提醒标题8','账号8','姓名8','upload/yuqitixing_fengmian8.jpg,upload/yuqitixing_fengmian9.jpg,upload/yuqitixing_fengmian10.jpg','2030-06-01 17:30:17','提醒内容8');
/*!40000 ALTER TABLE `yuqitixing` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2030-06-05  8:30:54
