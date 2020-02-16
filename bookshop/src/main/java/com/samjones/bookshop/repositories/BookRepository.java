package com.samjones.bookshop.repositories;

import com.samjones.bookshop.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
