package com.example.demo.dtos;

import java.util.List;

public class CommandeDTO {

	private int id;
	private String status;
	private List<ElementDTO> elements;
	
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

	public List<ElementDTO> getElements() {
        return elements;
    }
    public void setElements(List<ElementDTO> elements) {
        this.elements = elements;
    }
	
	public CommandeDTO(int id, String status, List<ElementDTO> elements) {
        this.id = id;
        this.status = status;
        this.elements = elements;
    }
	
}