package br.com.adopt.petsback.repository;

import br.com.adopt.petsback.domain.entity.Adoption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdoptionRepository extends JpaRepository<Adoption, Long> {
}
