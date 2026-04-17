package com.example.demo.models;

public class ElementInCommande {

    private int id;
    private int elementId;
    private int commandeId;
    private int quantity;

    public ElementInCommande() {}

    public ElementInCommande(int id, int elementId, int commandeId, int quantity) {
        this.id = id;
        this.elementId = elementId;
        this.commandeId = commandeId;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getElementId() {
        return elementId;
    }

    public void setElementId(int elementId) {
        this.elementId = elementId;
    }

    public int getCommandeId() {
        return commandeId;
    }

    public void setCommandeId(int commandeId) {
        this.commandeId = commandeId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}