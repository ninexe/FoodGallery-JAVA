/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import banco.Conexao;
import com.mysql.jdbc.Statement;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author juci_reis-junior
 */
public class TelaCarrocel extends javax.swing.JFrame {
    public int posicao ; //posicao do carrosel
    public int[] id = new int[100]; //array do carrosel
    public static int contador = 0;// contador do carrosel
    public static int minimo = 0;
    public static ImageIcon imagem = null;
    
    public static String desc = ""; 
    public static double valor = 00;
    public static String img = "";
    
    
    public static String valor1 = String.valueOf(valor);
    public static String txt01 = "" ;
    
    /**
     *
     */
    public TelaCarrocel() throws Exception {
    
        initComponents();
        carregaArray();
       
        btAdquirir.setVisible(false);// botao de adquirir para abrir dps
        lbEsquerda.setVisible(false); // desativar botao inicial demudar para a esquerda
        carregaMax();
        carregaMin();
        minimo = carregaMin();
        posicao = minimo;
        contador = minimo;
         mostradescri();
        
    }

    @SuppressWarnings("unchecked")
    
    
    
   
    
    private int carregaMax() throws SQLException, Exception{ //carregar o maximo de id's
        
        String txtSQL = "";
        
        Conexao con = new Conexao();
        con.getConexao();
        
        txtSQL = "SELECT max(idproduto) as vId FROM tb_produto where idTipoProd = '" + TelaClienteInicial.restaurante + "';";
                
        
        Statement banco = (Statement) Conexao.conexao.createStatement();
        
        ResultSet result = banco.executeQuery(txtSQL);
        
        while(result.next()){           
            return result.getInt("vId");
        }
        
        return 0;
    }
    
    private int carregaMin() throws SQLException, Exception{ //carregar o min de id's
        
        String txtSQL = "";
        
        Conexao con = new Conexao();
        con.getConexao();
        
        txtSQL = "SELECT min(idproduto) as vId FROM tb_produto where idTipoProd = '" + TelaClienteInicial.restaurante + "';";
                
        
        Statement banco = (Statement) Conexao.conexao.createStatement();
        
        ResultSet result = banco.executeQuery(txtSQL);
        
        while(result.next()){           
            return result.getInt("vId");
        }
        
        return 0;
    }
    
     private void carregaArray()throws Exception { //carregar o array com todas as posicoes
        
        String txtSQL = " select idproduto as id from tb_produto where idTipoProd = '" + TelaClienteInicial.restaurante + "';";
        int cont  = 0;         
        
        Conexao con = new Conexao();
        con.getConexao();

        Statement banco = (Statement) Conexao.conexao.createStatement();

        ResultSet result = banco.executeQuery(txtSQL);
        
         while(result.next()){  
             id[cont] = result.getInt("id");
             cont ++;
          
        }
        
        
    }
     
     
      public void viewProd (String Descricao, double Preco, String Foto) throws Exception {

        String txtSQL = " select Descricao, Preco, Foto from tb_produto "
                       + " where idproduto = " + posicao;

        Conexao con = new Conexao();
        con.getConexao();

        Statement banco = (Statement) Conexao.conexao.createStatement();

        ResultSet result = banco.executeQuery(txtSQL);
        
         while(result.next()){
             desc = result.getString("Descricao");
             valor = result.getDouble("Preco");
             img = result.getString("Foto");
           
          
        }
        
        
        
        
    }
      
       private void mostradescri() throws Exception{
        
        viewProd(desc, valor, img);
        txtDec1.setText(desc);
        txtPreco1.setText(String.valueOf(valor));
        imagem = new ImageIcon("src/imagens/"+img);             ///colocar o caminho da imagem desejada///
	lbCombo1.setIcon(imagem);
        
        
    }
      
     
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbCombo1 = new javax.swing.JLabel();
        btAdquirir = new javax.swing.JButton();
        txtDec1 = new javax.swing.JLabel();
        txtPreco1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lbDireita = new javax.swing.JLabel();
        lbEsquerda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        lbCombo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCombo1MouseClicked(evt);
            }
        });
        jPanel1.add(lbCombo1);
        lbCombo1.setBounds(10, 20, 160, 130);

        btAdquirir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btAdquirir.setText("ADQUIRIR");
        btAdquirir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdquirirActionPerformed(evt);
            }
        });
        jPanel1.add(btAdquirir);
        btAdquirir.setBounds(40, 250, 100, 25);
        jPanel1.add(txtDec1);
        txtDec1.setBounds(0, 160, 180, 30);

        txtPreco1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtPreco1);
        txtPreco1.setBounds(0, 190, 180, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 120, 180, 280);

        jPanel2.setBackground(new java.awt.Color(56, 63, 76));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 260, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("CANCELAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 405, 120, 25);

        lbDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/flecha.png"))); // NOI18N
        lbDireita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDireitaMouseClicked(evt);
            }
        });
        getContentPane().add(lbDireita);
        lbDireita.setBounds(220, 260, 60, 30);

        lbEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/flechaEsquerda.png"))); // NOI18N
        lbEsquerda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEsquerdaMouseClicked(evt);
            }
        });
        getContentPane().add(lbEsquerda);
        lbEsquerda.setBounds(0, 260, 40, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telafundo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 260, 443);

        setSize(new java.awt.Dimension(260, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbEsquerdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEsquerdaMouseClicked
        
        lbDireita.setVisible(true); //habilitar o botao esquerdo
        posicao--; //trocar a posicao do carrosel
        contador--; // variavelpadrao para desativar os botoes
        try {
            // TODO add your handling code here:
            if(contador == carregaMin()){
                lbEsquerda.setVisible(false);
            }else{
                lbEsquerda.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaCarrocel.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(contador);
        try {
            mostradescri();
        } catch (Exception ex) {
            Logger.getLogger(TelaCarrocel.class.getName()).log(Level.SEVERE, null, ex);
        }                                
    }//GEN-LAST:event_lbEsquerdaMouseClicked

    private void lbCombo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCombo1MouseClicked
        TelaInicial.desc = txtDec1.getText();
        TelaInicial.valor = txtPreco1.getText();
        
        btAdquirir.setVisible(true);
    }//GEN-LAST:event_lbCombo1MouseClicked

    private void btAdquirirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdquirirActionPerformed
       telas.Carrinho Tela = new telas.Carrinho();
       Tela.setVisible(true);
    }//GEN-LAST:event_btAdquirirActionPerformed

    private void lbDireitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDireitaMouseClicked

        lbEsquerda.setVisible(true); //habilitar o botao esquerdo
        posicao++; //trocar a posicao do carrosel
        contador++; // variavelpadrao para desativar os botoes
        try {
            // TODO add your handling code here:
            if(contador == carregaMax()){
                lbDireita.setVisible(false);
                posicao = carregaMax();
            }else{
                lbDireita.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaCarrocel.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(contador);
        try {
            mostradescri();
        } catch (Exception ex) {
            Logger.getLogger(TelaCarrocel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbDireitaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        telas.TelasHamburguerias Tela = new telas.TelasHamburguerias();
        Tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCarrocel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCarrocel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCarrocel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCarrocel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCarrocel().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TelaCarrocel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdquirir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCombo1;
    private javax.swing.JLabel lbDireita;
    private javax.swing.JLabel lbEsquerda;
    private javax.swing.JLabel txtDec1;
    private javax.swing.JLabel txtPreco1;
    // End of variables declaration//GEN-END:variables
}
