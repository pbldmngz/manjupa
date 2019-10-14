/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import static java.lang.Integer.parseInt;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Ale
 */
public class login extends javax.swing.JFrame {
    

    public static final String URL = "jdbc:mysql://localhost:3306/csm?autoReconnect=true&useSSL=false";
    public static final String mysql_user = "root";
    public static final String mysql_pass = "123456789";
    public static int user_numeric_level = 0;
    public static String user_name;
    public static String user_level;
    public static String user_email;
    public static int user_no;
    public static String user_tel;

    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/user2.png")).getImage());
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel_User = new javax.swing.JLabel();
        password_field = new javax.swing.JPasswordField();
        email_field = new javax.swing.JTextField();
        login_button = new javax.swing.JButton();
        jLabel_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 20, 20));

        jLabel_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user2.png"))); // NOI18N
        getContentPane().add(jLabel_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 200, 210));

        password_field.setBackground(new java.awt.Color(153, 153, 153));
        password_field.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        password_field.setForeground(new java.awt.Color(255, 255, 255));
        password_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_field.setText("password");
        password_field.setToolTipText("");
        password_field.setBorder(null);
        password_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password_fieldFocusLost(evt);
            }
        });
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 300, 30));

        email_field.setBackground(new java.awt.Color(153, 153, 153));
        email_field.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        email_field.setForeground(new java.awt.Color(255, 255, 255));
        email_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email_field.setText("e-mail");
        email_field.setBorder(null);
        email_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                email_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_fieldFocusLost(evt);
            }
        });
        email_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(email_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 300, 30));

        login_button.setBackground(new java.awt.Color(0, 0, 0));
        login_button.setFont(new java.awt.Font("Anonymous Pro", 0, 18)); // NOI18N
        login_button.setForeground(new java.awt.Color(255, 255, 255));
        login_button.setText("LOGIN");
        login_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 300, 50));

        jLabel_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 402, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static Connection getConection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, mysql_user, mysql_pass);

        } catch (Exception e) {
            System.out.println(e);

        }
        return con;
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed

        try {
            Connection con = null;
            con = getConection();

            PreparedStatement ps;
            ResultSet res;
            ps = (PreparedStatement) con.prepareStatement("select nivel, nombre, apellido_p, apellido_m, login.correo, profesor.noEmpleado, profesor.telefono from login, profesor where login.correo = ? and contraseña = ? and login.noEmpleado = profesor.noEmpleado");
            ps.setString(1, email_field.getText());
            ps.setString(2, password_field.getText());
            res = ps.executeQuery();
            if (res.next()) {
                user_numeric_level = res.getInt("nivel");

                switch (user_numeric_level) {
                    case 1:
                        user_level = "Administrador";
                        break;
                    case 2:
                        user_level = "Coordinador";
                        break;
                    case 3:
                        user_level = "Profesor";
                        break;
                    default:
                        System.out.println("error en switch login");
                        break;
                }

                //si se cambia a que el tab controle el fondo del main hay error en estas 3 lineas
                user_name = res.getString("nombre") + " " + res.getString("apellido_p") + " " + res.getString("apellido_m");
                user_name = user_name.toUpperCase();
                user_email = res.getString("login.correo").toUpperCase();
                user_no = res.getInt("profesor.noEmpleado");
                user_tel = res.getString("profesor.telefono");

                main main = new main();
                main.setVisible(true);
                this.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(null, "error al intentar acceder"); //no existen datos (puede ser porque el usuario o contraseña está mal)
            }

        } catch (Exception e) {
            System.out.println("Error en try/catch login_button");
        }

    }//GEN-LAST:event_login_buttonActionPerformed

    private void email_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_fieldActionPerformed

    }//GEN-LAST:event_email_fieldActionPerformed

    public void textfieldMouseClicked(java.awt.event.MouseEvent evt) {                                      
    email_field.setText(null);
    }     

    public void textfieldFocusLost(java.awt.event.FocusEvent evt) {                                   
        email_field.setText("Username");
    }

    
    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed

    private void email_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_fieldFocusGained

        email_field.setText("");
    }//GEN-LAST:event_email_fieldFocusGained

    private void email_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_fieldFocusLost

    }//GEN-LAST:event_email_fieldFocusLost

    private void password_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_fieldFocusGained

        password_field.setText("");

    }//GEN-LAST:event_password_fieldFocusGained

    private void password_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_fieldFocusLost

    }//GEN-LAST:event_password_fieldFocusLost

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }

        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email_field;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel_Fondo;
    private javax.swing.JLabel jLabel_User;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField password_field;
    // End of variables declaration//GEN-END:variables
}
