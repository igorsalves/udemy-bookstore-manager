package br.com.igorsalves.bookstoremanager.dto;

import javax.validation.Valid;
import javax.validation.constraints.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
  
  private Long id;

  @NotBlank
  @Size(max = 200)
  private String name;

  @NotNull
  private Integer pages;

  @NotNull
  private Integer chapters;

  @NotBlank
  @Size(max = 100)
  private String isbn;

  @NotBlank
  @Size(max = 200)
  private String publisherName;

  @Valid
  @NotNull
  private AuthorDTO author;
}
