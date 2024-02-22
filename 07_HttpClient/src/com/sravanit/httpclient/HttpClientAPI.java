package com.sravanit.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientAPI {

	public static void main(String[] args) {

		HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2)
				.connectTimeout(Duration.ofSeconds(10)).build();

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://www.google.com")).GET().build();

		try {
			
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			
			System.out.println("Status Code: "+response.statusCode());
			System.out.println("Headers : "+response.headers());
			System.out.println("body : "+response.body());

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}
