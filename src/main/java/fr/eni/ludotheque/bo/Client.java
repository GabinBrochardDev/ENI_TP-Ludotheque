package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "CLIENTS")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false, length = 50)
    @NonNull private String nom;

    @Column(nullable = false, length = 50)
    @NonNull private String prenom;

    @Column(nullable = false, length = 10)
    @NonNull private String telephone;

    @Column(nullable = false, length = 50)
    @NonNull private String email;

    @OneToOne(cascade = CascadeType.REMOVE)
    private Adresse adresse;
}
