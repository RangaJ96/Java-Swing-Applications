/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickcookapp;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author ASUS
 */
public class Greeting2 extends javax.swing.JDialog {
java.awt.Frame parent;
    /**
     * Creates new form Greeting2
     */
    public Greeting2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocation(350, 150); 
        Calendar calender=new GregorianCalendar();
        if(calender.get(Calendar.AM_PM)==Calendar.AM){
            jLabel1.setText("Good Morning");
        }else{
            jLabel1.setText("Good Evening");
        }
        this.parent=parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbtnResponse = new javax.swing.JButton();
        jbtnIgnore = new javax.swing.JButton();
        jbtnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 146, 250));
        jLabel1.setText("jLabel1");

        jbtnResponse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnResponse.setForeground(new java.awt.Color(51, 255, 0));
        jbtnResponse.setText("Response");
        jbtnResponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResponseActionPerformed(evt);
            }
        });

        jbtnIgnore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnIgnore.setForeground(new java.awt.Color(255, 102, 51));
        jbtnIgnore.setText("Ignnore");
        jbtnIgnore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIgnoreActionPerformed(evt);
            }
        });

        jbtnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnCancel.setForeground(new java.awt.Color(255, 0, 0));
        jbtnCancel.setText("Cancel");
        jbtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jbtnResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jbtnIgnore, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jbtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnResponse)
                    .addComponent(jbtnIgnore)
                    .addComponent(jbtnCancel))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResponseActionPerformed
        // TODO add your handling code here:
        //        MealMaker m=new MealMaker();
        //        DrinkMaker d=new DrinkMaker();
        //        if(this.parent==d){
            SelectDrink ms=new SelectDrink();
            ms.setVisible(true);
            this.dispose();
            parent.dispose();

            //        else if(this.parent==d){
                //         SelectDrink sd=new SelectDrink();
                //         sd.setVisible(true);
                //         this.dispose();
                //        parent.dispose();
                //       }

    }//GEN-LAST:event_jbtnResponseActionPerformed

    private void jbtnIgnoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIgnoreActionPerformed
        // TODO add your handling code here:
        Menu menu=new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnIgnoreActionPerformed

    private void jbtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelActionPerformed
        // TODO add your handling code here:
        Menu menu=new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(Greeting2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Greeting2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Greeting2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Greeting2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Greeting2 dialog = new Greeting2(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnCancel;
    private javax.swing.JButton jbtnIgnore;
    private javax.swing.JButton jbtnResponse;
    // End of variables declaration//GEN-END:variables
}