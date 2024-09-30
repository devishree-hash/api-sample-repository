package org.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadFormat {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader file=new FileReader("C:\\Users\\hp\\eclipse-workspace\\APIJsonFormat\\src\\test\\resources\\sample.json");
		JSONParser jsonParser=new JSONParser();
		Object parse = jsonParser.parse(file);
		JSONObject jsonObject=(JSONObject)parse;
		System.out.println(jsonObject.get("id"));
		System.out.println(jsonObject.get("type"));
		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("ppu"));
		System.out.println(jsonObject.get("batters"));
		System.out.println(jsonObject.get("topping"));
		
		
		
		
		
		
		
		
		
	}

}
