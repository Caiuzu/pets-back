package br.com.adopt.petsback.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetResponseDto implements Serializable {

    private Long id;
    private String name;
    private String history;
    private String photo;

}
