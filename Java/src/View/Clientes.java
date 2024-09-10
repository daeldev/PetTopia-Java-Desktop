package View;


import Utils.ConexaoCi;
import Utils.DTO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Clientes extends javax.swing.JInternalFrame { 
    
    
    public Clientes() { 
     
     initComponents();
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        JTTelefone = new javax.swing.JFormattedTextField();
        JTnome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JTcpf = new javax.swing.JFormattedTextField();
        JBAdicionar = new javax.swing.JButton();
        JBAtualizar = new javax.swing.JButton();
        JBRemover = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JCBgenero = new javax.swing.JComboBox<>();
        JTDataNasc = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setTitle("Cadastro");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1030, 670));
        jPanel1.setMinimumSize(new java.awt.Dimension(1030, 670));
        jPanel1.setPreferredSize(new java.awt.Dimension(10, 670));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jPanel1VetoableChange(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTClientes.setBackground(new java.awt.Color(246, 242, 242));
        JTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "nome", "cpf", "Telefone", "Data de Nascimento", "genero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTClientesMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JTClientesMouseReleased(evt);
            }
        });
        JTClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTClientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JTClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 570, 530));

        jPanel2.setBackground(new java.awt.Color(246, 242, 242));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        try {
            JTTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(JTTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 120, -1));

        JTnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTnomeActionPerformed(evt);
            }
        });
        jPanel2.add(JTnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 200, -1));

        jLabel8.setText("Telefone:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel9.setText("cpf:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel10.setText("nome:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        try {
            JTcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTcpfActionPerformed(evt);
            }
        });
        jPanel2.add(JTcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 120, -1));

        JBAdicionar.setBackground(new java.awt.Color(51, 102, 255));
        JBAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        JBAdicionar.setText("Adicionar");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(JBAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 110, 50));

        JBAtualizar.setBackground(new java.awt.Color(51, 102, 255));
        JBAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        JBAtualizar.setText("Atualizar");
        JBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtualizarActionPerformed(evt);
            }
        });
        jPanel2.add(JBAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 110, 50));

        JBRemover.setBackground(new java.awt.Color(255, 0, 51));
        JBRemover.setForeground(new java.awt.Color(255, 255, 255));
        JBRemover.setText("Remover");
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });
        jPanel2.add(JBRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 110, 50));

        jLabel2.setText("genero:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        JCBgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outros" }));
        jPanel2.add(JCBgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 100, -1));

        try {
            JTDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(JTDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 90, -1));

        jLabel1.setText("Data de nascimento:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 410, 360));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setText("Clientes");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setText("Dados do cliente");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1036, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
    
           //Adiciona os dados ao banco de dados
        
        //Instância a classe DTO
        DTO dto = new DTO();
        
        //Intância a classe FuncionarioDTO de DTO
        DTO.ClienteDTO clienteDTO = dto.new ClienteDTO();
        
        //Seta os dados fornecidos para o FuncionarioDTO
        clienteDTO.setnome(JTnome.getText());       
        clienteDTO.setcpf(JTcpf.getText());
        clienteDTO.setTelefone(JTTelefone.getText());
        clienteDTO.setData_nascimento(JTDataNasc.getText());
        clienteDTO.setgenero(JCBgenero.getSelectedItem().toString());
        
        //Instância a classe ConexaoCi
        ConexaoCi clienteDAO = new ConexaoCi();
        
        //Executa o insert dos dados setados na classe funcionarioDTO ao banco de dados através do funcionarioDAO
        int Resultado = clienteDAO.AdicionarCliente(clienteDTO);

        //Verifica se o cadastro foi efetuado com sucesso.
        if(Resultado != -1){
            //Grava os dados setados na classe funcionarioDTO para a tabela de cadastros através de um vetor
            DefaultTableModel Tabela = (DefaultTableModel) JTClientes.getModel();
            Object[] dados = {clienteDTO.getIdcliente(), clienteDTO.getnome(), clienteDTO.getcpf(), clienteDTO.getTelefone(), clienteDTO.getdata_nascimento(), clienteDTO.getgenero()};
            Tabela.addRow(dados);
        }                                             
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed

if(JTClientes.getSelectedRow() != -1){
        
        DefaultTableModel modelop = (DefaultTableModel) JTClientes.getModel();
        modelop.removeRow(JTClientes.getSelectedRow());    
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }    
    }//GEN-LAST:event_JBRemoverActionPerformed

    private void JTClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTClientesMouseClicked

//         if(JTTabela.getSelectedRow() != -1){
//             
//             JTidFuncionario.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 0).toString());
//             JTnome.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 1).toString());
//             JTcpf.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 2).toString());           
//             JTTelefone.setText(JTTabela.getValueAt(JTTabela.getSelectedRow(), 3).toString());
//         }

    }//GEN-LAST:event_JTClientesMouseClicked

    private void JTClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTClientesKeyReleased

    }//GEN-LAST:event_JTClientesKeyReleased

    private void JBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarActionPerformed
               if(JTClientes.getSelectedRow() != -1){                       
                JTClientes.setValueAt(JTnome.getText(), JTClientes.getSelectedRow(), 1);   
                 JTClientes.setValueAt(JTcpf.getText(), JTClientes.getSelectedRow(), 2);
                 JTClientes.setValueAt(JCBgenero.getSelectedItem(), JTClientes.getSelectedRow(), 5);
                 JTClientes.setValueAt(JTTelefone.getText(), JTClientes.getSelectedRow(), 3);
                 JTClientes.setValueAt(JTDataNasc.getText(),JTClientes.getSelectedRow(),4);           
        }else{
             JOptionPane.showMessageDialog(null, "Selecione uma linha para atualizar");
          }              
    }//GEN-LAST:event_JBAtualizarActionPerformed

    private void JTClientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTClientesMouseReleased
        // TODO add your handling code here:
   
    }//GEN-LAST:event_JTClientesMouseReleased

    private void jPanel1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jPanel1VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1VetoableChange

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
//        // TODO add your handling code here:
//        if (evt.isPopupTrigger()){
//            jPopupMenu2.show(this, evt.getX(), evt.getY());
//        }
    }//GEN-LAST:event_jPanel1MouseReleased

    private void JTTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTTelefoneActionPerformed

    private void JTcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTcpfActionPerformed

    private void JTnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTnomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBAtualizar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JComboBox<String> JCBgenero;
    private javax.swing.JFormattedTextField JTcpf;
    private static javax.swing.JTable JTClientes;
    private javax.swing.JFormattedTextField JTDataNasc;
    private javax.swing.JTextField JTnome;
    private javax.swing.JFormattedTextField JTTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
