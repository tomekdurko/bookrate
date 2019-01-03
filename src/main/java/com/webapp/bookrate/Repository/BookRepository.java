package com.webapp.bookrate.Repository;

import com.webapp.bookrate.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository <Book,Long> {

    Optional<Book> findByName(String name);

    List<Book> findByGenre(String genre);
}
