alter table WHEREISMYMONEYLEBOVSKIY_DEBTORS add column AMOUNT_OF_DEBT double precision ^
update WHEREISMYMONEYLEBOVSKIY_DEBTORS set AMOUNT_OF_DEBT = 0 where AMOUNT_OF_DEBT is null ;
alter table WHEREISMYMONEYLEBOVSKIY_DEBTORS alter column AMOUNT_OF_DEBT set not null ;
