package com.company.whereismymoneylebovskiy.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.annotation.PostConstruct;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|letter")
@Table(name = "WHEREISMYMONEYLEBOVSKIY_LETTER_BASE")
@Entity(name = "whereismymoneylebovskiy_LetterBase")
public class LetterBase extends StandardEntity {
    private static final long serialVersionUID = -3299939541865996565L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DEBTOR_ID")
    protected Debtor debtor;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LETTER_ID")
    protected LetterTemplate letter;

    public LetterTemplate getLetter() {
        return letter;
    }

    public void setLetter(LetterTemplate letter) {
        this.letter = letter;
    }

    public Debtor getDebtor() {
        return debtor;
    }

    public void setDebtor(Debtor debtor) {
        this.debtor = debtor;
    }

   // @PostUpdate
    @PostLoad
    @PostPersist
    public void updateLetter() {
        String template = letter.template;
        letter.template = changeTemplate(template);
    }

    public String changeTemplate(String letter) {
        // У меня получается извлекать те данные объекта, которые относятся к строковому представлению сущности.
        // Однако возникают проблемы с получением данных, не относящихся  к строковым представлениям сущности.
        // Т.к. извлечь их можно только после создания записи в обобщающей таблице
        String lastName = debtor.getLastName();
        String firstName = debtor.getFirstName();
        //String amountOfDebt = Double.toString(debtor.getAmountOfDebt());

        // Недостаток этого метода заключается в том, что конечный пользователь
        // должен знать значение "ключевых слов", которые заменяются на данные должника
        letter = letter.replaceAll("lastName",lastName);
        letter = letter.replaceAll("firstName",firstName);
        //letter = letter.replaceAll("cliDebt",amountOfDebt);

        // Альтернативный вариант, вставка данных в форматную строку
        // однако этот вариант еще хуже
        //letter = String.format(letter, lastName, firstName, amountOfDebt);

        return letter;
    }

}