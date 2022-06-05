package br.com.adopt.petsback.repository;

import br.com.adopt.petsback.domain.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
