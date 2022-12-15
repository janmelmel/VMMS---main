/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class VehicleService extends javax.swing.JFrame {

    /**
     * Creates new form VehicleService
     * @param id
     */
    public VehicleService(int id) {
        initComponents();
        this.vehicleId = id;
    }
    
    
    DefaultTableModel model;
    String service;
    int price;
    int vehicleId;
            
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst1;

    private VehicleService() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableService = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblengine = new javax.swing.JRadioButton();
        lbltrans = new javax.swing.JRadioButton();
        lblbattery = new javax.swing.JRadioButton();
        lblalternator = new javax.swing.JRadioButton();
        lblradiator = new javax.swing.JRadioButton();
        lblfaxle = new javax.swing.JRadioButton();
        lblbrake = new javax.swing.JRadioButton();
        lblsteer = new javax.swing.JRadioButton();
        lblcat = new javax.swing.JRadioButton();
        lblmuffler = new javax.swing.JRadioButton();
        lblfuel = new javax.swing.JRadioButton();
        lbltailpipe = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtqty = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpay = new javax.swing.JTextField();
        txtbal = new javax.swing.JTextField();
        lbltotal = new javax.swing.JLabel();
        txttot = new javax.swing.JTextField();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(135, 88, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Vehicle Servicing");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(135, 88, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(135, 88, 255));
        jLabel4.setText("Short Term Maintenance");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Print Invoice");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addButton.setText("Add");
        addButton.setToolTipText("");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        tableService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service", "Price", "Additional Parts", "Total"
            }
        ));
        jScrollPane2.setViewportView(tableService);

        jPanel4.setBackground(new java.awt.Color(135, 88, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblengine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblengine.setText("Engine");
        lblengine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblengineActionPerformed(evt);
            }
        });

        lbltrans.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbltrans.setText("Transmission");
        lbltrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbltransActionPerformed(evt);
            }
        });

        lblbattery.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblbattery.setText("Battery");
        lblbattery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblbatteryActionPerformed(evt);
            }
        });

        lblalternator.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblalternator.setText("Alternator");
        lblalternator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblalternatorActionPerformed(evt);
            }
        });

        lblradiator.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblradiator.setText("Radiator");
        lblradiator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblradiatorActionPerformed(evt);
            }
        });

        lblfaxle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblfaxle.setText("Front Axle");
        lblfaxle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblfaxleActionPerformed(evt);
            }
        });

        lblbrake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblbrake.setText("Brakes");
        lblbrake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblbrakeActionPerformed(evt);
            }
        });

        lblsteer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblsteer.setText("Front Steering & Suspension");
        lblsteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblsteerActionPerformed(evt);
            }
        });

        lblcat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblcat.setText("Catalytic Converter");
        lblcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblcatActionPerformed(evt);
            }
        });

        lblmuffler.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblmuffler.setText("Muffler");
        lblmuffler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblmufflerActionPerformed(evt);
            }
        });

        lblfuel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblfuel.setText("Fuel Tank");
        lblfuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblfuelActionPerformed(evt);
            }
        });

        lbltailpipe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbltailpipe.setText("Tailpipe");
        lbltailpipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbltailpipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblengine)
                    .addComponent(lbltrans)
                    .addComponent(lblbattery)
                    .addComponent(lblalternator)
                    .addComponent(lblradiator)
                    .addComponent(lblfaxle)
                    .addComponent(lblbrake)
                    .addComponent(lblsteer)
                    .addComponent(lblcat)
                    .addComponent(lblmuffler)
                    .addComponent(lblfuel)
                    .addComponent(lbltailpipe))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblengine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltrans)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblbattery)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblalternator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblradiator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblfaxle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsteer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblbrake)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblmuffler)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltailpipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblfuel)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Addtional Parts");

        txtqty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Payment");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Balance");

        txtpay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpayActionPerformed(evt);
            }
        });

        txtbal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbalActionPerformed(evt);
            }
        });

        lbltotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbltotal.setText("Total");

        txttot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txttot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotActionPerformed(evt);
            }
        });

        removeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        removeButton.setText("Remove");
        removeButton.setToolTipText("");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtpay)
                                .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(lbltotal)
                            .addComponent(txttot)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lbltotal)
                        .addGap(18, 18, 18)
                        .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpay, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if(lblengine.isSelected()==true){
            price = 50000;
            service = "Engine Check";
        }else if(lbltrans.isSelected()==true){   
            price = 15000;
            service = "Transmissions Check";
        }else if(lblbattery.isSelected()==true){   
            price = 6000;
            service = "Battery";
        }else if(lblalternator.isSelected()==true){   
            price = 5500;
            service = "Alternator";
        }else if(lblradiator.isSelected()==true){   
            price = 15000;
            service = "Radiator Check";
        }else if(lblfaxle.isSelected()==true){   
            price = 7500;
            service = "Front Axle";
        }else if(lblsteer.isSelected()==true){   
            price = 2500;
            service = "Front Steering and Suspension";
        }else if(lblbrake.isSelected()==true){   
            price = 1100;
            service = "Brake Replacement";
        }else if(lblcat.isSelected()==true){   
            price = 2000;
            service = "Catalytic Converter";
        }else if(lblmuffler.isSelected()==true){   
            price = 3700;
            service = "Muffler Check";
        }else if(lbltailpipe.isSelected()==true){   
            price = 35000;
            service = "Tailpipe Check";
        }else if(lblfuel.isSelected()==true){   
            price = 30000;
            service = "Fuel Tank Check";
        }
        
        int adds = Integer.parseInt(txtqty.getValue().toString());
        int tot = adds*price;
        if(tot>0){
            model =  (DefaultTableModel)tableService.getModel();
            model.addRow(new Object[]
                
            {
                service,
                price,
                adds,   
                tot
            });
        
            int sum = 0;     
            for(int a = 0;a<tableService.getRowCount();a++){
                  sum = sum+Integer.parseInt(tableService.getValueAt(a,3).toString());
            }
                txttot.setText(Integer.toString(sum));
        }
        
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void lblengineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblengineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblengineActionPerformed

    private void lbltransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbltransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbltransActionPerformed

    private void lblbatteryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblbatteryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblbatteryActionPerformed

    private void lblalternatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblalternatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblalternatorActionPerformed

    private void lblradiatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblradiatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblradiatorActionPerformed

    private void lblfaxleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblfaxleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblfaxleActionPerformed

    private void lblbrakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblbrakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblbrakeActionPerformed

    private void lblsteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblsteerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblsteerActionPerformed

    private void lblcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblcatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblcatActionPerformed

    private void lblmufflerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblmufflerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblmufflerActionPerformed

    private void lblfuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblfuelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblfuelActionPerformed

    private void lbltailpipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbltailpipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbltailpipeActionPerformed

    private void txtbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbalActionPerformed

    private void txtpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpayActionPerformed

    private void txttotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        model.removeRow(tableService.getSelectedRow());
        
        int sum = 0;
        for(int a = 0;a<tableService.getRowCount();a++){
            sum = sum+Integer.parseInt(tableService.getValueAt(a,3).toString());
        }
        
        txttot.setText(Integer.toString(sum));
    }//GEN-LAST:event_removeButtonActionPerformed

     public void sales() throws SQLException{
        int lastID = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/service_db","root","");
            
            String total = txttot.getText();
            String bal = txtbal.getText();
            String pay = txtpay.getText();
            
            String query = "INSERT INTO sales(subtotal,pay,balance) VALUES (?,?,?)";
            pst = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            pst.setString(1,total);
            pst.setString(2,pay);
            pst.setString(3,bal);
            pst.executeUpdate();
            
            ResultSet rs = pst.getGeneratedKeys();
            
            if(rs.next()){
                lastID = rs.getInt(1);
            }
            
            int row = tableService.getRowCount();
            
            String query1 = "INSERT INTO sales_prod(sales_id,servname,price,adds,total) VALUES (?,?,?,?,?)";
            pst1 = con.prepareStatement(query1);
            
            String prodname = "";
            int price;
            int adds;
            int tot = 0;
            
            for(int i=0;i<tableService.getRowCount(); i++){
                prodname = (String) tableService.getValueAt(i,0);
                price = (int) tableService.getValueAt(i,1);
                adds = (int) tableService.getValueAt(i,2);
                tot = (int) tableService.getValueAt(i,3);
                
                pst1.setInt(1,lastID);
                pst1.setString(2,prodname);
                pst1.setInt(3,price);
                pst1.setInt(4,adds);
                pst1.setInt(5,tot);
                pst1.executeUpdate();
            }
            JOptionPane.showMessageDialog(this, "Purchase Successful!");
            
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(VehicleService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int tot = Integer.parseInt(txttot.getText());
        int pay = Integer.parseInt(txtpay.getText());
        
        int bal = pay-tot;
        txtbal.setText(String.valueOf(bal));
        
        try {
            sales();
        } catch (SQLException ex) {
            Logger.getLogger(VehicleService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
 
    
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
            java.util.logging.Logger.getLogger(VehicleService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleService().setVisible(true);
            }
        });
    }     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton lblalternator;
    private javax.swing.JRadioButton lblbattery;
    private javax.swing.JRadioButton lblbrake;
    private javax.swing.JRadioButton lblcat;
    private javax.swing.JRadioButton lblengine;
    private javax.swing.JRadioButton lblfaxle;
    private javax.swing.JRadioButton lblfuel;
    private javax.swing.JRadioButton lblmuffler;
    private javax.swing.JRadioButton lblradiator;
    private javax.swing.JRadioButton lblsteer;
    private javax.swing.JRadioButton lbltailpipe;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JRadioButton lbltrans;
    private javax.swing.JButton removeButton;
    private javax.swing.JTable tableService;
    private javax.swing.JTextField txtbal;
    private javax.swing.JTextField txtpay;
    private javax.swing.JSpinner txtqty;
    private javax.swing.JTextField txttot;
    // End of variables declaration//GEN-END:variables

    private static class checkbox {

        public checkbox() {
        }
    }
}