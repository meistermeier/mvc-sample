package com.meistermeier.mvc.beer.model;

public class Beer {

    private final Long id;
    private final String name;

    public Beer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
