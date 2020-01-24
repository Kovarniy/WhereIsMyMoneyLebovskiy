alter table WHEREISMYMONEYLEBOVSKIY_LETTER_BASE add constraint FK_WHEREISMYMONEYLEBOVSKIY_LETTER_BASE_ON_DEBITOR foreign key (DEBITOR_ID) references WHEREISMYMONEYLEBOVSKIY_DEBTORS(ID);
alter table WHEREISMYMONEYLEBOVSKIY_LETTER_BASE add constraint FK_WHEREISMYMONEYLEBOVSKIY_LETTER_BASE_ON_LETTER foreign key (LETTER_ID) references WHEREISMYMONEYLEBOVSKIY_LETTER_TEMPLATES(ID);
create index IDX_WHEREISMYMONEYLEBOVSKIY_LETTER_BASE_ON_DEBITOR on WHEREISMYMONEYLEBOVSKIY_LETTER_BASE (DEBITOR_ID);
create index IDX_WHEREISMYMONEYLEBOVSKIY_LETTER_BASE_ON_LETTER on WHEREISMYMONEYLEBOVSKIY_LETTER_BASE (LETTER_ID);
