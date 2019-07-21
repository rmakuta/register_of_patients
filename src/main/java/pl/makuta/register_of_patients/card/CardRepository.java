package pl.makuta.register_of_patients.card;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
    Card findCardById(Long id);
}
