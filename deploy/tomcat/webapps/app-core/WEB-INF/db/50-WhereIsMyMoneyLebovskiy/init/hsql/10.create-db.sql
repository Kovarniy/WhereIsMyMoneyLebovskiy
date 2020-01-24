-- begin WHEREISMYMONEYLEBOVSKIY_DEBTORS
create table WHEREISMYMONEYLEBOVSKIY_DEBTORS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    EMAIL varchar(255) not null,
    AMOUNT_OF_DEBT double precision not null,
    --
    primary key (ID)
)^
-- end WHEREISMYMONEYLEBOVSKIY_DEBTORS
-- begin WHEREISMYMONEYLEBOVSKIY_LETTER_TEMPLATES
create table WHEREISMYMONEYLEBOVSKIY_LETTER_TEMPLATES (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LETTER_TYPE varchar(255) not null,
    TEMPLATE varchar(20000) not null,
    --
    primary key (ID)
)^
-- end WHEREISMYMONEYLEBOVSKIY_LETTER_TEMPLATES
-- begin WHEREISMYMONEYLEBOVSKIY_LETTER_BASE
create table WHEREISMYMONEYLEBOVSKIY_LETTER_BASE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DEBTOR_ID varchar(36) not null,
    LETTER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end WHEREISMYMONEYLEBOVSKIY_LETTER_BASE
