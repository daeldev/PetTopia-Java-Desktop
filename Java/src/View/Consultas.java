package View;


import View.Estoque;
import Utils.ConexaoCi;
import Utils.ConexaoCi;
import Utils.ConsultaDTO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Utils.FuncionarioDTO;
import Utils.HttpConnection;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Oruam
 */
public class Consultas extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaFuncionarios
     */
    private void listarConsultas() {
        // Instância a classe de conexão
        HttpConnection httpConnection = new HttpConnection();

        // Chama o método para listar os funcionários cadastrados
        List<ConsultaDTO> consultas = httpConnection.listarConsultas();

        // Obtem o modelo da tabela
        DefaultTableModel Tabela = (DefaultTableModel) jTConsultas.getModel();

        // Limpa a tabela antes de adicionar os novos dados
        Tabela.setRowCount(0);

        // Itera sobre a lista de funcionários e adiciona os dados na tabela
        for (ConsultaDTO consulta : consultas) {
            Object[] dados = {
                consulta.getIdCliente(), 
                consulta.getIdAnimal(), 
                consulta.getDescricao(), 
                consulta.getTipoConsultas(), 
                consulta.getData_comeco(),
                consulta.getData_final()
            };
            Tabela.addRow(dados);
        }
    }
    
    public Consultas() {
        initComponents();
        listarConsultas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        Limpar = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTConsultas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        JBRemover = new javax.swing.JButton();
        JBAtualizar = new javax.swing.JButton();
        JBAdicionar = new javax.swing.JButton();
        jCTipo = new javax.swing.JComboBox<>();
        jTCliente = new javax.swing.JTextField();
        jBBuscarCliente = new javax.swing.JButton();
        jTDescricao = new javax.swing.JTextField();
        jBBuscarAnimal = new javax.swing.JButton();
        jTDataFinal = new javax.swing.JFormattedTextField();
        jTDataComeco = new javax.swing.JFormattedTextField();
        jTAnimal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jButton6.setText("jButton6");

        Limpar.setText("jMenuItem1");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Limpar);

        setBorder(null);
        setTitle("Funcionários");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setInheritsPopupMenu(true);
        setName("Tela Funcionário"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTConsultas.setBackground(new java.awt.Color(51, 51, 51));
        jTConsultas.setForeground(new java.awt.Color(255, 255, 255));
        jTConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Animal", "Descricao", "Tipo", "Data começo", "Data final", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTConsultasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTConsultas);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        JBRemover.setBackground(new java.awt.Color(255, 0, 0));
        JBRemover.setForeground(new java.awt.Color(255, 255, 255));
        JBRemover.setText("Cancelar");
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });
        jPanel3.add(JBRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 120, 50));

        JBAtualizar.setBackground(new java.awt.Color(51, 102, 255));
        JBAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        JBAtualizar.setText("Atualizar");
        JBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtualizarActionPerformed(evt);
            }
        });
        jPanel3.add(JBAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 120, 50));

        JBAdicionar.setBackground(new java.awt.Color(51, 102, 255));
        JBAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        JBAdicionar.setText("Adicionar");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });
        jPanel3.add(JBAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, 50));

        jCTipo.setBackground(new java.awt.Color(51, 51, 51));
        jCTipo.setForeground(new java.awt.Color(255, 255, 255));
        jCTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Castração", "Consultas" }));
        jCTipo.setBorder(null);
        jCTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTipoActionPerformed(evt);
            }
        });
        jPanel3.add(jCTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jTCliente.setBackground(new java.awt.Color(51, 51, 51));
        jTCliente.setForeground(new java.awt.Color(255, 255, 255));
        jTCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jTCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTClienteActionPerformed(evt);
            }
        });
        jPanel3.add(jTCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 260, 40));

        jBBuscarCliente.setText("Buscar");
        jPanel3.add(jBBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jTDescricao.setBackground(new java.awt.Color(51, 51, 51));
        jTDescricao.setForeground(new java.awt.Color(255, 255, 255));
        jTDescricao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jTDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDescricaoActionPerformed(evt);
            }
        });
        jPanel3.add(jTDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 360, 40));

        jBBuscarAnimal.setText("Buscar");
        jPanel3.add(jBBuscarAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jTDataFinal.setBackground(new java.awt.Color(51, 51, 51));
        jTDataFinal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data final:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jTDataFinal.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jTDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTDataFinal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTDataFinal.setToolTipText("");
        jPanel3.add(jTDataFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 130, -1));

        jTDataComeco.setBackground(new java.awt.Color(51, 51, 51));
        jTDataComeco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data de começo:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jTDataComeco.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jTDataComeco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTDataComeco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTDataComeco.setToolTipText("");
        jPanel3.add(jTDataComeco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, -1));

        jTAnimal.setBackground(new java.awt.Color(51, 51, 51));
        jTAnimal.setForeground(new java.awt.Color(255, 255, 255));
        jTAnimal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTAnimal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Animal:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jTAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAnimalActionPerformed(evt);
            }
        });
        jPanel3.add(jTAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 260, 40));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel11.setText("Dados da consulta");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel12.setText("Consultas marcadas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(482, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // TODO add your handling code here:
        if(jTConsultas.getSelectedRow() != -1){

            DefaultTableModel modelo = (DefaultTableModel) jTConsultas.getModel();
            modelo.removeRow(jTConsultas.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }//GEN-LAST:event_LimparActionPerformed

    private void JTnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTnomeActionPerformed

    private void jTConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTConsultasMouseClicked
        // TODO add your handling code here:
        jTCliente.setText(jTConsultas.getValueAt(jTConsultas.getSelectedRow(), 0).toString());
        jTDescricao.setText(jTConsultas.getValueAt(jTConsultas.getSelectedRow(), 1).toString());
        jTDataComeco.setText(jTConsultas.getValueAt(jTConsultas.getSelectedRow(), 2).toString());
        jTDataFinal.setText(jTConsultas.getValueAt(jTConsultas.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_jTConsultasMouseClicked

    private void JCgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCgeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCgeneroActionPerformed

    private void JCtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCtipoActionPerformed

    private void jTClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClienteActionPerformed

    private void jCTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTipoActionPerformed

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        //Intância a classe FuncionarioDTO de DTO
        ConsultaDTO consultaDTO = new ConsultaDTO();

        //Seta os dados fornecidos para o FuncionarioDTO
        consultaDTO.setIdCliente(Integer.parseInt(jTCliente.getText()));
        consultaDTO.setIdAnimal(Integer.parseInt(jTAnimal.getText()));
        consultaDTO.setDescricao(jTDescricao.getText());
        consultaDTO.setTipoConsultas(jCTipo.getSelectedItem().toString());
        consultaDTO.setData_comeco(jTDataComeco.toString());
        consultaDTO.setData_final(jTDataFinal.toString());

        //Instância a classe ConexaoCi
        HttpConnection httpConnection = new HttpConnection();

        //Executa o insert dos dados setados na classe funcionarioDTO ao banco de dados através do funcionarioDAO
        consultaDTO = httpConnection.agendarConsulta(consultaDTO);

        //Verifica se o cadastro foi efetuado com sucesso.
        if(consultaDTO != null){
            listarConsultas();
        }   
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarActionPerformed
        if(jTConsultas.getSelectedRow() != -1){
            jTConsultas.setValueAt(jCTipo.getSelectedItem(), jTConsultas.getSelectedRow(), 0);
            jTConsultas.setValueAt(jTCliente.getText(), jTConsultas.getSelectedRow(), 1);
//            jTConsultas.setValueAt(jTEmail.getText(), jTConsultas.getSelectedRow(),2);
//            jTConsultas.setValueAt(jTCpf.getText(), jTConsultas.getSelectedRow(), 3);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para atualizar");
        }
    }//GEN-LAST:event_JBAtualizarActionPerformed

    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed

        if(jTConsultas.getSelectedRow() != -1){

            DefaultTableModel modelop = (DefaultTableModel) jTConsultas.getModel();
            modelop.removeRow(jTConsultas.getSelectedRow());

        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }

    }//GEN-LAST:event_JBRemoverActionPerformed

    private void jTDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDescricaoActionPerformed

    private void jTAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAnimalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBAtualizar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JMenuItem Limpar;
    private javax.swing.JButton jBBuscarAnimal;
    private javax.swing.JButton jBBuscarCliente;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jCTipo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAnimal;
    private javax.swing.JTextField jTCliente;
    private javax.swing.JTable jTConsultas;
    private javax.swing.JFormattedTextField jTDataComeco;
    private javax.swing.JFormattedTextField jTDataFinal;
    private javax.swing.JTextField jTDescricao;
    // End of variables declaration//GEN-END:variables
}
