
create table customer(
                         customerId bigint(20) not null auto_increment,
                         first_name varchar(50) not null ,
                         last_name varchar(50) not null ,
                         primary key (customerId)
)