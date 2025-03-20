package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "ADRESSES")
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    @NonNull private String rue;

    @Column(nullable = false, length = 5)
    @NonNull private String code_postal;

    @Column(nullable = false, length = 5)
    @NonNull private String ville;

    @OneToOne(mappedBy = "adresse")
    private Client client;
}
