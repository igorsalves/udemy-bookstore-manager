package br.com.igorsalves.bookstoremanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.igorsalves.bookstoremanager.dto.MessageResponseDTO;
import br.com.igorsalves.bookstoremanager.entity.Book;
import br.com.igorsalves.bookstoremanager.service.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
  
  @Autowired
  private BookService bookService;

  @PostMapping("/")
  public MessageResponseDTO create(@RequestBody Book book) {
    return bookService.create(book);
  }
}
