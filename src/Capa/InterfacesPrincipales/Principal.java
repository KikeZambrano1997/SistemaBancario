/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa.InterfacesPrincipales;

import Capa.InterfacesSecundaria.Cliente;
import Capa.InterfacesSecundaria.Prestamo;
import Capa.InterfacesSecundaria.Pago;
import Capa.InterfacesSecundaria.Inversion;
import Capa.InterfacesSecundaria.Cuenta;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import Capa.InterfacesSecundaria.Agencia;
import Capa.InterfacesSecundaria.Banco;
import Capa.InterfacesSecundaria.Cliente;
import Capa.InterfacesSecundaria.Cuenta;
import Capa.InterfacesSecundaria.Inversion;
import Capa.InterfacesSecundaria.Pago;
import Capa.InterfacesSecundaria.Prestamo;
import Capa.InterfacesPrincipales.Principal;
/**
 *
 * @author Javier
 */
public class Principal extends javax.swing.JFrame implements Runnable{
    String hora, minutos, segundos;
    Thread hilo;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();                
        txtFecha.setText(fecha());
        hilo = new Thread(this);
        hilo.start();
        setResizable(false);
        setLocationRelativeTo(this);
        setTitle("Sistema Bancario");
    }

    
    public void run(){
        Thread current = Thread.currentThread();
        while(current == hilo){
            hora();
            txtHora.setText(hora+":"+minutos+":"+segundos);
        }
    }
    
    public void hora(){
        Calendar calendario = new GregorianCalendar();
        Date horaActual = new Date();
        calendario.setTime(horaActual);
        hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }  
    
    public static String fecha(){
        Date fecha=new Date();
        SimpleDateFormat formatofecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtHora = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pago = new javax.swing.JButton();
        prestamo = new javax.swing.JButton();
        cuenta = new javax.swing.JButton();
        banco = new javax.swing.JButton();
        inversion = new javax.swing.JButton();
        agencia = new javax.swing.JButton();
        new_cliente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(110, 106, 106));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 2, 2, new java.awt.Color(0, 102, 102)));

        txtHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHora.setForeground(new java.awt.Color(255, 255, 255));
        txtHora.setText("00:00:00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(787, Short.MAX_VALUE)
                .addComponent(txtHora)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 860, -1));

        jPanel1.setBackground(new java.awt.Color(110, 106, 106));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 2, 2, new java.awt.Color(0, 102, 102)));

        txtFecha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setText("dd/mm/aa");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha:");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bandera_de_Ecuador_HD_opt (1).png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarjetas-credito-puertas-de-seguridad_opt.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFecha)
                .addGap(30, 30, 30)
                .addComponent(jLabel14)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 50));

        pago.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoActionPerformed(evt);
            }
        });
        getContentPane().add(pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 300, 60, 40));

        prestamo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamoActionPerformed(evt);
            }
        });
        getContentPane().add(prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 350, 60, 40));

        cuenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentaActionPerformed(evt);
            }
        });
        getContentPane().add(cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 300, 60, 40));

        banco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/house_opt.png"))); // NOI18N
        banco.setBorder(null);
        banco.setContentAreaFilled(false);
        banco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        banco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bancoActionPerformed(evt);
            }
        });
        getContentPane().add(banco, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 150, -1, 90));

        inversion.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        inversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inversionActionPerformed(evt);
            }
        });
        getContentPane().add(inversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 350, 60, 40));

        agencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/house_opt.png"))); // NOI18N
        agencia.setBorder(null);
        agencia.setContentAreaFilled(false);
        agencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agenciaActionPerformed(evt);
            }
        });
        getContentPane().add(agencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 150, -1, 90));

        new_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adduser_añadir_3553_opt.png"))); // NOI18N
        new_cliente.setBorder(null);
        new_cliente.setContentAreaFilled(false);
        new_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        new_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(new_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 90, 80));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("AGENCIAS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 180, 70, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("BANCO");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 50, 20));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1111_opt.png"))); // NOI18N
        jLabel25.setText("jLabel25");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 170, 110, 40));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("PAGO");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 308, 40, 20));

        jLabel24.setFont(new java.awt.Font("Raavi", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("CREAR");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 70, 30));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/centrobanca2.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 180, 120));

        jLabel21.setFont(new java.awt.Font("Chaparral Pro Light", 0, 16)); // NOI18N
        jLabel21.setText("Conmigo:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 60, 50));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yo_opt.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 80, 60));

        jLabel19.setFont(new java.awt.Font("Chaparral Pro Light", 0, 16)); // NOI18N
        jLabel19.setText("Con mi familia:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 100, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dinero.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 60, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casa_opt.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 70, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_opt.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 170, 120, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/la-familia_opt.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 70, 80));

        jLabel15.setFont(new java.awt.Font("Elephant", 0, 16)); // NOI18N
        jLabel15.setText("COLABORA:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, 50));

        jLabel13.setFont(new java.awt.Font("Chaparral Pro Light", 0, 16)); // NOI18N
        jLabel13.setText("Con mi negocio:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 100, 50));

        jLabel12.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("SISTEMA BANCARIO");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 300, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PRÉSTAMO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 357, 70, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("INVERSIÓN");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 357, 70, 20));

        jLabel6.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("NUEVO CLIENTE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 110, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CUENTA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 308, 60, 20));

        jLabel5.setFont(new java.awt.Font("Raavi", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("REALIZAR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 100, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_opt.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 650, 380));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Abstract-Blue-Yellow-Color-Wallpaper_opt.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoActionPerformed
        // TODO add your handling code here:
        Pago obj = new Pago();
        obj.setVisible(true);
    }//GEN-LAST:event_pagoActionPerformed

    private void prestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamoActionPerformed
        // TODO add your handling code here:
        Prestamo obj = new Prestamo();
        obj.setVisible(true);
    }//GEN-LAST:event_prestamoActionPerformed

    private void cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentaActionPerformed
        // TODO add your handling code here:
        Cuenta obj = new Cuenta();
        obj.setVisible(true);
    }//GEN-LAST:event_cuentaActionPerformed

    private void inversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inversionActionPerformed
        // TODO add your handling code here:
        Inversion obj = new Inversion();
        obj.setVisible(true);
    }//GEN-LAST:event_inversionActionPerformed

    private void new_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_clienteActionPerformed
        // TODO add your handling code here:
        Cliente obj = new Cliente();
        obj.setVisible(true);
    }//GEN-LAST:event_new_clienteActionPerformed

    private void agenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agenciaActionPerformed
        // TODO add your handling code here:
        Agencia obj = new Agencia();
        obj.setVisible(true);
    }//GEN-LAST:event_agenciaActionPerformed

    private void bancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bancoActionPerformed
        // TODO add your handling code here:
         Banco obj = new Banco();
        obj.setVisible(true);
    }//GEN-LAST:event_bancoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agencia;
    private javax.swing.JButton banco;
    private javax.swing.JButton cuenta;
    private javax.swing.JButton inversion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton new_cliente;
    private javax.swing.JButton pago;
    private javax.swing.JButton prestamo;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtHora;
    // End of variables declaration//GEN-END:variables
}
