import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<HashMap> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<HashMap>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return books.size();
    }

    public void addBook(HashMap book) {
        if(this.bookCount() < this.capacity){
        this.books.add(book); }
    }
}
