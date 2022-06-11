package br.com.adopt.petsback.repository;

import br.com.adopt.petsback.domain.entity.Pet;
import br.com.adopt.petsback.exception.PetNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
    default Pet findByIdOrElseThrow(Long id) {
        return findById(id).orElseThrow(PetNotFoundException::new);
    }

}
