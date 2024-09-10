package View;
import static View.WorkspaceFuncionario.WorkspaceAtendente;
import Utils.ConexaoCi;
import Utils.DTO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Pagamento extends javax.swing.JInternalFrame {
    
    private DefaultTableModel Carrinho;
    private Double Total;    
    public void Pagamento(DTO.VendaDTO vendaDTO, DefaultTableModel Carrinho) {
        initComponents();
        JTTotal.setText(vendaDTO.getTotal().toString());
        this.Total = vendaDTO.getTotal();
        this.Carrinho = Carrinho;
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgAVista = new javax.swing.ButtonGroup();
        jbgCartao = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        JBFinalizar = new javax.swing.JButton();
        JTTotal = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JCCartao = new javax.swing.JComboBox<>();
        JTDinheiro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        JRVista = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        JRCartao = new javax.swing.JRadioButton();

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Dados do Produto");

        setBackground(new java.awt.Color(246, 242, 242));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setTitle("Pagamento");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Forma de pagamento");

        jPanel1.setBackground(new java.awt.Color(246, 242, 242));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Total:");

        JBFinalizar.setBackground(new java.awt.Color(51, 102, 255));
        JBFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        JBFinalizar.setText("Finalizar");
        JBFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFinalizarActionPerformed(evt);
            }
        });

        JTTotal.setEditable(false);
        JTTotal.setBackground(new java.awt.Color(51, 51, 51));
        JTTotal.setForeground(new java.awt.Color(255, 255, 255));
        JTTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTTotalActionPerformed(evt);
            }
        });

        JBCancelar.setBackground(new java.awt.Color(255, 0, 0));
        JBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(JBFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(246, 242, 242));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Parcelas:");

        JCCartao.setBackground(new java.awt.Color(246, 242, 242));
        JCCartao.setForeground(new java.awt.Color(51, 51, 51));
        JCCartao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1x", "2x", "3x", "4x", "5x" }));
        JCCartao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCCartaoItemStateChanged(evt);
            }
        });
        JCCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCCartaoActionPerformed(evt);
            }
        });

        JTDinheiro.setBackground(new java.awt.Color(51, 51, 51));
        JTDinheiro.setForeground(new java.awt.Color(255, 255, 255));
        JTDinheiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTDinheiroMouseClicked(evt);
            }
        });
        JTDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTDinheiroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Dinheiro:");

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        JRVista.setBackground(new java.awt.Color(204, 204, 204));
        jbgAVista.add(JRVista);
        JRVista.setForeground(new java.awt.Color(51, 51, 51));
        JRVista.setText("Á vista");
        JRVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRVistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JRVista)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JRVista, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        JRCartao.setBackground(new java.awt.Color(204, 204, 204));
        jbgAVista.add(JRCartao);
        JRCartao.setForeground(new java.awt.Color(51, 51, 51));
        JRCartao.setText("Cartão");
        JRCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRCartaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JRCartao)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JRCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(JTDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(JCCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel12)
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFinalizarActionPerformed
        if(JRCartao.isSelected() || JRVista.isSelected()){
            if(JRVista.isSelected ()){
                try{
                    Double dinheiroCliente = Double.valueOf(JTDinheiro.getText());
                    Double troco = dinheiroCliente - Total;
                    if(dinheiroCliente < Total || troco < 0){
                        JOptionPane.showMessageDialog(null, "ERRO: Valor Inválido.");
                        JTDinheiro.setText("");
                    }else{
                        if(troco > 0){
                            JOptionPane.showMessageDialog(null, "Troco: "+ troco);
                        }
                    }
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERRO: Digite os valores novamente.");
                    JTDinheiro.setText("");
                    return;
                }
            }                                  
            
            //Adiciona o total e gera uma nota fiscal
            try{                   
                DTO dto = new DTO();
                DTO.VendaDTO vendaDTO = dto.new VendaDTO();
                
                vendaDTO.setTotal(Total);
                ConexaoCi vendaDAO = new ConexaoCi();
                int Resultado = vendaDAO.AdicionarVendas(vendaDTO);
                
                if(Resultado != -1){ 
                    //Adiciona e associa todos os produtos do carrinho à nota fiscal criada
                    DTO.ProdutoDTO produtoDTO = dto.new ProdutoDTO();
                    int NotaFiscal = Resultado;
                    
                    for (int i = 0; i < Carrinho.getRowCount(); i++) {
                        int Quantidade = Integer.parseInt(Carrinho.getValueAt(i, 2).toString());
                        int idFuncionario = Integer.parseInt(Carrinho.getValueAt(i, 4).toString());

                        produtoDTO.setQuantidade(Quantidade);
                        produtoDTO.setidFuncionario(idFuncionario);

                        ConexaoCi produtoDAO = new ConexaoCi();
                        int rs = produtoDAO.AdicionarItens(produtoDTO, NotaFiscal);

                        if(rs != -1){ 
                            JOptionPane.showMessageDialog(null, "Venda Finalizada.");

                            int Option = JOptionPane.showConfirmDialog(null,"Deseja cadastrar o cliente?","Atenção", JOptionPane.YES_NO_OPTION);
                            if(Option == JOptionPane.YES_OPTION){
                                dispose(); 
                                Clientes clientes = new Clientes();
                                WorkspaceAtendente.add(clientes);
                                clientes.setVisible(true);
                                clientes.setBounds(247, 97, 1036, 657);                        
                            }
                            else{
                                this.dispose();
                            }
                        }
                    }
                }
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRO: Dados inválidos." + e);
            }
        }else{
            JOptionPane.showMessageDialog(null, "ERRO: Selecione uma forma de pagamento.");
        }
    }//GEN-LAST:event_JBFinalizarActionPerformed

    private void JTTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTTotalActionPerformed

    private void JCCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCCartaoActionPerformed
        if (JRCartao.isSelected()){
            Double Total = Double.valueOf(JTTotal.getText());
            String parcelas = String.valueOf(JCCartao.getSelectedItem());
            Double juros = 0.00;
            Double jurosSoma = 0.00;
            Double calculo = 0.00;
            switch (parcelas) {
                case "1x" -> {
                    calculo = Total / 1;
                    JOptionPane.showMessageDialog(null, String.format("1x de R$ %.2f",calculo));
                }
                case "2x" -> {
                    calculo = Total / 2;
                    JOptionPane.showMessageDialog(null, String.format("2x de R$ %.2f",calculo));
                }
                case "3x" -> {
                    calculo = Total / 3;
                    JOptionPane.showMessageDialog(null, String.format("3x de R$ %.2f",calculo));
                }
                case "4x" -> {
                    calculo = Total / 4;
                    JOptionPane.showMessageDialog(null, String.format("4x de R$ %.2f",calculo));
                }
                case "5x" -> {
                    calculo = Total / 5;
                    JOptionPane.showMessageDialog(null, String.format("5x de R$ %.2f",calculo));
                }
            }
        }
    }//GEN-LAST:event_JCCartaoActionPerformed

    private void JRVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRVistaActionPerformed
        if(JRVista.isSelected()){
            JCCartao.setSelectedItem("1x");
            JCCartao.setEditable(false);
        }
    }//GEN-LAST:event_JRVistaActionPerformed

    private void JTDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTDinheiroActionPerformed
        
    }//GEN-LAST:event_JTDinheiroActionPerformed

    private void JTDinheiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTDinheiroMouseClicked

    }//GEN-LAST:event_JTDinheiroMouseClicked

    private void JCCartaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCCartaoItemStateChanged

    }//GEN-LAST:event_JCCartaoItemStateChanged

    private void JRCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRCartaoActionPerformed
        // TODO add your handling code here:
        if(JRCartao.isSelected()){
            JTDinheiro.setText("");
            JTDinheiro.setEditable(false);
        }
    }//GEN-LAST:event_JRCartaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBFinalizar;
    private javax.swing.JComboBox<String> JCCartao;
    private javax.swing.JRadioButton JRCartao;
    private javax.swing.JRadioButton JRVista;
    private javax.swing.JTextField JTDinheiro;
    private javax.swing.JTextField JTTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.ButtonGroup jbgAVista;
    private javax.swing.ButtonGroup jbgCartao;
    // End of variables declaration//GEN-END:variables

}
