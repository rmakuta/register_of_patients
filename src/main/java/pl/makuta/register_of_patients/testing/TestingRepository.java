package pl.makuta.register_of_patients.testing;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestingRepository extends JpaRepository<Testing, Long> {

    Testing findTestingById(Long id);
}
