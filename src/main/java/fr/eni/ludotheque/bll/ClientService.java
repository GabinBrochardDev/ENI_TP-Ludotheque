package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Adresse;
import fr.eni.ludotheque.bo.Client;

public interface ClientService {

    void ajouterClient(Client client, Adresse adresse);
}
