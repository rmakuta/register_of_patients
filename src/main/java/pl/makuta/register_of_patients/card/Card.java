package pl.makuta.register_of_patients.card;

import lombok.Data;
import org.aspectj.weaver.ast.Test;
import pl.makuta.register_of_patients.company.Company;
import pl.makuta.register_of_patients.qualification.Qualification;
import pl.makuta.register_of_patients.testing.Testing;
import pl.makuta.register_of_patients.user.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @NotNull
    private String number;
//    @NotNull
    private String date;
    private String lastDate;
    private String descritpion;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "qualification_id")
    private Qualification qualification;


    // działające
//    @ManyToOne
//    @JoinColumn(name = "testing_id")
//    private Testing testing;


    // dodane
    @ManyToMany
    private List<Testing> testitngList;
}
