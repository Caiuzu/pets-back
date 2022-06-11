package br.com.adopt.petsback.resource.pet;

import br.com.adopt.petsback.domain.dto.PetRequestDto;
import br.com.adopt.petsback.domain.dto.PetResponseDto;
import br.com.adopt.petsback.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/pets")
public class PetResource {

    private final PetService petService;

    @GetMapping
    public ResponseEntity<List<PetResponseDto>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(petService.findAll());
    }

    @PostMapping
    public ResponseEntity<PetResponseDto> create(@RequestBody @Valid final PetRequestDto petRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(petService.create(petRequestDto));
    }
}
