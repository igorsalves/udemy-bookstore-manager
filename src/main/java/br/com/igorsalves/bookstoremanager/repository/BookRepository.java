package br.com.igorsalves.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.igorsalves.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
  
}
