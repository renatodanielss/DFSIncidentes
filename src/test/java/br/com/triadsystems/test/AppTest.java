package br.com.triadsystems.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import br.com.triadsystems.rest.RestClient;

public class AppTest {
	public static void main(String[] args) {
		RestClient restClient = new RestClient("resources/properties/headers.properties", "https://suporte.dfsdigital.com.br/glpi/apirest.php/initSession");
		
		try {
			restClient.callRest();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
