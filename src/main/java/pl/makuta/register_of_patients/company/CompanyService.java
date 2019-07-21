package pl.makuta.register_of_patients.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.nio.charset.CoderMalfunctionError;
import java.util.List;

@Service
@Transactional
public class CompanyService {

    private CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> findAll(){
        return companyRepository.findAll();
    }

    public void add(Company company){
        companyRepository.save(company);
    }

    public void delete(Company company){
        companyRepository.delete(company);
    }

    public Company findById(Long id){
        return companyRepository.findCompanyById(id);
    }

    public void update(Company company){
        companyRepository.save(company);
    }
}
