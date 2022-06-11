package br.com.adopt.petsback.service;

import br.com.adopt.petsback.domain.dto.PetResponseDto;
import br.com.adopt.petsback.domain.entity.Pet;
import br.com.adopt.petsback.repository.PetRepository;
import br.com.adopt.petsback.service.adapter.PetBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetService {

    private final PetRepository petRepository;
    private final PetBuilder petBuilder;

    public List<PetResponseDto> findAll() {
        final List<Pet> pets = petRepository.findAll();
        return pets.stream().map(petBuilder::toPetResponseDto).toList();
    }

}
