package com.example.demo.services;

import com.example.demo.models.*;
import com.example.demo.dtos.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommandeService {

    private final List<Element> elements = new ArrayList<>();
    private final List<Commande> commandes = new ArrayList<>();
    private final List<ElementInCommande> links = new ArrayList<>();

    public CommandeService() {
        String[] status = { "en attente", "en préparation", "prête", "servie" };

        elements.add(new Element(1, "Clavier", 49.99));
        elements.add(new Element(2, "Souris", 19.99));
        elements.add(new Element(3, "Écran", 199.99));
        elements.add(new Element(4, "Casque", 89.99));

        commandes.add(new Commande(1, status[1]));
        commandes.add(new Commande(2, status[3]));

        links.add(new ElementInCommande(1, 1, 1, 2)); // clavier x2
        links.add(new ElementInCommande(2, 2, 1, 5)); // souris x5

        links.add(new ElementInCommande(3, 3, 2, 2)); // écran x2
        links.add(new ElementInCommande(4, 4, 2, 3)); // casque x3
    }

    public List<CommandeFullDTO> getAll() {

        List<CommandeFullDTO> result = new ArrayList<>();

        for (Commande commande : commandes) {

            List<ElementCommandeDTO> elementsDTO = new ArrayList<>();

            for (ElementInCommande link : links) {

                if (link.getCommandeId() == commande.getId()) {

                    Element element = elements.stream()
                            .filter(e -> e.getId() == link.getElementId())
                            .findFirst()
                            .orElse(null);

                    if (element != null) {
                        elementsDTO.add(new ElementCommandeDTO(
                                element.getId(),
                                element.getName(),
                                element.getPrice(),
                                link.getQuantity()
                        ));
                    }
                }
            }

            result.add(new CommandeFullDTO(
                    commande.getId(),
                    commande.getStatus(),
                    elementsDTO
            ));
        }

        return result;
    }
}