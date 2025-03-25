package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Adresse;
import fr.eni.ludotheque.bo.Client;
import fr.eni.ludotheque.dal.AdresseRepository;
import fr.eni.ludotheque.dal.ClientRepository;
import fr.eni.ludotheque.exceptions.DataNotFound;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ClientServiceImpl implements ClientService {

    @NonNull
    private ClientRepository clientRepository;
    @NonNull
    private AdresseRepository adresseRepository;

    @Override
    public void ajouterClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public Client trouverClientParId(Integer id) {
        Optional<Client> optClient = clientRepository.findById(id);
        if(optClient.isEmpty()) {
            throw new DataNotFound("Client", id);
        }
        return optClient.get();
    }

    @Override
    public List<Client> trouverClientsParNom(String nom) {
        return clientRepository.findByNomContainingIgnoreCase(nom);
    }


    @Override
    public void modifierClient(Client client) {
        if(client.getId() == null){
            throw new IllegalStateException();
        }
        clientRepository.save(client);
    }

    @Override
    public void modifierAdresse(Adresse adresse) {
        if(adresse.getId() == null) {
            throw new IllegalStateException();
        }
        adresseRepository.save(adresse);
    }
}
