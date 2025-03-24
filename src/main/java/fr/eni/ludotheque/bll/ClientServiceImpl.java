package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Adresse;
import fr.eni.ludotheque.bo.Client;
import fr.eni.ludotheque.dal.AdresseRepository;
import fr.eni.ludotheque.dal.ClientRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClientServiceImpl implements ClientService {

    @NonNull
    private ClientRepository clientRepository;
    @NonNull
    private AdresseRepository adresseRepository;

    @Override
    public void ajouterClient(Client client, Adresse adresse) {

        client.setAdresse(adresseRepository.save(adresse));
        clientRepository.save(client);
    }
}
