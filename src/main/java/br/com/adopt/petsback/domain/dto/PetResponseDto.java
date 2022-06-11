package br.com.adopt.petsback.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PetResponseDto implements Serializable {

    private Long id;
    private String name;
    private String history;
    private String photo;

}
