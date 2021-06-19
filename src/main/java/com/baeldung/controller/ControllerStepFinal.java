package com.baeldung.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/finish")
public class ControllerStepFinal {
	
	
	
	@GetMapping("{status}")
	public ResponseEntity<JsonNode> getStep2(@PathVariable("status") String status) throws JsonMappingException, JsonProcessingException{
		
		if ( status.equalsIgnoreCase("fail")) {
			return new ResponseEntity<JsonNode>(Util.getErrorMsg(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		String json = "{\n \"authorized\" "+"\"" +status+"\""
 				+ "    \"jabacomarroiz\": [\n"
				+ "        {\n"
				+ "            \"referencePremiumMinimum\": 2874.2175,\n"
				+ "            \"referencePremiumTax\": 0\n"
				+ "        }\n"
				+ "    ]\n"
				+ "}";

		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode readTree = objectMapper.readTree(json);
		return new ResponseEntity<JsonNode>(readTree,HttpStatus.OK);
		
	}

}
