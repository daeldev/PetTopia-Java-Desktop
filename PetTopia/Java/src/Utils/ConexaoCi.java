package Util;
import Utils.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class ConexaoCi {
    Connection conn;
    
    public int AdicionarFuncionario(DTO.FuncionarioDTO funcionarioDTO){
            conn = new ConexaoBD().ConectaBD();
            int generatedKey = -1;
            try {
                String sql = "INSERT INTO funcionario (Funcao, Nome, CPF, DataNascimento, Sexo, Usuario, Senha) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstm = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                pstm.setString(1, funcionarioDTO.getFuncao());
                pstm.setString(2, funcionarioDTO.getNome());
                pstm.setString(3, funcionarioDTO.getCPF());
                pstm.setString(4, funcionarioDTO.getDataNascimento());
                pstm.setString(5, funcionarioDTO.getSexo());
                pstm.setString(6, funcionarioDTO.getUsuario());
                pstm.setString(7, funcionarioDTO.getSenha());

                int rs = pstm.executeUpdate();

                ResultSet generatedKeys = pstm.getGeneratedKeys();
                if (generatedKeys.next()) {
                    funcionarioDTO.setCodigo(generatedKey = generatedKeys.getInt(1));
                }
                return rs;
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, erro.getMessage());
                return -1;
            }
    }
    
    public int AdicionarCliente(DTO.ClienteDTO clienteDTO){
            conn = new ConexaoBD().ConectaBD();
            int generatedKey = -1;
            try {
                String sql = "INSERT INTO cliente (Nome, CPF, Telefone, dataNascimento, Sexo) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement pstm = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                pstm.setString(1, clienteDTO.getNome());
                pstm.setString(2, clienteDTO.getCPF());
                pstm.setString(3, clienteDTO.getTelefone());    
                pstm.setString(4, clienteDTO.getdata_nascimento()); 
                pstm.setString(5, clienteDTO.getSexo()); 
                int rs = pstm.executeUpdate();
                ResultSet rsa = pstm.getGeneratedKeys();
                if (rsa.next()) {
                    clienteDTO.setIdcliente(generatedKey = rsa.getInt(1));   
                }  
                return rs;
            }catch (SQLException erro){
                JOptionPane.showMessageDialog(null, erro.getMessage());
                return -1;
            } 
     }
    
    public int AdicionarEstoque(DTO.ProdutoDTO produtoDTO){
        if (produtoDTO.getQuantidade() > 0){
            conn = new ConexaoBD().ConectaBD();
            int generatedKey = -1;
            try{
                String sql = "Insert into estoque (nome, Tamanho, Quantidade, Preco) Values (?, ?, ?, ?)";
                PreparedStatement pstm = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                pstm.setString(1, produtoDTO.getNome());
                pstm.setString(2, produtoDTO.getTamanho());
                pstm.setInt(3, produtoDTO.getQuantidade());
                pstm.setDouble(4, produtoDTO.getPreco());
                int rs = pstm.executeUpdate();
                ResultSet rsa = pstm.getGeneratedKeys();
                if (rsa.next()) {
                    produtoDTO.setCodigo(generatedKey = rsa.getInt(1));   
                }  
                return rs;
            }catch (SQLException erro){
                JOptionPane.showMessageDialog(null, erro.getMessage());
                return -1;
            } 
        }else{
            return -1;
        }
    }
    
    public int AdicionarVendas(DTO.VendaDTO vendaDTO){
        conn = new ConexaoBD().ConectaBD();   
        
        int generatedKey = -1;
        try{
            //Adiciona os daods ao banco
            
            String sql = "Insert into venda (Data, total) Values (?, ?)";
            PreparedStatement pstm = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            LocalDate dataAtual = LocalDate.now();
            pstm.setObject(1, dataAtual);
            pstm.setDouble(2, vendaDTO.getTotal());
            
            int vendas = pstm.executeUpdate();
            
            int notaFiscal = -1;
            ResultSet rsa = pstm.getGeneratedKeys();
                if (rsa.next()) {
                    vendaDTO.setNotaFiscal(generatedKey = rsa.getInt(1));   
                }
                
            return vendaDTO.getNotaFiscal(); 
            }catch (SQLException erro){
                JOptionPane.showMessageDialog(null, erro.getMessage());
                return -1;
            }  
    }
    
    public int AdicionarItens(DTO.ProdutoDTO produtoDTO, int NotaFiscal){
        conn = new ConexaoBD().ConectaBD();   
        DTO dto = new DTO();
        DTO.VendaDTO vendaDTO = dto.new VendaDTO();
        int generatedKey = -1;
        try{
            //Adiciona os dados ao banco 
            String sqlnotaFiscal = "Insert into itens (quantidade, Venda_notaFiscal, estoque_Codigo) Values (?, ?, ?)";
            PreparedStatement pstmnotaFiscal = conn.prepareStatement(sqlnotaFiscal);
            
            if (produtoDTO.getQuantidade() > 0){
                pstmnotaFiscal.setInt(1, produtoDTO.getQuantidade());
            }
            pstmnotaFiscal.setInt(2, NotaFiscal);
            pstmnotaFiscal.setInt(3, produtoDTO.getCodigo());
            
            int notaFiscal = pstmnotaFiscal.executeUpdate();
            
            return notaFiscal; 
            }catch (SQLException erro){
                JOptionPane.showMessageDialog(null, erro.getMessage());
                return -1;
            }  
    }
    
    public Boolean VerificarEstoque(DTO.ProdutoDTO produtoDTO){
        if (produtoDTO.getQuantidade() > 0){
            conn = new ConexaoBD().ConectaBD();       
            try{
                String sql = "Select nome, Tamanho, Quantidade, Preco from estoque where Codigo = ?";
                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setInt(1, produtoDTO.getCodigo());   

                ResultSet rs = pstm.executeQuery(); 
                if (rs.next()){
                    if (rs.getInt("Quantidade") >= produtoDTO.getQuantidade()){
                        produtoDTO.setNome(rs.getString("nome"));
                        produtoDTO.setTamanho(rs.getString("Tamanho"));
                        produtoDTO.setPreco(rs.getDouble("Preco"));       
                        return true;
                    }else{
                        JOptionPane.showMessageDialog(null, "ERRO: Quantidade indisponível no estoque."); 
                        return false;
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "ERRO: Produto inexistente."); 
                    return false;
                }   
            }catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, erro.getMessage());
                return false;
            }    
        }else{
            return false;
        }
    }
    
    public Boolean VerificarCliente(DTO.ClienteDTO clienteDTO){
        conn = new ConexaoBD().ConectaBD();       
        try{
            String sql = "SELECT * FROM cliente WHERE CPF = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, clienteDTO.getCPF());  
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){       
                return true;   
            }else{
                return false; 
            }
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            return false;
        }
    }
    public Boolean VerificarAtendente(DTO.FuncionarioDTO dadosDTO){
        conn = (Connection) new ConexaoBD().ConectaBD();       
        try{
            String sql = "SELECT usuario, senha FROM funcionario WHERE funcao =  'Atendente' and usuario =? and senha =?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, dadosDTO.getUsuario());
            pstm.setString(2, dadosDTO.getSenha()); 
            
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){       
                return true;   
            }else{
                return false; 
            }
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            return false;
        }
    }

    public Boolean VerificarAdministrador(DTO.FuncionarioDTO dadosDTO){
        conn = new ConexaoBD().ConectaBD();       
        try{
            String sql = "SELECT usuario, senha FROM funcionario WHERE funcao =  'Administrador' and usuario =? and senha =?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, dadosDTO.getUsuario());
            pstm.setString(2, dadosDTO.getSenha()); 
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){       
                return true;   
            }else{
                return false; 
            }
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            return false;
        }
    }

    public Boolean VerificarGerente(DTO.FuncionarioDTO dadosDTO){
        conn = new ConexaoBD().ConectaBD();       
        try{
            String sql = "SELECT usuario, senha FROM funcionario WHERE funcao =  'Gerente' and usuario =? and senha =?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, dadosDTO.getUsuario());
            pstm.setString(2, dadosDTO.getSenha()); 
            
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){       
                return true;   
            }else{
                return false; 
            }
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            return false;
        }
    }
}
