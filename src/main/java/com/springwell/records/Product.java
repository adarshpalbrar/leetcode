package com.springwell.records;

public record Product(long id, String name, String description) {

    public boolean hasDescription() {
        return this.description != null && !this.description.isBlank();
    }
}