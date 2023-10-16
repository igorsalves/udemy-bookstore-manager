package br.com.igorsalves.bookstoremanager.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import br.com.igorsalves.bookstoremanager.dto.BookDTO;
import br.com.igorsalves.bookstoremanager.entity.Book;

@Mapper
public interface BookMapper {

  BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

  Book bookDTOToBook(BookDTO bookDTO);

  BookDTO bookToBookDTO(Book book);
}
