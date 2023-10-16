package br.com.igorsalves.bookstoremanager.dto;

import javax.validation.constraints.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {
  
  private Long id;

  @NotBlank
  @Size(max = 200)
  private String name;
  
  @NotNull
  @Max(value = 100)
  private Integer age;
}
