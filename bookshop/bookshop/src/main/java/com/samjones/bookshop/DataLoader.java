package com.samjones.bookshop;

import com.samjones.bookshop.models.Book;
import com.samjones.bookshop.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public void run(String... args) throws Exception {
        Book b1 = new Book();

        b1.setAuthorName("Sam");
        b1.setPrice(100.0f);
        b1.setTitle("Yolo, Work hard As Hell");

        bookRepository.save(b1);
    }
}
