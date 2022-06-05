package br.com.adopt.petsback.resource.pet;

import br.com.adopt.petsback.domain.dto.PetDto;
import br.com.adopt.petsback.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/pets")
public class PetResource {

    private final PetService petService;

    @GetMapping
    public ResponseEntity<List<PetDto>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(petService.findAll());
    }

}
