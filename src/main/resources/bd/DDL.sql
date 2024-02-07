create table beverages
(
    id integer not null
        constraint beverages_pk
            primary key autoincrement,
    beverage text not null,
    price integer not null
);

create unique index beverages_beverage_uindex
    on beverages (beverage);

create unique index beverages_beverage_uindex_2
    on beverages (beverage);

insert into beverages (beverage, price) values ('chay', 300);
