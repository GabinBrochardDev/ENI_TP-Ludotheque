package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "EXEMPLAIRES")
public class Exemplaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 13)
    @NonNull private String codeBarre;

    @Column(nullable = false)
    @NonNull private Boolean louable = false;

    @ManyToOne
    @JoinColumn(name = "jeu_id", nullable = false)
    private Jeu jeu;


}
