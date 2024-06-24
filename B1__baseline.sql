Create SCHEMA "TESTE";

create table "TESTE"."CLIENTE"
(
    "ID"   serial
        constraint "CLIENTE_PK"
            primary key,
    "NOME" varchar(50) not null,
    "TELEFONE" varchar(50)
);
