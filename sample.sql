use world;
select *
from city
join country on city.countrycode = country.code
where 
