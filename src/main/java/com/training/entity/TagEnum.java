package com.training.entity;

public enum TagEnum {
    IN_HIGH_DEMAND("IN HIGH DEMAND"),BEST_SELLER("BEST SELLER");

    public final String label;

    private TagEnum(String label) {
        this.label = label;
    }
}
