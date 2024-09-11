package View;
import Utils.ConexaoCi;
import Utils.DTO;
import Utils.FuncionarioDTO;
import Utils.HttpConnection;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CorrigeOTracoNoInicio = new javax.swing.JTextField();
        Atendente = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTemail = new javax.swing.JTextField();
        jTpassword = new javax.swing.JPasswordField();
        jCMostrarpassword = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jBLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 242, 242));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CorrigeOTracoNoInicio.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        CorrigeOTracoNoInicio.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(CorrigeOTracoNoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1284, 0, 0, 0));

        Atendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/3.1.png"))); // NOI18N
        jPanel2.add(Atendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Bem-vindo!");

        pc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Efetue o seu login.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(pc)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pc))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 100));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jTemail.setBackground(new java.awt.Color(246, 242, 242));
        jTemail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTemail.setForeground(new java.awt.Color(204, 204, 204));
        jTemail.setText("Insira o seu nome de usuário");
        jTemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 51)));
        jTemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTemailMousePressed(evt);
            }
        });
        jTemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTemailActionPerformed(evt);
            }
        });
        jPanel2.add(jTemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 334, 30));

        jTpassword.setBackground(new java.awt.Color(246, 242, 242));
        jTpassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTpassword.setForeground(new java.awt.Color(204, 204, 204));
        jTpassword.setText("@abcdefghijk");
        jTpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTpassword.setEchoChar('\u25cf');
        jTpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTpasswordMousePressed(evt);
            }
        });
        jTpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(jTpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 331, 30));

        jCMostrarpassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCMostrarpassword.setText("Mostrar password");
        jCMostrarpassword.setBorder(null);
        jCMostrarpassword.setFocusable(false);
        jCMostrarpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMostrarpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(jCMostrarpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jBLogin.setBackground(new java.awt.Color(51, 153, 255));
        jBLogin.setForeground(new java.awt.Color(255, 255, 255));
        jBLogin.setText("Login");
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });
        jPanel2.add(jBLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 330, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Usuário");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 400, 420));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/2.2.png"))); // NOI18N
        jPanel1.add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTemailActionPerformed

    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed
        //Código 1
//        //Armazena os dados dos textfields
//        String email = jTemail.getText();
//        String password = String.valueOf(jTpassword.getPassword());
//        
//        //Envia os dados para o funcionarioDTO
//        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
//        funcionarioDTO.setEmail(email);
//        funcionarioDTO.setPassword(password);
//        
//        //Instacia o httpConnection
//        HttpConnection httpConnection = new HttpConnection();
//        //Envia o funcionarioDTO para o método login do httpConnection, retornando a resposta que vai conter o tipo de funcionário
//        funcionarioDTO = httpConnection.login(funcionarioDTO);
//        //Verifica se o funcionarioDTO retornado não é nulo
//        if (funcionarioDTO != null) {
//            //Verifica se o tipo de funcionário e exibi a workspace correspondente
//            if(funcionarioDTO.getTipo().equals("ADMINISTRADOR")){
//                WorkspaceAdministrador workspaceAdministrador = new WorkspaceAdministrador();
//                workspaceAdministrador.setVisible(true);
//                dispose();
//            }
//            if(funcionarioDTO.getTipo().equals("FUNCIONARIO")){
//                WorkspaceFuncionario workspaceFuncionario = new WorkspaceFuncionario();
//                workspaceFuncionario.setVisible(true);
//                dispose();
//            }
//            if(funcionarioDTO.getTipo().equals("VETERINARIO")){
//                WorkspaceVeterinario workspaceVeterinario = new WorkspaceVeterinario();
//                workspaceVeterinario.setVisible(true);
//                dispose();
//            }
//        //Caso o funcionarioDTO seja nulo, exibi no console, lança um JOptionPane e reseta os textfields
//        }else{
//           System.out.print("funcionarioDTO nulo");
//           JOptionPane.showMessageDialog(null, "Email ou password incorreto! Por favor tente novamente.");
//           jTemail.setText("Insira o seu nome de usuário");
//           jTpassword.setText("@abcdefghijk");
//           jTpassword.setEchoChar('\u25cf');
//           jTpassword.setForeground(Color.gray);
//           jCMostrarpassword.setSelected(false);           
//        }

        String email = jTemail.getText();
        String senha = new String(jTpassword.getPassword());

        // Cria um DTO para enviar as credenciais
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        funcionarioDTO.setEmail(email);
        funcionarioDTO.setPassword(senha);

        // Instancia o cliente de login
        HttpConnection loginClient = new HttpConnection();

        // Chama o método de login
        FuncionarioDTO response = loginClient.sendLoginRequest(funcionarioDTO);
        
        if (response != null) {
            String tipo = response.getTipo();
//            Verifica se o tipo de funcionário e exibi a workspace correspondente
            switch (tipo) {
            case "ADMINISTRADOR":
                WorkspaceAdministrador workspaceAdministrador = new WorkspaceAdministrador();
                workspaceAdministrador.setVisible(true);
                dispose();
                break;
            case "VETERINARIO":
                WorkspaceVeterinario workspaceVeterinario = new WorkspaceVeterinario();
                workspaceVeterinario.setVisible(true);
                dispose();
                break;
            case "FUNCIONARIO":
                WorkspaceFuncionario workspaceFuncionario = new WorkspaceFuncionario();
                workspaceFuncionario.setVisible(true);
                dispose();
                break;
            default:
                System.out.println("Tipo de funcionário desconhecido.");
                break;
            }
        } else {
            System.out.print(response);
            JOptionPane.showMessageDialog(null, "Email ou password incorreto! Por favor tente novamente.");
            jTemail.setText("Insira o seu nome de usuário");
            jTpassword.setText("@abcdefghijk");
            jTpassword.setEchoChar('\u25cf');
            jTpassword.setForeground(Color.gray);
            jCMostrarpassword.setSelected(false);   
        }
    }//GEN-LAST:event_jBLoginActionPerformed
    
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void jTpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpasswordActionPerformed

    private void jTemailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTemailMousePressed
        // TODO add your handling code here:
        if (jTemail.getText().equals("Insira o seu nome de usuário")){
            jTemail.setText("");
            jTemail.setForeground(Color.black);
        }
        if (String.valueOf(jTpassword.getPassword()).isEmpty()){
            jTpassword.setText("@abcdefghijk");
            jTpassword.setForeground(Color.gray);
        }   
    }//GEN-LAST:event_jTemailMousePressed

    private void jTpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTpasswordMousePressed
        // TODO add your handling code here:
        if (String.valueOf(jTpassword.getPassword()).equals(("@abcdefghijk"))){
            jTpassword.setText("");
            jTpassword.setForeground(Color.black);
        } 
        if (jTemail.getText().isEmpty()){
            jTemail.setText("Insira o seu nome de usuário");
            jTemail.setForeground(Color.gray);
        }       
    }//GEN-LAST:event_jTpasswordMousePressed

    private void jCMostrarpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMostrarpasswordActionPerformed
        // TODO add your handling code here:
        if (jCMostrarpassword.isSelected()){
            if (String.valueOf(jTpassword.getPassword()).equals(("@abcdefghijk"))){
                jTpassword.setEchoChar('\u25cf');
                jTpassword.setForeground(Color.gray);
                jCMostrarpassword.setSelected(false);
            }else{
                jTpassword.setEchoChar((char)0);
                jTpassword.setForeground(Color.black);
            }  
        }else{
            jTpassword.setEchoChar('\u25cf');
            jTpassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jCMostrarpasswordActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atendente;
    private javax.swing.JTextField CorrigeOTracoNoInicio;
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton jBLogin;
    private javax.swing.JCheckBox jCMostrarpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField jTpassword;
    private javax.swing.JTextField jTemail;
    private javax.swing.JLabel pc;
    // End of variables declaration//GEN-END:variables
}
