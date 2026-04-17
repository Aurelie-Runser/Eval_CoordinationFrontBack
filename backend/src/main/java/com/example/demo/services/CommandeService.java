package com.example.demo.services;

import com.example.demo.dtos.CommandeDTO;
import com.example.demo.dtos.ElementDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CommandeService {

    private final List<CommandeDTO> commandes = new ArrayList<>();

    public CommandeService() {

        String[] status = {
                "en attente",
                "en préparation",
                "prête",
                "servie"
        };

        CommandeDTO c1 = new CommandeDTO(
                1,
                status[0],
                Arrays.asList(
                        new ElementDTO(1, "Clavier", 49.99),
                        new ElementDTO(2, "Souris", 19.99)
                )
        );

        CommandeDTO c2 = new CommandeDTO(
                2,
                status[1],
                Arrays.asList(
                        new ElementDTO(3, "Écran", 199.99),
                        new ElementDTO(4, "Casque", 89.99)
                )
        );

        commandes.add(c1);
        commandes.add(c2);
    }

    public List<CommandeDTO> getAll() {
        return commandes;
    }

    public CommandeDTO getById(int id) {
        return commandes.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }
}