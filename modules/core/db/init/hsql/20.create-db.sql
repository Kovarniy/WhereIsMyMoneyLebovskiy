-- begin WHEREISMYMONEYLEBOVSKIY_DEBTORS
create unique index IDX_WHEREISMYMONEYLEBOVSKIY_DEBTORS_UNIQ_EMAIL on WHEREISMYMONEYLEBOVSKIY_DEBTORS (EMAIL) ^
-- end WHEREISMYMONEYLEBOVSKIY_DEBTORS
-- begin WHEREISMYMONEYLEBOVSKIY_LETTER_BASE
alter table WHEREISMYMONEYLEBOVSKIY_LETTER_BASE add constraint FK_WHEREISMYMONEYLEBOVSKIY_LETTER_BASE_ON_DEBTOR foreign key (DEBTOR_ID) references WHEREISMYMONEYLEBOVSKIY_DEBTORS(ID)^
alter table WHEREISMYMONEYLEBOVSKIY_LETTER_BASE add constraint FK_WHEREISMYMONEYLEBOVSKIY_LETTER_BASE_ON_LETTER foreign key (LETTER_ID) references WHEREISMYMONEYLEBOVSKIY_LETTER_TEMPLATES(ID)^
create index IDX_WHEREISMYMONEYLEBOVSKIY_LETTER_BASE_ON_DEBTOR on WHEREISMYMONEYLEBOVSKIY_LETTER_BASE (DEBTOR_ID)^
create index IDX_WHEREISMYMONEYLEBOVSKIY_LETTER_BASE_ON_LETTER on WHEREISMYMONEYLEBOVSKIY_LETTER_BASE (LETTER_ID)^
-- end WHEREISMYMONEYLEBOVSKIY_LETTER_BASE
-- begin WHEREISMYMONEYLEBOVSKIY_LETTER_TEMPLATES
create unique index IDX_WHEREISMYMONEYLEBOVSKIY_LETTER_TEMPLATES_UNIQ_LETTER_TYPE on WHEREISMYMONEYLEBOVSKIY_LETTER_TEMPLATES (LETTER_TYPE) ^
-- end WHEREISMYMONEYLEBOVSKIY_LETTER_TEMPLATES
