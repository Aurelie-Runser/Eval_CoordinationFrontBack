package com.example.demo.dtos;

import java.util.List;

public class CommandeDTO {

	private int id;
	private String title;
	private List<ElementDTO> elements;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public List<ElementDTO> getElements() {
        return elements;
    }
    public void setElements(List<ElementDTO> elements) {
        this.elements = elements;
    }
	
	public CommandeDTO(int id, String title, List<ElementDTO> elements) {
        this.id = id;
        this.title = title;
        this.elements = elements;
    }
	
}