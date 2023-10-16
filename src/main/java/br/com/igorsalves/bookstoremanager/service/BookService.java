package br.com.igorsalves.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.igorsalves.bookstoremanager.dto.MessageResponseDTO;
import br.com.igorsalves.bookstoremanager.entity.Book;
import br.com.igorsalves.bookstoremanager.repository.BookRepository;

@Service
public class BookService {
  
  @Autowired
  private BookRepository bookRepository;

  public MessageResponseDTO create(Book book) {
    Book savedBook = bookRepository.save(book);
    
    return MessageResponseDTO
      .builder()
      .message("Book created with ID " + savedBook.getId())
      .build();
  }
}
