package me.whiteship.springapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;

public class BookService {

    BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
