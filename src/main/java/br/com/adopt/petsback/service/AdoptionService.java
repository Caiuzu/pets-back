package br.com.adopt.petsback.service;

import br.com.adopt.petsback.domain.dto.AdoptionRequestDto;
import br.com.adopt.petsback.domain.dto.AdoptionResponseDto;
import br.com.adopt.petsback.repository.AdoptionRepository;
import br.com.adopt.petsback.service.adapter.AdoptionBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdoptionService {
    private final AdoptionRepository adoptionRepository;
    private final AdoptionBuilder adoptionBuilder;

    public AdoptionResponseDto create(AdoptionRequestDto adoptionRequestDto) {
        final var adoption = adoptionBuilder.toAdoption(adoptionRequestDto);
        final var createdAdoption = adoptionRepository.save(adoption);
        return adoptionBuilder.toAdoptionResponseDto(createdAdoption);
    }

    public List<AdoptionResponseDto> findAll() {
        return adoptionRepository.findAll()
                .stream().map(adoptionBuilder::toAdoptionResponseDto).toList();
    }

}
