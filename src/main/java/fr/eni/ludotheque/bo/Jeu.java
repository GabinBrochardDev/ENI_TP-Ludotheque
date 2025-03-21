package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "JEUX")
public class Jeu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,
            length = 50)
    @NonNull private String titre;

    @Column(nullable = false, length = 13)
    @NonNull private String reference;

    @Column(nullable = false)
    @NonNull private Integer ageMinimum;

    @Column(nullable = false,
            length = 250)
    @NonNull private String description;

    @Column(nullable = false)
    @NonNull private Integer dureeMoyenne;

    @Column(nullable = false)
    @NonNull private float tarifJour;

    @ManyToMany(
            cascade = {CascadeType.PERSIST, CascadeType. MERGE},
            fetch = FetchType. EAGER
    )
    @JoinTable(
            name ="jeu_genre",
            joinColumns = @JoinColumn(name = "jeu_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private List<Genre> genres;

    @OneToMany(mappedBy = "jeu", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Exemplaire> exemplaires = new ArrayList<>();

}
