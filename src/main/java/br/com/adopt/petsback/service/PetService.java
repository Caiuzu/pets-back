package br.com.adopt.petsback.service;

import br.com.adopt.petsback.domain.dto.PetResponseDto;
import br.com.adopt.petsback.domain.entity.Pet;
import br.com.adopt.petsback.repository.PetRepository;
import br.com.adopt.petsback.service.adapter.PetMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PetService {

    private final PetRepository petRepository;
    private final PetMapper petMapper;

    public List<PetResponseDto> findAll() {
        final List<Pet> pets = petRepository.findAll();
        return pets.stream().map(petMapper::toPetResponseDto).collect(Collectors.toList());
    }

}
