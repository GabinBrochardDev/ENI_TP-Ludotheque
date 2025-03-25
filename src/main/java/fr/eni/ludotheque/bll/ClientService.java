package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Adresse;
import fr.eni.ludotheque.bo.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    void ajouterClient(Client client);

    Client trouverClientParId(Integer id);

    List<Client> trouverClientsParNom(String nom);

    void modifierClient(Client client);

    void modifierAdresse(Adresse adresse);
}
