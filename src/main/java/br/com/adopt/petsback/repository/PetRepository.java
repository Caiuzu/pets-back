package br.com.adopt.petsback.repository;

import br.com.adopt.petsback.domain.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityNotFoundException;

public interface PetRepository extends JpaRepository<Pet, Long> {
    default Pet findByIdOrElseThrow(Long id) {
        var petOptional = findById(id);

        if (petOptional.isPresent()) {
            return petOptional.get();
        }
        throw new EntityNotFoundException("Pet not found");
    }

}
