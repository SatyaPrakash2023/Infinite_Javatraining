Drop database if exists InsuranceSystem;
create database InsuranceSystem;
drop table if exists Insurance_Details;
create table Insurance_Details(
Insurance_id varchar(30) primary key,
Insurance_Name varchar(40),
Type varchar(20),
PremiumStart INT,
PremiumEnd INT,
MinPeriod int,
MaxPeriod int,
LaunchDate date,
Status varchar(20));

