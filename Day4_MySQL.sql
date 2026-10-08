-- task 1
-- create database ubs_training
-- create user ubs_intern and give him password
-- grant all privileges on ubs_training to ubs_intern

create database ubs_training;

create user 'ubs_intern'@'localhost'
identified by 'your_password';

grant all privileges on ubs_training.*
to 'ubs_intern'@'localhost';

use ubs_training;


-- task 2
-- create students table

create table students
(
id int primary key auto_increment,
name varchar(100),
email varchar(150),
created_at datetime default current_timestamp
);

-- create courses table

create table courses
(
id int primary key auto_increment,
title varchar(100),
code varchar(50) unique
);

-- create enrollments table

create table enrollments
(
id int primary key auto_increment,
student_id int,
course_id int,
grade decimal(5,2),
enrolled_at datetime default current_timestamp,
foreign key(student_id) references students(id),
foreign key(course_id) references courses(id)
);


-- task 3
-- add 5 students

insert into students(name,email)
values('Mohammad','mohammad@gmail.com');

insert into students(name,email)
values('Ahmad','ahmad@gmail.com');

insert into students(name,email)
values('Rami','rami@gmail.com');

insert into students(name,email)
values('Khalid','khalid@gmail.com');

insert into students(name,email)
values('Omar','omar@gmail.com');

-- add 3 courses

insert into courses(title,code)
values('Java','JAVA101');

insert into courses(title,code)
values('Database','DB101');

insert into courses(title,code)
values('Python','PY101');


-- task 4
-- enroll each student in at least 2 courses

insert into enrollments(student_id,course_id,grade)
values(1,1,85);

insert into enrollments(student_id,course_id,grade)
values(1,2,90);

insert into enrollments(student_id,course_id,grade)
values(2,1,78);

insert into enrollments(student_id,course_id,grade)
values(2,3,88);

insert into enrollments(student_id,course_id,grade)
values(3,2,92);

insert into enrollments(student_id,course_id,grade)
values(3,3,81);

insert into enrollments(student_id,course_id,grade)
values(4,1,74);

insert into enrollments(student_id,course_id,grade)
values(4,2,79);

insert into enrollments(student_id,course_id,grade)
values(5,2,95);

insert into enrollments(student_id,course_id,grade)
values(5,3,89);


-- task 5
-- show all students

select * from students;

-- show all courses

select * from courses;

-- show student name and course title and grade using inner join

select students.name,courses.title,enrollments.grade
from enrollments
inner join students
on enrollments.student_id = students.id
inner join courses
on enrollments.course_id = courses.id;


-- task 6
-- find students enrolled in no courses

select students.name
from students
left join enrollments
on students.id = enrollments.student_id
where enrollments.student_id is null;


-- task 7
-- average grade per course

select courses.title,avg(enrollments.grade) as average_grade
from enrollments
inner join courses
on enrollments.course_id = courses.id
group by courses.id,courses.title;


-- task 8
-- students with average grade above 75

select students.name,avg(enrollments.grade) as average_grade
from students
join enrollments
on students.id = enrollments.student_id
group by students.id,students.name
having avg(enrollments.grade) > 75;


-- task 9
-- update a specific enrollment grade
-- verify with select

select * from enrollments;

update enrollments
set grade=95
where id=1;

select * from enrollments
where id=1;


-- task 10
-- delete one enrollment

delete from enrollments
where id=1;

select * from enrollments
where id=1;

select * from students
where id=1;

select * from courses
where id=1;


-- task 11
-- check query before adding index

explain
select * from enrollments
where student_id=2;

-- check index

show index from enrollments;

-- student_id already has index because it is foreign key

-- if we want to create another index
-- create index idx_student_id
-- on enrollments(student_id);

-- check query after index

explain
select * from enrollments
where student_id=2;