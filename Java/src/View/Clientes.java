package View;

import Utils.ClienteDTO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Utils.HttpConnection;
import static View.DashboardFuncionario.DashboardFuncionario;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Component;
import java.awt.Dimension;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Oruam
 */
public class Clientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaFuncionarios
     */
    private void listarClientes() {
        // Instância a classe de conexão
        HttpConnection httpConnection = new HttpConnection();

        // Chama o método para listar os funcionários cadastrados
        List<ClienteDTO> clientes = httpConnection.listarClientes();

        // Obtem o modelo da tabela
        DefaultTableModel Tabela = (DefaultTableModel) jTClientes.getModel();

        // Limpa a tabela antes de adicionar os novos dados
        Tabela.setRowCount(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Itera sobre a lista de funcionários e adiciona os dados na tabela
            for (ClienteDTO cliente : clientes) {
            Object[] dados = {
                cliente.getNome(),
                cliente.getCpf_Cliente().replaceAll("(\\d{3})(\\.\\d{3}\\.\\d{3}-)(\\d{2})", "***$2**"),
                cliente.getData_nascimento().format(formatter),
                cliente.getTelefone_Cliente(),
                cliente.getEmail(),
                cliente.getGeneroCliente().substring(0, 1).toUpperCase() + cliente.getGeneroCliente().substring(1).toLowerCase(),
                cliente.getData_Cadastro().format(formatter),
                cliente.getIdCliente()
            };
            Tabela.addRow(dados);
        }
    }
    
    private ClienteDTO clienteDTO;
    public Clientes() {
        initComponents();
        FlatLaf.registerCustomDefaultsSource("tableview");
        FlatMacDarkLaf.setup();
        
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Atualiza os dados da tabela periodicamente
                listarClientes();
            }
        }, 0, 5000); // Atualiza a cada 5000 ms (5 segundos)
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTCorrigirField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTPesquisar = new javax.swing.JTextField();
        jLPesquisar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBAdd = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBDeletar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTClientes = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCTipo = new javax.swing.JComboBox<>();

        setBorder(null);
        setTitle("Clientes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setInheritsPopupMenu(true);
        setName("Tela Funcionário"); // NOI18N
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel2FocusLost(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel2KeyReleased(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTCorrigirField.setBackground(new java.awt.Color(255, 255, 255));
        jTCorrigirField.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTCorrigirField, new org.netbeans.lib.awtextra.AbsoluteConstraints(-68, 0, -1, 20));

        jPanel3.setBackground(new java.awt.Color(24, 24, 24));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTPesquisar.setBackground(new java.awt.Color(24, 24, 24));
        jTPesquisar.setForeground(new java.awt.Color(204, 204, 204));
        jTPesquisar.setText("Pesquisar");
        jTPesquisar.setBorder(null);
        jTPesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTPesquisarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTPesquisarFocusLost(evt);
            }
        });
        jTPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPesquisarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTPesquisarMouseExited(evt);
            }
        });
        jTPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPesquisarActionPerformed(evt);
            }
        });
        jTPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPesquisarKeyReleased(evt);
            }
        });
        jPanel3.add(jTPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, 20));

        jLPesquisar.setBackground(new java.awt.Color(40, 40, 40));
        jLPesquisar.setForeground(new java.awt.Color(204, 204, 204));
        jLPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/PesquisarIcon.png"))); // NOI18N
        jPanel3.add(jLPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 30, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 270, 40));

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setForeground(new java.awt.Color(233, 233, 233));

        jBAdd.setBackground(new java.awt.Color(24, 24, 24));
        jBAdd.setForeground(new java.awt.Color(204, 204, 204));
        jBAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jBAdd.setText("Add");
        jBAdd.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(59, 59, 59)));
        jBAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAddMouseExited(evt);
            }
        });
        jBAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddActionPerformed(evt);
            }
        });

        jBEditar.setBackground(new java.awt.Color(24, 24, 24));
        jBEditar.setForeground(new java.awt.Color(204, 204, 204));
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/EditarIcon.png"))); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(59, 59, 59)));
        jBEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEditarMouseExited(evt);
            }
        });
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBDeletar.setBackground(new java.awt.Color(24, 24, 24));
        jBDeletar.setForeground(new java.awt.Color(204, 204, 204));
        jBDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DeletarIcon.png"))); // NOI18N
        jBDeletar.setText("Deletar");
        jBDeletar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(59, 59, 59)));
        jBDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDeletarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDeletarMouseExited(evt);
            }
        });
        jBDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(414, Short.MAX_VALUE)
                .addComponent(jBAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 720, 60));

        jPanel4.setBackground(new java.awt.Color(238, 238, 238));
        jPanel4.setForeground(new java.awt.Color(233, 233, 233));

        jTClientes.setShowHorizontalLines(true);
        jTClientes.setShowVerticalLines(false);
        jTClientes.setGridColor(new java.awt.Color(51,51,51));
        jTClientes.setBackground(new java.awt.Color(238, 238, 238));
        jTClientes.setIntercellSpacing(new Dimension(0, 10));
        jTClientes.setRowHeight(30);
        jTClientes.setForeground(new java.awt.Color(51,51,51));
        jTClientes.setSelectionBackground(new java.awt.Color(24,24,24));
        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cpf", "Nascimento", "Telefone", "E-mail", "Gênero", "Cadastro", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTClientes.setSelectionBackground(new java.awt.Color(102,102,102));   // Fundo quando selecionado

        JTableHeader header = jTClientes.getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Definir a borda do cabeçalho
                if (column == 0) { // Para a primeira coluna (Nome)
                    label.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, table.getGridColor())); // Linha horizontal embaixo e sem linha vertical
                }else if (column == 7) { // Para a ultima coluna (Data de emissão)
                    label.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, table.getGridColor())); // Linha horizontal embaixo e sem linha vertical
                }else {
                    label.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, table.getGridColor())); // Linha horizontal embaixo e linha vertical à esquerda
                }

                label.setHorizontalAlignment(SwingConstants.CENTER); // Centralizar o texto no cabeçalho
                return label;
            }
        });
        jTClientes.setSelectionForeground(new java.awt.Color(204,204,204));
        jTClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTClientes);
        if (jTClientes.getColumnModel().getColumnCount() > 0) {
            jTClientes.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTClientes.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTClientes.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTClientes.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTClientes.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTClientes.getColumnModel().getColumn(5).setPreferredWidth(75);
            jTClientes.getColumnModel().getColumn(6).setPreferredWidth(80);
            jTClientes.getColumnModel().getColumn(7).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, 490));

        jPanel5.setBackground(new java.awt.Color(238, 238, 238));
        jPanel5.setForeground(new java.awt.Color(233, 233, 233));

        jButton1.setBackground(new java.awt.Color(24, 24, 24));
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DeletarIcon.png"))); // NOI18N
        jButton1.setText("Limpar filtros");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(24, 24, 24));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Gênero");

        jCTipo.setBackground(new java.awt.Color(24, 24, 24));
        jCTipo.setForeground(new java.awt.Color(204, 204, 204));
        jCTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outros" }));
        jCTipo.setBorder(null);
        jCTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCTipo.setOpaque(true);
        jCTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTipoActionPerformed(evt);
            }
        });
        jPanel1.add(jCTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCTipo, 0, 145, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 190, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1173, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTnomeActionPerformed

    private void JCgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCgeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCgeneroActionPerformed

    private void JCtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCtipoActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
  
    }//GEN-LAST:event_formKeyReleased

    private void jPanel2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel2KeyReleased

    private void jPanel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2FocusGained

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseReleased

    private void jTPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPesquisarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPesquisarMouseExited

    private void jTPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPesquisarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPesquisarMouseClicked

    private void jTPesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPesquisarFocusLost
        // TODO add your handling code here:
        if(jTPesquisar.getText().equals("")){

            jTPesquisar.setText("Pesquisar");
        }
    }//GEN-LAST:event_jTPesquisarFocusLost

    private void jTPesquisarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPesquisarFocusGained
        // TODO add your handling code here:
        if(jTPesquisar.getText().equals("Pesquisar")){
            jTPesquisar.setText("");
        }
    }//GEN-LAST:event_jTPesquisarFocusGained

    private void jBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarActionPerformed
        // TODO add your handling code here:
        if(jTClientes.getSelectedRow() != -1){

            DefaultTableModel modelo = (DefaultTableModel) jTClientes.getModel();
            modelo.removeRow(jTClientes.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null, "ERRO: selecione um cliente para deletar.");
        }
    }//GEN-LAST:event_jBDeletarActionPerformed

    private void jBAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddActionPerformed
        // TODO add your handling code here:
        CadastrarCliente cadastrarCliente = new CadastrarCliente(DashboardFuncionario);
        DashboardFuncionario.add(cadastrarCliente);
        cadastrarCliente.setVisible(true);
        cadastrarCliente.setBounds(400, 0, 810, 560);
    }//GEN-LAST:event_jBAddActionPerformed

    private void jPanel2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel2FocusLost

    private void jTPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPesquisarKeyReleased
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTClientes.getModel();
        TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(modelo);
        jTClientes.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(jTPesquisar.getText()));
    }//GEN-LAST:event_jTPesquisarKeyReleased

    private void jBAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAddMouseEntered
        // TODO add your handling code here:
        jBAdd.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_jBAddMouseEntered

    private void jBEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEditarMouseEntered
        // TODO add your handling code here:
        jBEditar.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_jBEditarMouseEntered

    private void jBDeletarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDeletarMouseEntered
        // TODO add your handling code here:
        jBDeletar.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_jBDeletarMouseEntered

    private void jBAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAddMouseExited
        // TODO add your handling code here:
        jBAdd.setBackground(new java.awt.Color(24,24,24));
    }//GEN-LAST:event_jBAddMouseExited

    private void jBEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEditarMouseExited
        // TODO add your handling code here:
        jBEditar.setBackground(new java.awt.Color(24,24,24));
    }//GEN-LAST:event_jBEditarMouseExited

    private void jBDeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDeletarMouseExited
        // TODO add your handling code here:
        jBDeletar.setBackground(new java.awt.Color(24,24,24));
    }//GEN-LAST:event_jBDeletarMouseExited

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        // TODO add your handling code here:
        int[] selectedRows = jTClientes.getSelectedRows();
        
        if(selectedRows.length == 0){
            JOptionPane.showMessageDialog(rootPane, "ERRO: selecione um cliente.");
        }else if(selectedRows.length > 1){
            JOptionPane.showMessageDialog(rootPane, "ERRO: selecione somente um cliente.");
        }else{
            ClienteDTO clienteDTO = new ClienteDTO();
            clienteDTO.setNome(jTClientes.getValueAt(jTClientes.getSelectedRow(), 0).toString());
            clienteDTO.setCpf_Cliente(jTClientes.getValueAt(jTClientes.getSelectedRow(), 1).toString());
            
            // Converte a data do formato Brasileiro para o formato LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(jTClientes.getValueAt(jTClientes.getSelectedRow(), 2).toString(), formatter);
            clienteDTO.setData_nascimento(data);
            clienteDTO.setTelefone_Cliente(jTClientes.getValueAt(jTClientes.getSelectedRow(), 3).toString());
            clienteDTO.setEmail(jTClientes.getValueAt(jTClientes.getSelectedRow(), 4).toString());
            clienteDTO.setGeneroCliente(jTClientes.getValueAt(jTClientes.getSelectedRow(), 5).toString());
            clienteDTO.setIdCliente(Integer.parseInt(String.valueOf(jTClientes.getValueAt(jTClientes.getSelectedRow(), 7))));
            
            EditarCliente editarCliente = new EditarCliente(DashboardFuncionario, clienteDTO);
            DashboardFuncionario.add(editarCliente);
            editarCliente.setVisible(true);
            editarCliente.setBounds(400, 0, 810, 572);
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jTClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClientesMouseClicked

    private void jTPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPesquisarActionPerformed

    private void jCTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTipoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTClientes.getModel();
        TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(modelo);
        jTClientes.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(jCTipo.getSelectedItem().toString()));
    }//GEN-LAST:event_jCTipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTClientes.getModel();
        TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(modelo);
        jTClientes.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(""));
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdd;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCTipo;
    private javax.swing.JLabel jLPesquisar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTClientes;
    private javax.swing.JTextField jTCorrigirField;
    private javax.swing.JTextField jTPesquisar;
    // End of variables declaration//GEN-END:variables
}
