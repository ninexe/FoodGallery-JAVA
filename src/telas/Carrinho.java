/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import banco.Conexao;
import com.mysql.jdbc.Statement;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author juci_reis-junior
 */
public class Carrinho extends javax.swing.JFrame {

    /**
     * Creates new form Carrinho
     */
    public Carrinho() {
        initComponents();
        lbCombo2.setIcon(TelaCarrocel.imagem);
        lbDescricao.setText(TelaInicial.desc); 
        lbPreco.setText(TelaInicial.valor);
         btGerador.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtConteudo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btCancelar = new javax.swing.JButton();
        btGerador = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lbPreco = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbCombo2 = new javax.swing.JLabel();

        txtConteudo.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btCancelar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btCancelar.setText("CANCELAR");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar);
        btCancelar.setBounds(80, 410, 110, 25);

        btGerador.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btGerador.setText("GERAR C??DIGO");
        btGerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGeradorActionPerformed(evt);
            }
        });
        jPanel1.add(btGerador);
        btGerador.setBounds(60, 370, 150, 25);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("FINALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(80, 330, 110, 25);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(40, 250, 40, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PRECO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 230, 260, 15);

        lbPreco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPreco);
        lbPreco.setBounds(0, 250, 260, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DESCRI????O");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 180, 260, 15);

        lbDescricao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lbDescricao);
        lbDescricao.setBounds(30, 190, 200, 30);

        jPanel2.setBackground(new java.awt.Color(56, 63, 76));
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 260, 30);

        jPanel3.setBackground(new java.awt.Color(56, 63, 76));
        jPanel1.add(jPanel3);
        jPanel3.setBounds(230, 0, 30, 443);
        jPanel1.add(lbCombo2);
        lbCombo2.setBounds(40, 40, 160, 130);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 260, 443);

        setSize(new java.awt.Dimension(260, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        String valorCombo = String.valueOf(jComboBox1.getSelectedItem());
        String precoUnit = TelaInicial.valor;
        
        String total = "";
        
        total = String.valueOf( Double.parseDouble(precoUnit) * Double.parseDouble(valorCombo));
        
        lbPreco.setText(total);  
    }//GEN-LAST:event_jComboBox1ItemStateChanged

     private int Ticket() throws SQLException, Exception{
        
        String txtSQL = "";
        
        Conexao con = new Conexao();
        con.getConexao();
        
        txtSQL = "SELECT max(idTicket) as id FROM tb_ticket";
                
        
        Statement banco = (Statement) Conexao.conexao.createStatement();
        
        ResultSet result = banco.executeQuery(txtSQL);
        
        while(result.next()){           
            return result.getInt("id");
        }
        
        return 0;
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
            // TODO add your handling code here:
            txtConteudo.setText(String.valueOf(Ticket()));
        } catch (Exception ex) {
            Logger.getLogger(Carrinho.class.getName()).log(Level.SEVERE, null, ex);
        }
        int size = 150;
        String nomeArquivo = "Guilherme.png";
        try {
            FileOutputStream f = new FileOutputStream(nomeArquivo);
            ByteArrayOutputStream out = QRCode.from(txtConteudo.getText())
                    .to(ImageType.PNG)
                    .withSize(size, size)
                    .stream();
            
            f.write(out.toByteArray());
            f.close();
            
            JOptionPane.showMessageDialog(rootPane, "Finalizado");
             btGerador.setVisible(true);
             
             
        } catch (IOException ex) {
            Logger.getLogger(Carrinho.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
       btCancelar.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    private void btGeradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGeradorActionPerformed
        telas.TelaQrCode Tela = new telas.TelaQrCode();
        Tela.setVisible(true);
    }//GEN-LAST:event_btGeradorActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        telas.TelaCarrocel Tela = null;
        try {
            Tela = new telas.TelaCarrocel();
        } catch (Exception ex) {
            Logger.getLogger(Carrinho.class.getName()).log(Level.SEVERE, null, ex);
        }
        Tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btGerador;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbCombo2;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JTextField txtConteudo;
    // End of variables declaration//GEN-END:variables
}
