import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private HashMap bookOne;
    private HashMap bookTwo;
    private HashMap bookThree;
    private HashMap bookFour;

    @Before
    public void before(){
        library = new Library(3);
        bookOne = new HashMap<String, String>();
        bookOne.put("Title", "Harry Potter and the Philosopher's Stone");
        bookOne.put("Author", "JK Rowling");
        bookOne.put("Genre", "Fantasy");
        bookTwo = new HashMap<String, String>();
        bookTwo.put("Title", "Artemis Fowl");
        bookTwo.put("Author", "Eoin Colfer");
        bookTwo.put("Genre", "Fantasy");
        bookThree = new HashMap<String, String>();
        bookThree.put("Title", "The Goldfinch");
        bookThree.put("Author", "Donna Tart");
        bookThree.put("Genre", "Drama");
        bookFour = new HashMap<String, String>();
        bookFour.put("Title", "");
        bookFour.put("Author", "JK Rowling");
        bookFour.put("Genre", "Fantasy");
    }

    @Test
    public void shouldBeAbleToCountBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddToLibrary(){
        library.addBook(bookOne);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddToLibraryNoRoom(){
        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookThree);
        library.addBook(bookFour);
        assertEquals(3, library.bookCount());
    }


}
