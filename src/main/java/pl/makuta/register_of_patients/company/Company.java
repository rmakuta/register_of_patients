package pl.makuta.register_of_patients.company;

import lombok.Data;
import org.hibernate.validator.constraints.pl.NIP;

import javax.persistence.*;


@Entity
@Table(name = "company")
@Data
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @NotNull
    private String name;

//    @NotNull
    private String street;
//    @NotNull
    @Column(name = "house_number")
    private String houseNumber;
//    @NotNull
    private String city;
//    @NotNull
    @Column(name = "postal_code")
    private String postalCode;

    private String numberPhone;

//    @NIP
//    @NotNull
    private Long nip;

    public String getFullName(){
        return name + ", NIP: " + nip;
    }

//    @OneToMany
//    @JoinTable(name = "company_user")
//    private List<User> users;

}

