package View;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Vendas extends javax.swing.JInternalFrame { 
    public Vendas() {
        initComponents();
   
    DefaultTableModel modelo = (DefaultTableModel)JTRegistro.getModel();
    JTRegistro.setRowSorter(new TableRowSorter(modelo));
    String FilePath = "Coloque aqui o caminho do arquivo Clientes da pasta DadosTabelas.";
             File file = new File(FilePath) ;  
        
        try {
            FileReader fr = new FileReader (file);
            BufferedReader br = new BufferedReader(fr);
            
            
            Object [ ] lines = br.lines().toArray();
            
            for (int i = 0 ; i < lines.length; i ++){
                String [ ] row = lines[i].toString().split(" ");
                modelo.addRow(row);
                
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Vendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        Limpar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTRegistro = new javax.swing.JTable();
        JBRemover = new javax.swing.JButton();

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        jPopupMenu2.add(Limpar);

        setBorder(null);
        setClosable(true);
        setTitle("Cadastro");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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

        JTRegistro.setBackground(new java.awt.Color(246, 242, 242));
        JTRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Cliente", "Telefone", "CPF", "Produto", "Tamanho", "Quantidade", "Nota fiscal", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTRegistroMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JTRegistroMouseReleased(evt);
            }
        });
        JTRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTRegistroKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JTRegistro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 930, 500));

        JBRemover.setBackground(new java.awt.Color(255, 0, 51));
        JBRemover.setForeground(new java.awt.Color(255, 255, 255));
        JBRemover.setText("REMOVER");
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });
        jPanel1.add(JBRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1036, 620);
    }// </editor-fold>//GEN-END:initComponents
  
    
    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed
        if(JTRegistro.getSelectedRow() != -1){    
            DefaultTableModel modelop = (DefaultTableModel) JTRegistro.getModel();
            modelop.removeRow(JTRegistro.getSelectedRow());    
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }//GEN-LAST:event_JBRemoverActionPerformed

    private void JTRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTRegistroMouseClicked

    }//GEN-LAST:event_JTRegistroMouseClicked

    private void JTRegistroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTRegistroKeyReleased

    }//GEN-LAST:event_JTRegistroKeyReleased

    private void JTRegistroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTRegistroMouseReleased
        // TODO add your handling code here:
   
    }//GEN-LAST:event_JTRegistroMouseReleased

    private void jPanel1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jPanel1VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1VetoableChange

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        // TODO add your handling code here:
        if (evt.isPopupTrigger()){
            jPopupMenu2.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jPanel1MouseReleased

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // TODO add your handling code here:
        if(JTRegistro.getSelectedRow() != -1){
        
        DefaultTableModel modelo = (DefaultTableModel) JTRegistro.getModel();
        modelo.removeRow(JTRegistro.getSelectedRow());     
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }//GEN-LAST:event_LimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBRemover;
    public static javax.swing.JTable JTRegistro;
    private javax.swing.JMenuItem Limpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
