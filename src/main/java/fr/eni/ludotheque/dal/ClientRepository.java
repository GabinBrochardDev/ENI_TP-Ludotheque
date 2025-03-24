package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Client;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    List<Client> findByNomContainingIgnoreCase(@NonNull String nom);
}
