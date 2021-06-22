package com.ood.splitwise.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpenseMetadata {
    private String name;
    private String imgUrl;
    private String notes;
    private ExpenseMetadata metadata;

    public ExpenseMetadata(String name, String imgUrl, String notes, ExpenseMetadata metadata) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.notes = notes;
        this.metadata = metadata;
    }


}
