#创建班级表
create table classInfo
(
    classId int primary key auto_increment,
    className varchar(20)
);

select * from classInfo;

insert into classInfo
(className)
values
('AAA01'),
('AAA02');

#创建学生表
create table studentInfo
(
    studentId int primary key auto_increment,
    name varchar(20) not null,
    sex char(1) not null,
    birthday date,
    province varchar(20) default '河南',
    classId int,
    foreign key (classId)
        references classInfo(classId)
);

select * from studentInfo;

insert into studentInfo
(name,sex,birthday,province,classId)
values
('张三','男','2002-01-01','湖北',1),
('李四','女','2003-01-05','河南',2),
('王五','男','2010-03-01','湖北',1),
('赵六','男','2009-01-08','河南',2),
('孙琪','女','2001-09-01','湖北',1);

#创建课程表
create table courseInfo
(
    courseId int primary key auto_increment,
    courseName varchar(20) not null
);

select * from courseInfo;

insert into courseInfo
(courseName)
values
('html'),
('java'),
('sql');

#创建成绩表
create table examInfo
(
    examId int primary key auto_increment,
    studentId int not null,
    courseId int not null,
    score int,
    foreign key (studentId)
        REFERENCES studentInfo(studentId), #外键对应的类型必须一致
        foreign key (courseId)
        REFERENCES courseInfo(courseId)
);

select * from examInfo;
select * from studentInfo;

insert into examInfo
(studentId,courseId,score)
VALUES
(1,1,90),
(1,2,70),
(1,3,65),
(2,1,88),
(2,2,67),
(2,3,55),
(3,1,69),
(3,3,45);