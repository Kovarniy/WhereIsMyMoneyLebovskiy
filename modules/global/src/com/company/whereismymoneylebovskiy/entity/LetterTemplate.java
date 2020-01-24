package com.company.whereismymoneylebovskiy.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|letterType,template")
@Table(name = "WHEREISMYMONEYLEBOVSKIY_LETTER_TEMPLATES")
@Entity(name = "whereismymoneylebovskiy_LetterTemplates")
public class LetterTemplate extends StandardEntity {
    private static final long serialVersionUID = 770056547604252031L;

    @NotNull
    @Column(name = "LETTER_TYPE", nullable = false, unique = true)
    protected String letterType;

    @NotNull
    @Column(name = "TEMPLATE", nullable = false, length = 20000)
    protected String template;

    public String getLetterType() {
        return letterType;
    }

    public void setLetterType(String letterType) {
        this.letterType = letterType;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

}