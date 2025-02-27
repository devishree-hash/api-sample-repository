package org.deserialization;

import java.util.ArrayList;
import java.util.Map;

public class RootClass {

	

	private String id;
	
	private String type;
	
	private String name;
	
	private Double ppu;
	
	private Batters batters;
	
	private ArrayList<Topping> topping;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPpu() {
		return ppu;
	}

	public void setPpu(Double ppu) {
		this.ppu = ppu;
	}

	
	public Batters getBatters() {
		return batters;
	}

	public void setBatters(Batters batters) {
		this.batters = batters;
	}

	public ArrayList<Topping> getTopping() {
		return topping;
	}

	public void setTopping(ArrayList<Topping> topping) {
		this.topping = topping;
	}
	
}
