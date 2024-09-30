package org.deserialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class implementation {

	private static Batters batters;

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		FileReader fileReader = new FileReader(
				new File("C:\\Users\\hp\\eclipse-workspace\\APIJsonFormat\\src\\test\\resources\\sample.json"));
		ObjectMapper objectMapper = new ObjectMapper();
		RootClass readValue = objectMapper.readValue(fileReader, RootClass.class);
		System.out.println(readValue.getId());
		System.out.println(readValue.getType());
		System.out.println(readValue.getName());
		System.out.println(readValue.getPpu());
		Batters batters = readValue.getBatters();
		ArrayList<Batter> batter = batters.getBatter();
		for(Batter b:batter) {
			System.out.println(b.getId());
			System.out.println(b.getType());
			
		}
		ArrayList<Topping> topping = readValue.getTopping();
		for(Topping t:topping) {
			
			System.out.println(t.getId());
			System.out.println(t.getType());
		}
		
		}

}
