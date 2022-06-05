package br.com.adopt.petsback.service;

import br.com.adopt.petsback.repository.AdoptionRepository;
import br.com.adopt.petsback.domain.dto.AdoptionRequestDto;
import br.com.adopt.petsback.domain.dto.AdoptionResponseDto;
import br.com.adopt.petsback.service.adapter.AdoptionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdoptionService {
    private final AdoptionRepository adoptionRepository;
    private final AdoptionMapper adoptionMapper;

    public AdoptionResponseDto create(AdoptionRequestDto adoptionRequestDto) {
        final var adoption = adoptionMapper.toAdoption(adoptionRequestDto);
        final var createdAdoption = adoptionRepository.save(adoption);
        return adoptionMapper.toAdoptionResponseDto(createdAdoption);
    }


}
