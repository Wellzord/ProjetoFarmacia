/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author Wellington
 */
public class mainView extends javax.swing.JFrame {

    /**
     * Creates new form mainView
     */
    public mainView() {
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

        menuConteudo = new javax.swing.JPanel();
        menuLateral = new javax.swing.JPanel();
        painelMed1 = new javax.swing.JPanel();
        lblIconMed1 = new javax.swing.JLabel();
        btnCadCli = new javax.swing.JLabel();
        painelMed2 = new javax.swing.JPanel();
        lblIconMed2 = new javax.swing.JLabel();
        btnCaixa = new javax.swing.JLabel();
        painelMed3 = new javax.swing.JPanel();
        lblIconMed3 = new javax.swing.JLabel();
        btnCadMed = new javax.swing.JLabel();
        painelMed4 = new javax.swing.JPanel();
        lblIconMed4 = new javax.swing.JLabel();
        btnVenda = new javax.swing.JLabel();
        painelMed5 = new javax.swing.JPanel();
        lblIconMed5 = new javax.swing.JLabel();
        btnRelat = new javax.swing.JLabel();
        painelMed6 = new javax.swing.JPanel();
        lblIconMed6 = new javax.swing.JLabel();
        btnSair = new javax.swing.JLabel();
        pnlLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(236, 238, 241));

        menuConteudo.setBackground(javax.swing.UIManager.getDefaults().getColor("tab_focus_fill_upper"));

        javax.swing.GroupLayout menuConteudoLayout = new javax.swing.GroupLayout(menuConteudo);
        menuConteudo.setLayout(menuConteudoLayout);
        menuConteudoLayout.setHorizontalGroup(
            menuConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        menuConteudoLayout.setVerticalGroup(
            menuConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menuLateral.setBackground(new java.awt.Color(40, 160, 28));
        menuLateral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        menuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelMed1.setBackground(new java.awt.Color(40, 163, 28));
        painelMed1.setForeground(new java.awt.Color(240, 240, 240));

        lblIconMed1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cliente.png"))); // NOI18N

        btnCadCli.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btnCadCli.setForeground(new java.awt.Color(240, 240, 240));
        btnCadCli.setText("CADASTRO DE CLIENTES");

        javax.swing.GroupLayout painelMed1Layout = new javax.swing.GroupLayout(painelMed1);
        painelMed1.setLayout(painelMed1Layout);
        painelMed1Layout.setHorizontalGroup(
            painelMed1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMed1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblIconMed1)
                .addGap(18, 18, 18)
                .addComponent(btnCadCli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelMed1Layout.setVerticalGroup(
            painelMed1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIconMed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMed1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadCli)
                .addContainerGap())
        );

        menuLateral.add(painelMed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 250, 40));

        painelMed2.setBackground(new java.awt.Color(40, 163, 28));
        painelMed2.setForeground(new java.awt.Color(240, 240, 240));

        lblIconMed2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/caixa.png"))); // NOI18N

        btnCaixa.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btnCaixa.setForeground(new java.awt.Color(240, 240, 240));
        btnCaixa.setText("GERENCIAMENTO DE CAIXA");

        javax.swing.GroupLayout painelMed2Layout = new javax.swing.GroupLayout(painelMed2);
        painelMed2.setLayout(painelMed2Layout);
        painelMed2Layout.setHorizontalGroup(
            painelMed2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMed2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblIconMed2)
                .addGap(18, 18, 18)
                .addComponent(btnCaixa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelMed2Layout.setVerticalGroup(
            painelMed2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIconMed2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMed2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCaixa)
                .addContainerGap())
        );

        menuLateral.add(painelMed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 250, 40));

        painelMed3.setBackground(new java.awt.Color(40, 163, 28));
        painelMed3.setForeground(new java.awt.Color(240, 240, 240));

        lblIconMed3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/medicamento.png"))); // NOI18N

        btnCadMed.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btnCadMed.setForeground(new java.awt.Color(240, 240, 240));
        btnCadMed.setText("CADASTRO DE MEDICAMENTOS");

        javax.swing.GroupLayout painelMed3Layout = new javax.swing.GroupLayout(painelMed3);
        painelMed3.setLayout(painelMed3Layout);
        painelMed3Layout.setHorizontalGroup(
            painelMed3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMed3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblIconMed3)
                .addGap(18, 18, 18)
                .addComponent(btnCadMed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelMed3Layout.setVerticalGroup(
            painelMed3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIconMed3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMed3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadMed)
                .addContainerGap())
        );

        menuLateral.add(painelMed3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 240, 40));

        painelMed4.setBackground(new java.awt.Color(40, 163, 28));
        painelMed4.setForeground(new java.awt.Color(240, 240, 240));

        lblIconMed4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/venda.png"))); // NOI18N

        btnVenda.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btnVenda.setForeground(new java.awt.Color(240, 240, 240));
        btnVenda.setText("EFETUAR VENDA");

        javax.swing.GroupLayout painelMed4Layout = new javax.swing.GroupLayout(painelMed4);
        painelMed4.setLayout(painelMed4Layout);
        painelMed4Layout.setHorizontalGroup(
            painelMed4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMed4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblIconMed4)
                .addGap(18, 18, 18)
                .addComponent(btnVenda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelMed4Layout.setVerticalGroup(
            painelMed4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIconMed4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMed4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(btnVenda)
                .addContainerGap())
        );

        menuLateral.add(painelMed4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 250, 40));

        painelMed5.setBackground(new java.awt.Color(40, 163, 28));
        painelMed5.setForeground(new java.awt.Color(240, 240, 240));

        lblIconMed5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatorio.png"))); // NOI18N

        btnRelat.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btnRelat.setForeground(new java.awt.Color(240, 240, 240));
        btnRelat.setText("RELATÓRIOS");

        javax.swing.GroupLayout painelMed5Layout = new javax.swing.GroupLayout(painelMed5);
        painelMed5.setLayout(painelMed5Layout);
        painelMed5Layout.setHorizontalGroup(
            painelMed5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMed5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblIconMed5)
                .addGap(18, 18, 18)
                .addComponent(btnRelat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelMed5Layout.setVerticalGroup(
            painelMed5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIconMed5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMed5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(btnRelat)
                .addContainerGap())
        );

        menuLateral.add(painelMed5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 250, 40));

        painelMed6.setBackground(new java.awt.Color(40, 163, 28));
        painelMed6.setForeground(new java.awt.Color(240, 240, 240));

        lblIconMed6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N

        btnSair.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(240, 240, 240));
        btnSair.setText("SAIR");

        javax.swing.GroupLayout painelMed6Layout = new javax.swing.GroupLayout(painelMed6);
        painelMed6.setLayout(painelMed6Layout);
        painelMed6Layout.setHorizontalGroup(
            painelMed6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMed6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblIconMed6)
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelMed6Layout.setVerticalGroup(
            painelMed6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIconMed6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMed6Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addContainerGap())
        );

        menuLateral.add(painelMed6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 200, 40));

        pnlLogo.setBackground(new java.awt.Color(40, 160, 28));
        pnlLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(40, 160, 28));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo2_teste.fw.png"))); // NOI18N
        pnlLogo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 10, 65, 87));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FARMA");
        pnlLogo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 77, 77));
        jLabel3.setText("WELL");
        pnlLogo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("&");
        pnlLogo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 109, 217));
        jLabel5.setText("ROSEN");
        pnlLogo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 90, 60, -1));

        menuLateral.add(pnlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
            .addComponent(menuConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCadCli;
    private javax.swing.JLabel btnCadMed;
    private javax.swing.JLabel btnCaixa;
    private javax.swing.JLabel btnRelat;
    private javax.swing.JLabel btnSair;
    private javax.swing.JLabel btnVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblIconMed1;
    private javax.swing.JLabel lblIconMed2;
    private javax.swing.JLabel lblIconMed3;
    private javax.swing.JLabel lblIconMed4;
    private javax.swing.JLabel lblIconMed5;
    private javax.swing.JLabel lblIconMed6;
    private javax.swing.JPanel menuConteudo;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JPanel painelMed1;
    private javax.swing.JPanel painelMed2;
    private javax.swing.JPanel painelMed3;
    private javax.swing.JPanel painelMed4;
    private javax.swing.JPanel painelMed5;
    private javax.swing.JPanel painelMed6;
    private javax.swing.JPanel pnlLogo;
    // End of variables declaration//GEN-END:variables
}
