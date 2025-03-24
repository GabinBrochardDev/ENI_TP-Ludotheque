package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Client;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Optional<Client> findByNomContainingIgnoreCase(@NonNull String nom);
}
