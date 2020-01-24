package com.company.whereismymoneylebovskiy.web.screens.lettertemplate;

import com.haulmont.cuba.gui.screen.*;
import com.company.whereismymoneylebovskiy.entity.LetterTemplate;

@UiController("whereismymoneylebovskiy_LetterTemplates.browse")
@UiDescriptor("letter-template-browse.xml")
@LookupComponent("letterTemplatesTable")
@LoadDataBeforeShow
public class LetterTemplateBrowse extends StandardLookup<LetterTemplate> {
}