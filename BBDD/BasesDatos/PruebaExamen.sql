create schema BlueSea;
use BlueSea;

create table if not exists staff
(
	StaffID char(5),
    DNI char(9) unique,
    nombre varchar(30),
    surname varchar(30), 
	email varchar(30),
	jobCategory varchar(30),
	constraint pk_StaffID primary key (StaffID)
	
);

create table if not exists Staff_phone
(	
	StaffID char(5),
	phone char(9),
    constraint pk_staff_phone primary key (StaffID,phone),
    constraint pfStaff_phone foreign key (StaffID) references staff(StaffID)
    
);

insert into staff values('12345','12345678N','jaun','lopez','pppppp@gmail.com','123456789','sailor');
select * from staff;


create table if not exists boats
(
	boatNumber char(5),
    nombre varchar(40),
    tipo varchar(20),
	estado varchar(20),
	constraint pk_boatNumber primary key (boatNumber)


);

create table if not exists tours
(
	tourID char(5),
	startPoint varchar(30),
	destination varchar(30),
	startDate datetime,
    returnDate datetime,
    numberOP int,
	price numeric(6,2),
	operatingExpenses numeric(6,2),
	StaffID char(5),
	constraint pk_tourID primary key (tourID)
	

);


create table if not exists staff_tours
(
	StaffID char(5),
    tourID char(5),
	constraint pk_tourID primary key (tourID),
	constraint fk_StaffID foreign key (StaffID) references staff(StaffID),
    constraint fk_tourID foreign key (tourID) references tours(tourID)

);

create table if not exists boat_tours
(
	boatNumber char(5),
    tourID char(5),
	
	constraint fk_boatNumber foreign key (boatNumber) references boats(boatNumber),
	constraint fk_tourID2 foreign key (tourID) references tours(tourID)

);




















create table if not exists Captain
(
	StaffID char(5),
	constraint pk_StaffID primary key (StaffID),
    constraint fk_StaffID2 foreign key (StaffID) references staff(StaffID)
);

create table if not exists Sailor
(
	StaffID char(5),
	constraint pk_StaffID primary key (StaffID),
    constraint fk_StaffID3 foreign key (StaffID) references staff(StaffID)
);

create table if not exists Service
(
	StaffID char(5),
	constraint pk_StaffID primary key (StaffID),
	constraint fk_StaffID4 foreign key (StaffID) references staff(StaffID)
);


create table if not exists CabinBoy
(
	StaffID char(5),
	constraint pk_StaffID primary key (StaffID),
	constraint fk_StaffID5 foreign key (StaffID) references staff(StaffID)

);