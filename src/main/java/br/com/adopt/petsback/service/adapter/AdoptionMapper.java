package br.com.adopt.petsback.service.adapter;

import br.com.adopt.petsback.domain.dto.AdoptionRequestDto;
import br.com.adopt.petsback.domain.entity.Adoption;
import br.com.adopt.petsback.repository.PetRepository;
import br.com.adopt.petsback.domain.dto.AdoptionResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdoptionMapper {

    private final PetRepository petRepository;
    private final PetMapper petMapper;

    public Adoption toAdoption(final AdoptionRequestDto adoptionRequestDto){
        final var adoption = new Adoption();
        adoption.setEmail(adoptionRequestDto.getEmail());
        adoption.setValue(adoptionRequestDto.getValue());
        adoption.setPet(petRepository.findByIdOrElseThrow(adoptionRequestDto.getPetId()));
        return adoption;
    }

    public AdoptionResponseDto toAdoptionResponseDto(final Adoption adoption) {
        final var adoptionResponseDto = new AdoptionResponseDto();
        adoptionResponseDto.setId(adoption.getId());
        adoptionResponseDto.setEmail(adoption.getEmail());
        adoptionResponseDto.setValue(adoption.getValue());
        adoptionResponseDto.setPet(petMapper.toPetResponseDto(adoption.getPet()));
        return adoptionResponseDto;
    }


}
