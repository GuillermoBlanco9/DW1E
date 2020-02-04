-- 1)
select NomEquipo,director
from ejercicios.equipo;
-- 2)all team names, directos if director beggins with M
select nomequipo,director
from ejercicios.equipo
where director like 'M%';
-- 3)dorsal, cyclist name and team name for team different than artiach and banesto
select dorsal,nombre,nomequipo
from ejercicios.ciclista
where nomequipo != 'Artiach' and nomequipo != 'Banesto';
-- 4) winners of the stages with more than 180 kms
select dorsal 
from ejercicios.etapa 
where kms > 180
order by DORSAL;
-- 5)like select 4 with no repeated dorsal
select distinct dorsal
from ejercicios.etapa 
where kms > 180
-- group by dorsal
order by DORSAL;
-- 6)listar todos los numeros de etapa si en las etapas tenemos un paso de montaña con altura mayor que 200
select numetapa,altura
from ejercicios.puerto
where altura >2000;
-- 7)list passes name and stage number of the stage with the maximun slope
select nombrepuerto,numetapa pendiente
from ejercicios.puerto
order by pendiente desc limit 1;
-- 8)maillot color for tipo:mas sufrido
select color,tipo
from ejercicios.maillot
where tipo like 'mas sufrido';

-- 9)stage numbers in wich dorsal 2 has won. list dorsal, cyclist name and stage number
select e.dorsal, nombre, numetapa
from ejercicios.ciclista e
inner join ejercicios.etapa d
on e.dorsal = d.DORSAL
where e.dorsal = 2;
-- 10)stage number with the gratest slope,
select numetapa, max(pendiente)
from ejercicios.etapa e
inner join cyclist.puerto p
on e.NUMETAPA=p.NUMETAPA;
-- using(numetapa);
-- 11)cyclist name, team name , mayot color of the cycist who won stage number 9
select nombre,nomequipo,color
from ejercicios.ciclista e
inner join ejercicios.etapa p
using(dorsal)
inner join ejercicios.lleva l
using(numetapa)
inner join ejercicios.maillot m
using(codigo)
where p.NUMETAPA=9;

select c.NOMBRE, c.NOMEQUIPO, m.COlor
from ejercicios.ciclista c
inner join ejercicios.etapa e
using(dorsal)
inner join ejercicios.lleva l
on e.dorsal=l.dorsal
inner join ejercicios.maillot m
on l.CODIGO like m.CODIGO
where e.NUMETAPA=9;

-- 12)what are the passs names of all the cyclist who wear the malliot code MGE
select distinct p.nombrepuerto,l.codigo
from ejercicios.puerto p
inner join ejercicios.lleva l
on p.dorsal=l.DORSAL
where l.CODIGO like 'MGE';
-- 16)cyclist name , stage number for the ciclyst who wom more than 2 races
select c.nombre, e.numetapa
from ejercicios.ciclista c
inner join ejercicios.etapa e
using(dorsal)
group by c.nombre
having count(*) >1;
