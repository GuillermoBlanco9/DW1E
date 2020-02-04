create database if not exists ClassTest;
use ClassTest;

create table if not exists Student 
(
	idS char(5),
    dniS char(9),
    nombreS varchar(30),
    study varchar(30),
    ageS numeric(2,0),
    town varchar(30),
    constraint pk_idS primary key (idS),
    constraint indxUQ_dniS unique index (dniS)

);
create table if not exists Teacher
(
	idT char(5),
    dniT char(9),
    nombreT varchar(30),
    ageT numeric(2,0),
    salary decimal(6,2),
    constraint pk_idT primary key(idT),
    constraint fk_Student_dniS foreign key (idT) references Student (idS),
	constraint indxUQ_dniT unique index (dniT)
    
);

show indexes from student;
show indexes from teacher;