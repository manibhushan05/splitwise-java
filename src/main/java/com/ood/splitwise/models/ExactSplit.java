package com.ood.splitwise.models;

import lombok.AllArgsConstructor;

public class ExactSplit extends Split {

    public ExactSplit(User user, double amount) {
        super(user);
        this.amount = amount;
    }
}
