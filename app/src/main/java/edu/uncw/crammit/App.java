package edu.uncw.crammit;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import io.objectbox.Box;
import io.objectbox.BoxStore;

public class App extends Application {

    private BoxStore boxStore;

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize the main data access object
        boxStore = MyObjectBox.builder().androidContext(App.this).build();

        // Get the wrapper (Box) for the Book table that lets us store Book objects
        Box<Book> bookBox = boxStore.boxFor(Book.class);

        // Clear the database and initialize it with fresh data
        bookBox.removeAll();
        List<Book> initialBooks = new ArrayList<>();
        initialBooks.add(new Book("Elements of Computing Systems", "CSC 242", "Not really a textbook. More of a handbook.", 2012));
        initialBooks.add(new Book("Introduction to Algorithms", "CSC 380", "The gold standard for algorithms textbooks.", 2009));
        initialBooks.add(new Book("Head First Android Development", "CSC 315", "A book with step-by-step instructions for creating awesome apps.", 2017));
        initialBooks.add(new Book("Plato's Symposium", "PAR 101", "Recent translation of the bedrock of Western Philosophy", 1956));
        initialBooks.add(new Book("Hamlet (Penguin Classics)", "COM 116", "Alas, poor Yorick, I knew him well!", 1995));
        initialBooks.add(new Book("They Say/I Say with Readings", "ENG 101", "The basics of writing styles", 2018));
        initialBooks.add(new Book("Introduction to Psychology", "PSY 105", "Everything from neurons to nannyies. Learn how the brain works.", 2017));
        initialBooks.add(new Book("Introducing Anthropology", "ANT 105", "Ever wonder how the process of studying people and civilizations is done? Wonder no more.", 2011));

        // ObjectBox is smart enough to handle CRUD on Collections of entities
        bookBox.put(initialBooks);

    }

    public BoxStore getBoxStore() {
        return boxStore;
    }
}