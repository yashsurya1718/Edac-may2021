use dbt;
create table date(date1 date);
insert into date values ('2019-11-11'),('2022-10-18');



SELECT  date1 from date ORDER BY day(DATE_FORMAT(Date1, '%d/%m/%Y')) ;
drop table date;

SELECT DATE_FORMAT(date1,'%d/%m/%Y') as day 
FROM  date

union
select upper(dayname(date1)) from date;


select * from date;


select day(nicedate) from date;