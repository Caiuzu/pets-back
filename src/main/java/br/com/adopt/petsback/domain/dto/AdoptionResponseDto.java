package br.com.adopt.petsback.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdoptionResponseDto implements Serializable {

    private Long id;
    private String email;
    private BigDecimal value;
    private PetResponseDto pet;

}
