package View;

import Utils.FuncionarioDTO;
import View.Login;
import View.Clientes;
import View.WorkspaceFuncionario;
import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Aluno.Tarde
 */
public class WorkspaceFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaAtendenteNova
     */
    
    public void ExibirDados(FuncionarioDTO funcionarioDTO){
        jLNome.setText(funcionarioDTO.getNome_funcionario() + "!");
    }
    
    public WorkspaceFuncionario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WorkspaceAdministrador = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLFuncionariosAtivos2 = new javax.swing.JLabel();
        jLVisualizarFuncionarios2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLFuncionariosAtivos1 = new javax.swing.JLabel();
        jLVisualizarFuncionarios1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLFuncionariosAtivos = new javax.swing.JLabel();
        jLVisualizarFuncionarios = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JBFuncionarios = new javax.swing.JButton();
        JBClientes = new javax.swing.JButton();
        JBLogout = new javax.swing.JButton();
        jLNome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JBClientes1 = new javax.swing.JButton();
        JBClientes2 = new javax.swing.JButton();
        JBClientes3 = new javax.swing.JButton();
        JBFuncionarios1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Workspace");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Clientes cadastrados");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/8.2.png"))); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 56, -1, -1));

        jLFuncionariosAtivos2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLFuncionariosAtivos2.setForeground(new java.awt.Color(255, 255, 255));
        jLFuncionariosAtivos2.setText("632623532");
        jPanel5.add(jLFuncionariosAtivos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 20));

        jLVisualizarFuncionarios2.setForeground(new java.awt.Color(255, 255, 255));
        jLVisualizarFuncionarios2.setText("Visualizar");
        jPanel5.add(jLVisualizarFuncionarios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 60, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 70, 300, 160));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Funcionários cadastrados");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 170, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/8.2.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 56, -1, -1));

        jLFuncionariosAtivos1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLFuncionariosAtivos1.setForeground(new java.awt.Color(255, 255, 255));
        jLFuncionariosAtivos1.setText("632623532");
        jPanel4.add(jLFuncionariosAtivos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 20));

        jLVisualizarFuncionarios1.setForeground(new java.awt.Color(255, 255, 255));
        jLVisualizarFuncionarios1.setText("Visualizar");
        jPanel4.add(jLVisualizarFuncionarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 60, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 300, 160));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Funcionários ativos");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/8.2.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 56, -1, -1));

        jLFuncionariosAtivos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLFuncionariosAtivos.setForeground(new java.awt.Color(255, 255, 255));
        jLFuncionariosAtivos.setText("632623532");
        jPanel3.add(jLFuncionariosAtivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 20));

        jLVisualizarFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        jLVisualizarFuncionarios.setText("Visualizar");
        jPanel3.add(jLVisualizarFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 60, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 300, 160));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBFuncionarios.setBackground(new java.awt.Color(51, 51, 51));
        JBFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JBFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        JBFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/8.7.png"))); // NOI18N
        JBFuncionarios.setText("Denúncias");
        JBFuncionarios.setBorder(null);
        JBFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBFuncionariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBFuncionariosMouseExited(evt);
            }
        });
        JBFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFuncionariosActionPerformed(evt);
            }
        });
        jPanel2.add(JBFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 150, 270, 50));

        JBClientes.setBackground(new java.awt.Color(51, 51, 51));
        JBClientes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JBClientes.setForeground(new java.awt.Color(255, 255, 255));
        JBClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/8.7.png"))); // NOI18N
        JBClientes.setText("Adoções");
        JBClientes.setBorder(null);
        JBClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBClientesMouseExited(evt);
            }
        });
        JBClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClientesActionPerformed(evt);
            }
        });
        jPanel2.add(JBClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 500, 290, 50));

        JBLogout.setBackground(new java.awt.Color(51, 51, 51));
        JBLogout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JBLogout.setForeground(new java.awt.Color(255, 255, 255));
        JBLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/8.4.png"))); // NOI18N
        JBLogout.setText("Logout");
        JBLogout.setBorder(null);
        JBLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBLogoutMouseExited(evt);
            }
        });
        JBLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(JBLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 640, 320, 50));

        jLNome.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLNome.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 180, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seja bem-vindo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, 20));

        JBClientes1.setBackground(new java.awt.Color(51, 51, 51));
        JBClientes1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JBClientes1.setForeground(new java.awt.Color(255, 255, 255));
        JBClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/8.2.png"))); // NOI18N
        JBClientes1.setText("Clientes");
        JBClientes1.setBorder(null);
        JBClientes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBClientes1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBClientes1MouseExited(evt);
            }
        });
        JBClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClientes1ActionPerformed(evt);
            }
        });
        jPanel2.add(JBClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 290, 290, 50));

        JBClientes2.setBackground(new java.awt.Color(51, 51, 51));
        JBClientes2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JBClientes2.setForeground(new java.awt.Color(255, 255, 255));
        JBClientes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/8.7.png"))); // NOI18N
        JBClientes2.setText("Animais");
        JBClientes2.setBorder(null);
        JBClientes2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBClientes2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBClientes2MouseExited(evt);
            }
        });
        JBClientes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClientes2ActionPerformed(evt);
            }
        });
        jPanel2.add(JBClientes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 360, 300, 50));

        JBClientes3.setBackground(new java.awt.Color(51, 51, 51));
        JBClientes3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JBClientes3.setForeground(new java.awt.Color(255, 255, 255));
        JBClientes3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/8.7.png"))); // NOI18N
        JBClientes3.setText("Doações");
        JBClientes3.setBorder(null);
        JBClientes3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBClientes3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBClientes3MouseExited(evt);
            }
        });
        JBClientes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClientes3ActionPerformed(evt);
            }
        });
        jPanel2.add(JBClientes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 430, 300, 50));

        JBFuncionarios1.setBackground(new java.awt.Color(51, 51, 51));
        JBFuncionarios1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JBFuncionarios1.setForeground(new java.awt.Color(255, 255, 255));
        JBFuncionarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/8.7.png"))); // NOI18N
        JBFuncionarios1.setText("Consultas");
        JBFuncionarios1.setBorder(null);
        JBFuncionarios1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBFuncionarios1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBFuncionarios1MouseExited(evt);
            }
        });
        JBFuncionarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFuncionarios1ActionPerformed(evt);
            }
        });
        jPanel2.add(JBFuncionarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 220, 280, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 770));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/9.1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        WorkspaceAdministrador.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout WorkspaceAdministradorLayout = new javax.swing.GroupLayout(WorkspaceAdministrador);
        WorkspaceAdministrador.setLayout(WorkspaceAdministradorLayout);
        WorkspaceAdministradorLayout.setHorizontalGroup(
            WorkspaceAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        WorkspaceAdministradorLayout.setVerticalGroup(
            WorkspaceAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WorkspaceAdministrador)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WorkspaceAdministrador)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClientesActionPerformed
        // TODO add your handling code here:
        Clientes CadastrarClientes = new Clientes();
        WorkspaceAdministrador.add(CadastrarClientes);     
        CadastrarClientes.setVisible(true); 
        CadastrarClientes.setBounds(247, -30, 1035, 1000);
    }//GEN-LAST:event_JBClientesActionPerformed

    private void JBLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLogoutActionPerformed
        // TODO add your handling code here:
        int Option = JOptionPane.showConfirmDialog(null,"Você tem Certeza?","Atenção", JOptionPane.YES_NO_OPTION);
        if(Option == JOptionPane.YES_OPTION){
            Login Logout = new Login();
            this.dispose();
            Logout.setVisible(true);
        }
    }//GEN-LAST:event_JBLogoutActionPerformed

    private void JBFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFuncionariosActionPerformed
        // TODO add your handling code here:
        Funcionarios GerenciarFuncionários;
        GerenciarFuncionários = new Funcionarios();
        WorkspaceAdministrador.add(GerenciarFuncionários);
        GerenciarFuncionários.setVisible(true);
        GerenciarFuncionários.setBounds(247, -30, 1035, 1000);
    }//GEN-LAST:event_JBFuncionariosActionPerformed

    private void JBFuncionariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBFuncionariosMouseEntered
        // TODO add your handling code here:
        JBFuncionarios.setBackground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_JBFuncionariosMouseEntered

    private void JBFuncionariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBFuncionariosMouseExited
        // TODO add your handling code here:
        JBFuncionarios.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_JBFuncionariosMouseExited

    private void JBClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBClientesMouseEntered
        // TODO add your handling code here:
        JBClientes.setBackground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_JBClientesMouseEntered

    private void JBClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBClientesMouseExited
        // TODO add your handling code here:
        JBClientes.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_JBClientesMouseExited

    private void JBLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBLogoutMouseEntered
        // TODO add your handling code here:
        JBLogout.setBackground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_JBLogoutMouseEntered

    private void JBLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBLogoutMouseExited
        // TODO add your handling code here:
        JBLogout.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_JBLogoutMouseExited

    private void JBClientes1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBClientes1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JBClientes1MouseEntered

    private void JBClientes1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBClientes1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_JBClientes1MouseExited

    private void JBClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClientes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBClientes1ActionPerformed

    private void JBClientes2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBClientes2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JBClientes2MouseEntered

    private void JBClientes2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBClientes2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_JBClientes2MouseExited

    private void JBClientes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClientes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBClientes2ActionPerformed

    private void JBClientes3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBClientes3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JBClientes3MouseEntered

    private void JBClientes3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBClientes3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_JBClientes3MouseExited

    private void JBClientes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClientes3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBClientes3ActionPerformed

    private void JBFuncionarios1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBFuncionarios1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JBFuncionarios1MouseEntered

    private void JBFuncionarios1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBFuncionarios1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_JBFuncionarios1MouseExited

    private void JBFuncionarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFuncionarios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBFuncionarios1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WorkspaceFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkspaceFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkspaceFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkspaceFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkspaceFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBClientes;
    private javax.swing.JButton JBClientes1;
    private javax.swing.JButton JBClientes2;
    private javax.swing.JButton JBClientes3;
    private javax.swing.JButton JBFuncionarios;
    private javax.swing.JButton JBFuncionarios1;
    private javax.swing.JButton JBLogout;
    public static javax.swing.JDesktopPane WorkspaceAdministrador;
    private javax.swing.JLabel jLFuncionariosAtivos;
    private javax.swing.JLabel jLFuncionariosAtivos1;
    private javax.swing.JLabel jLFuncionariosAtivos2;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLVisualizarFuncionarios;
    private javax.swing.JLabel jLVisualizarFuncionarios1;
    private javax.swing.JLabel jLVisualizarFuncionarios2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
