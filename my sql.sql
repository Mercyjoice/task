use mercydb

select * from student_new1
use mercydb
CREATE TABLE  countries (
COUNTRY_ID integer NOT NULL AUTO_INCREMENT PRIMARY KEY,
COUNTRY_NAME varchar(40) NOT NULL,
REGION_ID integer NOT NULL
);
select * from student_new2
select * from countries
alter table countries add price varchar(255)
insert into countries (price)values(8000)
insert into countries (region_id)values(113)
alter table countries drop column region_id
select * from countries where country_id=1
/*and or not */ 
alter table countries modify country_name varchar(255)
select * from countries where country_id=1 or country_name='sowmi' 
select * from countries where not country_name='sowmi'
select * from countries where not country_name='sowmi' and not region_id=113
/* order by  group up count */
select * from countries order by country_id  asc,country_name desc
update countries set country_name='rex',region_id=999 where country_id=2 
select distinct country_id,country_name from countries
/*limit */
select * from countries where country_name='rex' limit 1;
/* max min count sum html,css,javascript ,jsp/core java ,sql) */
select max(country_id) from countries
select min(country_id) from countries
/*count,avg*/
select count(price) from countries 
select avg(price) from countries 
/*like operator(%,_)* multiple character is accessed
*/
select * from countries where country_name like '%rex'
select * from countries where country_name like 'r_%'
select * from countries where country_name not like 'r%'
/* in And between */
select * from countries where country_name not in('rex','vino','nisha')
select country_id,country_name from countries where price between 6000 and 7000







