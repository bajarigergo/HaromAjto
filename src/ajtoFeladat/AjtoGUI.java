/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ajtoFeladat;

/**
 *
 * @author HalászGergő(SZF_2023
 */
public class AjtoGUI extends javax.swing.JFrame {

    /**
     * Creates new form AjtoGUI
     */
    public AjtoGUI() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCim = new javax.swing.JLabel();
        lblCserevel = new javax.swing.JLabel();
        SpnCserevel = new javax.swing.JSpinner();
        lblMasodikAjto = new javax.swing.JLabel();
        lblHarmadikAjto = new javax.swing.JLabel();
        lblElsoAjto = new javax.swing.JLabel();
        btnElsoGomb = new javax.swing.JButton();
        btnMasodikGomb = new javax.swing.JButton();
        btnHarmadikGomb = new javax.swing.JButton();
        lblCsereNelkul = new javax.swing.JLabel();
        SpnCsereNelkul = new javax.swing.JSpinner();
        btnUjJatek = new javax.swing.JButton();
        btnJatekVege = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setText("Kérlek, jelölj meg egy ajtót!");

        jLabel4.setText("A három közül, az egyik ajtó egy autót rejt!");

        lblCim.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblCim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCim.setText("Ajtó nyitás!");

        lblCserevel.setText("Nyert körök cserével:");

        SpnCserevel.setEnabled(false);

        lblMasodikAjto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajtoFeladat/kepek/kicsi_11zon.png"))); // NOI18N

        lblHarmadikAjto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajtoFeladat/kepek/kicsi_11zon.png"))); // NOI18N

        lblElsoAjto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajtoFeladat/kepek/kicsi_11zon.png"))); // NOI18N

        btnElsoGomb.setText("Ezt nyitom!");

        btnMasodikGomb.setText("Ezt nyitom!");

        btnHarmadikGomb.setText("Ezt nyitom!");

        lblCsereNelkul.setText("Nyert körök csere nélkül:");

        SpnCsereNelkul.setEnabled(false);

        btnUjJatek.setText("Új játék!");
        btnUjJatek.setMaximumSize(new java.awt.Dimension(102, 23));
        btnUjJatek.setMinimumSize(new java.awt.Dimension(102, 23));
        btnUjJatek.setPreferredSize(new java.awt.Dimension(102, 23));

        btnJatekVege.setText("Abbahagyom");

        jLabel2.setText("Az ajtó megjelölése után, dönthetsz cseréről.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnMasodikGomb, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblMasodikAjto, javax.swing.GroupLayout.Alignment.CENTER))
                .addGap(315, 315, 315))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(579, 579, 579)
                        .addComponent(btnUjJatek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCserevel)
                                .addGap(26, 26, 26)
                                .addComponent(SpnCserevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnElsoGomb))
                                    .addComponent(lblElsoAjto)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCsereNelkul)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpnCsereNelkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(lblCim, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHarmadikAjto)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnHarmadikGomb))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(btnJatekVege, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCim)
                    .addComponent(lblCserevel)
                    .addComponent(SpnCserevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUjJatek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCsereNelkul)
                        .addComponent(SpnCsereNelkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(btnJatekVege)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMasodikAjto)
                    .addComponent(lblHarmadikAjto)
                    .addComponent(lblElsoAjto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMasodikGomb)
                    .addComponent(btnElsoGomb)
                    .addComponent(btnHarmadikGomb))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(AjtoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjtoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjtoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjtoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjtoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpnCsereNelkul;
    private javax.swing.JSpinner SpnCserevel;
    private javax.swing.JButton btnElsoGomb;
    private javax.swing.JButton btnHarmadikGomb;
    private javax.swing.JButton btnJatekVege;
    private javax.swing.JButton btnMasodikGomb;
    private javax.swing.JButton btnUjJatek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCim;
    private javax.swing.JLabel lblCsereNelkul;
    private javax.swing.JLabel lblCserevel;
    private javax.swing.JLabel lblElsoAjto;
    private javax.swing.JLabel lblHarmadikAjto;
    private javax.swing.JLabel lblMasodikAjto;
    // End of variables declaration//GEN-END:variables
}
