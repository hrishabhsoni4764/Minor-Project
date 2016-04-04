
package mobilecloning;

/**
 *
 * @author saurabh
 */


public class phone extends javax.swing.JFrame {

    String phone="";
    String sim="";
    String loc="";
    
    public phone(String phone,String sim,String loc) {
        initComponents();
        this.phone=phone;
        this.sim=sim;
        this.loc=loc;
        lblPhone.setText(phone);
        lblSim.setText(sim);
        lblLocation.setText(loc);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration Module");

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Phone Panel"));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sim-icon.gif"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 150, 30, 40);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mobile-icon.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 80, 70, 51);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-delete.gif"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(140, 310, 130, 40);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setText("Phone panel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 30, 180, 24);

        lblPhone.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblPhone.setText("-");
        jPanel1.add(lblPhone);
        lblPhone.setBounds(230, 100, 180, 19);

        lblLocation.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblLocation.setText("-");
        jPanel1.add(lblLocation);
        lblLocation.setBounds(230, 230, 180, 19);

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/location-icon.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 210, 80, 51);

        lblSim.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblSim.setText("-");
        jPanel1.add(lblSim);
        lblSim.setBounds(230, 160, 170, 19);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
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
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new phone("","","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSim;
    // End of variables declaration//GEN-END:variables

}
