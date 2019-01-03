package com.webapp.bookrate.Repository;

import com.webapp.bookrate.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book,Long> {

}
