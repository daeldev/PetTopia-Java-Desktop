/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Oliveira
 */
public class ClienteDTO {
    private int idCliente;
    private String cpf_Cliente;
    private String nome;
    private String email;
    private String password_Cliente;
    private String telefone_Cliente;
    private String generoCliente;
    private String data_nascimento;
    private String data_Cadastro;
    private String resetToken;
    private LocalDateTime resetTokenExpiration;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCpf_Cliente() {
        return cpf_Cliente;
    }

    public void setCpf_Cliente(String cpf_Cliente) {
        this.cpf_Cliente = cpf_Cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword_Cliente() {
        return password_Cliente;
    }

    public void setPassword_Cliente(String password_Cliente) {
        this.password_Cliente = password_Cliente;
    }

    public String getTelefone_Cliente() {
        return telefone_Cliente;
    }

    public void setTelefone_Cliente(String telefone_Cliente) {
        this.telefone_Cliente = telefone_Cliente;
    }

    public String getGeneroCliente() {
        return generoCliente;
    }

    public void setGeneroCliente(String generoCliente) {
        this.generoCliente = generoCliente;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        if (data_nascimento != null && !data_nascimento.isEmpty()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.data_nascimento = LocalDate.parse(data_nascimento, formatter).toString();
        } else {
            this.data_nascimento = null; // Trata caso nulo ou vazio
        }
    }

    public String getData_Cadastro() {
        return data_Cadastro;
    }

    public void setData_Cadastro(String data_Cadastro) {
        this.data_Cadastro = data_Cadastro;
    }

    public String getResetToken() {
        return resetToken;
    }

    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    public LocalDateTime getResetTokenExpiration() {
        return resetTokenExpiration;
    }

    public void setResetTokenExpiration(LocalDateTime resetTokenExpiration) {
        this.resetTokenExpiration = resetTokenExpiration;
    }
}
