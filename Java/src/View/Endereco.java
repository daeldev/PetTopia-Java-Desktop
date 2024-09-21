package View;
import View.Estoque;
//import static View.WorkspaceFuncionario.WorkspaceAtendente;
import Utils.ConexaoCi;
import Utils.DTO;
import Utils.DenunciaDTO;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;



public class Endereco extends javax.swing.JInternalFrame {

    
    private JDesktopPane workspaceFuncionario; // ou o tipo correto

    public Endereco(JDesktopPane workspaceFuncionario) {
        initComponents();
        this.workspaceFuncionario = workspaceFuncionario; // Armazena a referência
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CorrigeBug = new javax.swing.JTextField();
        Atendente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBProsseguir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTRua = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTNome2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTBairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCUf = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTComplemento = new javax.swing.JTextField();
        jTCep1 = new javax.swing.JFormattedTextField();

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Complemento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 20));

        jBProsseguir.setBackground(new java.awt.Color(51, 153, 255));
        jBProsseguir.setForeground(new java.awt.Color(255, 255, 255));
        jBProsseguir.setText("Prosseguir");
        jBProsseguir.setBorder(null);
        jBProsseguir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jBProsseguirFocusGained(evt);
            }
        });
        jBProsseguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBProsseguirMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBProsseguirMouseReleased(evt);
            }
        });
        jBProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProsseguirActionPerformed(evt);
            }
        });
        jPanel1.add(jBProsseguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 360, 40));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Denúncia");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        pc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1.png"))); // NOI18N
        jPanel3.add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Insira o endereço da denúncia");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 920, 90));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Cep");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jTRua.setBackground(new java.awt.Color(246, 242, 242));
        jTRua.setForeground(new java.awt.Color(204, 204, 204));
        jTRua.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));
        jTRua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTRuaMousePressed(evt);
            }
        });
        jTRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTRuaActionPerformed(evt);
            }
        });
        jPanel1.add(jTRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 330, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("UF:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, 20));

        JTNome2.setBackground(new java.awt.Color(246, 242, 242));
        JTNome2.setForeground(new java.awt.Color(204, 204, 204));
        JTNome2.setText("Insira o nome do cliente");
        JTNome2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));
        JTNome2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTNome2MousePressed(evt);
            }
        });
        JTNome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNome2ActionPerformed(evt);
            }
        });
        jPanel1.add(JTNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 330, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Rua");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));

        jTBairro.setBackground(new java.awt.Color(246, 242, 242));
        jTBairro.setForeground(new java.awt.Color(204, 204, 204));
        jTBairro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));
        jTBairro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTBairroMousePressed(evt);
            }
        });
        jTBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBairroActionPerformed(evt);
            }
        });
        jPanel1.add(jTBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 330, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Bairro");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, 20));

        jCUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RJ", "ES", "SP" }));
        jPanel1.add(jCUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Rua");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));

        jTComplemento.setBackground(new java.awt.Color(246, 242, 242));
        jTComplemento.setForeground(new java.awt.Color(204, 204, 204));
        jTComplemento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));
        jTComplemento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTComplementoMousePressed(evt);
            }
        });
        jTComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTComplementoActionPerformed(evt);
            }
        });
        jPanel1.add(jTComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 330, 30));

        jTCep1.setBackground(new java.awt.Color(246, 242, 242));
        jTCep1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTCep1.setForeground(new java.awt.Color(204, 204, 204));
        try {
            jTCep1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTCep1.setToolTipText("");
        jTCep1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTCep1MousePressed(evt);
            }
        });
        jPanel1.add(jTCep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 400, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProsseguirActionPerformed
        DenunciaDTO denunciaDTO = new DenunciaDTO();
        denunciaDTO.setCep(jTCep1.getText());
        denunciaDTO.setRua(jTRua.getText());
        denunciaDTO.setComplemento(jTComplemento.getText());
        denunciaDTO.setBairro(jTBairro.getText());
        denunciaDTO.setUf(jCUf.getSelectedItem().toString()); 
        
        // Exibir a tela de denúncia antes de fechar a atual
        Denuncias denuncias = new Denuncias(denunciaDTO);    
        workspaceFuncionario.add(denuncias);
        denuncias.setVisible(true);
        denuncias.setBounds(247, -30, 1035, 1000);
        
        // Fechar a tela de endereço
        this.dispose(); 
    }//GEN-LAST:event_jBProsseguirActionPerformed

    private void JTnomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTnomeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTnomeMousePressed

    private void JTnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTnomeActionPerformed

    private void jBProsseguirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProsseguirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBProsseguirMouseClicked

    private void jBProsseguirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProsseguirMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBProsseguirMouseReleased

    private void CorrigeBugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrigeBugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorrigeBugActionPerformed

    private void jBProsseguirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBProsseguirFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jBProsseguirFocusGained

    private void JTcpfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTcpfMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTcpfMousePressed

    private void jTRuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTRuaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTRuaMousePressed

    private void jTRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTRuaActionPerformed

    private void JTNome2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTNome2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNome2MousePressed

    private void JTNome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNome2ActionPerformed

    private void jTBairroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBairroMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBairroMousePressed

    private void jTBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBairroActionPerformed

    private void jTComplementoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTComplementoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTComplementoMousePressed

    private void jTComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTComplementoActionPerformed

    private void jTCep1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCep1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCep1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atendente;
    private javax.swing.JTextField CorrigeBug;
    private javax.swing.JTextField JTNome2;
    private javax.swing.JButton jBProsseguir;
    private javax.swing.JComboBox<String> jCUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JFormattedTextField jTCep1;
    private javax.swing.JTextField jTComplemento;
    private javax.swing.JTextField jTRua;
    private javax.swing.JLabel pc;
    // End of variables declaration//GEN-END:variables
}
