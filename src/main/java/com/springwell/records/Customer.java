package com.springwell.records;

public record Customer(long id, String name, String email) {

    @Override
    public String name() {
        return this.name != null && !this.name.isBlank() ? name : "anonymous";
    }
}
