/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4atema2caamal;

/**
 *
 * @author m
 */
public class dlgSecante extends javax.swing.JDialog {

    /**
     * Creates new form dlgSecante
     */
    public dlgSecante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Método de la Secante");
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

        lblX0 = new javax.swing.JLabel();
        lblX1 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        lblIteraciones = new javax.swing.JLabel();
        txtX0 = new javax.swing.JTextField();
        txtX1 = new javax.swing.JTextField();
        txtError = new javax.swing.JTextField();
        txtIteraciones = new javax.swing.JTextField();
        btnSecante = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSecante = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblX0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblX0.setText("X0:");

        lblX1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblX1.setText("X1:");

        lblError.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblError.setText("Error Deseado:");

        lblIteraciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIteraciones.setText("Max. Iteraciones:");

        btnSecante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSecante.setText("Calcular");
        btnSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecanteActionPerformed(evt);
            }
        });

        tablaSecante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaSecante);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblX0)
                        .addGap(18, 18, 18)
                        .addComponent(txtX0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblX1)
                        .addGap(18, 18, 18)
                        .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblError)
                        .addGap(18, 18, 18)
                        .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSecante, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addGap(32, 32, 32)
                .addComponent(lblIteraciones)
                .addGap(18, 18, 18)
                .addComponent(txtIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblX0)
                    .addComponent(txtX0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblX1)
                    .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblError)
                    .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIteraciones)
                    .addComponent(txtIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnSecante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecanteActionPerformed
        double Xi=Double.parseDouble(txtX0.getText().trim());
        double Xs=Double.parseDouble(txtX1.getText().trim());
        double Error=Double.parseDouble(txtError.getText().trim());
        int I=Integer.parseInt(txtIteraciones.getText().trim());
        ctrlSecante ctrl = new ctrlSecante(Xi,Xs,Error,I);
        tablaSecante tabla = ctrl.getTablaSecante();
        this.tablaSecante.setModel(tabla);
    }//GEN-LAST:event_btnSecanteActionPerformed

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
            java.util.logging.Logger.getLogger(dlgSecante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgSecante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgSecante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgSecante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgSecante dialog = new dlgSecante(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
               
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSecante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblIteraciones;
    private javax.swing.JLabel lblX0;
    private javax.swing.JLabel lblX1;
    private javax.swing.JTable tablaSecante;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtIteraciones;
    private javax.swing.JTextField txtX0;
    private javax.swing.JTextField txtX1;
    // End of variables declaration//GEN-END:variables
}
