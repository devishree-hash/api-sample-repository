package org.serialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class implementation {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		File f = new File("C:\\Users\\hp\\eclipse-workspace\\APIJsonFormat\\src\\test\\resources\\write.json");

		ObjectMapper objectMapper = new ObjectMapper();
		Batter batter1 = new Batter("1001", "Regular");
		Batter batter2 = new Batter("1002", "Chocolate");
		Batter batter3 = new Batter("1003", "Blueberry");
		Batter batter4 = new Batter("1004", "Devil's Food");

		ArrayList<Batter> batt = new ArrayList();
		batt.add(batter1);
		batt.add(batter2);
		batt.add(batter3);
		batt.add(batter4);

		Batters batters = new Batters(batt);
		Topping t1 = new Topping("5001", "None");
		Topping t2 = new Topping("5002", "Glazed");
		Topping t3 = new Topping("5005", "Sugar");
		Topping t4 = new Topping("5007", "powered sugar");
		Topping t5 = new Topping("5006", "Chocolate with Sprinkles");
		Topping t6 = new Topping("5003", "Chocolate");
		Topping t7 = new Topping("5004", "Maple");
		ArrayList<Topping> topping = new ArrayList();
		topping.add(t1);
		topping.add(t2);
		topping.add(t3);
		topping.add(t4);
		topping.add(t5);
		topping.add(t6);
		topping.add(t7);

		RootClass root = new RootClass("0001", "donut", "Cake", 0.55, batters, topping);

		objectMapper.writeValue(f, root);

	}

}
