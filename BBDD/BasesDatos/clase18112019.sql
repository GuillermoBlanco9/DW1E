use sakila;

/*on delete cascade, on update cascade*/
/*
    RESTRICT – Es el comportamiento por defecto, que impide realizar modificaciones que atentan contra la integridad referencial.
    CASCADE – Borra los registros de la tabla dependiente cuando se borra el registro de la tabla principal (en una sentencia DELETE),
    o actualiza el valor de la clave secundaria cuando se actualiza el valor de la clave referenciada (en una sentencia UPDATE).
    SET NULL – Establece a NULL el valor de la clave secundaria cuando se elimina el registro en la tabla principal o se modifica el valor del campo referenciado.
    NO ACTION – Inhabilita el efecto de la restricción, permitiendo que se efectúe el cambio en la base de datos.
    
    Exemple:
    ....
    FOREIGN KEY (product_category, product_id)
      REFERENCES product(category, id)
      ON UPDATE CASCADE ON DELETE RESTRICT,
*/

/* To configure secure_file_priv in Windows: C:/ProgramData/MySQL/MySQLServer8.0/my.ini */
SHOW VARIABLES LIKE "secure_file_priv"; 

select payment_id,staff_id,max(amount)
into outfile 'z:\\sakila_payment.txt'
fields terminated by '*' optionally enclosed by '"'
lines terminated by '\n'
from payment
group by payment_id;

create table if not exists tablaDesdeOtraTablaSinDatos as (select payment_id,staff_id,max(amount) from sakila.payment where 1=2);

select * from ejercicios.tabladesdeotratablasindatos;

load data infile 'z:\\sakila_payment.txt'
into table ejercicios.tabladesdeotratablasindatos
fields terminated by '*' optionally enclosed by'"'
lines terminated by '\n';

/********************* S E L E C T S *******************************************

/*Get the customer_id and the greatest payment_date from customer_id group in sakila.payment*/
select customer_id, max(payment_date)
from sakila.payment
group by customer_id;

/*Get the customer_id, sum amount from customer_id group in sakila.payment if the sum amount of the group is greater than 150 */
select customer_id, sum(amount)
from sakila.payment
group by customer_id
having sum(amount) >=150;

/*Get all fields from table sakila.rental if the day of return_date is between 1 and 10*/
select * from sakila.rental where day(return_date) between 3 and 5;

/*Get all fields from the sakila.language table which name ends in <h> */
select * from sakila.language where name like '%h';

update sakila.staff set last_update = '2008-03-29 11:30:25' where staff_id=2; /*I modify one register to obtain results*/
/*Get records from sakila.staff if last_update year is greater than 2007*/
select * from sakila.staff where year(last_update) > '2007';

/*Get records from sakila.staff where the last_name begins with a capital letter, then low letters until the end. The beginning can not b an S and the end can not be an s*/
select * from sakila.staff where last_name regexp "^[A-RT-Z][a-z]*[^s]$";

/*Get from sakila.film_text table all records which title has two words*/
select * from sakila.film_text where title regexp '[a-zA-Z]*\s[a-zA-Z]*';

/*How many countries begin by C, has two words and the first letter of the second word begins by R in sakila.country*/
select count(country) 'Countries begin with C, has two words. Second word begins by R' from sakila.country where country regexp '^C[a-z]* R[a-z]*$';

/*Get five records from sakila.customer table that match the constraint but from the third one, excluded. The constraint is: address_id greater or equal than 10*/
SELECT * FROM sakila.customer where address_id >= 10 limit 3,5;

/*Get records from sakila.film table where (rental_rate is greater than 3 and rental_duration less or equal than 5) or (length different than: 62, 63, 113, 150 y 18)*/
select * from sakila.film where (rental_rate > 3 and rental_duration <= 5) OR length not in (62, 63, 86, 113, 150, 18);

/*Get records from sakila.film_text with the word 'astounding' in its description*/
select * from sakila.film_text where description like '%astounding%';

/*Get length fields of the records with different length from sakila.film table*/
select distinct length 'Different Length' from sakila.film order by length;

/*Count how many different length are there in records belonging to sakila.film table*/
select count(distinct length) 'Different Length count' from sakila.film order by length;

/*Count how many records are active, how many are inactive and total customers number in sakila.customer table*/
/*Active=1 means active. Active=0 means inactive*/
select (select count(active) from sakila.customer where active=1) 'Active Customer',
(select count(active) from sakila.customer where active=0)  'Inactive Customer',
(select count(*) from sakila.customer) 'Total Customer';

/*********************************************************************/
/*With round*/
select payment_id,round(amount*15000.56,2) from sakila.payment where payment_id < 15; 

/*With format*/
select payment_id,format(amount*15000.56,2) from sakila.payment where payment_id < 15;
/*********************************************************************/











