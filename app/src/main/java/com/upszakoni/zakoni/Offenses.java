package com.upszakoni.zakoni;

public class Offenses {

    private String title;
    private String description;

    public Offenses(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
