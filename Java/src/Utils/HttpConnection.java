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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static javax.swing.text.DefaultStyledDocument.ElementSpec.ContentType;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpConnection {
    private final String apiUrl = "http://localhost:8081/api/";
    private final ObjectMapper mapper = new ObjectMapper();

    public FuncionarioDTO sendLoginRequest(FuncionarioDTO funcionarioDTO) {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(apiUrl + "funcionario/LoginNormal");
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
    
    public FuncionarioDTO CadastrarFuncionario(FuncionarioDTO funcionarioDTO) {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(apiUrl + "adm/cadastrar/funcionario");
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
    
    public List<FuncionarioDTO> listarFuncionarios() {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(apiUrl + "adm/listar/funcionario");
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json");

            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        response.append(line);
                    }
                    // Converte a resposta JSON para uma lista de FuncionarioDTO
                    return Arrays.asList(mapper.readValue(response.toString(), FuncionarioDTO[].class));
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
        return new ArrayList<>();  // Retorna uma lista vazia caso ocorra erro
    }
    
    public ClienteDTO CadastrarCliente(ClienteDTO clienteDTO) {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(apiUrl + "cliente/cadastrar");
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String inputJson = mapper.writeValueAsString(clienteDTO);
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
                    return mapper.readValue(response.toString(), ClienteDTO.class);
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
    
    public List<ClienteDTO> listarClientes() {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(apiUrl + "funcionario/listar/cliente");
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json");

            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        response.append(line);
                    }
                    // Converte a resposta JSON para uma lista de FuncionarioDTO
                    return Arrays.asList(mapper.readValue(response.toString(), ClienteDTO[].class));
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
        return new ArrayList<>();  // Retorna uma lista vazia caso ocorra erro
    }
    
    public ConsultaDTO agendarConsulta(ConsultaDTO consultaDTO) {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(apiUrl + "cliente/agendarConsulta");
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String inputJson = mapper.writeValueAsString(consultaDTO);
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
                    return mapper.readValue(response.toString(), ConsultaDTO.class);
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
    
    public List<ConsultaDTO> listarConsultas() {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(apiUrl + "funcionario/ListarConsultas");
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json");

            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        response.append(line);
                    }
                    // Converte a resposta JSON para uma lista de FuncionarioDTO
                    return Arrays.asList(mapper.readValue(response.toString(), ConsultaDTO[].class));
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
        return new ArrayList<>();  // Retorna uma lista vazia caso ocorra erro
    }
    
    public DenunciaDTO cadastrarDenuncia(DenunciaDTO denunciaDTO) {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(apiUrl + "cliente/RealizarDenuncia");
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String inputJson = mapper.writeValueAsString(denunciaDTO);
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
                    return mapper.readValue(response.toString(), DenunciaDTO.class);
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
    
    public List<DenunciaDTO> listarDenuncias() {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(apiUrl + "funcionario/listar/denuncia");
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json");

            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        response.append(line);
                    }
                    // Converte a resposta JSON para uma lista de FuncionarioDTO
                    return Arrays.asList(mapper.readValue(response.toString(), DenunciaDTO[].class));
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
        return new ArrayList<>();  // Retorna uma lista vazia caso ocorra erro
    }
    
    // animais
    public AnimalDTO cadastrarAnimal(AnimalDTO animalDTO) {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(apiUrl + "cliente/RealizarDenuncia");
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String inputJson = mapper.writeValueAsString(animalDTO);
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
                    return mapper.readValue(response.toString(), AnimalDTO.class);
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
    
    public List<AnimalDTO> listarAnimais() {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(apiUrl + "funcionario/listar/animal");
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json");

            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        response.append(line);
                    }
                    // Converte a resposta JSON para uma lista de FuncionarioDTO
                    return Arrays.asList(mapper.readValue(response.toString(), AnimalDTO[].class));
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
        return new ArrayList<>();  // Retorna uma lista vazia caso ocorra erro
    }
}