/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.project;

/**
 *
 * @author MARIO
 */
public class MRU extends javax.swing.JPanel {

    /**
     * Creates new form MRU
     */
    public MRU() {
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

        bg = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jLabel8 = new javax.swing.JLabel();
        txtt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txttf = new javax.swing.JTextField();
        Labelinf = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Label7 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label8 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(860, 700));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(52, 177, 208));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calcular");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        panel1.setBackground(new java.awt.Color(52, 177, 208));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tiempo    =");

        txtt.setName("txbt"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Distancia  =");

        txtd.setName("txbd"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Velocidad = ");

        txtv.setName("txbv"); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtv, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(txtd, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(txtt))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 480, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MOVIMIENTO RECTILINEO UNIFORME APLICANDO INTEGRALES");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Datos ");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Tiempo Final = ");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        txttf.setName("txbtf"); // NOI18N
        txttf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txttfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txttfMouseExited(evt);
            }
        });
        txttf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttfActionPerformed(evt);
            }
        });
        bg.add(txttf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 280, -1));

        Labelinf.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Labelinf.setForeground(new java.awt.Color(255, 0, 51));
        bg.add(Labelinf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 430, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Desarrollo Ejercicio");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 250, -1));

        jPanel1.setBackground(new java.awt.Color(52, 177, 208));

        Label7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Label7.setForeground(new java.awt.Color(255, 255, 255));
        Label7.setText("x=0");

        Label6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Label6.setForeground(new java.awt.Color(255, 255, 255));
        Label6.setText("x=vt+c");

        Label5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Label5.setForeground(new java.awt.Color(255, 255, 255));
        Label5.setText("c=0");

        Label1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Label1.setForeground(new java.awt.Color(255, 255, 255));
        Label1.setText("v=dx/dt");
        Label1.setName("label1"); // NOI18N

        Label2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Label2.setForeground(new java.awt.Color(255, 255, 255));
        Label2.setText("∫dx=∫vdt");

        Label8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Label8.setForeground(new java.awt.Color(255, 255, 255));
        Label8.setText("x=vt+c");

        Label4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Label4.setForeground(new java.awt.Color(255, 255, 255));
        Label4.setText("x=vt+c");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label4)
                            .addComponent(Label8)
                            .addComponent(Label5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label2)
                            .addComponent(Label1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label6)
                            .addComponent(Label7))
                        .addGap(81, 81, 81))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label5)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 470, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int d,v,t,c,r,tf;
        d=Integer.parseInt(txtd.getText());
        v=Integer.parseInt(txtv.getText());
        t=Integer.parseInt(txtt.getText());
        tf=Integer.parseInt(txttf.getText());
        c=d-(v*t);
        r=(v*tf)+c;
        
        
        Label1.setText(txtv.getText()+"=dx/dv");
        Label2.setText("∫dx=∫"+txtv.getText()+"dt");
        Label4.setText(txtd.getText()+"="+txtv.getText()+"("+txtt.getText()+")+c");
        Label5.setText("c="+c);
        Label6.setText("x="+txtv.getText()+"("+txttf.getText()+")+"+c);
        Label7.setText("x="+r);
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int d,v,t,c,r,tf;
        d=Integer.parseInt(txtd.getText());
        v=Integer.parseInt(txtv.getText());
        t=Integer.parseInt(txtt.getText());
        tf=Integer.parseInt(txttf.getText());
        c=d-(v*t);
        r=(v*tf)+c;
        Label1.setText(txtv.getText()+"=dx/dv");
        Label2.setText("∫dx=∫"+txtv.getText()+"dt");
        Label4.setText(txtd.getText()+"="+txtv.getText()+"("+txtt.getText()+")+c");
        Label5.setText("c="+c);
        Label6.setText("x="+txtv.getText()+"("+txttf.getText()+")+"+c);
        Label7.setText("x="+r);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttfMouseEntered
        // TODO add your handling code here:
        Labelinf.setText("Tiempo para hallar la posición real");
    }//GEN-LAST:event_txttfMouseEntered

    private void txttfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttfMouseExited
        // TODO add your handling code here:
        Labelinf.setText("");
    }//GEN-LAST:event_txttfMouseExited

    private void txttfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JLabel Label8;
    private javax.swing.JLabel Labelinf;
    private javax.swing.JPanel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private java.awt.Panel panel1;
    private javax.swing.JTextField txtd;
    private javax.swing.JTextField txtt;
    private javax.swing.JTextField txttf;
    private javax.swing.JTextField txtv;
    // End of variables declaration//GEN-END:variables
}
