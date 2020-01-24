package com.company.whereismymoneylebovskiy.web.screens.debtor;

import com.haulmont.cuba.gui.screen.*;
import com.company.whereismymoneylebovskiy.entity.Debtor;

@UiController("whereismymoneylebovskiy_Debtors.browse")
@UiDescriptor("debtor-browse.xml")
@LookupComponent("debtorsTable")
@LoadDataBeforeShow
public class DebtorBrowse extends StandardLookup<Debtor> {
}