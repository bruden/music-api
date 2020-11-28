/*
Navicat SQLite Data Transfer

Source Server         : sqlite
Source Server Version : 30714
Source Host           : :0

Target Server Type    : SQLite
Target Server Version : 30714
File Encoding         : 65001

Date: 2020-11-28 20:04:24
*/

PRAGMA foreign_keys = OFF;

-- ----------------------------
-- Table structure for song
-- ----------------------------
CREATE TABLE "song" (
"title"  TEXT NOT NULL,
"creator"  TEXT NOT NULL,
"createTime"  INTEGER NOT NULL,
"downloadCount"  INTEGER NOT NULL,
"duration"  INTEGER NOT NULL,
"tones"  BLOB NOT NULL,
PRIMARY KEY ("title" ASC)
);
