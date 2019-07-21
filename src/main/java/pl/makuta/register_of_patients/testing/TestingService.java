package pl.makuta.register_of_patients.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TestingService {

    private TestingRepository testingRepository;

    @Autowired
    public TestingService(TestingRepository testingRepository) {
        this.testingRepository = testingRepository;
    }

    public List<Testing> findAll(){
        return testingRepository.findAll();
    }

    public void add(Testing testing){
        testingRepository.save(testing);
    }

    public void delete(Testing testing){
        testingRepository.delete(testing);
    }

    public Testing findById(Long id){
        return testingRepository.findTestingById(id);
    }

    public void update(Testing testing){
        testingRepository.save(testing);
    }
}
