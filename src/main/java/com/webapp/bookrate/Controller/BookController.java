package com.webapp.bookrate.Controller;


import com.webapp.bookrate.Entity.Book;
import com.webapp.bookrate.Services.BookServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    private BookServices bookServices;

   public BookController(BookServices bookServices)
    {
        this.bookServices = bookServices;
    }

    @PostMapping
    public Book addBook(@RequestBody Book input)
    {
        return  bookServices.addBook(input);
    }

    @GetMapping("/genre/{genre}")
    public List<Book> getBookByGenre(@PathVariable String genre)
    {
        return bookServices.getBooksByGendre(genre);
    }

    @GetMapping
    public List<Book> getBooks()
    {
        return bookServices.getAllBook();
    }

    @GetMapping("/name/{name}")
    public Optional<Book> getBookByName(@PathVariable String name)
    {
        return bookServices.getBookByName(name);
    }

    @GetMapping("/{bookId}")
    public Optional<Book> getBookById(@PathVariable long bookId)
    {
        return bookServices.getBook(bookId);
    }

}
