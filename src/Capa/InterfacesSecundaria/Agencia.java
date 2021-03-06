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
public class Agencia extends javax.swing.JFrame {

    /**
     * Creates new form Agencia
     */
    public Agencia() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        setTitle("Agencia");
        Rc(ruc);
        numeros(codigo_agencia);
        letras(nombre_gerente);
        letras(ciudad_agencia);
        Telef(telefono_agencia);
    }
    
    private int rc = 13;
    public void Rc (JTextField a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if (!Character.isDigit(c)){
                    //getToolkit().beep();
                    e.consume();
                }
                if (a.getText().length()== rc)
                    e.consume();
            }
        });
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
     public void letras (JTextField a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if (Character.isDigit(c)){
                    //getToolkit().beep();
                    e.consume();
                }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ruc = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        codigo_agencia = new javax.swing.JTextField();
        nombre_gerente = new javax.swing.JTextField();
        correo_agencia = new javax.swing.JTextField();
        ciudad_agencia = new javax.swing.JTextField();
        telefono_agencia = new javax.swing.JTextField();
        BotonIngresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Código:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("RUC :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Gerente:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ciudad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Teléfono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agencias-Debito_opt.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 200, 240));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Correo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 80, 30));

        ruc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ruc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(ruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 150, 20));

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
        getContentPane().add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 170, 50));

        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_opt.png"))); // NOI18N
        Limpiar.setBorder(null);
        Limpiar.setContentAreaFilled(false);
        Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, 60));

        codigo_agencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codigo_agencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(codigo_agencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 80, 20));

        nombre_gerente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre_gerente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(nombre_gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 20));

        correo_agencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correo_agencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(correo_agencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 210, 20));

        ciudad_agencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ciudad_agencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(ciudad_agencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 20));

        telefono_agencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefono_agencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(telefono_agencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 210, 20));

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
        getContentPane().add(BotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 140, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 2, 2, new java.awt.Color(0, 102, 102)));

        jLabel13.setBackground(new java.awt.Color(204, 255, 204));
        jLabel13.setFont(new java.awt.Font("Lucida Console", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("AGENCIAS BANCARIAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 440, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image55ef95555423e5_opt.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 440, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        // TODO add your handling code here:
        /*ConexionSistemaBancario c = new ConexionSistemaBancario();
        c.conectar();

        c.ejecutar("insert into agencia values("+Integer.parseInt(codigo_agencia.getText())+",'"
            +ruc.getText()+"','"
            +nombre_gerente.getText()+"','"
            +correo_agencia.getText()+"',"
            +Integer.parseInt(telefono_agencia.getText())+",'"
            +ciudad_agencia.getText()+"')");

        codigo_agencia.setText("");
        ruc.setText("");
        nombre_gerente.setText("");
        correo_agencia.setText("");
        telefono_agencia.setText("");
        ciudad_agencia.setText("");

        JOptionPane.showMessageDialog(null, "La información se guardo con éxito!");*/
        
        ConexionSistemaBancario cn=new ConexionSistemaBancario().conectar();            // Conecta con la base de datos XE con el usuario system y la contraseña password
        Connection c=cn.getConexion();                                        
        
        try {
            CallableStatement cst = c.prepareCall("{call PA_INSERTAR_AGENCIA (?,?,?,?,?,?)}");
            cst.setInt(1, Integer.parseInt(codigo_agencia.getText()));
            cst.setString(2, ruc.getText());                  
            cst.setString(3, nombre_gerente.getText());
            cst.setString(4, ciudad_agencia.getText());
            cst.setInt(5, Integer.parseInt(telefono_agencia.getText()));            
            cst.setString(6, correo_agencia.getText());            
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
             
        codigo_agencia.setText("");
        ruc.setText("");
        nombre_gerente.setText("");
        ciudad_agencia.setText("");
        telefono_agencia.setText("");
        correo_agencia.setText("");

    }//GEN-LAST:event_BotonIngresarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
        ConexionSistemaBancario f = new ConexionSistemaBancario();
        f.conectar();     

        int id = Integer.parseInt(codigo_agencia.getText());
        ResultSet resultado;

        try{
            resultado = f.consultar("SELECT ruc, nombre_gerente, ciudad_agencia, telefono_agencia, correo_agencia FROM Agencia "
                + "WHERE codigo_agencia ='"+id+"'");

            while ( resultado.next() ) {
                String rcu = resultado.getString("ruc");                
                String nombregerente = resultado.getString("nombre_gerente");
                String ciudadagencia = resultado.getString("ciudad_agencia");
                int telefonoagencia = resultado.getInt("telefono_agencia");
                String correoagencia = resultado.getString("correo_agencia");                                                

                ruc.setText(""+rcu);
                nombre_gerente.setText(""+nombregerente);
                ciudad_agencia.setText(""+ciudadagencia);
                telefono_agencia.setText(""+telefonoagencia);
                correo_agencia.setText(""+correoagencia);               
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

        int codigoagencia = Integer.parseInt(codigo_agencia.getText());

        f.ejecutar("DELETE FROM Agencia WHERE codigo_agencia ='"+codigoagencia+"'");

        ruc.setText("");
        nombre_gerente.setText("");
        ciudad_agencia.setText("");
        telefono_agencia.setText("");
        correo_agencia.setText("");        
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
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField ciudad_agencia;
    private javax.swing.JTextField codigo_agencia;
    private javax.swing.JTextField correo_agencia;
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
    private javax.swing.JTextField nombre_gerente;
    private javax.swing.JTextField ruc;
    private javax.swing.JTextField telefono_agencia;
    // End of variables declaration//GEN-END:variables
}
