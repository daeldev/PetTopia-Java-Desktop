package View;


import Utils.AnimalDTO;
import Utils.ClienteDTO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Utils.FuncionarioDTO;
import Utils.HttpConnection;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Oruam
 */
public class Animais extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaFuncionarios
     */
    private void listarAnimais() {
        // Instância a classe de conexão
        HttpConnection httpConnection = new HttpConnection();

        // Chama o método para listar os funcionários cadastrados
        List<AnimalDTO> animais = httpConnection.listarAnimais();

        // Obtem o modelo da tabela
        DefaultTableModel Tabela = (DefaultTableModel) jTAnimais.getModel();

        // Limpa a tabela antes de adicionar os novos dados
        Tabela.setRowCount(0);

        // Itera sobre a lista de funcionários e adiciona os dados na tabela
        for (AnimalDTO animai : animais) {
            Object[] dados = {
                animai.getNome(), 
                animai.getDescricao(), 
                animai.getGeneroAnimal(), 
                animai.getIdade(), 
                animai.getRaca(),
                animai.getEspecie(),
                animai.getCor()
            };
            Tabela.addRow(dados);
        }
    }
    
    public Animais() {
        initComponents();
        listarAnimais();
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
        jTAnimais = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        JBRemover = new javax.swing.JButton();
        jTDescricao = new javax.swing.JTextField();
        JBAtualizar = new javax.swing.JButton();
        JBAdicionar = new javax.swing.JButton();
        jCGenero = new javax.swing.JComboBox<>();
        jTNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCEspecie = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jCRaca = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jCIdade = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jCCor = new javax.swing.JComboBox<>();
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

        jTAnimais.setBackground(new java.awt.Color(51, 51, 51));
        jTAnimais.setForeground(new java.awt.Color(255, 255, 255));
        jTAnimais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Espécie", "Raça", "Gênero", "Idade", "Descrição", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAnimais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAnimaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTAnimais);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gênero:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        JBRemover.setBackground(new java.awt.Color(255, 0, 0));
        JBRemover.setForeground(new java.awt.Color(255, 255, 255));
        JBRemover.setText("Remover");
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });
        jPanel3.add(JBRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 120, 50));

        jTDescricao.setBackground(new java.awt.Color(51, 51, 51));
        jTDescricao.setForeground(new java.awt.Color(255, 255, 255));
        jTDescricao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(jTDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 360, -1));

        JBAtualizar.setBackground(new java.awt.Color(51, 102, 255));
        JBAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        JBAtualizar.setText("Atualizar");
        JBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtualizarActionPerformed(evt);
            }
        });
        jPanel3.add(JBAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 120, 50));

        JBAdicionar.setBackground(new java.awt.Color(51, 102, 255));
        JBAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        JBAdicionar.setText("Adicionar");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });
        jPanel3.add(JBAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, 50));

        jCGenero.setBackground(new java.awt.Color(51, 51, 51));
        jCGenero.setForeground(new java.awt.Color(255, 255, 255));
        jCGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Fêmea" }));
        jCGenero.setBorder(null);
        jCGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCGeneroActionPerformed(evt);
            }
        });
        jPanel3.add(jCGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 70, -1));

        jTNome.setBackground(new java.awt.Color(51, 51, 51));
        jTNome.setForeground(new java.awt.Color(255, 255, 255));
        jTNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomeActionPerformed(evt);
            }
        });
        jPanel3.add(jTNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 260, 40));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Espécie:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jCEspecie.setBackground(new java.awt.Color(51, 51, 51));
        jCEspecie.setForeground(new java.awt.Color(255, 255, 255));
        jCEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Siames", "Persa", "American", "Main Conn" }));
        jCEspecie.setBorder(null);
        jCEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCEspecieActionPerformed(evt);
            }
        });
        jPanel3.add(jCEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 70, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Raça:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jCRaca.setBackground(new java.awt.Color(51, 51, 51));
        jCRaca.setForeground(new java.awt.Color(255, 255, 255));
        jCRaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gato", "Cachorro" }));
        jCRaca.setBorder(null);
        jCRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCRacaActionPerformed(evt);
            }
        });
        jPanel3.add(jCRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 70, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Idade:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jCIdade.setBackground(new java.awt.Color(51, 51, 51));
        jCIdade.setForeground(new java.awt.Color(255, 255, 255));
        jCIdade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zero a três meses", "Tres a seis meses", "Seis a um ano", "Mais de um ano" }));
        jCIdade.setBorder(null);
        jCIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCIdadeActionPerformed(evt);
            }
        });
        jPanel3.add(jCIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cor:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jCCor.setBackground(new java.awt.Color(51, 51, 51));
        jCCor.setForeground(new java.awt.Color(255, 255, 255));
        jCCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preto", "Branco", "Marrom", "Cinza", "Laranja", "Mesclado" }));
        jCCor.setBorder(null);
        jCCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCorActionPerformed(evt);
            }
        });
        jPanel3.add(jCCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 70, -1));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel11.setText("Dados do animal");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel12.setText("Animais");

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
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if(jTAnimais.getSelectedRow() != -1){

            DefaultTableModel modelo = (DefaultTableModel) jTAnimais.getModel();
            modelo.removeRow(jTAnimais.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }//GEN-LAST:event_LimparActionPerformed

    private void JTnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTnomeActionPerformed

    private void jTAnimaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAnimaisMouseClicked
        // TODO add your handling code here:
//        jCSexoro.setSelectedItem(jTAnimais.getValueAt(jTAnimais.getSelectedRow(), 0).toString());
//        jTNome.setText(jTAnimais.getValueAt(jTAnimais.getSelectedRow(), 1).toString());
//        jTDescricao.setText(jTAnimais.getValueAt(jTAnimais.getSelectedRow(), 2).toString());
//        jTTelefone.setText(jTAnimais.getValueAt(jTAnimais.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_jTAnimaisMouseClicked

    private void JCgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCgeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCgeneroActionPerformed

    private void JCtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCtipoActionPerformed

    private void jTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNomeActionPerformed

    private void jCGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCGeneroActionPerformed

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        //Intância a classe FuncionarioDTO de DTO
        AnimalDTO animalDTO = new AnimalDTO();

        //Seta os dados fornecidos para o FuncionarioDTO
        animalDTO.setNome(jTNome.getText());
        animalDTO.setDescricao(jTDescricao.getText());
        animalDTO.setGeneroAnimal(jCGenero.getSelectedItem().toString());
        animalDTO.setRaca(jCRaca.getSelectedItem().toString());
        animalDTO.setEspecie(jCEspecie.getSelectedItem().toString());
        animalDTO.setIdade(jCIdade.getSelectedItem().toString());
        animalDTO.setCor(jCCor.getSelectedItem().toString());

        //Instância a classe ConexaoCi
        HttpConnection httpConnection = new HttpConnection();

        //Executa o insert dos dados setados na classe funcionarioDTO ao banco de dados através do funcionarioDAO
        animalDTO = httpConnection.cadastrarAnimal(animalDTO);

        //Verifica se o cadastro foi efetuado com sucesso.
        if(animalDTO != null){
            listarAnimais();
        }   
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarActionPerformed
//        if(jTClientes.getSelectedRow() != -1){
//            jTClientes.setValueAjCSexoro.getSelectedItem(), jTClientes.getSelectedRow(), 0);
//            jTClientes.setValueAt(jTNome.getText(), jTClientes.getSelectedRow(), 1);
//            jTClientes.setValueAt(jTEmail.getText(), jTClientes.getSelectedRow(),2);
//            jTClientes.setValueAt(jTTelefone.getText(), jTClientes.getSelectedRow(), 3);
//        }else{
//            JOptionPane.showMessageDialog(null, "Selecione uma linha para atualizar");
//        }
    }//GEN-LAST:event_JBAtualizarActionPerformed

    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed

        if(jTAnimais.getSelectedRow() != -1){

            DefaultTableModel modelop = (DefaultTableModel) jTAnimais.getModel();
            modelop.removeRow(jTAnimais.getSelectedRow());

        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }

    }//GEN-LAST:event_JBRemoverActionPerformed

    private void jCEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCEspecieActionPerformed

    private void jCRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCRacaActionPerformed
        // TODO add your handling code here:
        if(jCRaca.getSelectedItem().toString().equals("Gato")){
            jCEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Siames", "Persa", "American", "Main Conn" }));
        }
        if(jCRaca.getSelectedItem().toString().equals("Cachorro")){
            jCEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pug", "Buldogue", "Salsicha", "Pastor alemao", "Poodle", 
                                                                                    "Rottweiler", "Labrador", "Pinscher", "Golden Retriever", 
                                                                                    "Pittbull", "Bull Terrir"}));
        }
    }//GEN-LAST:event_jCRacaActionPerformed

    private void jCIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCIdadeActionPerformed

    private void jCCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCCorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBAtualizar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JMenuItem Limpar;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jCCor;
    private javax.swing.JComboBox<String> jCEspecie;
    private javax.swing.JComboBox<String> jCGenero;
    private javax.swing.JComboBox<String> jCIdade;
    private javax.swing.JComboBox<String> jCRaca;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAnimais;
    private javax.swing.JTextField jTDescricao;
    private javax.swing.JTextField jTNome;
    // End of variables declaration//GEN-END:variables
}
