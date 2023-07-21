package clases;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class Conexion {

    private static final String API_KEY = "43932|0_mu_gMstpATKjVHHANprZovoJP7dRRi";

    public Conexion() {
    }

    public String getExchangeRate(String fromCurrency, String toCurrency) throws IOException {
        URL url = new URL("https://api.cambio.today/v1/quotes/" + fromCurrency + "/" + toCurrency + "/json?quantity=1&key=" + API_KEY);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int responseCode = connection.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new RuntimeException("Ocurrió un error: " + responseCode);
        }

        InputStream inputStream = connection.getInputStream();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream));
        StringBuilder responseBody = new StringBuilder();
        while (scanner.hasNextLine()) {
            responseBody.append(scanner.nextLine());
        }
        scanner.close();
        connection.disconnect();

        JSONObject jsonObject = new JSONObject(responseBody.toString());

        return jsonObject.getString("result");
    }
}
