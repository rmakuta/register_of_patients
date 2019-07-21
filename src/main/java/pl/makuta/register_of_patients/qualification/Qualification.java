package pl.makuta.register_of_patients.qualification;

import lombok.Data;
import pl.makuta.register_of_patients.card.Card;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Qualification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
