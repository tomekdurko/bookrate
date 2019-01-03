package com.webapp.bookrate.Services;

import com.webapp.bookrate.Entity.Book;
import com.webapp.bookrate.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServices {

    private BookRepository bookRepository;

    public BookServices(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> getBook(long id)
    {
        return bookRepository.findById(id);
    }

    public Book addBook(Book newBook)
    {
       return bookRepository.save(newBook);
    }

    public Optional<Book> getBookByName (String name)
    {
        return bookRepository.findByName(name);
    }

    public List<Book> getAllBook()
    {
        return bookRepository.findAll();
    }

    public List<Book> getBooksByGendre( String genre)
    {
        return bookRepository.findByGenre(genre);
    }

}
