package com.company.whereismymoneylebovskiy.web.screens.lettertemplate;

import com.haulmont.cuba.gui.screen.*;
import com.company.whereismymoneylebovskiy.entity.LetterTemplate;

@UiController("whereismymoneylebovskiy_LetterTemplates.edit")
@UiDescriptor("letter-template-edit.xml")
@EditedEntityContainer("letterTemplateDc")
@LoadDataBeforeShow
public class LetterTemplateEdit extends StandardEditor<LetterTemplate> {
}