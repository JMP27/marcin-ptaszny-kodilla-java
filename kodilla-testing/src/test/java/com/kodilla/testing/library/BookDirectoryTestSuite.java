package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.internal.verification.Times;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;


public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }


    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock,times(0)).listBooksWithCondition(anyString());
    }

    /*
    gdy użytkownik nie ma wypożyczonych żadnych książek,
    gdy ma wypożyczoną jedną książkę,
    gdy ma wypożyczone 5 książek.
     */

    @Test
    public void testListBooksInHandsNoBook(){
    //Given
    LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
    BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
    List<Book> listOfBooks = new ArrayList<Book>();
    Book book = new Book("a","s", 2001);
    LibraryUser user = new LibraryUser("Marcin", "Ptaszny", "0001");
    when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listOfBooks);
    //When
    int theListOfBooks0 = listOfBooks.size();
    //Then
    assertEquals(0, theListOfBooks0);
    }

    @Test
    public void testListBooksInHandsOneBook(){
    //Given
    LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
    BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
    List<Book> listOfBooks = new ArrayList<Book>();
    Book book = new Book("a","s", 2001);
    listOfBooks.add(book);
    LibraryUser user = new LibraryUser("Marcin", "Ptaszny", "0001");
    when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listOfBooks);
    //When
    int theListOfBooks0 = listOfBooks.size();
    //Then
    assertEquals(1, theListOfBooks0);
    }

    @Test
    public void testListBooksInHandsFiveBook(){
    //Given
    LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
    BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
    List<Book> listOfBooks = new ArrayList<Book>();
    Book book1 = new Book("a","b", 2001);
    Book book2 = new Book("c","d", 2002);
    Book book3 = new Book("e","f", 2003);
    Book book4 = new Book("g","h", 2004);
    Book book5 = new Book("i","j", 2005);

    listOfBooks.add(book1);
    listOfBooks.add(book2);
    listOfBooks.add(book3);
    listOfBooks.add(book4);
    listOfBooks.add(book5);
    LibraryUser user = new LibraryUser("Marcin", "Ptaszny", "0001");
    when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listOfBooks);
    //When
    int theListOfBooks0 = listOfBooks.size();
    //Then
    assertEquals(5, theListOfBooks0);
    }
}
