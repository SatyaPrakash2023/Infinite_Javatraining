drop database if exists Hms;
create database Hms;

use Hms;
create table Doctor_Master(
doctor_id varchar(15) primary key,
doctor_name varchar(15) Not null,
Dept varchar(15) not null
);

desc Doctor_Master;

insert into Doctor_Master(doctor_id,doctor_name,Dept)
values('D0001','Ram','ENT'),
('D0002','Ranjan','ENT'),
('D0003','Smita','Eye'),
('D0004','Bhuban','Surgery'),
('D0005','Sheela','Surgery'),
('D0006','Nethra','Surgery');

create table room_master(
room_no varchar(15) primary key,
room_type varchar(15) not null,
status varchar(15) not null
);

insert into room_master(room_no,room_type,status)
values('R0001','AC','occupied'),
('R0002','Suite','Vacent'),
('R0003','NonAC','Vacent'),
('R0004','NonAC','occupied'),
('R0005','AC','Vacent'),
('R0006','AC','occupied');

create table Patient_Master(
pid varchar(15) primary key,
name varchar(15) not null,
age varchar(15) not null,
Weight Varchar(15) not null,
Gender varchar(15)not null,
Address varchar(15)not null,
PhoneNo varchar(15)not null,
Disease varchar(15)not null,
Doctor_id varchar(5),

foreign key(Doctor_id)  references  doctor_master(Docto_id)
);


insert into PATIENT_MASTER(pid, name,age,weight,gender,address,phoneno,disease,doctorid) 
Values('POOO1','Gita','35','65','F','Chennai','9867145678 ','Eye Infection','D0003'),
('POOO2','Ashis','40','70','M','Delhi','9845675678  ','Asthma','D0003'),
('POOO3','Radha','25','60','F','Chennai','9867166678  ','Pain in heart','D0005'),
('POOO1','Chandra','28','55','F','Banglore','9867145578 ','Asthma','D0001'),
('POOO1','Goyal','42','65','F','Delhi','8967533223  ','Pain in Stomach','D0004');


create table room_allocation(
room_no varchar(15),
pid varchar(15),
admission_date datetime,
release_date date,
foreign key (pid) references patient_master(pid), 
foreign key room_allocation(room_no) references room_master(room_no)
);

insert into room_allocation(room_no,pid,admission_date,release_date)
values('R0001','P0001','15-oct-16','26-oct-16 '),
('R0002','P0002','15-nov-16 ','26-nov-16  '),
('R0003','P0003','01-dec-16 ','30-dec-16 '),
('R0004','P0004','01-jan-17','30-jan-17'),




