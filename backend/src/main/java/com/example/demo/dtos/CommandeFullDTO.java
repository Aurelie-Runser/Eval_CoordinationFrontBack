package com.example.demo.dtos;

import java.util.List;

public class CommandeFullDTO {

    private int id;
    private String status;
    private List<ElementCommandeDTO> elements;

    public CommandeFullDTO() {}

    public CommandeFullDTO(int id, String status, List<ElementCommandeDTO> elements) {
        this.id = id;
        this.status = status;
        this.elements = elements;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ElementCommandeDTO> getElements() {
        return elements;
    }

    public void setElements(List<ElementCommandeDTO> elements) {
        this.elements = elements;
    }
}