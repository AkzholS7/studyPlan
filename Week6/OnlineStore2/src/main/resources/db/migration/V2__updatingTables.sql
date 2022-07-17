create table car_shop(
                         id bigint(20) not null auto_increment,
                         model varchar(50) not null ,
                         provided_year varchar(50) not null,
                         customer_id bigint(20) not null,
                         primary key(id),
                         Foreign Key (customer_id) references customer(customerId)
)