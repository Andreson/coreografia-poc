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
@RequestMapping("/rns")
public class ControllerRNS {
	
	
	
	@GetMapping("{status}")
	public ResponseEntity<JsonNode> getStep2(@PathVariable("status") String status) throws JsonMappingException, JsonProcessingException{
		
		
		if ( status.equalsIgnoreCase("fail")) {
			return new ResponseEntity<JsonNode>(Util.getErrorMsg(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		String json = getResponse();

		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode readTree = objectMapper.readTree(json);
		return new ResponseEntity<JsonNode>(readTree,HttpStatus.OK);
		
	}

	
	private String getResponse() {
		return "{\n"
				+ "   \"prospect\":{\n"
				+ "      \"score\":0,\n"
				+ "      \"documents\":[\n"
				+ "         {\n"
				+ "            \"number\":\"31424783534\",\n"
				+ "            \"type\":{\n"
				+ "               \"id\":1\n"
				+ "            }\n"
				+ "         }\n"
				+ "      ],\n"
				+ "      \"claims\":{\n"
				+ "         \"registers\":[\n"
				+ "            \n"
				+ "         ]\n"
				+ "      },\n"
				+ "      \"restrictiveList\":{\n"
				+ "         \"registers\":[\n"
				+ "            \n"
				+ "         ]\n"
				+ "      },\n"
				+ "      \"wholeIndemnity\":{\n"
				+ "         \"registers\":[\n"
				+ "            \n"
				+ "         ]\n"
				+ "      },\n"
				+ "      \"wholeIndemnityThirdpart\":{\n"
				+ "         \"registers\":[\n"
				+ "            \n"
				+ "         ]\n"
				+ "      }\n"
				+ "   },\n"
				+ "   \"vehicle\":{\n"
				+ "      \"score\":0,\n"
				+ "      \"chassisCode\":\"9BHBG51DAHP672686\",\n"
				+ "      \"licensePlateCode\":null,\n"
				+ "      \"claimsChassis\":{\n"
				+ "         \"registers\":[\n"
				+ "            \n"
				+ "         ]\n"
				+ "      },\n"
				+ "      \"claimsRobbery\":{\n"
				+ "         \"registers\":[\n"
				+ "            {\n"
				+ "               \"broker\":{\n"
				+ "                  \"susepCode\":\"06572\"\n"
				+ "               },\n"
				+ "               \"claim\":{\n"
				+ "                  \"closureReason\":{\n"
				+ "                     \"id\":\"03\"\n"
				+ "                  },\n"
				+ "                  \"indemnity\":{\n"
				+ "                     \"code\":\"05\"\n"
				+ "                  },\n"
				+ "                  \"nature\":{\n"
				+ "                     \"id\":\"030\"\n"
				+ "                  },\n"
				+ "                  \"noticeDate\":\"2019-05-30\",\n"
				+ "                  \"status\":{\n"
				+ "                     \"id\":\"02\"\n"
				+ "                  }\n"
				+ "               },\n"
				+ "               \"id\":0,\n"
				+ "               \"insurancePolicy\":{\n"
				+ "                  \"lineId\":\"031\"\n"
				+ "               },\n"
				+ "               \"person\":{\n"
				+ "                  \"documents\":[\n"
				+ "                     {\n"
				+ "                        \"number\":\"00025842895803\"\n"
				+ "                     }\n"
				+ "                  ]\n"
				+ "               },\n"
				+ "               \"vehicle\":{\n"
				+ "                  \"chassisCode\":\"9BHBG51DAHP672686    \",\n"
				+ "                  \"plateCode\":\"PYL3121\"\n"
				+ "               }\n"
				+ "            }\n"
				+ "         ]\n"
				+ "      },\n"
				+ "      \"restrictiveList\":{\n"
				+ "         \"registers\":[\n"
				+ "            \n"
				+ "         ]\n"
				+ "      },\n"
				+ "      \"wholeIndemnity\":{\n"
				+ "         \"registers\":[\n"
				+ "            \n"
				+ "         ]\n"
				+ "      },\n"
				+ "      \"wholeIndemnityThirdpart\":{\n"
				+ "         \"registers\":[\n"
				+ "            \n"
				+ "         ]\n"
				+ "      }\n"
				+ "   }\n"
				+ "}";
	}
	
}
