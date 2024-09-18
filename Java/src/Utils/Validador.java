/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Oliveira
 */
public class Validador {
    // Método público não estático
    public boolean validarCpf(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("\\D", "");

        // Verifica se tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais
        String firstDigit = cpf.substring(0, 1);
        if (cpf.chars().allMatch(ch -> ch == firstDigit.charAt(0))) {
            return false;
        }

        // Calcula o dígito verificador
        int[] digits = new int[11];
        for (int i = 0; i < 11; i++) {
            digits[i] = Character.getNumericValue(cpf.charAt(i));
        }

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += digits[i] * (10 - i);
        }
        int remainder = 11 - (sum % 11);
        int firstDigitVerifier = remainder > 9 ? 0 : remainder;
        if (digits[9] != firstDigitVerifier) {
            return false;
        }

        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += digits[i] * (11 - i);
        }
        remainder = 11 - (sum % 11);
        int secondDigitVerifier = remainder > 9 ? 0 : remainder;
        if (digits[10] != secondDigitVerifier) {
            return false;
        }

        return true;
    }
    
    public boolean validarData(String dataNascimento) {
        // Definir o formato esperado para a data (ex: "dd/MM/yyyy")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            // Tentar converter a string para uma data válida
            LocalDate data = LocalDate.parse(dataNascimento, formatter);

            // Validar se a data não é no futuro
            if (data.isAfter(LocalDate.now())) {
                return false;
            } else {
                return true;
            }
        } catch (DateTimeParseException e) {
            // Mensagem de erro se a data estiver em formato inválido
            return false;
        }
    }
}
