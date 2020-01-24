package com.company.whereismymoneylebovskiy.web.screens.letterbase;

import com.haulmont.cuba.gui.screen.*;
import com.company.whereismymoneylebovskiy.entity.LetterBase;

@UiController("whereismymoneylebovskiy_LetterBase.edit")
@UiDescriptor("letter-base-edit.xml")
@EditedEntityContainer("letterBaseDc")
@LoadDataBeforeShow
public class LetterBaseEdit extends StandardEditor<LetterBase> {
}