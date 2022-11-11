select* from student where age>10 and age<20;
select name from student;
select * from student where name like '%o%';
select * from student where age>20;
select * from student ORDER BY age;
select * from faculty;
select * from student;
select student.name,faculty.name  from student,faculty where student.students_id = faculty.id ;
select faculty.name,student.name from faculty,student where faculty.id = student.students_id ;
