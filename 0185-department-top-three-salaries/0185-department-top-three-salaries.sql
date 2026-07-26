select d.name as Department,e.name as Employee, e.salary from
(select name, salary, departmentId,dense_rank()
over(partition by departmentId order by salary desc) as drk from Employee) e  
join Department d on e.departmentId = d.id where drk<=3;