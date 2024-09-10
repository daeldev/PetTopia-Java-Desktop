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
    // Cria variáveis final, pois será imutável para serem reutilizadas
    private final String apiUrl = "http://localhost:8081/api/funcionario/LoginFuncionario";
    
    private final ObjectMapper mapper = new ObjectMapper();
    // Cria o ObjectMapper para conversão entre DTO e JSON
    
    //Código 1
    // Método que realiza o login e retorna FuncionarioDTO com a função
//    public FuncionarioDTO login(FuncionarioDTO funcionarioDTO) {
//        HttpURLConnection conn = null;
//        try {
//            // Url contendo o endpoint da API login
//            URL url = new URL(apiUrl + "/api/funcionario/");
//            // Abre a conexão http
//            conn = (HttpURLConnection) url.openConnection();
//            // Define o http como POST
//            conn.setRequestMethod("POST");
//            // Define o tipo de conteúdo como JSON
//            conn.setRequestProperty("Content-Type", "application/json");
//            // Permite o envio de solicitação
//            conn.setDoOutput(true);
//
//            // Converte o FuncionarioDTO em String Json usando o ObjectMapper
//            String inputJson = mapper.writeValueAsString(funcionarioDTO);
//
//            // Envia a solicitação
//            try (OutputStream os = conn.getOutputStream()) {
//                os.write(inputJson.getBytes());
//                os.flush();
//            }
//
////            Verifica se deu 200 (OK)
//            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
////                Lê a resposta do servidor
//                try (InputStream is = conn.getInputStream()) {
////                    Converte a resposta Json em FuncionarioDTO
//                    funcionarioDTO = mapper.readValue(is, FuncionarioDTO.class);
//                }
//            } else {
//                System.err.println("Erro na resposta: " + conn.getResponseCode());
//            }
//        } catch (Exception e) {
//            System.out.println("ERRO: "+ e);
//        } finally {
//            if (conn != null) {
//                // Garante que a conexão seja desconectada
//                conn.disconnect();
//            }
//        }
//        // Retorna funcionarioDTO contendo a função
//        return funcionarioDTO;
//    }
    
    //Código 2
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
                    if (response.length() > 0) {
                        return mapper.readValue(response.toString(), FuncionarioDTO.class);
                    }
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