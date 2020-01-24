package com.company.whereismymoneylebovskiy.web.screens.letterbase;

import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.*;
import com.company.whereismymoneylebovskiy.entity.LetterBase;
import com.haulmont.reports.gui.actions.TablePrintFormAction;

import com.haulmont.cuba.gui.components.GroupTable;
import com.company.whereismymoneylebovskiy.entity.LetterBase;


import javax.inject.Inject;
@UiController("whereismymoneylebovskiy_LetterBase.browse")
@UiDescriptor("letter-base-browse.xml")
@LookupComponent("letterBasesTable")
@LoadDataBeforeShow
public class LetterBaseBrowse extends StandardLookup<LetterBase> {

    @Inject
    private GroupTable<LetterBase> letterBasesTable;

    @Inject
    private Button printDetails;

    @Subscribe
    private void onInit(InitEvent event) {
        TablePrintFormAction action = new TablePrintFormAction("report", letterBasesTable);
        letterBasesTable.addAction(action);
        printDetails.setAction(action);
    }


}