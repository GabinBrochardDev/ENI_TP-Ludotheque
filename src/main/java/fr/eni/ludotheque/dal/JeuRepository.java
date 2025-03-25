package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Jeu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JeuRepository extends JpaRepository<Jeu, Integer> {

    @Query(nativeQuery = true, value = "select ex.id, j.titre, j.reference, j.description, j.tarif_jour, j.duree_moyenne, j.age_minimum, COUNT(ex.jeu_id) as nbExemplaires "
            + " from jeux j left join exemplaires ex on j.id = ex.jeu_id "
            + " where ex.louable = 1  "
            + " and (:titre = 'TOUS' OR titre like '%:titre%')"
            + " group by ex.jeu_id, j.titre, j.reference, j.description, j.tarif_jour, j.duree_moyenne, j.age_minimum  ")
    List<Jeu> findAllJeuxAvecNbExemplaires(@Param("titre") String titre);

}
