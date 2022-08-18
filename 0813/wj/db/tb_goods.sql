create table tb_goods(
     goods_id int primary key auto_increment,
     goods_name varchar(5),
     price decimal,
     address varchar(20),
     produce_date date
);

insert into tb_goods(goods_name,price,address,produce_date)
values
('面',10.5,'郑州1','2022-07-13'),
('面',10.5,'郑州2','2022-07-13'),
('面',10.5,'郑州3','2022-07-13'),
('面',10.5,'郑州4','2022-07-13'),
('面',10.5,'郑州5','2022-07-13'),
('面',10.5,'郑州6','2022-07-13');