package com.webapp.bookrate.Repository;

import com.webapp.bookrate.Entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating,Long> {
}
