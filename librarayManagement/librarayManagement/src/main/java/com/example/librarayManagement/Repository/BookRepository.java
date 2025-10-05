package com.example.librarayManagement.Repository;

import com.example.librarayManagement.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
