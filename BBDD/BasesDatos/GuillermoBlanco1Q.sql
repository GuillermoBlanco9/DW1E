
create database if not exists Animals;

use Animals;
create table if not exists Staff
(
	StaffID char(5),
    DNI char(9),
    Nombre varchar(40),
	surname varchar(40),
    DofB date,
    age int,
    Email varchar(40),
    phoneS char(9),
    JobCategory enum('Veterinarian','Assistant','Oficce_clerk'),
    salary decimal(4,2)not null,
    constraint pk_staff primary key (StaffID),
    constraint uq_staff unique (DNI)
);

create table if not exists Clinic 
(
	StaffID char(5),
	ClinicID char(5),
    town varchar(40),
    Address enum ('Street','Number'),
    phoneC char(9),
	constraint pk_clinic primary key (ClinicID),
    constraint fk_vetC foreign key (StaffID) references Vet(StaffID)
);

create table if not exists Staff_phone
(
	StaffID char(5),
    phoneS char(9),
    constraint pk_staff_phone primary key (StaffID,phoneS),
	constraint fk_staff_phone foreign key (StaffID) references Staff(StaffID)
); 

create table if not exists Clinic_phone
(
	ClinicID char(5),
    phoneC char(9),
    constraint pk_clinic_phone primary key (ClinicID,phoneC),
	constraint fk_clinic_phone foreign key (ClinicID) references Clinic(ClinicID)
); 

create table if not exists Vet
(
	StaffID char(5),
    especialization enum ('cat','dog','others'),
    constraint pk_vet primary key (StaffID),
    constraint fk_vetStaff foreign key (StaffID) references Staff(StaffID)
);

create table if not exists Assistant
(
	StaffID char(5),
    constraint pk_Assis primary key (StaffID),
    constraint fk_AssisStaff foreign key (StaffID) references Staff(StaffID)
);

create table if not exists OfficeClerk
(
	ClinicID char(5),
	StaffID char(5),
    constraint pk_clerk primary key (StaffID),
    constraint uq_clerkV unique (ClinicID),
    constraint fk_clerkV foreign key (ClinicID) references Clinic(ClinicID),
    constraint fk_clerkStaff foreign key (StaffID) references Staff(StaffID)
);

create table if not exists Vet_Asists
(
	StaffID char(5),
    constraint pk_vet primary key (StaffID),
    constraint fk_v_a foreign key (StaffID) references Vet(StaffID),
    constraint fk_a_v foreign key (StaffID) references Assistant(StaffID)
);

create table if not exists Asists_clinic
(
	StaffID char(5),
    ClinicID char(5),
    
    constraint pk_ClinicA primary key (ClinicID,StaffID),
    constraint fk_c_a foreign key (ClinicID) references Clinic(ClinicID),
    constraint fk_a_c foreign key (StaffID) references Assistant(StaffID)
);

insert into animals.staff values
('ab001','12345678n','Juan1','lopez1','1999-10-10','19','aaaaaaa@aaaaaa','123426789','Veterinarian','4.2'),
('ab002','12145678n','Juaan1','lopeez1','1999-10-10','19','aaaaaaa@aaabaa','123456739','Assistant','4.2'),
('ab003','12345674n','Juaaan1','lopeeez1','1999-10-10','19','aaaacaaa@aaaaaa','125456789','Veterinarian','4.2');


1
select film_id,title,max(length)
from sakila.film;

2
select film_id,title,lenght
from sakila.film
group by lenght 
limit 10;

3

select film_id,titlerental_duration,replacement_cost from sakila.film where (replacement_cost between 20 and 25 rental_duration >=5);

4
select film_id,titlerental_duration,replacement_cost from sakila.film



drop schema animals;
