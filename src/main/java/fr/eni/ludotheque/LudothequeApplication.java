package fr.eni.ludotheque;

import fr.eni.ludotheque.bll.ClientServiceImpl;
import fr.eni.ludotheque.bo.Adresse;
import fr.eni.ludotheque.bo.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LudothequeApplication implements CommandLineRunner {

    @Autowired
    private ClientServiceImpl cliService;

    public static void main(String[] args) {
        SpringApplication.run(LudothequeApplication.class, args);
    }


    public void run(String... args) throws Exception {
        Client cli = new Client("nomTest", "prenomTest", "0000000000", "email@test.com");
        Adresse adr = new Adresse("rue xx", "79000", "Niort");

        cliService.ajouterClient(cli, adr);
        System.out.println("Client ajouté avec succès !");
    }

}
