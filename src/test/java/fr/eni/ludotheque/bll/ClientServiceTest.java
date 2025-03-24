//package fr.eni.ludotheque.bll;
//
//import fr.eni.ludotheque.bo.Adresse;
//import fr.eni.ludotheque.bo.Client;
//import jakarta.transaction.Transactional;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//public class ClientServiceTest {
//
//    @Autowired
//    private ClientServiceImpl cliService;
//
//
//    @Test
//    @DisplayName("test création client et adresse CAS POSITIF")
//    @Transactional
//    void testAjouterClient() {
//        Client cli = new Client("DUPOND", "Jean", "0000000000", "email@test.com");
//        Adresse adr = new Adresse("rue léo la grange", "79000", "Niort");
//
//        cliService.ajouterClient(cli, adr);
//
//        //Assert
//        assertThat(cli.getId()).isNotNull();
//        Optional<Client> clientBD = cliService.getById(cli.getId());
//        assertThat(clientBD.isPresent()).isTrue();
//        if(clientBD.isPresent()) {
//            assertThat(clientBD.get()).isEqualTo(cli);
//        }
//    }
//
//    @Test
//    @DisplayName("test recherche client par nom CAS POSITIF")
//    @Transactional
//    void testRechercheClient() {
//
//        Client cli = new Client("DUPONT", "Jean", "0000000000", "email@test.com");
//        Adresse adr = new Adresse("rue léo la grange", "79000", "Niort");
//
//        cliService.ajouterClient(cli, adr);
//
//
//        List<Client> clientRecherche = cliService.getByNom("DUPONT");
//        assertThat(clientRecherche.isPresent()).isTrue();
//        if(clientRecherche.isPresent()) {
//            assertThat(clientRecherche.get().getNom()).isEqualTo("DUPONT");
//        }
//    }
//
//    @Test
//    @DisplayName("test modification client et adresse complet CAS POSITIF")
//    @Transactional
//    void testModifClientComplet() {
//
//        Client cli = new Client("DUPONT", "Jean", "0000000000", "email@test.com");
//        Adresse adr = new Adresse("rue léo la grange", "79000", "Niort");
//
//        cliService.ajouterClient(cli, adr);
//
//        cli.setPrenom("Edouard");
//        adr.setVille("La Rochelle");
//        adr.setCode_postal("17000");
//        cliService.modifierClient(cli);
//
//        Optional<Client> clientRecherche = cliService.getByNom("DUPONT");
//        assertThat(clientRecherche.isPresent()).isTrue();
//        if(clientRecherche.isPresent()) {
//            assertThat(clientRecherche.get().getAdresse().getCode_postal()).isEqualTo("17000");
//        }
//    }
//
//}
