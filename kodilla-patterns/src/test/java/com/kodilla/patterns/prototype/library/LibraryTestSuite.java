package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Book book1 = new Book("Lady D", "Jeremy Maken", LocalDate.of(2000, 12, 2));
        Book book2 = new Book("Mister C", "Margaret Trand", LocalDate.of(1999, 1, 11));
        Book book3 = new Book("Missus E", "Susan Sans", LocalDate.of(1980, 9, 10 ));

        Library library = new Library("collection 1");

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("collection 2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("collection 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        System.out.println("collection 1 consists of: " + library.getBooks().size() + " elements");
        System.out.println("collection 3 consists of: " + shallowClonedLibrary.getBooks().size() + " elements");
        System.out.println("collection 2 consists of: " + deepClonedLibrary.getBooks().size() + " elements");

    }
}
