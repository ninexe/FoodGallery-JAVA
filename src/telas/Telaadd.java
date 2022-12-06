/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;


import banco.Conexao;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author n.inexe
 */
public final class Telaadd extends javax.swing.JFrame {
public DefaultTableModel aModel = null;
    /**
     * Creates new form Telaadd
     */
    public Telaadd() throws SQLException {
        initComponents();
        Painelrela.setVisible(false);
        try {
            consultaBD();
        } catch (SQLException ex) {
            Logger.getLogger(Telaadd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Painelinicio.setVisible(false);
        
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelBase = new javax.swing.JPanel();
        Painelmenu = new javax.swing.JPanel();
        lbinicio = new javax.swing.JLabel();
        lbadd = new javax.swing.JLabel();
        lbrela = new javax.swing.JLabel();
        lbfundomenu = new javax.swing.JLabel();
        Painelperfil = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblogo = new javax.swing.JLabel();
        lbfg = new javax.swing.JLabel();
        PainelAdd = new javax.swing.JPanel();
        txtCNPJ = new javax.swing.JTextField();
        txtNomeFantasia = new javax.swing.JTextField();
        txtRazaoSocial = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmailGerente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbletraCA = new javax.swing.JLabel();
        lbfundo12 = new javax.swing.JLabel();
        lbfundoA2 = new javax.swing.JLabel();
        lbfundoA = new javax.swing.JLabel();
        Painelinicio = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JScrollIni = new javax.swing.JScrollPane();
        JtableIni = new javax.swing.JTable();
        lbfundoI = new javax.swing.JLabel();
        Painelrela = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbrelafun = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbminimizar = new javax.swing.JLabel();
        lbfechar = new javax.swing.JLabel();
        lbtopo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        PainelBase.setPreferredSize(new java.awt.Dimension(990, 589));
        PainelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Painelmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbinicio.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        lbinicio.setForeground(new java.awt.Color(255, 255, 255));
        lbinicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btinicio1.png"))); // NOI18N
        lbinicio.setToolTipText("");
        lbinicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbinicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbinicioMouseClicked(evt);
            }
        });
        Painelmenu.add(lbinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 40));

        lbadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btAdicionar1.png"))); // NOI18N
        lbadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbaddMouseClicked(evt);
            }
        });
        Painelmenu.add(lbadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, 40));

        lbrela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btrela1.png"))); // NOI18N
        lbrela.setToolTipText("");
        lbrela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbrela.setFocusable(false);
        lbrela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbrelaMouseClicked(evt);
            }
        });
        Painelmenu.add(lbrela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 170, 40));

        lbfundomenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cormenu.png"))); // NOI18N
        Painelmenu.add(lbfundomenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 600));

        PainelBase.add(Painelmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 170, 600));

        Painelperfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        Painelperfil.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, 140));

        jLabel14.setText("Usuario:");
        Painelperfil.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel15.setText("Batotinha");
        Painelperfil.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel16.setText("Administrador");
        Painelperfil.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cor fundo.png"))); // NOI18N
        Painelperfil.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 600));

        PainelBase.add(Painelperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, 40, 170, 600));

        lblogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logozada.png"))); // NOI18N
        lblogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblogoMouseClicked(evt);
            }
        });
        PainelBase.add(lblogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        lbfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logomarca.png"))); // NOI18N
        lbfg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbfg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbfgMouseClicked(evt);
            }
        });
        PainelBase.add(lbfg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 170, 40));

        PainelAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PainelAdd.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 310, -1));
        PainelAdd.add(txtNomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 310, -1));
        PainelAdd.add(txtRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 310, -1));
        PainelAdd.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 310, -1));
        PainelAdd.add(txtEmailGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 310, -1));

        jButton1.setBackground(new java.awt.Color(40, 44, 52));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salvar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PainelAdd.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 90, 30));

        jButton2.setBackground(new java.awt.Color(40, 44, 52));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Limpar");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PainelAdd.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 90, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText(" CNPJ");
        PainelAdd.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nome Fantasia");
        PainelAdd.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Razão Social");
        PainelAdd.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nome");
        PainelAdd.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("E-mail Gerente");
        PainelAdd.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        lbletraCA.setFont(new java.awt.Font("Bungee Inline", 0, 18)); // NOI18N
        lbletraCA.setForeground(new java.awt.Color(255, 255, 255));
        lbletraCA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbletraCA.setText("Cadastro de Estabelecimentos");
        PainelAdd.add(lbletraCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 590, 30));

        lbfundo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cor1.png"))); // NOI18N
        lbfundo12.setText("jLabel2");
        PainelAdd.add(lbfundo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 590, 30));

        lbfundoA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sem título - Cópia.png"))); // NOI18N
        PainelAdd.add(lbfundoA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 590, 330));

        lbfundoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cor fundo.png"))); // NOI18N
        PainelAdd.add(lbfundoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

        PainelBase.add(PainelAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 40, 840, 600));

        Painelinicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Bungee Inline", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Todos os Produtos em Estoque");
        Painelinicio.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 740, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cor1.png"))); // NOI18N
        Painelinicio.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 740, 30));

        JtableIni.setBorder(new javax.swing.border.MatteBorder(null));
        JtableIni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Preço", "ID Estabelecimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtableIni.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JtableIni.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        JtableIni.setEnabled(false);
        JtableIni.setGridColor(new java.awt.Color(153, 153, 153));
        JtableIni.setRowSelectionAllowed(false);
        JtableIni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtableIniMouseClicked(evt);
            }
        });
        JScrollIni.setViewportView(JtableIni);

        Painelinicio.add(JScrollIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 740, 180));

        lbfundoI.setBackground(new java.awt.Color(255, 0, 0));
        lbfundoI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cor fundo.png"))); // NOI18N
        Painelinicio.add(lbfundoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 600));

        PainelBase.add(Painelinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 700, 840, 600));

        Painelrela.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Bungee Inline", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Relatório Mensais");
        Painelrela.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 770, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cor1.png"))); // NOI18N
        Painelrela.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 770, 30));
        Painelrela.add(lbrelafun, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 770, 346));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cor fundo.png"))); // NOI18N
        Painelrela.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 600));

        PainelBase.add(Painelrela, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 840, 600));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cor fundo.png"))); // NOI18N
        PainelBase.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 40, 1020, 600));

        lbminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menos icon.png"))); // NOI18N
        lbminimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbminimizarMouseClicked(evt);
            }
        });
        PainelBase.add(lbminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 20, 40));

        lbfechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x icon.png"))); // NOI18N
        lbfechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbfechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbfecharMouseClicked(evt);
            }
        });
        PainelBase.add(lbfechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, 40));

        lbtopo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cor1.png"))); // NOI18N
        PainelBase.add(lbtopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 40));

        getContentPane().add(PainelBase);
        PainelBase.setBounds(0, 0, 1010, 639);

        setSize(new java.awt.Dimension(1008, 637));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    
public void Tarefa1(){
        int delay1 = 1000;   // delay de 2 seg.
        int delay2 = 1070;
        int delay3 = 1140;
        int interval = 5000;  // intervalo de 1 seg.
        Timer timer1 = new Timer();
        Timer timer2 = new Timer();
        Timer timer3 = new Timer();

        timer1.scheduleAtFixedRate(new TimerTask() {
        public void run() {
            lb1();
            timer1.cancel();
        }
        }, delay1, interval);
        
        timer2.scheduleAtFixedRate(new TimerTask() {
        public void run() {
            lb2();
            timer2.cancel();
        }
        }, delay2, interval);
        
        timer3.scheduleAtFixedRate(new TimerTask() {
        public void run() {
            lb3();
            timer3.cancel();
        }
        }, delay3, interval);
        
    }
         
    
    
    private void lbfecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbfecharMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbfecharMouseClicked

    private void lb0(){
        ImageIcon imagem = new ImageIcon("src/imagens/0.png");             ///colocar o caminho da imagem desejada///
	lbrelafun.setIcon(imagem);
    }
    
     private void lb1(){
        ImageIcon imagem = new ImageIcon("src/imagens/3.png");             ///colocar o caminho da imagem desejada///
	lbrelafun.setIcon(imagem);
    }
     
     private void lb2(){
        ImageIcon imagem = new ImageIcon("src/imagens/2.png");             ///colocar o caminho da imagem desejada///
	lbrelafun.setIcon(imagem);
    }
     
     
      private void lb3(){
        ImageIcon imagem = new ImageIcon("src/imagens/1.png");             ///colocar o caminho da imagem desejada///
	lbrelafun.setIcon(imagem);
    }

    

    
    private void lbminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbminimizarMouseClicked
        // TODO add your handling code here:
        setState(Telaadd.ICONIFIED);
    }//GEN-LAST:event_lbminimizarMouseClicked

    private void lbinicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbinicioMouseClicked
        // TODO add your handling code here:
        ImageIcon imagem = new ImageIcon("src/imagens/btinicio2.png");             ///colocar o caminho da imagem desejada///
	lbinicio.setIcon(imagem);
        ImageIcon imagem2 = new ImageIcon("src/imagens/btAdicionar1.png");             ///colocar o caminho da imagem desejada///
	lbadd.setIcon(imagem2);
        ImageIcon imagem3 = new ImageIcon("src/imagens/btrela1.png");             ///colocar o caminho da imagem desejada///
	lbrela.setIcon(imagem3);
        lb0();
        Painelrela.setVisible(false);
        Painelinicio.setVisible(true);
        
        int posi = Painelinicio.getY();
        int posi2 = PainelAdd.getX();
        
        if(posi == 40){
            
        }else{
            Animacion.Animacion.subir(700, 40, 10, 10, Painelinicio);
            
        }
        
        if(posi2 == 1020){
           
        }else{
            Animacion.Animacion.mover_derecha(170, 1020, 10, 10, PainelAdd);
            PainelAdd.setVisible(false);
            
        }
        
       
        
        
    }//GEN-LAST:event_lbinicioMouseClicked

    public void consultaBD() throws SQLException{
        
        int qtdLinhas = 0;        
        String[] tableColumnsName = {"ID", 
                                     "Descrição", 
                                     "Preço", 
                                     "ID Estabelecimento"}; 
        
        DefaultTableModel aModel = (DefaultTableModel) JtableIni.getModel();
        aModel = new javax.swing.table.DefaultTableModel(0,6);
        aModel.setColumnIdentifiers(tableColumnsName);
        
                
        try{       
            Conexao con = new Conexao();
            con.getConexao();            
                       
            String txtSQL = ("SELECT idProduto, Descricao, Preco,idEstab from tb_produto"); 
            try ( 
                Statement bco = (Statement) banco.Conexao.conexao.createStatement()) {
                
                System.out.println(txtSQL);
                ResultSet resultCount = bco.executeQuery(txtSQL);  

                java.sql.ResultSetMetaData rsmd = resultCount.getMetaData();
                int colNo = rsmd.getColumnCount();
                while(resultCount.next()){
                    Object[] objects = new Object[colNo];
 
                    for(int i = 0; i < colNo; i++) {
                      objects[i] = resultCount.getObject(i+1);
                      
                    }

                    aModel.addRow(objects); 
                    qtdLinhas = resultCount.getRow();               
                }
                JtableIni.setVisible(true);
                JtableIni.setModel(aModel);
             //   JOptionPane.showMessageDialog(this, "Sua consulta retornou " + String.valueOf(qtdLinhas) + " linha(s).");                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Falha na consulta - stoSelectClienteTel");
        }
    }   
    
  
private void efeito(){
    
    int posi = Painelinicio.getY();
        
        if(posi < 700){
            Animacion.Animacion.bajar(40, 700, 10, 10, Painelinicio);
        }else{
            Animacion.Animacion.subir(700, 40, 10, 10, Painelinicio);
        }
    
}
    
   
    
    private void lbaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbaddMouseClicked
        // TODO add your handling code here:
        ImageIcon imagem = new ImageIcon("src/imagens/btAdicionar2.png");             ///colocar o caminho da imagem desejada///
	lbadd.setIcon(imagem);
        ImageIcon imagem2 = new ImageIcon("src/imagens/btinicio1.png");             ///colocar o caminho da imagem desejada///
	lbinicio.setIcon(imagem2);
        ImageIcon imagem3 = new ImageIcon("src/imagens/btrela1.png");             ///colocar o caminho da imagem desejada///
	lbrela.setIcon(imagem3);
        lb0();
        
        PainelAdd.setVisible(true);
       
        int posi = Painelinicio.getY();
        int posi2 = PainelAdd.getX();
        
        if(posi == 700){
           
        }else{
            Animacion.Animacion.bajar(40, 700, 10, 10, Painelinicio);
            Painelinicio.setVisible(false);
            Painelrela.setVisible(false);
        }
        
        
         if(posi2 == 170){
           
        }else{
            Animacion.Animacion.mover_izquierda(1020, 170, 10, 10, PainelAdd);
            
        }
        
        
        
        
       
         
    }//GEN-LAST:event_lbaddMouseClicked

    private void lblogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblogoMouseClicked
        // TODO add your handling code here:
        int posi = Painelmenu.getX();
        
        if(posi < 0){
            Animacion.Animacion.mover_derecha(-240, 0, 2, 2, Painelmenu);
            Animacion.Animacion.mover_izquierda(0, -240, 2, 2, Painelperfil);
            
        }else{
            Animacion.Animacion.mover_izquierda(0, -240, 2, 2, Painelmenu);
            Animacion.Animacion.mover_derecha(-240, 0, 2, 2, Painelperfil);
        }
    }//GEN-LAST:event_lblogoMouseClicked

    private void lbfgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbfgMouseClicked
        // TODO add your handling code here:
        int posi = Painelmenu.getX();
        
        if(posi < 0){
            Animacion.Animacion.mover_derecha(-240, 0, 2, 2, Painelmenu);
            Animacion.Animacion.mover_izquierda(0, -240, 2, 2, Painelperfil);
            
        }else{
            Animacion.Animacion.mover_izquierda(0, -240, 2, 2, Painelmenu);
            Animacion.Animacion.mover_derecha(-240, 0, 2, 2, Painelperfil);
        }
        
        
        
    }//GEN-LAST:event_lbfgMouseClicked

    private void salvarEstab(String CNPJ,
            String Nome_Fantasia,
            String Razao_Social,
	    String Nome,
            String Email_Gerente
	    
			) throws Exception {

        String txtSQL = "";

        txtSQL = "INSERT INTO tb_estabelecimento(CNPJ, Nome_Fantasia, Razao_Social, Nome, Email_Gerente) "
                + "Values ('" + CNPJ + "','" + Nome_Fantasia + "','" + Razao_Social + "','" + Nome + "','" + Email_Gerente + "');";

        Conexao con = new Conexao();
        con.getConexao();

        Statement banco = (Statement) Conexao.conexao.createStatement();
        int result = banco.executeUpdate(txtSQL);

        if (result != 0) {

            JOptionPane.showMessageDialog(rootPane, ("Salvo"));

        } else {
            JOptionPane.showMessageDialog(rootPane, ("ERRO"));
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
            salvarEstab(txtCNPJ.getText(),
                    txtNomeFantasia.getText(),
                    txtRazaoSocial.getText(),
                    txtNome.getText(),
                    txtEmailGerente.getText());
        } catch (Exception ex) {
            Logger.getLogger(Telaadd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                    txtCNPJ.setText("");
                    txtNomeFantasia.setText("");
                    txtRazaoSocial.setText("");
                    txtNome.setText("");
                    txtEmailGerente.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lbrelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbrelaMouseClicked
        // TODO add your handling code here:
        ImageIcon imagem = new ImageIcon("src/imagens/btAdicionar1.png");             ///colocar o caminho da imagem desejada///
	lbadd.setIcon(imagem);
        ImageIcon imagem2 = new ImageIcon("src/imagens/btinicio1.png");             ///colocar o caminho da imagem desejada///
	lbinicio.setIcon(imagem2);
        ImageIcon imagem3 = new ImageIcon("src/imagens/btrela2.png");             ///colocar o caminho da imagem desejada///
	lbrela.setIcon(imagem3);
        
        
        Painelrela.setVisible(true);
        
        int posi = Painelinicio.getY();
        int posi2 = PainelAdd.getX();
        
        if(posi == 700){
            
        }else{
            Animacion.Animacion.bajar(40, 700, 10, 10, Painelinicio);
            
            
        }
        
        if(posi2 == 1020){
           
        }else{
            Animacion.Animacion.mover_derecha(170, 1020, 10, 10, PainelAdd);
            
        }
        
        Tarefa1();
        
        
        
        
        
        
    }//GEN-LAST:event_lbrelaMouseClicked

    private void JtableIniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtableIniMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JtableIniMouseClicked

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
            java.util.logging.Logger.getLogger(Telaadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telaadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telaadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telaadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollIni;
    private javax.swing.JTable JtableIni;
    private javax.swing.JPanel PainelAdd;
    private javax.swing.JPanel PainelBase;
    private javax.swing.JPanel Painelinicio;
    private javax.swing.JPanel Painelmenu;
    private javax.swing.JPanel Painelperfil;
    private javax.swing.JPanel Painelrela;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbadd;
    private javax.swing.JLabel lbfechar;
    private javax.swing.JLabel lbfg;
    private javax.swing.JLabel lbfundo12;
    private javax.swing.JLabel lbfundoA;
    private javax.swing.JLabel lbfundoA2;
    private javax.swing.JLabel lbfundoI;
    private javax.swing.JLabel lbfundomenu;
    private javax.swing.JLabel lbinicio;
    private javax.swing.JLabel lbletraCA;
    private javax.swing.JLabel lblogo;
    private javax.swing.JLabel lbminimizar;
    private javax.swing.JLabel lbrela;
    private javax.swing.JLabel lbrelafun;
    private javax.swing.JLabel lbtopo;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtEmailGerente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtRazaoSocial;
    // End of variables declaration//GEN-END:variables
}