create database studdb;
use studdb;

create table STUDENT(
USN  VARCHAR(10) PRIMARY KEY,

FULL_NAME varchar(15) not null,
FATHER_NAME varchar(15) not null,

EMAIL VARCHAR(30) NOT NULL,
PHONE VARCHAR(10) NOT NULL,
DATE_JOIN varchar(15),
B_DATE varchar(15),
ADMNO varchar(10) UNIQUE,
Address varchar(50),
Branch varchar(10)
);
