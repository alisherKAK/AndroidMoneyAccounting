package com.example.moneyaccounting.models;

import java.util.Date;

public class Operation {
    private int id;
    private Purse purse;
    private Date dtoper;
    private Category category;
    private int sum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Purse getPurse() {
        return purse;
    }

    public void setPurse(Purse purse) {
        this.purse = purse;
    }

    public Date getDtoper() {
        return dtoper;
    }

    public void setDtoper(Date dtoper) {
        this.dtoper = dtoper;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
