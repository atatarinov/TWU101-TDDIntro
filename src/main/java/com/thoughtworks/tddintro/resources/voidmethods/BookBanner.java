package com.thoughtworks.tddintro.resources.voidmethods;

import java.util.Collection;

public class BookBanner {
    Library library;

    public BookBanner(Library library) {
        this.library = library;
    }

    public void remove(Collection<String> bannedBooks) {
        for (String bookTitle : bannedBooks) {
            library.removeBook(bookTitle);
        }
        bannedBooks.clear();
    }
}
