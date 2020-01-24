package com.company.whereismymoneylebovskiy.web.screens.debtor;

import com.haulmont.cuba.gui.screen.*;
import com.company.whereismymoneylebovskiy.entity.Debtor;

@UiController("whereismymoneylebovskiy_Debtors.edit")
@UiDescriptor("debtor-edit.xml")
@EditedEntityContainer("debtorDc")
@LoadDataBeforeShow
public class DebtorEdit extends StandardEditor<Debtor> {
}