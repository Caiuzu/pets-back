package br.com.adopt.petsback.service.adapter;

import br.com.adopt.petsback.domain.dto.PetResponseDto;
import br.com.adopt.petsback.domain.entity.Pet;
import org.springframework.stereotype.Component;

@Component
public class PetMapper {

    public PetResponseDto toPetResponseDto(final Pet pet) {
        final var petResponseDto = new PetResponseDto();
        petResponseDto.setId(pet.getId());
        petResponseDto.setName(pet.getName());
        petResponseDto.setHistory(pet.getHistory());
        petResponseDto.setPhoto(pet.getPhoto());
        return petResponseDto;
    }

}
