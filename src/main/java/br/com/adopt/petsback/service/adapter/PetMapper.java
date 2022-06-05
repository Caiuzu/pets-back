package br.com.adopt.petsback.service.adapter;

import br.com.adopt.petsback.domain.dto.PetDto;
import br.com.adopt.petsback.domain.entity.Pet;
import org.springframework.stereotype.Component;

@Component
public class PetMapper {

    public PetDto toPetDto(final Pet pet) {
        var petDto = new PetDto();
        petDto.setId(pet.getId());
        petDto.setName(pet.getName());
        petDto.setHistory(pet.getHistory());
        petDto.setPhoto(pet.getPhoto());
        return petDto;
    }

}
