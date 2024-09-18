/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import static javax.swing.text.DefaultStyledDocument.ElementSpec.ContentType;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpConnection {
    private final String apiUrl = "http://localhost:8081/api/funcionario/LoginNormal";
    private final ObjectMapper mapper = new ObjectMapper();

    public FuncionarioDTO sendLoginRequest(FuncionarioDTO funcionarioDTO) {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(apiUrl);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String inputJson = mapper.writeValueAsString(funcionarioDTO);
            try (OutputStream os = conn.getOutputStream()) {
                os.write(inputJson.getBytes());
                os.flush();
            }

            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        response.append(line);
                    }
                    // Converte a resposta JSON para FuncionarioModel
                    return mapper.readValue(response.toString(), FuncionarioDTO.class);
                }
            } else {
                System.err.println("Erro na resposta: " + conn.getResponseCode());
            }
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
        return null;
    }
}