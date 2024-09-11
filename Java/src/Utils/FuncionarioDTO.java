/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import javax.swing.JOptionPane;

/**
 *
 * @author Oliveira
 */
public class FuncionarioDTO {
    private int idFuncionario;
    private String tipo;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String genero;
    private String email;
    private String password;
    
    Validador validador = new Validador();

    public void setNome(String nome) {
        // Expressão regular para verificar se o nome contém apenas letras e espaços
        String nomeRegex = "^[a-zA-ZÀ-ÿ\\s]+$"; 

        if (nome != null && nome.trim().matches(nomeRegex) && nome.length() >= 2) {
            this.nome = nome.trim(); // Remove espaços extras no início ou fim
        } else {
            JOptionPane.showMessageDialog(null, "ERRO: Verifique o nome do funcionário. O nome deve conter apenas letras e ter ao menos 2 caracteres.");
        }
    }

    public void setEmail(String email) {
        // Expressão regular para validar o formato de email
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        if (email != null && email.trim().matches(emailRegex)) {
            this.email = email.trim();
        } else {
            JOptionPane.showMessageDialog(null, "ERRO: Verifique o email do funcionário. O email deve estar em um formato válido.");
        }
    }

    public void setPassword(String password) {
        if (!password.isEmpty()) {
            this.password = password;
        } else {
            JOptionPane.showMessageDialog(null, "ERRO: Verifique a password do funcionário.");
        }
    }

    public void setCpf(String cpf) {
        
        if (cpf != null && cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            if (validador.validarCpf(cpf)){
                this.cpf = cpf;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: O CPF informado é inválido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERRO: Verifique o CPF do funcionário. O CPF deve estar no formato XXX.XXX.XXX-XX.");
        }
    }

    public void setDataNascimento(String dataNascimento) {
        if (validador.validarDataNascimento(dataNascimento)) {
            this.dataNascimento = dataNascimento;
        } else {
            JOptionPane.showMessageDialog(null, "ERRO: Verifique a data de nascimento do funcionário.");
        }
    }

    public void setTipo(String tipo) {
        if (!tipo.isEmpty()) {
            this.tipo = tipo;
        } else {
            JOptionPane.showMessageDialog(null, "ERRO: Verifique a função do funcionário.");
        }
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getidFuncionario() {
        return idFuncionario;
    }
}
