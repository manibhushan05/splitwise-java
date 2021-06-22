package com.ood.splitwise.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class Expense {
    private String id;
    private double amount;
    private User paidBy;
    private List<Split> splits;
    private ExpenseMetadata metadata;

    public Expense(double amount, User paidBy, List<Split> splits, ExpenseMetadata metadata) {
        this.amount = amount;
        this.paidBy = paidBy;
        this.splits = splits;
        this.metadata = metadata;
    }

    public abstract boolean validate();

}
