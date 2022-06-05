package br.com.adopt.petsback.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetDto {

    private Long id;
    private String name;
    private String history;
    private String photo;

}
