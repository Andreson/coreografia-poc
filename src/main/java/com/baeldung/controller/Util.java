package com.baeldung.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {

	
	public static JsonNode  getErrorMsg() {
		
		try {
		String json ="{\n"
				+ "    \"code\": 500,\n"
				+ "    \"message\": \"Erro ao realizar operação\"\n"
				+ "}";

		ObjectMapper objectMapper = new ObjectMapper();
			return  objectMapper.readTree(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return null;
		}
		
		
	}
}
