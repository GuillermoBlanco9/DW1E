select actor_id,first_name from sakila.actor where actor_id>=190 and actor_id<=200;
select costumer_id,amount,payment_date from sakila.payment where amount>1000;
select amount from sakila.payment where amount>=2;
select * from sakila.inventory where store_id=2;
select * from sakila.film_text where title regexp '[a-zA-Z]*\s[a-zA-Z]*';

select country_id 'Countries begin with C has two words and ends in R',country from sakila.country where country regexp '^C[a-z]* R[a-z]*$';

select (select count(active) from sakila.customer where active=1) 'Active Customer',
(select count(active) from sakila.customer where active=0) 'Inactive Customer' ,
(select count(*) from sakila.customer) 'Total Customer';


select * from sakila.film where (rental_rate >3 and rental_duration >=5);