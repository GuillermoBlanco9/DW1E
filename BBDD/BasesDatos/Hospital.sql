create database ClinicSante;
use clinicsante;
create table staff
(
	dni char(9),                             /*char es limitado mientras que varchar pones un limite*/
    salary decimal(5,2) null,
    dateOfBirth date not null,
    first_name varchar(30)not null,
    surname varchar(30)not null,
    street varchar(30)not null,
    numberStreet int not null,
    constraint dni_staff primary key(dni)
);


create table staff_phone
(
	dni char(9),
    phone varchar(15),
    constraint staff_phone primary key (dni, phone),
    constraint staff_phoneFK foreign key (dni) references staff(dni)
);