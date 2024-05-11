package parkingguidancesystem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class adminPage extends javax.swing.JFrame {

    public adminPage() {
        initComponents();
        spot1.setVisible(false);
        spot2.setVisible(false);
        spot4.setVisible(false);
        spot5.setVisible(false);
        spot6.setVisible(false);
        spotNum.setVisible(false);
        list3.setVisible(false);
        list2.setVisible(false);
        listParked5.setVisible(false);
        list4.setVisible(false);
        list6.setVisible(false);
        user.setVisible(false);
        user1.setVisible(false);
        userShift.setVisible(false);
        user3.setVisible(false);
        user4.setVisible(false);
        userplate.setVisible(false);
        userSpot.setVisible(false);        
        user5.setVisible(false);
        user6.setVisible(false);
        user7.setVisible(false);
        listParked5.setVisible(false);
        rep1.setVisible(false);
        rep2.setVisible(false);
        rep3.setVisible(false);
        rep4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        spotNum = new javax.swing.JTextField();
        spot2 = new javax.swing.JButton();
        spot1 = new javax.swing.JLabel();
        spot4 = new javax.swing.JButton();
        spot5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spot6 = new javax.swing.JTextField();
        list3 = new java.awt.List();
        list2 = new javax.swing.JButton();
        list4 = new javax.swing.JButton();
        userShift = new javax.swing.JTextField();
        user1 = new javax.swing.JLabel();
        user3 = new javax.swing.JLabel();
        userplate = new javax.swing.JTextField();
        user4 = new javax.swing.JLabel();
        userSpot = new javax.swing.JTextField();
        user = new javax.swing.JLabel();
        user5 = new javax.swing.JSeparator();
        user6 = new javax.swing.JButton();
        user7 = new javax.swing.JButton();
        list6 = new java.awt.List();
        listParked5 = new java.awt.List();
        rep2 = new javax.swing.JTextField();
        rep1 = new javax.swing.JTextField();
        rep3 = new javax.swing.JButton();
        rep4 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Mode");
        setPreferredSize(new java.awt.Dimension(930, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Shift Reports");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 150, 50));

        jButton4.setText("Add Spots");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 50));

        jButton3.setText("View Total Spots");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 150, 50));

        jButton5.setText("Users");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 150, 50));

        jButton6.setText("Parked Cars");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 150, 50));

        spotNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spotNumActionPerformed(evt);
            }
        });
        getContentPane().add(spotNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 125, 35));

        spot2.setText("Add");
        spot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spot2ActionPerformed(evt);
            }
        });
        getContentPane().add(spot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 125, 50));

        spot1.setText("Add Number Of Spots");
        getContentPane().add(spot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 120, -1));

        spot4.setText("increase one");
        spot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spot4ActionPerformed(evt);
            }
        });
        getContentPane().add(spot4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 125, 50));

        spot5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        spot5.setText("Total Spots");
        getContentPane().add(spot5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 100, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 127, -1, -1));

        spot6.setEditable(false);
        spot6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        spot6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spot6ActionPerformed(evt);
            }
        });
        getContentPane().add(spot6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 40, 30));

        list3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list3ActionPerformed(evt);
            }
        });
        getContentPane().add(list3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 170, 280));

        list2.setText("Show Free Spots");
        list2.setToolTipText("");
        list2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list2ActionPerformed(evt);
            }
        });
        getContentPane().add(list2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 125, 25));

        list4.setText("Show Busy Spots");
        list4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list4ActionPerformed(evt);
            }
        });
        getContentPane().add(list4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, -1, -1));
        getContentPane().add(userShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 70, 30));

        user1.setText("Shift Number");
        getContentPane().add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        user3.setText("Spot Number");
        getContentPane().add(user3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));
        getContentPane().add(userplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 70, 30));

        user4.setText("Plate Number");
        getContentPane().add(user4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));
        getContentPane().add(userSpot, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 70, 30));

        user.setText("Add user : ");
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        getContentPane().add(user5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 930, 10));

        user6.setText("Add");
        user6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user6ActionPerformed(evt);
            }
        });
        getContentPane().add(user6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 70, 30));

        user7.setText("Show User");
        user7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user7ActionPerformed(evt);
            }
        });
        getContentPane().add(user7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 150, 50));

        list6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list6ActionPerformed(evt);
            }
        });
        getContentPane().add(list6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 170, 280));

        listParked5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        listParked5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listParked5ActionPerformed(evt);
            }
        });
        getContentPane().add(listParked5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 500, 265));

        rep2.setEditable(false);
        rep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep2ActionPerformed(evt);
            }
        });
        getContentPane().add(rep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 140, 30));

        rep1.setEditable(false);
        getContentPane().add(rep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 140, 30));

        rep3.setText("Shift 1");
        rep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep3ActionPerformed(evt);
            }
        });
        getContentPane().add(rep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 75, 35));

        rep4.setText("Shift 2");
        rep4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep4ActionPerformed(evt);
            }
        });
        getContentPane().add(rep4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 75, 35));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        spot1.setVisible(false);
        spot2.setVisible(false);
        //spot3.setVisible(false);
        spot4.setVisible(false);
        spot5.setVisible(false);
        spot6.setVisible(false);
        spotNum.setVisible(false);
        list3.setVisible(false);
        list2.setVisible(false);
        listParked5.setVisible(false);
        list4.setVisible(false);
        list6.setVisible(false);
        user.setVisible(false);
        user1.setVisible(false);
        userShift.setVisible(false);
        user3.setVisible(false);
        user4.setVisible(false);
        userplate.setVisible(false);
        userSpot.setVisible(false);        
        user5.setVisible(false);
        user6.setVisible(false);
        user7.setVisible(false);
        listParked5.setVisible(false);
        rep1.setVisible(true);
        rep2.setVisible(true);
        rep3.setVisible(true);
        rep4.setVisible(true);
        listParked5.removeAll();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        spot1.setVisible(true);
        spot2.setVisible(true);
        spot4.setVisible(true);
        spot5.setVisible(true);
        spot6.setVisible(true);
        spotNum.setVisible(true);
        list3.setVisible(false);
        list2.setVisible(false);
        listParked5.setVisible(false);
        list4.setVisible(false);
        list6.setVisible(false);
        user.setVisible(false);
        user1.setVisible(false);
        userShift.setVisible(false);
        user3.setVisible(false);
        user4.setVisible(false);
        userplate.setVisible(false);
        userSpot.setVisible(false);
        user5.setVisible(false);
        user6.setVisible(false);
        user7.setVisible(false);
        listParked5.setVisible(false);
        rep1.setVisible(false);
        rep2.setVisible(false);
        rep3.setVisible(false);
        rep4.setVisible(false);
        spots s = null;
        try { s = new spots(); }
        catch (IOException ex) { }
        spot6.setText(s.getTotalSpots() + " ");
        listParked5.removeAll();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        list3.setVisible(true);
        list2.setVisible(true);
        listParked5.setVisible(true);
        list4.setVisible(true);
        spot1.setVisible(false);
        spot2.setVisible(false);
        spot4.setVisible(false);
        spot5.setVisible(true);
        spot6.setVisible(true);
        spots s = null;
        try { s = new spots(); }
        catch (IOException ex) { }
        spot6.setText(s.getTotalSpots() + " ");
        spotNum.setVisible(false);
        user.setVisible(false);
        user1.setVisible(false);
        userShift.setVisible(false);
        user3.setVisible(false);
        user4.setVisible(false);
        userplate.setVisible(false);
        userSpot.setVisible(false);
        user5.setVisible(false);
        user6.setVisible(false);        
        user7.setVisible(false);
        listParked5.setVisible(false);
        list6.setVisible(true);
        rep1.setVisible(false);
        rep2.setVisible(false);
        rep3.setVisible(false);
        rep4.setVisible(false);
        listParked5.removeAll();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        user.setVisible(true);
        user1.setVisible(true);
        userShift.setVisible(true);
        user3.setVisible(true);
        user4.setVisible(true);
        userplate.setVisible(true);
        userSpot.setVisible(true);
        user5.setVisible(true);
        user6.setVisible(true);
        user7.setVisible(true);
        spot1.setVisible(false);
        spot2.setVisible(false);
        spot4.setVisible(false);
        spot5.setVisible(false);
        spot6.setVisible(false);
        spotNum.setVisible(false);
        list3.setVisible(false);
        list2.setVisible(false);
        listParked5.setVisible(false);
        list4.setVisible(false);
        listParked5.setVisible(false);
        list6.setVisible(false);
        rep1.setVisible(false);
        rep2.setVisible(false);
        rep3.setVisible(false);
        rep4.setVisible(false);
        listParked5.removeAll();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        listParked5.removeAll();
        spot1.setVisible(false);
        spot2.setVisible(false);
        spot4.setVisible(false);
        spot5.setVisible(false);
        spot6.setVisible(false);
        spotNum.setVisible(false);
        list3.setVisible(false);
        list2.setVisible(false);
        listParked5.setVisible(false);
        list4.setVisible(false);
        user.setVisible(false);
        user1.setVisible(false);
        userShift.setVisible(false);
        user3.setVisible(false);
        user4.setVisible(false);
        userplate.setVisible(false);
        userSpot.setVisible(false);        
        user5.setVisible(false);
        user6.setVisible(false);
        user7.setVisible(false);
        listParked5.setVisible(true);
        list6.setVisible(false);
        rep1.setVisible(false);
        rep2.setVisible(false);
        rep3.setVisible(false);
        rep4.setVisible(false);
        
        Scanner Reader = null;
        
        try { Reader = new Scanner(new File("inParke.txt")); }
        catch (FileNotFoundException e) { System.out.println(e); }
        
        while (Reader.hasNext()) {
            String Line = Reader.nextLine();
            listParked5.add(Line); }
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void spot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spot2ActionPerformed
        // TODO add your handling code here:
        int num  = Integer.parseInt(spotNum.getText());
        try {
            spots s = new spots();
            s.setSpotsNumber(1);            
            s.setSpotsNumber(num);
        } catch (IOException ex) { }
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        JOptionPane.showMessageDialog(frame, num + " Spots Was Added");
        spots s = null;
        try { s = new spots(); } catch (IOException ex) { }
        spot6.setText(s.getTotalSpots() + " ");
    }//GEN-LAST:event_spot2ActionPerformed

    private void spot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spot4ActionPerformed
        // TODO add your handling code here:
        try {
            spots s = new spots();
            s.setSpotsNumber(1);
        } catch (IOException ex) { }
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        JOptionPane.showMessageDialog(frame, "1 Spot Was Added");
        spots s = null;
        try {
            s = new spots();
        } catch (IOException ex) { }
        spot6.setText(s.getTotalSpots() + " ");
    }//GEN-LAST:event_spot4ActionPerformed

    private void spot6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spot6ActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_spot6ActionPerformed

    private void list2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list2ActionPerformed
        list6.removeAll();
        try {
            for(int i = 0; i<spots.monitorFreeSpots().length; i++)
            try {
                spots s = new spots();
                list6.add(s.monitorFreeSpots()[i]); 
            } catch (IOException ex) { System.out.println(ex); }

        } catch (IOException ex) { System.out.println(ex); }
        
        
    }//GEN-LAST:event_list2ActionPerformed

    private void list4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list4ActionPerformed
        list3.removeAll();
        try {
            for(int i = 0; i<spots.monitorBusySpots().length; i++)
            try {
                spots s = new spots();
                list3.add(s.monitorBusySpots()[i]); 
            } catch (IOException ex) { System.out.println(ex); }

        } catch (IOException ex) { System.out.println(ex); }
    }//GEN-LAST:event_list4ActionPerformed

    private void spotNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spotNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spotNumActionPerformed

    private void list3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list3ActionPerformed

    private void user6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user6ActionPerformed
        // TODO add your handling code here:
        String plate = userplate.getText();
        int spot = Integer.parseInt(userSpot.getText());
        int shift = Integer.parseInt(userShift.getText());
        int e = 0;
        try {
            customers c = new customers(plate, spot, shift);
            e = c.getID(); }
        catch (IOException ex) { }
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        JOptionPane.showMessageDialog(frame,
            "The User " + plate + " Has Added\n" + "In Spot " + spot + "\n" + "The Entry ID : " + e + "\n" +"Thank You !");
    }//GEN-LAST:event_user6ActionPerformed

    private void user7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user7ActionPerformed
        // TODO add your handling code here:
        edit_member e = new edit_member();
        e.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_user7ActionPerformed

    private void list6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list6ActionPerformed

    private void listParked5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listParked5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listParked5ActionPerformed

    private void rep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep3ActionPerformed
        // TODO add your handling code here:
        FileReader f;
        try {
            f = new FileReader("shift1.txt");
            BufferedReader r = new BufferedReader(f);
            Double balance = Double.parseDouble(r.readLine());
            rep1.setText(balance.toString()); }
        catch (FileNotFoundException ex) { } 
        catch (IOException ex) { }
        
    }//GEN-LAST:event_rep3ActionPerformed

    private void rep4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep4ActionPerformed
        // TODO add your handling code here:
        FileReader f;
        try {
            f = new FileReader("shift2.txt");
            BufferedReader r = new BufferedReader(f);
            Double balance = Double.parseDouble(r.readLine());
            rep2.setText(balance.toString()); }
        catch (FileNotFoundException ex) { }
        catch (IOException ex) { }
    }//GEN-LAST:event_rep4ActionPerformed

    private void rep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rep2ActionPerformed

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
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton list2;
    private java.awt.List list3;
    private javax.swing.JButton list4;
    private java.awt.List list6;
    private java.awt.List listParked5;
    private javax.swing.JTextField rep1;
    private javax.swing.JTextField rep2;
    private javax.swing.JButton rep3;
    private javax.swing.JButton rep4;
    private javax.swing.JLabel spot1;
    private javax.swing.JButton spot2;
    private javax.swing.JButton spot4;
    private javax.swing.JLabel spot5;
    private javax.swing.JTextField spot6;
    private javax.swing.JTextField spotNum;
    private javax.swing.JLabel user;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel user3;
    private javax.swing.JLabel user4;
    private javax.swing.JSeparator user5;
    private javax.swing.JButton user6;
    private javax.swing.JButton user7;
    private javax.swing.JTextField userShift;
    private javax.swing.JTextField userSpot;
    private javax.swing.JTextField userplate;
    // End of variables declaration//GEN-END:variables
}
