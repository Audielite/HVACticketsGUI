package com.lex;

/**
 * Created by alexishennings on 4/30/17.
 */
public class Issues {
    private String name;
    private String rating;

    public Issues(String name, String rating) {
        this.name = name;
        this.rating = rating;

    }

    @Override
    public String toString() {

        return "Ticket Issue: " + name + " Priority level: " + rating;
    }
}