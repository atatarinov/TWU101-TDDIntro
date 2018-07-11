package com.thoughtworks.tddintro.resources.voidmethods;

import java.util.ArrayList;

public class Library {
    private ArrayList<String> currentBooks = new ArrayList<>();

    public void Library() {
        currentBooks.add("Lord of the Rings");
    }

    public void removeBook(String bookName) {
        currentBooks.remove(bookName);
    }
}
