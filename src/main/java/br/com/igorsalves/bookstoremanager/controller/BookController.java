package br.com.igorsalves.bookstoremanager.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.igorsalves.bookstoremanager.dto.BookDTO;
import br.com.igorsalves.bookstoremanager.dto.MessageResponseDTO;
import br.com.igorsalves.bookstoremanager.exception.BookNotFoundException;
import br.com.igorsalves.bookstoremanager.service.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
  
  @Autowired
  private BookService bookService;

  @PostMapping("/")
  public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO) {
    return bookService.create(bookDTO);
  }

  @GetMapping("/{id}")
  public BookDTO findByID(@PathVariable Long id) throws BookNotFoundException {
    return bookService.findByID(id);
  }
}
