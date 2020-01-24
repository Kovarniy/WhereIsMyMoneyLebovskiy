package com.company.whereismymoneylebovskiy.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s %s|firstName,lastName,email")
@Table(name = "WHEREISMYMONEYLEBOVSKIY_DEBTORS")
@Entity(name = "whereismymoneylebovskiy_Debtors")
public class Debtor extends StandardEntity {
    private static final long serialVersionUID = 5655936618011724059L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    protected String firstName;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false)
    protected String lastName;

    @Email
    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    protected String email;

    @NotNull
    @Column(name = "AMOUNT_OF_DEBT", nullable = false)
    protected Double amountOfDebt;

    public Double getAmountOfDebt() {
        return amountOfDebt;
    }

    public void setAmountOfDebt(Double amountOfDebt) {
        this.amountOfDebt = amountOfDebt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}