/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno.Tarde
 */
public class DTO {

    public class FuncionarioDTO {
        //Funcionário
        private String Funcao;
        private String Nome;
        private String CPF;
        private String DataNascimento;
        private String Sexo;
        private String Usuario;
        private String Senha;
        private int Codigo;

        public void setNome(String Nome) {
            if (!Nome.isEmpty()) {
                this.Nome = Nome;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique o nome do funcionário.");
            }
        }

        public void setUsuario(String Usuario) {
            if (!Usuario.isEmpty()) {
                this.Usuario = Usuario;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique o Usuario do funcionário.");
            }
        }

        public void setSenha(String Senha) {
            if (!Senha.isEmpty()) {
                this.Senha = Senha;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique a senha do funcionário.");
            }
        }

        public void setCPF(String CPF) {
            if (!CPF.equals("   .   .   -  ")) {
                this.CPF = CPF;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique o Cpf do funcionário.");
            }
        }

        public void setDataNascimento(String DataNascimento) {
            if (!DataNascimento.equals("  /  /    ")) {
                this.DataNascimento = DataNascimento;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique a data de nascimento do funcionário.");
            }
        }

        public void setFuncao(String Funcao) {
            if (!Funcao.isEmpty()) {
                this.Funcao = Funcao;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique a função do funcionário.");
            }
        }

        public void setSexo(String Sexo) {
            this.Sexo = Sexo;
        }

        public void setCodigo(int Codigo) {
            this.Codigo = Codigo;
        }

        public String getFuncao() {
            return Funcao;
        }

        public String getNome() {
            return Nome;
        }

        public String getCPF() {
            return CPF;
        }

        public String getDataNascimento() {
            return DataNascimento;
        }

        public String getSexo() {
            return Sexo;
        }

        public String getUsuario() {
            return Usuario;
        }

        public String getSenha() {
            return Senha;
        }

        public int getCodigo() {
            return Codigo;
        }
    }

    public class VendaDTO {
        private Double Total;
        private int NotaFiscal;

        public Double getTotal() {
            return Total;
        }

        public void setTotal(Double Total) {
            if (Total > 0) {
                this.Total = Total;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: O total deve ser maior do que zero.");
            }
        }
        
        public int getNotaFiscal() {
            return NotaFiscal;
        }

        public void setNotaFiscal(int NotaFiscal) {
            this.NotaFiscal = NotaFiscal;
        }
    }

    public class ProdutoDTO {
        //Produto
        private String Nome;
        private String Tamanho;
        private int Quantidade;
        private Double Preco;
        private int Codigo;
        

        public void setNome(String Nome) {
            if (!Nome.isEmpty()) {
                this.Nome = Nome;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique o nome do produto.");
            }
        }

        public void setCodigo(int Codigo) {
            if (!String.valueOf(Codigo).isEmpty()) {
                this.Codigo = Codigo;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique o código do produto.");
            }
        }

        public String getTamanho() {
            return Tamanho;
        }

        public void setTamanho(String Tamanho) {
            this.Tamanho = Tamanho;
        }

        public String getNome() {
            return Nome;
        }

        public Double getPreco() {
            return Preco;
        }

        public int getCodigo() {
            return Codigo;
        }

        

        public void setPreco(Double Preco) {
            if (Preco > 0) {
                this.Preco = Preco;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: O preço deve ser maior do que zero.");
            }
        }
        public int getQuantidade() {
            return Quantidade;
        }
        
        public void setQuantidade(int Quantidade) {
            if (Quantidade > 0) {
                this.Quantidade = Quantidade;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: A quantidade deve ser maior do que zero.");
            }
        }
    }

    public class ClienteDTO {
        //Cliente
        private String Nome;
        private String Telefone;
        private String CPF;
        private int idCliente;
        private String data_nascimento;
        private String Sexo;

        public String getNome() {
            return Nome;
        }

        public void setNome(String Nome) {
            if (Nome.equals("Insira o nome do cliente") || Nome.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique o nome do cliente.");
            } else {
                this.Nome = Nome;
            }
        }

        public String getTelefone() {
            return Telefone;
        }

        public void setTelefone(String Telefone){
            if (Telefone.equals("(  )      -    ")) {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique o número de telefone do cliente.");
            } else {
                this.Telefone = Telefone;
            }
        }

        public String getCPF() {           
            return CPF;    
        }

        public void setCPF(String CPF) {
            if (CPF.equals("   .   .   -  ")) {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique o CPF do cliente.");
            } else {
                this.CPF = CPF;
            }
        }

        public int getIdcliente() {
            return idCliente;
        }

        public void setIdcliente(int idCliente) {
            this.idCliente = idCliente;
        }

        public String getdata_nascimento() {
            return data_nascimento;
        }

        public void setData_nascimento(String data_nascimento) {
            if (data_nascimento.equals("  /  /  ")) {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique a data de nascimento do cliente.");
            } else {
                this.data_nascimento = data_nascimento;
            }
        }

        public String getSexo(){
            return Sexo;
        }

        public void setSexo(String Sexo) {
            if (Sexo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique o sexo do cliente.");
            } else {
                this.Sexo = Sexo;
            }
        }
    }
}
