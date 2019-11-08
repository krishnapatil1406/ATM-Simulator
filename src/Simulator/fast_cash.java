package Simulator;

import static Simulator.sign_in.c;
import java.awt.Color;
import java.awt.Container;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fast_cash extends javax.swing.JFrame {

    public fast_cash() {
        initComponents();
        setTitle("   FAST CASH   ");
        Container con = getContentPane();
        con.setBackground(Color.WHITE);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("FAST CASH");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Rs. 100");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Rs. 500");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Rs. 1000");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Rs.2000");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("Rs. 5000");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setText("Rs. 10000");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton8.setText("EXIT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        transaction s1 = new transaction();
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        JFrame f = new JFrame();
        sign_in si = new sign_in();
        
        try
            {
                PreparedStatement stmt = c.prepareStatement("select * from data where cardno = '"+si.cardno+"' and pin ='"+si.pin+"'");
                ResultSet abc = stmt.executeQuery();
                abc.next();  

                if (100 < Double.parseDouble(abc.getString(29)))
                {
                    double balance = Double.parseDouble(abc.getString(29)) - 100;
           
                    stmt = c.prepareStatement("update data set balance = "+balance+" where cardno = '"+si.cardno+"' and pin ='"+si.pin+"' ");
                    stmt.execute();
            
                    JOptionPane.showMessageDialog(f, "Total Balance :- " + balance, "MESSAGE" , JOptionPane.INFORMATION_MESSAGE);
        
                }
                else
                {
                    JOptionPane.showMessageDialog(f, "INSUFFICIENT BALANCE", "MESSAGE" , JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception e)
            {
            e.printStackTrace();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        JFrame f = new JFrame();
        sign_in si = new sign_in();
        
        try
            {
                PreparedStatement stmt = c.prepareStatement("select * from data where cardno = '"+si.cardno+"' and pin ='"+si.pin+"'");
                ResultSet abc = stmt.executeQuery();
                abc.next();  

                if (500 < Double.parseDouble(abc.getString(29)))
                {
                    double balance = Double.parseDouble(abc.getString(29)) - 500;
           
                    stmt = c.prepareStatement("update data set balance = "+balance+" where cardno = '"+si.cardno+"' and pin ='"+si.pin+"' ");
                    stmt.execute();
            
                    JOptionPane.showMessageDialog(f, "Total Balance :- " + balance, "MESSAGE" , JOptionPane.INFORMATION_MESSAGE);
        
                }
                else
                {
                    JOptionPane.showMessageDialog(f, "INSUFFICIENT BALANCE", "MESSAGE" , JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception e)
            {
            e.printStackTrace();
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        JFrame f = new JFrame();
        sign_in si = new sign_in();
        
        try
            {
                PreparedStatement stmt = c.prepareStatement("select * from data where cardno = '"+si.cardno+"' and pin ='"+si.pin+"'");
                ResultSet abc = stmt.executeQuery();
                abc.next();  

                if (2000 < Double.parseDouble(abc.getString(29)))
                {
                    double balance = Double.parseDouble(abc.getString(29)) - 2000;
           
                    stmt = c.prepareStatement("update data set balance = "+balance+" where cardno = '"+si.cardno+"' and pin ='"+si.pin+"' ");
                    stmt.execute();
            
                    JOptionPane.showMessageDialog(f, "Total Balance :- " + balance, "MESSAGE" , JOptionPane.INFORMATION_MESSAGE);
        
                }
                else
                {
                    JOptionPane.showMessageDialog(f, "INSUFFICIENT BALANCE", "MESSAGE" , JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception e)
            {
            e.printStackTrace();
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        JFrame f = new JFrame();
        sign_in si = new sign_in();
        
        try
            {
                PreparedStatement stmt = c.prepareStatement("select * from data where cardno = '"+si.cardno+"' and pin ='"+si.pin+"'");
                ResultSet abc = stmt.executeQuery();
                abc.next();  

                if (1000 < Double.parseDouble(abc.getString(29)))
                {
                    double balance = Double.parseDouble(abc.getString(29)) - 1000;
           
                    stmt = c.prepareStatement("update data set balance = "+balance+" where cardno = '"+si.cardno+"' and pin ='"+si.pin+"' ");
                    stmt.execute();
            
                    JOptionPane.showMessageDialog(f, "Total Balance :- " + balance, "MESSAGE" , JOptionPane.INFORMATION_MESSAGE);
        
                }
                else
                {
                    JOptionPane.showMessageDialog(f, "INSUFFICIENT BALANCE", "MESSAGE" , JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception e)
            {
            e.printStackTrace();
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        JFrame f = new JFrame();
        sign_in si = new sign_in();
        
        try
            {
                PreparedStatement stmt = c.prepareStatement("select * from data where cardno = '"+si.cardno+"' and pin ='"+si.pin+"'");
                ResultSet abc = stmt.executeQuery();
                abc.next();  

                if (5000 < Double.parseDouble(abc.getString(29)))
                {
                    double balance = Double.parseDouble(abc.getString(29)) - 5000;
           
                    stmt = c.prepareStatement("update data set balance = "+balance+" where cardno = '"+si.cardno+"' and pin ='"+si.pin+"' ");
                    stmt.execute();
            
                    JOptionPane.showMessageDialog(f, "Total Balance :- " + balance, "MESSAGE" , JOptionPane.INFORMATION_MESSAGE);
        
                }
                else
                {
                    JOptionPane.showMessageDialog(f, "INSUFFICIENT BALANCE", "MESSAGE" , JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception e)
            {
            e.printStackTrace();
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        JFrame f = new JFrame();
        sign_in si = new sign_in();
        
        try
            {
                PreparedStatement stmt = c.prepareStatement("select * from data where cardno = '"+si.cardno+"' and pin ='"+si.pin+"'");
                ResultSet abc = stmt.executeQuery();
                abc.next();  

                if (10000 < Double.parseDouble(abc.getString(29)))
                {
                    double balance = Double.parseDouble(abc.getString(29)) - 10000;
           
                    stmt = c.prepareStatement("update data set balance = "+balance+" where cardno = '"+si.cardno+"' and pin ='"+si.pin+"' ");
                    stmt.execute();
            
                    JOptionPane.showMessageDialog(f, "Total Balance :- " + balance, "MESSAGE" , JOptionPane.INFORMATION_MESSAGE);
        
                }
                else
                {
                    JOptionPane.showMessageDialog(f, "INSUFFICIENT BALANCE", "MESSAGE" , JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception e)
            {
            e.printStackTrace();
            }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
