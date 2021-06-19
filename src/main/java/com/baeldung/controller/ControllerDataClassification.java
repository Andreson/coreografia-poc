package com.baeldung.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/dataclassification")
public class ControllerDataClassification {
	
	
	
	@GetMapping
	public ResponseEntity<JsonNode> getDataClassification() throws JsonMappingException, JsonProcessingException{
		
		String json = getMockResponse();

		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode readTree = objectMapper.readTree(json);
		return new ResponseEntity<JsonNode>(readTree,HttpStatus.OK);
		
	}
	
	
	
	private String getMockResponse() {
		
		return "\n"
				+ "{\n"
				+ "    \"region\": {\n"
				+ "        \"address\": {\n"
				+ "            \"streetName\": \"RUA JOAO FERREIRA DE ABREU\",\n"
				+ "            \"districtName\": \"VILA ARRIETE\",\n"
				+ "            \"postalCode\": \"04445140\",\n"
				+ "            \"latitude\": \"-23.682\",\n"
				+ "            \"longitude\": \"-46.681\",\n"
				+ "            \"city\": {\n"
				+ "                \"code\": \"SAO\",\n"
				+ "                \"description\": \"SAO PAULO\",\n"
				+ "                \"state\": {\n"
				+ "                    \"code\": \"SP\",\n"
				+ "                    \"description\": \"SAO PAULO\"\n"
				+ "                }\n"
				+ "            },\n"
				+ "            \"regionClass\": {\n"
				+ "                \"code\": \"144\",\n"
				+ "                \"description\": \"Sul V - SP\",\n"
				+ "                \"group\": {\n"
				+ "                    \"code\": \"001\",\n"
				+ "                    \"description\": \"4135\"\n"
				+ "                }\n"
				+ "            }\n"
				+ "        }\n"
				+ "    },\n"
				+ "    \"vehicleModel\": {\n"
				+ "        \"code\": \"0014462\",\n"
				+ "        \"fipeCode\": \"025144-5\",\n"
				+ "        \"description\": \"EXPRESSION HI-FLEX 1.6 8V 5P\",\n"
				+ "        \"descriptionType\": \"SANDERO\",\n"
				+ "        \"seatCount\": 5,\n"
				+ "        \"isFleet\": 0,\n"
				+ "        \"isRCTRVI\": 0,\n"
				+ "        \"isInsurable\": 1,\n"
				+ "        \"isValue\": 26371.0,\n"
				+ "        \"fuelType\": {\n"
				+ "            \"id\": \"1\",\n"
				+ "            \"description\": \"GASOLINA\"\n"
				+ "        },\n"
				+ "        \"branch\": {\n"
				+ "            \"description\": \"RENAULT\"\n"
				+ "        },\n"
				+ "        \"group\": {\n"
				+ "            \"code\": \"1652\",\n"
				+ "            \"description\": \"SANDERO EXPRESSION 1.6\",\n"
				+ "            \"class\": {\n"
				+ "                \"code\": \"1\"\n"
				+ "            }\n"
				+ "        },\n"
				+ "        \"category\": {\n"
				+ "            \"code\": \"10\",\n"
				+ "            \"description\": \"PASSEIO - NACIONAL\",\n"
				+ "            \"group\": {\n"
				+ "                \"code\": \"1\",\n"
				+ "                \"description\": \"Passeio\"\n"
				+ "            }\n"
				+ "        },\n"
				+ "        \"traction\": {\n"
				+ "            \"id\": 1,\n"
				+ "            \"description\": \"4x2\"\n"
				+ "        },\n"
				+ "        \"engine\": {\n"
				+ "            \"id\": 6,\n"
				+ "            \"description\": \"1.6\"\n"
				+ "        },\n"
				+ "        \"exchangeRate\": {\n"
				+ "            \"id\": 1,\n"
				+ "            \"description\": \"MECANICO\"\n"
				+ "        }\n"
				+ "    },\n"
				+ "    \"internalBureauAnalitycs\": {\n"
				+ "        \"client\": [],\n"
				+ "        \"vehicle\": [],\n"
				+ "        \"districtInformation\": []\n"
				+ "    }\n"
				+ "}\n"
				+ "";
	}

}
