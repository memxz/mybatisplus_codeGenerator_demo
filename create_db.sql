CREATE DATABASE mp;

USE `mp`;

/*Table structure for table `student` */

CREATE TABLE `student` (
                           `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学号',
                           `name` varchar(50) DEFAULT NULL COMMENT '姓名',
                           `score` double DEFAULT NULL COMMENT '成绩',
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `user` */

CREATE TABLE `user` (
                        `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
                        `username` varchar(50) NOT NULL COMMENT '用户名',
                        `password` varchar(50) DEFAULT NULL COMMENT '密码',
                        `create_time` date DEFAULT NULL COMMENT '创建时间',
                        `modify_time` date DEFAULT NULL COMMENT '最后一次修改时间',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-----------------------------------
©著作权归作者所有：来自51CTO博客作者ZS_Jie的原创作品，请联系作者获取转载授权，否则将追究法律责任
#yyds干货盘点# MyBatis-Plus——代码生成器（3.5.1+版本）
https://blog.51cto.com/u_15428918/4661188