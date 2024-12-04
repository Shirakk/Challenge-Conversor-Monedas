package service;

import org.json.JSONObject;
import java.io.IOException;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateAPI {

    public String getRequest(String fromCurrency, String toCurrency, int amount) {

        final String BASE_URL = "https://v6.exchangerate-api.com/v6/7cee7f6921eef9c1e94da8f8";
        final String ENDPOINT = "/pair/" + fromCurrency + "/" + toCurrency + "/" + amount;

        try {
            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(new URI(BASE_URL + ENDPOINT))
                    .build();

            HttpClient httpClient = HttpClient.newHttpClient();
            HttpResponse<String> response = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

            JSONObject jsonObject = new JSONObject(response.body());

            if ("success".equalsIgnoreCase(jsonObject.getString("result"))) {
                return String.valueOf(jsonObject.getDouble("conversion_result"));
            } else {
                throw new RuntimeException("API error: " + jsonObject.getString("error-type"));
            }

        } catch (URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException("Request failed", e);
        }
    }
}