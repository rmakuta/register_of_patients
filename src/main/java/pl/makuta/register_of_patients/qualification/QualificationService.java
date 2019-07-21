package pl.makuta.register_of_patients.qualification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class QualificationService {

    private QualificationRepository qualificationRepository;

    @Autowired
    public QualificationService(QualificationRepository qualificationRepository) {
        this.qualificationRepository = qualificationRepository;
    }

    public List<Qualification> findAll(){
        return qualificationRepository.findAll();
    }

    public void add(Qualification qualification){
        qualificationRepository.save(qualification);
    }

    public void delete(Qualification qualification){
        qualificationRepository.delete(qualification);
    }

    public Qualification findById(Long id){
        return qualificationRepository.findQualificationById(id);
    }

    public void update(Qualification qualification){
        qualificationRepository.save(qualification);
    }
}
