/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noviayasmin_14311398;

/**
 *
 * @author user
 */
public class tugas1 extends javax.swing.JFrame {

    /**
     * Creates new form tugas1
     */
    public tugas1() {
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

        penjumlahan1 = new noviayasmin_14311398.penjumlahan();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        penjumlahan2 = new noviayasmin_14311398.penjumlahan();
        penjumlahan3 = new noviayasmin_14311398.penjumlahan();
        penjumlahan4 = new noviayasmin_14311398.penjumlahan();
        penjumlahan5 = new noviayasmin_14311398.penjumlahan();
        penjumlahan6 = new noviayasmin_14311398.penjumlahan();
        penjumlahan8 = new noviayasmin_14311398.penjumlahan();
        penjumlahan7 = new noviayasmin_14311398.penjumlahan();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        penjumlahan9 = new noviayasmin_14311398.penjumlahan();
        pengurangan2 = new noviayasmin_14311398.pengurangan();
        perkalian1 = new noviayasmin_14311398.perkalian();
        pembagian1 = new noviayasmin_14311398.pembagian();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addTab("+", penjumlahan9);
        jTabbedPane1.addTab("-", pengurangan2);
        jTabbedPane1.addTab("*", perkalian1);
        jTabbedPane1.addTab("/", pembagian1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tugas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private noviayasmin_14311398.pembagian pembagian1;
    private noviayasmin_14311398.pengurangan pengurangan2;
    private noviayasmin_14311398.penjumlahan penjumlahan1;
    private noviayasmin_14311398.penjumlahan penjumlahan2;
    private noviayasmin_14311398.penjumlahan penjumlahan3;
    private noviayasmin_14311398.penjumlahan penjumlahan4;
    private noviayasmin_14311398.penjumlahan penjumlahan5;
    private noviayasmin_14311398.penjumlahan penjumlahan6;
    private noviayasmin_14311398.penjumlahan penjumlahan7;
    private noviayasmin_14311398.penjumlahan penjumlahan8;
    private noviayasmin_14311398.penjumlahan penjumlahan9;
    private noviayasmin_14311398.perkalian perkalian1;
    // End of variables declaration//GEN-END:variables
}
