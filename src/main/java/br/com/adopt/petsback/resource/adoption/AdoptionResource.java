package br.com.adopt.petsback.resource.adoption;

import br.com.adopt.petsback.domain.dto.AdoptionRequestDto;
import br.com.adopt.petsback.domain.dto.AdoptionResponseDto;
import br.com.adopt.petsback.service.AdoptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/adoption")
public class AdoptionResource {

    private final AdoptionService adoptionService;

    @PostMapping
    public ResponseEntity<AdoptionResponseDto> create(@RequestBody final AdoptionRequestDto adoptionRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(adoptionService.create(adoptionRequestDto));
    }

}
