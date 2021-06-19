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
@RequestMapping("/biros")
public class ControllerNeurotech {
	
	
	
	@GetMapping("{status}")
	public ResponseEntity<JsonNode> getStep2(@PathVariable("status") String status) throws JsonMappingException, JsonProcessingException{
		
		if ( status.equalsIgnoreCase("fail")) {
			return new ResponseEntity<JsonNode>(Util.getErrorMsg(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		String json = getJson();

		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode readTree = objectMapper.readTree(json);
		return new ResponseEntity<JsonNode>(readTree,HttpStatus.OK);
		
	}
	
	private String getJson() {
		return  "{\n"
				+ "    \"operationCode\": \"613556980813782667\",\n"
				+ "    \"internalOperationCode\": \"29934bd8-a0c2-442a-b5f2-82501b97c4af\",\n"
				+ "    \"message\": \"OK \",\n"
				+ "    \"status\": \"0100\",\n"
				+ "    \"result\": \"AVALIAR\",\n"
				+ "    \"flowParameters\": [\n"
				+ "        \n"
				+ "        {\n"
				+ "            \"name\": \"GTWR_5284_informacoesprofissao\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTWR_5284_informacoesrenda\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_0882_ID_LOG\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_0882_NM_CONSULTA\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_0882_ORIGEM_CONSULTA\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_0882_STATUS_CONSULTA\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_0882_VALIDADE_CONSULTA\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_5212_CONVERSAO_ENTRADA\",\n"
				+ "            \"value\": \"produto£autoscoreconversao§versao£v1§metodo£predict§ApiKey£7YLf0TmLGS5aXsVan9tL218MkEvsrKaB201azNHH§client£hdi§layout£oneclickcon§cpf£09249701462§cep£01046010§modelo£MILE§marca£UNO§anofabricacao£08/10/1990§\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_5212_CONVERSAO_ID_COM\",\n"
				+ "            \"value\": \"734915\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_5212_ID_LOG\",\n"
				+ "            \"value\": \"676798630990548293\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_5212_NM_CONSULTA\",\n"
				+ "            \"value\": \"AUTOSCORE\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_5212_ORIGEM_CONSULTA\",\n"
				+ "            \"value\": \"Input\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_5212_RF_ENTRADA\",\n"
				+ "            \"value\": \"produto£autoscoreroubofurto§versao£v1§metodo£predict§ApiKey£4fN9yJH2Aw1C45XU6TY4raezWBAOo8uu11PjHrAg§client£hdi§layout£oneclickrf§cpf£09249701462§cep£01046010§modelo£MILE§marca£UNO§anofabricacao£08/10/1990§\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_5212_RF_ID_COM\",\n"
				+ "            \"value\": \"734913\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_5212_SINISTRO_ENTRADA\",\n"
				+ "            \"value\": \"produto£autoscoresinistro§versao£v1§metodo£predict§ApiKey£SE5GW8LQH76NJ11MypydJ9YP6jq7UH0O3hEckqy1§client£hdi§layout£oneclicksinistro§cpf£09249701462§cep£01046010§modelo£MILE§marca£UNO§anofabricacao£08/10/1990§\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_5212_SINISTRO_ID_COM\",\n"
				+ "            \"value\": \"734914\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_5212_STATUS_CONSULTA\",\n"
				+ "            \"value\": \"0221\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_5212_STATUS_CONSULTA_CATALOGO\",\n"
				+ "            \"value\": \"100\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_5212_STATUS_CONSULTA_CONVERSAO\",\n"
				+ "            \"value\": \"0221\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"GTW_5212_STATUS_CONSULTA_RF\",\n"
				+ "            \"value\": \"0221\"\n"
				+ "        },\n"
				+ "        \n"
				+ "        \n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_CONCENTRACAO_BEBIDAS\",\n"
				+ "            \"value\": \"ALTISSIMA\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_CONCENTRACAO_BOMBEIRO\",\n"
				+ "            \"value\": \"ALTISSIMA\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_CONCENTRACAO_CAIXA_ELETRONICO\",\n"
				+ "            \"value\": \"ALTISSIMA\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_CONCENTRACAO_CASA_NOTURNA\",\n"
				+ "            \"value\": \"ALTISSIMA\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_CONCENTRACAO_CEMITERIO\",\n"
				+ "            \"value\": \"ALTISSIMA\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_CONCENTRACAO_CINEMAS\",\n"
				+ "            \"value\": \"ALTISSIMA\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_CONCENTRACAO_CONCESSIONARIA\",\n"
				+ "            \"value\": \"ALTA\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_CONCENTRACAO_CORREIOS\",\n"
				+ "            \"value\": \"ALTISSIMA\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_CONCENTRACAO_CORRETOR_SEGUROS\",\n"
				+ "            \"value\": \"ALTISSIMA\"\n"
				+ "        },\n"
				+ "         \n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_FUNERARIA\",\n"
				+ "            \"value\": \"PROXIMO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_HOSPITAL\",\n"
				+ "            \"value\": \"PROXIMO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_HOTEL\",\n"
				+ "            \"value\": \"PROXIMO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_IGREJA\",\n"
				+ "            \"value\": \"MEDIO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_LAVA_RAPIDO\",\n"
				+ "            \"value\": \"MEDIO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_LOJA_BEBIDAS\",\n"
				+ "            \"value\": \"PROXIMO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_METRO\",\n"
				+ "            \"value\": \"PROXIMO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_OFICINAS\",\n"
				+ "            \"value\": \"LONGE\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_PARQUE\",\n"
				+ "            \"value\": \"PROXIMO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_PARQUES_DIVERSAO\",\n"
				+ "            \"value\": \"MEDIO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_POLICIA\",\n"
				+ "            \"value\": \"PROXIMO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_PONTO_TAXI\",\n"
				+ "            \"value\": \"MUITO PROXIMO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_POSTO_GASOLINA\",\n"
				+ "            \"value\": \"LONGE\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_PREFEITURA\",\n"
				+ "            \"value\": \"MEDIO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_SHOPPING\",\n"
				+ "            \"value\": \"PROXIMO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_SUPERMERCADO\",\n"
				+ "            \"value\": \"PROXIMO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_TREM\",\n"
				+ "            \"value\": \"PROXIMO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_DISTANCIA_UNIVERSIDADE\",\n"
				+ "            \"value\": \"PROXIMO\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_EXPOSICAO_COBRANCA\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_EXPOSICAO_EMAILS\",\n"
				+ "            \"value\": \"0.25\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_EXPOSICAO_TELEFONES\",\n"
				+ "            \"value\": \"0\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_BOLSA_FAMILIA\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_FILIADO_PARTIDO_POLITICO\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_OBITO\",\n"
				+ "            \"value\": \"0\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_PROGRAMAS_SOCIAIS\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_PROUNI\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_REDE_SOCIAL\",\n"
				+ "            \"value\": \"S\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_SERVIDOR_CIVIL\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_SERVIDOR_MILITAR\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB\",\n"
				+ "            \"value\": \"S\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_ARTES\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_CIENCIA\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_COMPRAS\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_ESPORTES_FUTEBOL\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_LIVROS\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_MUSICA\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_NEGOCIOS\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_NEGOCIOS_MARKETING\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_NEGOCIOS_SERVICOS\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_NEGOCIOS_SERVICOS_COMPUT\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_NEGOCIOS_SERVICOS_UNIVER\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_NOTICIAS\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_SAUDE\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_SOCIEDADE\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_SOCIEDADE_GENEALOGIA\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_FLAG_WEB_TV\",\n"
				+ "            \"value\": \"N\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_GENERO\",\n"
				+ "            \"value\": \"M\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_IDADE\",\n"
				+ "            \"value\": \"28.041\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_LATITUDE\",\n"
				+ "            \"value\": \"-7.1524431\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_LONGITUDE\",\n"
				+ "            \"value\": \"-34.8344889\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_NIVEL_RELACIONAMENTO_AUTOMOVEL\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_NIVEL_RELACIONAMENTO_CREDITO\",\n"
				+ "            \"value\": \"0.021\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_NIVEL_RELACIONAMENTO_SEGUROS_01\",\n"
				+ "            \"value\": \"0\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_NIVEL_RELACIONAMENTO_SEGUROS_02\",\n"
				+ "            \"value\": \"0.042\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_NIVEL_RELACIONAMENTO_VAREJO\",\n"
				+ "            \"value\": \"0\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_NOME\",\n"
				+ "            \"value\": \"ARTHUR VARELA LUCKWU DE OLIVEIRA\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_PASSAGENS_EMAIL\",\n"
				+ "            \"value\": \"0.032\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_PASSAGENS_ENDERECO\",\n"
				+ "            \"value\": \"0.017\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_PASSAGENS_TELEFONE\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_PASSAGENS_WEB\",\n"
				+ "            \"value\": \"0.006\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_REMUNERACAO_SERVIDOR_CIVIL\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_REMUNERACAO_SERVIDOR_MILITAR\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_SCORE_CONVERSAO\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_SCORE_RF\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_SCORE_RISCO_CADASTRAL\",\n"
				+ "            \"value\": \"0.3116856813430786\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_SCORE_RISCO_DEMOGRAFICO\",\n"
				+ "            \"value\": \"0.48580431938171387\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_SCORE_RISCO_GEORREFERENCIADO\",\n"
				+ "            \"value\": \"0.22148269414901733\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_SCORE_RISCO_WEB\",\n"
				+ "            \"value\": \"0.516607403755188\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_SCORE_SINISTRO\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_SIGLA_PARTIDO_FILIADO\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_STATUS_RESTITUICAO_IRPF\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_UF\",\n"
				+ "            \"value\": \"PB\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_ULT_PASSAGEM_EMAIL\",\n"
				+ "            \"value\": \"1.3362762\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_ULT_PASSAGEM_ENDERECO\",\n"
				+ "            \"value\": \"2.2705228\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_ULT_PASSAGEM_MERCADO_FINANCEIRO\",\n"
				+ "            \"value\": \"0.6666667\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_ULT_PASSAGEM_TELEFONE\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_VALOR_PARCELA_BOLSA_FAMILIA\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_VAR17\",\n"
				+ "            \"value\": \"0.997723\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_VAR19\",\n"
				+ "            \"value\": \"0.034819\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_VAR3\",\n"
				+ "            \"value\": \"0.762431\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_VAR36\",\n"
				+ "            \"value\": \"0.001441\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_VAR37\",\n"
				+ "            \"value\": \"0.000896\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_VAR41\",\n"
				+ "            \"value\": \"0.012973\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_VAR44\",\n"
				+ "            \"value\": \"0.967229\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_VAR5\",\n"
				+ "            \"value\": \"0.136239\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_VAR50\",\n"
				+ "            \"value\": \"0.984249\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RET_NL_VAR52\",\n"
				+ "            \"value\": \"0.041925\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RGR_AUTOSCORE\",\n"
				+ "            \"value\": \"PI\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RGR_AUTOSCORE_SINISTRO\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RGR_CATALOGO\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RGR_NOVAVIDAPERFILSOCIODEMOGRAFICO\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RGR_NOVAVIDAPESSOASEMPRESAS\",\n"
				+ "            \"value\": \"\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RGR_SCORE_RF_SIS_RESPONDE\",\n"
				+ "            \"value\": \"PI\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RGR_VARIAVEIS_CARREGADAS\",\n"
				+ "            \"value\": \"\"\n"
				+ "        }\n"
				+ "    ],\n"
				+ "    \"ruleResult\": [\n"
				+ "        {\n"
				+ "            \"name\": \"RGR_SCORE_RF_SIS_RESPONDE#1\",\n"
				+ "            \"status\": \"A\",\n"
				+ "            \"ruleDescription\": \"REGISTRO LOCALIZADO NO CATALOGO?\",\n"
				+ "            \"resultCompleteDescription\": \"APROVADO\",\n"
				+ "            \"resultSimpleDescription\": \"APROVADO\",\n"
				+ "            \"parentRuleName\": \"RGR_AUTOSCORE#1\",\n"
				+ "            \"startTime\": \"2021-06-18T17:32:32.696\",\n"
				+ "            \"endTime\": \"2021-06-18T17:32:32.696\",\n"
				+ "            \"inputs\": []\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RGR_SCORE_RF_SIS_RESPONDE#2\",\n"
				+ "            \"status\": \"P\",\n"
				+ "            \"ruleDescription\": \"REGISTRO LOCALIZADO NO AUTOSCORE ROUBO E FURTO?\",\n"
				+ "            \"resultCompleteDescription\": \"PARAMETRO INVALIDO\",\n"
				+ "            \"resultSimpleDescription\": \"PARAMETRO INVALIDO\",\n"
				+ "            \"parentRuleName\": \"RGR_AUTOSCORE#1\",\n"
				+ "            \"startTime\": \"2021-06-18T17:32:32.696\",\n"
				+ "            \"endTime\": \"2021-06-18T17:32:32.696\",\n"
				+ "            \"inputs\": []\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"name\": \"RGR_SCORE_RF_SIS_RESPONDE#3\",\n"
				+ "            \"status\": \"P\",\n"
				+ "            \"ruleDescription\": \"REGISTRO LOCALIZADO NO AUTOSCORE SINISTRO?\",\n"
				+ "            \"resultCompleteDescription\": \"PARAMETRO INVALIDO\",\n"
				+ "            \"resultSimpleDescription\": \"PARAMETRO INVALIDO\",\n"
				+ "            \"parentRuleName\": \"RGR_AUTOSCORE#1\",\n"
				+ "            \"startTime\": \"2021-06-18T17:32:32.696\",\n"
				+ "            \"endTime\": \"2021-06-18T17:32:32.696\",\n"
				+ "            \"inputs\": []\n"
				+ "        }\n"
				+ "        \n"
				+ "    ],\n"
				+ "    \"gatewayResults\": []\n"
				+ "}";
	}

}
