package br.com.igorsalves.bookstoremanager.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igorsalves.bookstoremanager.dto.BookDTO;
import br.com.igorsalves.bookstoremanager.dto.MessageResponseDTO;
import br.com.igorsalves.bookstoremanager.entity.Book;
import br.com.igorsalves.bookstoremanager.exception.BookNotFoundException;
import br.com.igorsalves.bookstoremanager.mapper.BookMapper;
import br.com.igorsalves.bookstoremanager.repository.BookRepository;

@Service
public class BookService {
  
  @Autowired
  private BookRepository bookRepository;

  private BookMapper bookMapper = BookMapper.INSTANCE;
  
  public MessageResponseDTO create(BookDTO bookDTO) {
    Book bookToSave = bookMapper.bookDTOToBook(bookDTO);
    
    Book savedBook = bookRepository.save(bookToSave);
    
    return MessageResponseDTO
      .builder()
      .message("Book created with ID " + savedBook.getId())
      .build();
  }

  public BookDTO findByID(Long id) throws BookNotFoundException {
    Book book = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    
    return bookMapper.bookToBookDTO(book);
  }
}
