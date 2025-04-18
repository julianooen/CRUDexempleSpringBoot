Create SCHEMA "TESTE";

create table "TESTE"."CLIENTE"
(
    "ID"       uuid
        constraint "CLIENTE_PK" PRIMARY KEY,
    "NOME"     varchar(50) not null,
    "TELEFONE" varchar(50)
);

create table "TESTE"."PRODUTO"
(
    "ID"       uuid
        constraint "PRODUTO_PK" PRIMARY KEY,
    "NOME"     varchar(50) not null,
    "QTY" numeric
);

create table "TESTE"."VENDA"
(
    "ID"       uuid
        constraint "VENDA_PK" PRIMARY KEY,
    "CLIENTE_ID" uuid
        constraint "VENDA_CLIENTE_FK" references "TESTE"."CLIENTE",
    "PRODUTO_ID" uuid
        constraint "VENDA_PRODUTO_FK" references "TESTE"."PRODUTO",
    "VALOR"    numeric not null,
    "QTY"      numeric not null,
    "DATA_VENDA" timestamp not null
);