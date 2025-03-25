package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Jeu;
import fr.eni.ludotheque.dal.JeuRepository;
import lombok.NonNull;

import java.util.Optional;

public class JeuServiceImpl implements JeuService {

    @NonNull
    private JeuRepository jeuRepository;

    @Override
    public void ajouterJeu(Jeu jeu) {
        jeuRepository.save(jeu);
    }

    @Override
    public Jeu trouverJeuParNoJeu(Integer id) {
        Optional<Jeu> optJeu = jeuRepository.findById(id);
        if(optJeu.isEmpty()) {
            throw new IllegalStateException();
        }
        return optJeu.get();
    }
}
