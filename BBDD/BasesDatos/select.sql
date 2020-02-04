use sakila;
select * from country limit 3,5;
select concat(last_namepayment,' , ',first_name) 'Full name' from actor;

select sum(amount) 'Total amount' from payment where amount > 3;
select min(amount) 'Minimun amount' from payment where amount > 2;
select avg(amount) 'Average amount' from payment where amount > 4 and amount < 6;

select last_name,first_name from customer order by last_name,first_name;