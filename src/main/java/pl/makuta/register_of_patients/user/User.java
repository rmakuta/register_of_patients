package pl.makuta.register_of_patients.user;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotNull
    @Column(name = "first_name")
    private String firstName;
//    @NotNull
    @Column(name = "last_name")
    private String lastName;

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
//    @NotNull
//    @PESEL
    private String pesel;

    @Column(name = "number_phone")
    private String numberPhone;

    public String getFullName(){
        return this.firstName + " " + lastName + ", PESEL:  " + pesel;
    }

//    @OneToMany(mappedBy = "user")
//    private List<Card> cards = new ArrayList<>();

//    @ManyToOne
//    @JoinColumn(name = "company_id")
//    private Company companyId;


}
