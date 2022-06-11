package br.com.adopt.petsback.service.adapter;

import br.com.adopt.petsback.domain.dto.AdoptionRequestDto;
import br.com.adopt.petsback.domain.dto.AdoptionResponseDto;
import br.com.adopt.petsback.domain.entity.Adoption;
import br.com.adopt.petsback.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdoptionBuilder {

    private final PetRepository petRepository;
    private final PetBuilder petBuilder;

    public Adoption toAdoption(final AdoptionRequestDto adoptionRequestDto) {
        return Adoption.builder()
                .email(adoptionRequestDto.getEmail())
                .value(adoptionRequestDto.getValue())
                .pet(petRepository.findByIdOrElseThrow(adoptionRequestDto.getPetId()))
                .build();
    }

    public AdoptionResponseDto toAdoptionResponseDto(final Adoption adoption) {
        return AdoptionResponseDto.builder().id(adoption.getId())
                .email(adoption.getEmail())
                .value(adoption.getValue())
                .pet(petBuilder.toPetResponseDto(adoption.getPet()))
                .build();
    }


}
