create database if not exists Ejercicios charset utf8mb4 collate utf8mb4_unicode_ci;

use Ejercicios;

create table if not exists empleados
(
	numemp char(3),
    nombre varchar(30),
    edad tinyint,
    oficina tinyint,
    titulo varchar(30),
    contrato date,
    jefe char(3),
    cuota decimal(8,2),
    ventas decimal(8,2),
    primary key (numemp)
);

insert into empleados values ('101','Antonio Viguer',45,12,'representante',str_to_date(replace('20/10/86','/','.'),get_format(date,'EUR')),'104',300000,305000),
							('102','Alvaro Jaumes',48,21,'representante',str_to_date(replace('10/12/86','/','.'),get_format(date,'EUR')),'108',350000,474000),
                            ('103','Juan Rovira',29,12,'representante',str_to_date(replace('01/03/87','/','.'),get_format(date,'EUR')),'104',275000,286000),
                            ('104','JosÃ© GonzÃ¡lez',33,12,'dir ventas',str_to_date(replace('19/05/87','/','.'),get_format(date,'EUR')),'106',200000,143000),
                            ('105','Vicente Pantalla',37,13,'representante',str_to_date(replace('12/02/88','/','.'),get_format(date,'EUR')),'104',350000,368000),
                            ('106','Luis Antonio',52,11,'dir general',str_to_date(replace('14/06/88','/','.'),get_format(date,'EUR')),null,275000,299000),
                            ('107','Jorge GutiÃ©rrez',49,22,'representante',str_to_date(replace('14/11/88','/','.'),get_format(date,'EUR')),'108',300000,186000),
                            ('108','Ana Bustamante',62,21,'dir ventas',str_to_date(replace('12/10/89','/','.'),get_format(date,'EUR')),'106',350000,361000),
                            ('109','MarÃ­a Sunta',31,11,'representante',str_to_date(replace('12/10/99','/','.'),get_format(date,'EUR')),'106',300000,392000),
                            ('110','Juan Victor',41,null,'representante',str_to_date(replace('13/01/90','/','.'),get_format(date,'EUR')),'104',null,76000);
	
create table if not exists oficinas
(
	oficina tinyint,
    ciudad varchar(30),
    region varchar(10),
    dir char(3),
    objetivo decimal(8,2),
    ventas decimal(9,2),
    primary key (oficina)
);

insert into oficinas values (11,'Valencia','este','106',575000,693000),
							(12,'Alicante','este','104',800000,735000),
                            (13,'CastellÃ³n','este','105',350000,368000),
                            (21,'Badajoz','oeste','108',725000,836000),
                            (22,'A CoruÃ±a','oeste','108',300000,186000),
                            (23,'Madrid','centro','108',null,null),
							(24,'Madrid','centro','108',250000,150000),
                            (26,'Pamplona','norte',null,null,null),
                            (28,'Valencia','este',null,900000,0);

create table if not exists clientes
(
	numclie char(4),
    nombre varchar(30),
    repclie char(3),
    limitecredito decimal(7,2),
    primary key (numclie)
);

insert into clientes values ('2101','Luis García AntÃ³n','106',65000),
							('2102','Ãlvaro RodrÃ­guez','101',65000),
                            ('2103','Jaime Llorens','105',50000),
                            ('2105','Antonio Canales','101',45000),
							('2106','Juan SuÃ¡rez','102',65000),
                            ('2107','Julian LÃ³pez','110',35000),
                            ('2108','Julia Antequera','109',55000),
							('2109','Alberto Juanes','103',25000),
                            ('2111','CritÃ³bal GarcÃ­a','103',50000),
                            ('2112','MarÃ­a Silva','108',50000),
							('2113','Luisa Maron','104',20000),
                            ('2114','Cristina Bulini','102',20000),
                            ('2115','Vicente MartÃ­nez','101',20000),
							('2117','Carlos Tena','106',35000),
                            ('2118','JunÃ­pero Ãlvarez','108',60000),
                            ('2119','SalomÃ³n Bueno','109',25000),
							('2120','Juan Malo','102',50000),
                            ('2121','Vicente RÃ­os','103',45000),
                            ('2122','JosÃ© Marchante','105',30000),
							('2123','JosÃ© Libros','102',40000),
                            ('2124','Juan Bolto','107',40000);
                            
create table if not exists productos
(
	idfab char(3),
    idproducto varchar(5),
    descripcion varchar(30),
    precio decimal(6,2),
    existencias int,
    primary key (idfab,idproducto)
);

insert into productos values ('aci','41001','arandela',58,277),
							('aci','41002','bisagra',80,167),
                            ('aci','41003','art t3',112,207),
                            ('aci','41004','art t4',123,139),
                            ('aci','4100x','junta',26,37),
                            ('aci','4100y','extrator',2888,25),
							('aci','4100z','mont',2625,28),
                            ('bic','41003','manivela',652,3),
                            ('bic','41089','rodamiento',225,78),
                            ('bic','41672','plato',180,0),
                            ('fea','112','cubo',148,115),
							('fea','114','cubo',243,15),
                            ('imm','773c','reostato',975,28),
                            ('imm','775c','reostato 2',1425,5),
                            ('imm','779c','reostato 3',1875,0),
                            ('imm','887h','caja clavos',54,223),
							('imm','887p','perno',25,24),
                            ('imm','887x','manivela',475,32),
                            ('qsa','xk47','red',355,38),
                            ('qsa','xk48','red',134,203),
                            ('qsa','xk48a','red',117,37),
							('rei','2a44g','pas',350,14),
                            ('rei','2a44l','bomba l',4500,12),
                            ('rei','2a44r','bomba r',4500,12),
                            ('rei','2a45c','junta',79,210);

create table if not exists pedidos
(
	codigo int auto_increment,
    numpedido char(6),
    fechapedido date,
    clie char(4),
    rep char(3),
    fab char(3),
    producto varchar(5),
    cant tinyint,
    importe decimal(8,2),
    primary key (codigo)
);

insert into pedidos values (null,'110036',str_to_date(replace('02/01/97','/','.'),get_format(date,'EUR')),'2107','110','aci','4100z',9,22500),
							(null,'110036',str_to_date(replace('02/01/97','/','.'),get_format(date,'EUR')),'2117','106','rei','2a44l',7,31500),
                            (null,'112963',str_to_date(replace('10/05/97','/','.'),get_format(date,'EUR')),'2103','105','aci','41004',28,3276),
                            (null,'112968',str_to_date(replace('11/01/90','/','.'),get_format(date,'EUR')),'2102','101','aci','41004',34,3978),
                            (null,'112975',str_to_date(replace('11/02/97','/','.'),get_format(date,'EUR')),'2111','103','rei','2a44g',6,2100),
                            (null,'112979',str_to_date(replace('12/10/89','/','.'),get_format(date,'EUR')),'2114','108','aci','4100z',6,15000),
                            (null,'112983',str_to_date(replace('10/05/97','/','.'),get_format(date,'EUR')),'2103','105','aci','41004',6,702),
							(null,'112987',str_to_date(replace('01/01/97','/','.'),get_format(date,'EUR')),'2103','105','aci','4100y',11,27500),
                            (null,'112989',str_to_date(replace('10/12/97','/','.'),get_format(date,'EUR')),'2101','106','fea','114',6,1458),
                            (null,'112992',str_to_date(replace('15/04/90','/','.'),get_format(date,'EUR')),'2118','108','aci','41002',10,760),
                            (null,'112993',str_to_date(replace('10/03/97','/','.'),get_format(date,'EUR')),'2106','102','rei','2a45c',24,1896),
                            (null,'112997',str_to_date(replace('04/04/97','/','.'),get_format(date,'EUR')),'2124','107','bic','41003',1,652),
                            (null,'113003',str_to_date(replace('05/02/97','/','.'),get_format(date,'EUR')),'2108','109','imm','779c',3,5625),
							(null,'113007',str_to_date(replace('01/01/97','/','.'),get_format(date,'EUR')),'2112','108','imm','773c',3,2925),
                            (null,'113012',str_to_date(replace('05/05/97','/','.'),get_format(date,'EUR')),'2111','105','aci','41003',35,3745),
                            (null,'113013',str_to_date(replace('06/08/97','/','.'),get_format(date,'EUR')),'2118','108','bic','41003',1,652),
                            (null,'113024',str_to_date(replace('04/07/97','/','.'),get_format(date,'EUR')),'2114','108','qsa','xk47',20,7100),
                            (null,'113027',str_to_date(replace('05/02/97','/','.'),get_format(date,'EUR')),'2103','105','aci','41002',54,4104),
                            (null,'113034',str_to_date(replace('05/11/97','/','.'),get_format(date,'EUR')),'2107','110','rei','2a45c',8,632),
							(null,'113042',str_to_date(replace('01/01/97','/','.'),get_format(date,'EUR')),'2113','101','rei','2a44r',5,22500),
                            (null,'113045',str_to_date(replace('02/07/97','/','.'),get_format(date,'EUR')),'2112','108','rei','2a44r',10,45000),
                            (null,'113048',str_to_date(replace('02/02/97','/','.'),get_format(date,'EUR')),'2120','102','imm','779c',2,3750),
                            (null,'113049',str_to_date(replace('04/04/97','/','.'),get_format(date,'EUR')),'2118','108','qsa','xk47',2,776),
                            (null,'113051',str_to_date(replace('06/07/97','/','.'),get_format(date,'EUR')),'2118','108','qsa','xk47',4,1420),
                            (null,'113055',str_to_date(replace('01/04/09','/','.'),get_format(date,'EUR')),'2108','101','aci','4100x',6,150),
							(null,'113057',str_to_date(replace('01/11/97','/','.'),get_format(date,'EUR')),'2111','103','aci','4100x',24,600),
                            (null,'113058',str_to_date(replace('04/07/89','/','.'),get_format(date,'EUR')),'2108','109','fea','112',10,1480),
                            (null,'113062',str_to_date(replace('04/07/97','/','.'),get_format(date,'EUR')),'2124','107','bic','41003',10,2430),
                            (null,'113065',str_to_date(replace('03/06/97','/','.'),get_format(date,'EUR')),'2106','102','qsa','xk47',6,2130),
                            (null,'113069',str_to_date(replace('01/08/97','/','.'),get_format(date,'EUR')),'2109','107','imm','773c',22,31350);

/*

%Y 	4-digit year
%y 	2-digit year 	for year < 70 the century is 20th, otherwise 19th
%b 	Abbreviated month (Jan - Dec)
%M 	Month name (January - December)
%m 	Month (0 - 12) 	Zero month supported by MySQL
%a 	Abbreviated day (Sun - Sat)
%d 	Day (0 - 31) 	Zero day supported by MySQL
%H		Hour (0 - 23)
%h 	Hour (01 - 12)
%i 	Minutes (0 - 59)
%s 	Seconds (0 - 59)

 SELECT STR_TO_DATE('17-09-2010','%d-%m-%Y');
 
 REPLACE(str, find_string, replace_with)
 
SELECT pub_city,country,
REPLACE(country,'K','SA') 
FROM publisher 
WHERE country='UK';

GET_ FORMAT([date | time | datetime ],[âEURâ |âUSAâ |âJISâ|âISOâ|âINTERNALâ])

GET_FORMAT(DATE,'USA') 	'%m.%d.%Y'
GET_FORMAT(DATE,'JIS') 	'%Y-%m-%d'
GET_FORMAT(DATE,'ISO') 	'%Y-%m-%d'
GET_FORMAT(DATE,'EUR') 	'%d.%m.%Y'
GET_FORMAT(DATE,'INTERNAL') 	'%Y%m%d'
GET_FORMAT(DATETIME,'USA') 	'%Y-%m-%d %H.%i.%s'
GET_FORMAT(DATETIME,'JIS') 	'%Y-%m-%d %H:%i:%s'
GET_FORMAT(DATETIME,'ISO') 	'%Y-%m-%d %H:%i:%s'
GET_FORMAT(DATETIME,'EUR') 	'%Y-%m-%d %H.%i.%s'
GET_FORMAT(DATETIME,'INTERNAL') 	'%Y%m%d%H%i%s'
GET_FORMAT(TIME,'USA') 	'%h:%i:%s %p'
GET_FORMAT(TIME,'JIS') 	'%H:%i:%s'
GET_FORMAT(TIME,'ISO') 	'%H:%i:%s'
GET_FORMAT(TIME,'EUR') 	'%H.%i.%s'
HOUR_MINUTE 	'HOURS:MINUTES'
DAY_MICROSECOND 	'DAYS HOURS:MINUTES:SECONDS.MICROSECONDS'
DAY_SECOND 	'DAYS HOURS:MINUTES:SECONDS'
DAY_MINUTE 	'DAYS HOURS:MINUTES'
DAY_HOUR 	'DAYS HOURS'
YEAR_MONTH 	'YEARS-MONTHS'

*/


