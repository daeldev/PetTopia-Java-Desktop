    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package Utils;

    import java.time.LocalDate;
    import javax.swing.JOptionPane;

    /**
     *
     * @author Oliveira
     */
    public class FuncionarioDTO {
        private int id_funcionario;
        private String nome_funcionario;
        private String cpf_funcionario;
        private String dataNascimento;
        private String generoFuncionario;
        private String email;
        private String passwordFuncionario;
        private String data_emissao;
        private String tipoFuncionario;

        public FuncionarioDTO(String email, String passwordFuncionario) {
            this.email = email;
            this.passwordFuncionario = passwordFuncionario;
        }

        public FuncionarioDTO(){

        }

        Validador validador = new Validador();
        public int getId_funcionario() {
            return id_funcionario;
        }

        public void setId_funcionario(int id_funcionario) {
            this.id_funcionario = id_funcionario;
        }

        public String getNome_funcionario() {
            return nome_funcionario;
        }

        public void setNome_funcionario(String nome_funcionario) {
            // Expressão regular para verificar se o nome_funcionario contém apenas letras e espaços
    //        String nome_funcionarioRegex = "^[a-zA-ZÀ-ÿ\\s]+$"; 

    //        if (nome_funcionario != null && nome_funcionario.trim().matches(nome_funcionarioRegex) && nome_funcionario.length() >= 2) {
                this.nome_funcionario = nome_funcionario.trim(); // Remove espaços extras no início ou fim
    //        } else {
    //            JOptionPane.showMessageDialog(null, "ERRO: Verifique o nome_funcionario do funcionário. O nome_funcionario deve conter apenas letras e ter ao menos 2 caracteres.");
    //        }
        }

        public String getCpf_funcionario() {
            return cpf_funcionario;
        }

        public void setCpf_funcionario(String cpf_funcionario) {
    //        if (cpf_funcionario != null && cpf_funcionario.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
    //            if (validador.validarCpf(cpf_funcionario)){
                    this.cpf_funcionario = cpf_funcionario;
    //            }
    //        } else {
    //            JOptionPane.showMessageDialog(null, "ERRO: Verifique o CPF do funcionário. O CPF deve estar no formato XXX.XXX.XXX-XX.");
    //        }
        }

        public String getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(String dataNascimento) {
    //        if (validador.validarData(dataNascimento)) {
                this.dataNascimento = dataNascimento;
    //        } else {
    //            JOptionPane.showMessageDialog(null, "ERRO: Verifique a data de nascimento do funcionário.");
    //        }
        }

        public String getGeneroFuncionario() {
            return generoFuncionario;
        }

        public void setGeneroFuncionario(String generoFuncionario) {
            this.generoFuncionario = generoFuncionario;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
    //        if (email != null && email.trim().matches(email)) {
                this.email = email.trim();
    //        } else {
    //            JOptionPane.showMessageDialog(null, "ERRO: Verifique o email do funcionário.");
    //        }
        }

        public String getPasswordFuncionario() {
            return passwordFuncionario;
        }

        public void setPasswordFuncionario(String passwordFuncionario) {
            if (!passwordFuncionario.isEmpty()) {
                this.passwordFuncionario = passwordFuncionario;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique a senha do funcionário.");
            }
        }

        public String getData_emissao() {
            return data_emissao;
        }

        public void setData_emissao(String data_emissao) {
            this.data_emissao = data_emissao;
        }

        public String getTipoFuncionario() {
            return tipoFuncionario;
        }

        public void setTipoFuncionario(String tipoFuncionario) {
            if (!tipoFuncionario.isEmpty()) {
                this.tipoFuncionario = tipoFuncionario;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Verifique a função do funcionário.");
            }
        }
    }
