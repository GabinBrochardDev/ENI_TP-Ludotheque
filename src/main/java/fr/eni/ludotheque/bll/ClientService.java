package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Adresse;
import fr.eni.ludotheque.bo.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    void ajouterClient(Client client, Adresse adresse);

    Optional<Client> getById(int id);

    List<Client> getByNom(String nom);

    void modifierClient(Client client);

    void modifierAdresse(Adresse adresse);
}
