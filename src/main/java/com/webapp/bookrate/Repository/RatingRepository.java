package com.webapp.bookrate.Repository;

import com.webapp.bookrate.Entity.Book;
import com.webapp.bookrate.Entity.Rating;
import com.webapp.bookrate.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating,Long> {
    List<Rating> findByBook(Book book);

    List<Rating> findByUser(User user);
}
