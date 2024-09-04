package View;
import View.Estoque;
import static View.WorkspaceAtendente.WorkspaceAtendente;
import Util.ConexaoCi;
import Util.DTO;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class DadosCliente extends javax.swing.JInternalFrame {

    
    public DadosCliente() {
        initComponents();
          
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CorrigeBug = new javax.swing.JTextField();
        Atendente = new javax.swing.JLabel();
        JTNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTProsseguir = new javax.swing.JButton();
        JTTelefone = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTCPF = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setTitle("Dados");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(246, 242, 242));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CorrigeBug.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        CorrigeBug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrigeBugActionPerformed(evt);
            }
        });
        jPanel1.add(CorrigeBug, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 10, 0, 0));

        Atendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/3.1.png"))); // NOI18N
        jPanel1.add(Atendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        JTNome.setBackground(new java.awt.Color(246, 242, 242));
        JTNome.setForeground(new java.awt.Color(204, 204, 204));
        JTNome.setText("Insira o nome do cliente");
        JTNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));
        JTNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTNomeMousePressed(evt);
            }
        });
        JTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNomeActionPerformed(evt);
            }
        });
        jPanel1.add(JTNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 330, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Telefone");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));

        JTProsseguir.setBackground(new java.awt.Color(51, 153, 255));
        JTProsseguir.setForeground(new java.awt.Color(255, 255, 255));
        JTProsseguir.setText("Prosseguir");
        JTProsseguir.setBorder(null);
        JTProsseguir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTProsseguirFocusGained(evt);
            }
        });
        JTProsseguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTProsseguirMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JTProsseguirMouseReleased(evt);
            }
        });
        JTProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTProsseguirActionPerformed(evt);
            }
        });
        jPanel1.add(JTProsseguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 435, 330, 40));

        JTTelefone.setBackground(new java.awt.Color(246, 242, 242));
        JTTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        JTTelefone.setForeground(new java.awt.Color(204, 204, 204));
        try {
            JTTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTTelefone.setToolTipText("");
        JTTelefone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTTelefoneMousePressed(evt);
            }
        });
        JTTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(JTTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 330, 30));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Venda");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 50));

        pc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1.png"))); // NOI18N
        jPanel3.add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 6, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Insira os dados da venda");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 57, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 420, -1));

        JTCPF.setBackground(new java.awt.Color(246, 242, 242));
        JTCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        JTCPF.setForeground(new java.awt.Color(204, 204, 204));
        try {
            JTCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTCPF.setToolTipText("");
        JTCPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTCPFMousePressed(evt);
            }
        });
        jPanel1.add(JTCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 330, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("CPF");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 410, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTProsseguirActionPerformed
        DTO dto = new DTO();
        DTO.ClienteDTO clienteDTO = dto.new ClienteDTO();
        
        String Nome = JTNome.getText().toString();
        String Telefone = JTTelefone.getText().toString();
        String CPF = JTCPF.getText().toString();
        
        clienteDTO.setNome(Nome);
        clienteDTO.setTelefone(Telefone);
        clienteDTO.setCPF(JTCPF.getText());       

        if (!CPF.equals("   .   .   -  ") && !Telefone.equals("(  )      -    ") && !Nome.equals("Insira o nome do cliente") && !Nome.isEmpty()){
            ConexaoCi clienteDAO = new ConexaoCi();
            
            if (clienteDAO.VerificarCliente(clienteDTO)){
            Caixa Carrinho = new Caixa();
            WorkspaceAtendente.add(Carrinho);
            Carrinho.setVisible(true);
            Carrinho.setBounds(247, 97, 1036, 657);
            dispose();
            }
            if (!clienteDAO.VerificarCliente(clienteDTO)){
                int Option = JOptionPane.showConfirmDialog(null,"Deseja cadastrar o cliente?","Atenção", JOptionPane.YES_NO_OPTION);
                if(Option == JOptionPane.YES_OPTION){
                    Clientes clientes = new Clientes();
                    WorkspaceAtendente.add(clientes);
                    clientes.setVisible(true);
                    clientes.setBounds(247, 97, 1036, 657);
                    dispose();             
                }

                if(Option == JOptionPane.NO_OPTION){
                    Caixa carrinho = new Caixa();
                    WorkspaceAtendente.add(carrinho);
                    carrinho.setVisible(true);
                    carrinho.setBounds(247, 97, 1036, 657);
                    dispose();
                }
            }             
        }
    }//GEN-LAST:event_JTProsseguirActionPerformed

    private void JTNomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTNomeMousePressed
        // TODO add your handling code here:
        if (JTNome.getText().equals("Insira o nome do cliente")){
            JTNome.setText("");
            JTNome.setForeground(Color.black);
        }   
        if (JTCPF.getText().isEmpty()){
            JTCPF.setText("   .   .   -  ");
            JTCPF.setForeground(Color.gray);
        }
        if (JTTelefone.getText().isEmpty()){
            JTTelefone.setText("(  )      -    ");
            JTTelefone.setForeground(Color.gray);
        }
    }//GEN-LAST:event_JTNomeMousePressed

    private void JTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNomeActionPerformed

    private void JTProsseguirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTProsseguirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JTProsseguirMouseClicked

    private void JTTelefoneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTTelefoneMousePressed
        // TODO add your handling code here:
        if (JTTelefone.getText().equals("(  )      -    ")){
            JTTelefone.setText("");
            JTTelefone.setForeground(Color.black);
        }   
        if (JTNome.getText().isEmpty()){
            JTNome.setText("Insira o nome do cliente");
            JTNome.setForeground(Color.gray);
        }
        if (JTCPF.getText().isEmpty()){
            JTCPF.setText("   .   .   -  ");
            JTCPF.setForeground(Color.gray);
        }
    }//GEN-LAST:event_JTTelefoneMousePressed

    private void JTProsseguirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTProsseguirMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JTProsseguirMouseReleased

    private void CorrigeBugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrigeBugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorrigeBugActionPerformed

    private void JTProsseguirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTProsseguirFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_JTProsseguirFocusGained

    private void JTCPFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTCPFMousePressed
        // TODO add your handling code here:
        if (JTCPF.getText().equals("   .   .   -  ")){
            JTCPF.setText("");
            JTCPF.setForeground(Color.black);
        }   
        if (JTNome.getText().isEmpty()){
            JTNome.setText("Insira o nome do cliente");
            JTNome.setForeground(Color.gray);
        }
        if (JTTelefone.getText().isEmpty()){
            JTTelefone.setText("(  )      -    ");
            JTTelefone.setForeground(Color.gray);
        }
    }//GEN-LAST:event_JTCPFMousePressed

    private void JTTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTTelefoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atendente;
    private javax.swing.JTextField CorrigeBug;
    private javax.swing.JFormattedTextField JTCPF;
    private javax.swing.JTextField JTNome;
    private javax.swing.JButton JTProsseguir;
    private javax.swing.JFormattedTextField JTTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel pc;
    // End of variables declaration//GEN-END:variables
}
