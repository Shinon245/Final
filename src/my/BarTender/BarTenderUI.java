/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.BarTender;
import static kiss.API.*;
import junit.framework.*;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Cameron
 */
public class BarTenderUI extends javax.swing.JFrame {
        Boolean Kerryserved = false , Melissaserved = false, Steveserved = false;
        Bartender Steve = new Bartender("Steve", 0);
        Bartender Melissa = new Bartender("Melissa", 0);
        Bartender Kerry = new Bartender("Kerry", 0);

    public BarTenderUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Serve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Name:");

        jLabel2.setText("Age:");

        jLabel3.setText("The Bartenders' Best Friend");

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Kerry", "Melissa", "Steve" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel4.setText("Bartender");

        jButton3.setText("Clear Log");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(140, 140, 140)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   class ServeBeer implements Runnable {
   private String customer;
   private String server;
   private Thread C;
   
   ServeBeer(String name, String servername) {
      server = servername;
      customer = name;
   }
   
   public void run() {
      jTextArea1.setText(jTextArea1.getText() + "\n" + customer + " is drinking" );
      try {
         for(int i = 0; i < 4; i++) {
            jTextArea1.setText(jTextArea1.getText() + "\n" + customer + " drunk level is: " + (i*2) + "\n");
            // Let the thread sleep for a while.
            Thread.sleep(10000);
         }
      }catch (InterruptedException e) {
         jTextArea1.setText("Thread " +  customer + " interrupted.");
   }
      jTextArea1.setText(jTextArea1.getText() + "\n" + customer + " kicked out." + "\n");
      if (server == "Kerry")
      {
          Kerry.setServe(Kerry.getServe()-1); 
      }
      if (server == "Melissa")
      {
          Melissa.setServe(Melissa.getServe()-1); 
      }
      if (server == "Steve")
      {
          Steve.setServe(Steve.getServe()-1); 
      }
   }
   
   public void start () {
      jTextArea1.setText(jTextArea1.getText() + server + " served " +  customer );
      if (C == null) {
         C = new Thread (this, customer);
         C.start ();
      }
   }
}
   
   
   public class Bartender {
       String tendername;
       int serving;
       
       public Bartender(String name, int serve) {
           tendername = name;
           serving = serve;
       }
       
       public int getServe() {
           return serving;
       }
       
       public void setServe(int num) {
           serving = num;
       }
       
       public void Serve(String custname, int custage) {
            if (serving <= 3)
            {
                assertEquals((serving <= 3),true);
                Customer newCust = new Customer(tendername, custname, custage);
                newCust.serveDrink();
            }
            else 
            {
                jTextArea1.setText(jTextArea1.getText() + tendername + " can't serve any more customers!" + "\n");
                if (tendername == "Kerry")
            {
                 Kerry.setServe(Kerry.getServe()-1); 
            }
                if (tendername == "Melissa")
            {
                 Melissa.setServe(Melissa.getServe()-1); 
            }
                if (tendername == "Steve")
            {
                 Steve.setServe(Steve.getServe()-1); 
            }
            } 
       }
   }
    
    
    
    public class Customer {
        String custname, servername;
        int custAge;
        boolean drink;
        
        public Customer(String server, String name, int age) {
            servername = server;
            custname = name;
            custAge = age;
        }
        
        public String getName() {
            return custname;
        }
        
        
        public int getAge() {
            return custAge;
        }
        
        public void setDrink() {
            if(getAge() >= 21) drink = true;
            else drink = false;
        }
        
        public boolean getDrink() {
            return drink;
        }
        
        public void serveDrink() {
            assertEquals(custname, getName());
            assertEquals(custAge, getAge());
            setDrink();
            if (getDrink() == true)
            {
                assertEquals(getDrink(), true);
                ServeBeer C1 = new ServeBeer(custname, servername);
                C1.start(); 
            }
           else 
            {
                jTextArea1.setText(jTextArea1.getText() + custname + " was served water!" + "\n");
                if (servername == "Kerry" && Kerry.getServe() > 0)
                 {
                      Kerry.setServe(Kerry.getServe()-1); 
                      assertEquals((Kerry.getServe() >= 0),true);
                 }
                 if (servername == "Melissa" && Melissa.getServe() > 0)
                {
                     Melissa.setServe(Melissa.getServe()-1);
                     assertEquals((Melissa.getServe() >= 0),true);
                }
                 if (servername == "Steve" && Steve.getServe() > 0)
                {
                     Steve.setServe(Steve.getServe()-1); 
                     assertEquals((Steve.getServe() >= 0),true);
                 }
                assertEquals(getDrink(), false);
            }
        }
           
    }
    
    
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String tendername = jList1.getSelectedValue();
        String name = jTextField1.getText().trim();
        int age = Integer.parseInt(jTextField2.getText().trim());
        if(tendername == "Kerry" && Kerryserved == true)
            {
                assertEquals(Kerryserved,true);
                Kerry.setServe(Kerry.getServe()+1);
                Kerry.Serve(name, age);
            }
        
        if(tendername == "Melissa" && Melissaserved == true)
            {
                assertEquals(Melissaserved,true);
                Melissa.setServe(Melissa.getServe()+1);
                Melissa.Serve(name, age);
            }
                
        if(tendername == "Steve" && Steveserved == true)
            {
                assertEquals(Steveserved,true);
                Steve.setServe(Steve.getServe()+1);
                Steve.Serve(name, age);
            }
        
        if(tendername == "Kerry" && Kerryserved == false)
            {
                Kerry.Serve(name, age);
                Kerry.setServe(1);
                Kerryserved = true;
            }
        
        if(tendername == "Melissa" && Melissaserved == false)
            {
                Melissa.Serve(name, age);
                Melissa.setServe(1);
                Melissaserved = true;
            }
                
        if(tendername == "Steve" && Steveserved == false)
            {
                Steve.Serve(name, age);
                Steve.setServe(1);
                Steveserved = true;
            } 
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BarTenderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarTenderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarTenderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarTenderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarTenderUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
