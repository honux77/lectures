<!-- page_number: true -->
![30%](images/slogo.png) ![30%](images/stove.png) 
# DBMS Basic 2: MySQL
<p align='center'>
CodeSquad Master <br>
Hoyoung Jung <br>
</p>

<p align='right'><img src='images/logo.png' width = '15%'> </p>

---
# 실습 준비 
- AWS - ubuntu16.04 - mysql 설치 
```
$ sudo apt install mysql-server
$ sudo service mysql start
$ sudo update-rc.d mysql defaults
```

---
# 한글 utf-8 설정
https://github.com/honux77/practice/wiki/mysql-ko-utf8
/etc/mysql/my.cnf에 추가
```
# client 부분밑에 추가
[client]
default-character-set = utf8
 
# mysqld 부분밑에 추가
[mysqld]
init_connect = SET collation_connection = utf8_general_ci
init_connect = SET NAMES utf8
character-set-server = utf8
collation-server = utf8_general_ci
 
# mysqldump 부분밑에 추가
[mysqldump]
default-character-set = utf8
 
# mysql 부분밑에 추가
[mysql]
default-character-set = utf8
```

---
# 일반사용자 외부 접속 허용
```
$ cd /etc/mysql
$ grep -r 'bind'
# bind-adress=127.0.0.1 내용 주석처리 
```

---
데이터베이스 및 일반 사용자 생성 
```sql
CREATE DATABASE honuxdb;
CREATE USER 'honux'@'%' IDENTIFIED BY '9a55w0rd';
GRANT ALL ON honuxdb.* TO 'honux'@'%';
FLUSH PRIVILEGES;
```
---
# GUI 이용 접속
## macOS
https://www.sequelpro.com/

## windows
HeidiSQL
http://www.heidisql.com/

---
# 테이블 생성 
```sql
DROP TABLE IF EXISTS USER;
CREATE TABLE USER (
    UID INT PRIMARY KEY AUTO_INCREMENT,
    EMAIL VARCHAR(64),
    NAME VARCHAR(64),
    PW VARCHAR(64)
    );
```
- http://dev.mysql.com/doc/refman/5.7/en/create-table.html
-  http://dev.mysql.com/doc/refman/5.7/en/data-types.html

---
# INSERT 
```
INSERT INTO USER VALUES (NULL, ...);
INSERT INTO USER(NAME, PW) VALUES ('honux', 'asdf');
INSERT INTO USER(NAME, PW) VALUES 
    ('honux', 'asdf'),(...);
```

---
# SELECT 
```
SELECT * FROM USER;
SELECT ID, NAME FROM USER;
SELECT ID, NAME FROM USER 
    WHERE ID=3;
SELECT * FROM USER 
    WHERE NAME LIKE 'H%';
```

---
# DELETE
팁: DELETE 문과 SELECT 문은 거의 비슷하므로 SELECT를 먼저 수행해 본다. 
```
DELETE FROM USER;
DELETE FROM USER WHERE ID = 4;
```

---
# UPDATE
```
UPDATE USER SET MONEY = 0;
UPDATE USER SET NAME = 'Honux' WHERE ID=2;
```