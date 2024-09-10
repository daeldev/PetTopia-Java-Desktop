/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno.Tarde
 */
public class DTO {
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
        private String nome;
        private String Tamanho;
        private int Quantidade;
        private Double Preco;
        private int idFuncionario;
        

        public void setnome(String nome) {
            if (!nome.isEmpty()) {
                this.nome = nome;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique o nome do produto.");
            }
        }

        public void setidFuncionario(int idFuncionario) {
            if (!String.valueOf(idFuncionario).isEmpty()) {
                this.idFuncionario = idFuncionario;
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

        public String getnome() {
            return nome;
        }

        public Double getPreco() {
            return Preco;
        }

        public int getidFuncionario() {
            return idFuncionario;
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
        private String nome;
        private String Telefone;
        private String cpf;
        private int idCliente;
        private String data_nascimento;
        private String genero;

        public String getnome() {
            return nome;
        }

        public void setnome(String nome) {
            if (nome.equals("Insira o nome do cliente") || nome.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique o nome do cliente.");
            } else {
                this.nome = nome;
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

        public String getcpf() {           
            return cpf;    
        }

        public void setcpf(String cpf) {
            if (cpf.equals("   .   .   -  ")) {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique o cpf do cliente.");
            } else {
                this.cpf = cpf;
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

        public String getgenero(){
            return genero;
        }

        public void setgenero(String genero) {
            if (genero.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique o genero do cliente.");
            } else {
                this.genero = genero;
            }
        }
    }
}
