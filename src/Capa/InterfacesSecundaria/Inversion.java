/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa.InterfacesSecundaria;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sistema_bancario.ConexionSistemaBancario;
/**
 *
 * @author Javier
 */
public class Inversion extends javax.swing.JFrame {

    /**
     * Creates new form Inversion
     */
    public Inversion() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        setTitle("Inversion");
        Telef(cedula_cliente);
        numeros(id_inversion);
        numeros(capital_inversion);
        numeros(interes_inversion);
    }
    
    public void numeros (JTextField a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if (!Character.isDigit(c)){
                    //getToolkit().beep();
                    e.consume();
                }
            }
        });
    }
    
    private int ct = 10;
    public void Telef (JTextField a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if (!Character.isDigit(c)){
                    //getToolkit().beep();
                    e.consume();
                }
                if (a.getText().length()== ct)
                    e.consume();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        capital_inversion = new javax.swing.JTextField();
        plazo_inversion = new javax.swing.JTextField();
        id_inversion = new javax.swing.JTextField();
        cedula_cliente = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        interes_inversion = new javax.swing.JTextField();
        fecha_inversion = new javax.swing.JTextField();
        BotonIngresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 30, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CI Cliente:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Fecha Inversión:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Capital:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Plazo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Interés:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 80, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inversion creciente_opt.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 210, 120));

        capital_inversion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        capital_inversion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(capital_inversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 140, 20));

        plazo_inversion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        plazo_inversion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(plazo_inversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, 20));

        id_inversion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_inversion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(id_inversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 70, 30));

        cedula_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cedula_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(cedula_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 160, 20));

        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_opt.png"))); // NOI18N
        Limpiar.setBorder(null);
        Limpiar.setContentAreaFilled(false);
        Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, 60));

        BotonBuscar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar-TuneaTaringa_opt.png"))); // NOI18N
        BotonBuscar.setBorder(null);
        BotonBuscar.setContentAreaFilled(false);
        BotonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 170, 50));

        interes_inversion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        interes_inversion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(interes_inversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 140, 20));

        fecha_inversion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_inversion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(fecha_inversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 140, 20));

        BotonIngresar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        BotonIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar_opt.png"))); // NOI18N
        BotonIngresar.setBorder(null);
        BotonIngresar.setContentAreaFilled(false);
        BotonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 140, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 2, 2, new java.awt.Color(0, 102, 102)));

        jLabel13.setBackground(new java.awt.Color(204, 255, 204));
        jLabel13.setFont(new java.awt.Font("Lucida Console", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("INVERSIÓN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 390, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image55ef95555423e5_opt.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 390, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        // TODO add your handling code here:
        ConexionSistemaBancario cn=new ConexionSistemaBancario().conectar();            // Conecta con la base de datos XE con el usuario system y la contraseña password
        Connection c=cn.getConexion();                                        
        
        try {
            CallableStatement cst = c.prepareCall("{call PA_INSERTAR_INVERSION (?,?,?,?,?,?)}");
            cst.setInt(1, Integer.parseInt(id_inversion.getText()));
            cst.setInt(2, Integer.parseInt(cedula_cliente.getText()));
            cst.setString(3, fecha_inversion.getText());
            cst.setInt(4, Integer.parseInt(capital_inversion.getText()));
            cst.setString(5, plazo_inversion.getText());
            cst.setInt(6, Integer.parseInt(interes_inversion.getText()));                       
            cst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage());
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage());
            }
        }
                                                                        
        id_inversion.setText("");
        cedula_cliente.setText("");
        fecha_inversion.setText("");
        capital_inversion.setText("");
        plazo_inversion.setText("");
        interes_inversion.setText("");
                
        //JOptionPane.showMessageDialog(null, "La información se guardo con éxito!");                          
    }//GEN-LAST:event_BotonIngresarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
        ConexionSistemaBancario f = new ConexionSistemaBancario();
        f.conectar();
        String fecha = null;

        int id = Integer.parseInt(id_inversion.getText());
        ResultSet resultado;

        try{
            resultado = f.consultar("SELECT cedula_cliente, fecha_inversion, capital_inversion, plazo_inversion, interes_inversion FROM Inversion "
                + "WHERE id_inversion ='"+id+"'");

            while ( resultado.next() ) {
                int cedulacliente = resultado.getInt("cedula_cliente");
                
                fecha=resultado.getString("fecha_inversion");
                String dia=fecha.substring(8, 10);
                String mes=fecha.substring(5, 7);
                String anio=fecha.substring(0, 4);                
                fecha_inversion.setText(dia+"-"+mes+"-"+anio);      
                
                int capitalinversion = resultado.getInt("capital_inversion");
                
                fecha=resultado.getString("plazo_inversion");
                dia=fecha.substring(8, 10);
                mes=fecha.substring(5, 7);
                anio=fecha.substring(0, 4);
                plazo_inversion.setText(dia+"-"+mes+"-"+anio);              
                                     
                int interesinversion = resultado.getInt("interes_inversion");

                cedula_cliente.setText(""+cedulacliente);
                capital_inversion.setText(""+capitalinversion);                                                
                interes_inversion.setText(""+interesinversion);
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion con la base de datos");
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
        ConexionSistemaBancario f = new ConexionSistemaBancario();
        f.conectar();

        int idinversion = Integer.parseInt(id_inversion.getText());

        f.ejecutar("DELETE FROM Inversion WHERE id_inversion ='"+idinversion+"'");

        cedula_cliente.setText("");
        fecha_inversion.setText("");
        capital_inversion.setText("");
        plazo_inversion.setText("");
        interes_inversion.setText("");        

        JOptionPane.showMessageDialog(null, "Dato eliminado con éxito!");
    }//GEN-LAST:event_LimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Inversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inversion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField capital_inversion;
    private javax.swing.JTextField cedula_cliente;
    private javax.swing.JTextField fecha_inversion;
    private javax.swing.JTextField id_inversion;
    private javax.swing.JTextField interes_inversion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField plazo_inversion;
    // End of variables declaration//GEN-END:variables
}