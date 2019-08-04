/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import com.mysql.jdbc.Connection;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static ventana.login.URL;
import static ventana.login.mysql_pass;
import static ventana.login.mysql_user;
import static ventana.login.user_no;

/**
 *
 * @author Ale
 */
public class main extends javax.swing.JFrame {

    boolean nombre_isEnabled = false;
    boolean apellido1_isEnabled = false;
    boolean apellido2_isEnabled = false;

    public String mat;
    private String listProf;
    private String listAlumnos;
    private String listNotificaciones;

    public main() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/user2.png")).getImage());
        loadNotifications();
        loadList(rbutton_alumnos.isSelected());
    }

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

//    private void undefinnedOrder() {
//
//        try {
//            Connection con = null;
//            con = getConection();
//
//            PreparedStatement ps;
//            ResultSet res;
//            ps = (PreparedStatement) con.prepareStatement("select * from alumno");
////            ps.setString(1, data1.getText());
////            ps.setString(2, data2.getText());
//            res = ps.executeQuery();
//            if (res.next()) {
//
//
//            } else {
//                JOptionPane.showMessageDialog(null, "error al intentar acceder"); //no existen datos (puede ser porque el usuario o contraseña está mal)
//            }
//
//        } catch (Exception e) {
//            System.out.println("Error en try/catch");
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_perfil = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        noEmpleado = new javax.swing.JLabel();
        Level = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        telefono = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        user_name = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        user_icon = new javax.swing.JLabel();
        panel_notificaciones = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        campo_mensaje = new javax.swing.JTextField();
        campo_profesor = new javax.swing.JTextField();
        update_not = new javax.swing.JButton();
        enviar_mensaje = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        not_area = new javax.swing.JTextArea();
        panel_listado = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Listado = new javax.swing.JTextArea();
        actualizar_listado_alumnos_boton = new javax.swing.JButton();
        data_listado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbutton_alumnos = new javax.swing.JRadioButton();
        rbutton_prof = new javax.swing.JRadioButton();

        jMenu1.setText("jMenu1");

        buttonGroup2.add(rbutton_alumnos);
        buttonGroup2.add(rbutton_prof);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 153));
        jTabbedPane1.setFont(new java.awt.Font("Anonymous Pro", 0, 11)); // NOI18N

        panel_perfil.setBackground(new java.awt.Color(0, 102, 204));
        panel_perfil.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        panel_perfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(4, 2, 45));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 11, 64));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        noEmpleado.setFont(new java.awt.Font("Anonymous Pro", 0, 24)); // NOI18N
        noEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        noEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noEmpleado.setText("n° " + login.user_no);
        jPanel6.add(noEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 230, 40));

        Level.setFont(new java.awt.Font("Anonymous Pro", 0, 24)); // NOI18N
        Level.setForeground(new java.awt.Color(255, 255, 255));
        Level.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Level.setText(login.user_level);
        jPanel6.add(Level, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 230, 40));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 230, 190));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Anonymous Pro", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("HERRAMIENTAS ADMINISTRATIVAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 460, -1));

        telefono.setFont(new java.awt.Font("Anonymous Pro", 0, 24)); // NOI18N
        telefono.setForeground(new java.awt.Color(255, 255, 255));
        telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefono.setText(login.user_tel);
        jPanel2.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 530, 40));

        correo.setFont(new java.awt.Font("Anonymous Pro", 0, 24)); // NOI18N
        correo.setForeground(new java.awt.Color(255, 255, 255));
        correo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correo.setText(login.user_email);
        jPanel2.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 530, 40));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Anonymous Pro", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CERRAR SESION");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 460, -1));

        user_name.setFont(new java.awt.Font("Anonymous Pro", 0, 24)); // NOI18N
        user_name.setForeground(new java.awt.Color(255, 255, 255));
        user_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_name.setText(login.user_name);
        jPanel2.add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 530, 40));

        jPanel5.setBackground(new java.awt.Color(0, 11, 64));
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 460, 190));

        user_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user2.png"))); // NOI18N
        jPanel2.add(user_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 220, -1));

        panel_perfil.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 10, 580, 650));

        jTabbedPane1.addTab("PERFIL DE PROFESOR", panel_perfil);

        panel_notificaciones.setBackground(new java.awt.Color(0, 102, 153));
        panel_notificaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Chaparral Pro", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENVIAR NOTIFICACIÓN A UN PROFESOR");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 530, -1));

        panel_notificaciones.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 530, 40));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campo_mensaje.setBackground(new java.awt.Color(255, 255, 255));
        campo_mensaje.setFont(new java.awt.Font("Anonymous Pro", 0, 18)); // NOI18N
        campo_mensaje.setForeground(new java.awt.Color(0, 0, 0));
        campo_mensaje.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campo_mensaje.setText("inserte cuerpo del mensaje");
        campo_mensaje.setMargin(new java.awt.Insets(0, 20, 0, 20));
        jPanel1.add(campo_mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 380, 50));

        campo_profesor.setBackground(new java.awt.Color(255, 255, 255));
        campo_profesor.setFont(new java.awt.Font("Anonymous Pro", 0, 18)); // NOI18N
        campo_profesor.setForeground(new java.awt.Color(0, 0, 0));
        campo_profesor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campo_profesor.setText("nombre primer_apellido segundo_apellido");
        campo_profesor.setMargin(new java.awt.Insets(0, 20, 0, 20));
        campo_profesor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campo_profesorFocusGained(evt);
            }
        });
        jPanel1.add(campo_profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 490, 30));

        update_not.setBackground(new java.awt.Color(0, 102, 102));
        update_not.setFont(new java.awt.Font("Chaparral Pro", 0, 18)); // NOI18N
        update_not.setForeground(new java.awt.Color(255, 255, 255));
        update_not.setText("ACTUALIZAR");
        update_not.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_notActionPerformed(evt);
            }
        });
        jPanel1.add(update_not, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 530, 40));

        enviar_mensaje.setBackground(new java.awt.Color(0, 102, 102));
        enviar_mensaje.setFont(new java.awt.Font("Chaparral Pro", 0, 18)); // NOI18N
        enviar_mensaje.setForeground(new java.awt.Color(255, 255, 255));
        enviar_mensaje.setText("ENVIAR");
        enviar_mensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_mensajeActionPerformed(evt);
            }
        });
        jPanel1.add(enviar_mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 100, 50));

        jPanel8.setBackground(new java.awt.Color(0, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Chaparral Pro", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BANDEJA DE ENTRADA");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 530, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 40));

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 153));

        not_area.setEditable(false);
        not_area.setBackground(new java.awt.Color(0, 36, 67));
        not_area.setColumns(20);
        not_area.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        not_area.setForeground(new java.awt.Color(255, 255, 255));
        not_area.setRows(5);
        jScrollPane1.setViewportView(not_area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 530, 400));

        panel_notificaciones.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 570, 650));

        jTabbedPane1.addTab("CENTRO DE NOTIFICACIONES", panel_notificaciones);

        panel_listado.setBackground(new java.awt.Color(0, 102, 0));
        panel_listado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Listado.setBackground(new java.awt.Color(0, 36, 67));
        Listado.setColumns(20);
        Listado.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        Listado.setForeground(new java.awt.Color(255, 255, 255));
        Listado.setRows(5);
        jScrollPane2.setViewportView(Listado);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 540));

        actualizar_listado_alumnos_boton.setBackground(new java.awt.Color(0, 102, 102));
        actualizar_listado_alumnos_boton.setFont(new java.awt.Font("Chaparral Pro", 0, 18)); // NOI18N
        actualizar_listado_alumnos_boton.setForeground(new java.awt.Color(255, 255, 255));
        actualizar_listado_alumnos_boton.setText("ACTUALIZAR LISTADO");
        actualizar_listado_alumnos_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_listado_alumnos_botonActionPerformed(evt);
            }
        });
        jPanel4.add(actualizar_listado_alumnos_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 530, 40));

        data_listado.setBackground(new java.awt.Color(255, 255, 255));
        data_listado.setFont(new java.awt.Font("Chaparral Pro", 0, 24)); // NOI18N
        data_listado.setForeground(new java.awt.Color(0, 0, 0));
        data_listado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        data_listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_listadoActionPerformed(evt);
            }
        });
        jPanel4.add(data_listado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 390, 40));

        jLabel4.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BÚSQUEDA SELECTIVA");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 575, 390, 40));

        rbutton_alumnos.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        rbutton_alumnos.setForeground(new java.awt.Color(255, 255, 255));
        rbutton_alumnos.setSelected(true);
        rbutton_alumnos.setText("ALUMNOS");
        jPanel4.add(rbutton_alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, -1, -1));

        rbutton_prof.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        rbutton_prof.setForeground(new java.awt.Color(255, 255, 255));
        rbutton_prof.setText("PROFESORES");
        jPanel4.add(rbutton_prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, -1, -1));

        panel_listado.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 540, 650));

        jTabbedPane1.addTab("  LISTADO ", panel_listado);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviar_mensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_mensajeActionPerformed

        Connection con;
        PreparedStatement st;
        ResultSet rs;
        int empleado = 0;
        String[] profesor = campo_profesor.getText().split(" ");
        String mensaje = campo_mensaje.getText();

        try {
            con = (Connection) DriverManager.getConnection(URL, mysql_user, mysql_pass);

            st = (PreparedStatement) con.prepareStatement("select noEmpleado from profesor where nombre = ? and apellido_p = ? and apellido_m = ?");
            st.setString(1, profesor[0]);
            st.setString(2, profesor[1]);
            st.setString(3, profesor[2]);
            rs = st.executeQuery();

            if (rs.next()) {
                empleado = rs.getInt("noEmpleado");
            }

            st = (PreparedStatement) con.prepareStatement("insert into notificaciones (noEmpleado, nota, remitente) values (?,?,?)");
            st.setInt(1, empleado);
            st.setString(2, mensaje);
            st.setInt(3, user_no);
            st.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "¡Mensaje enviado!");
            
            campo_profesor.setText("nombre primer_apellido segundo_apellido");
            campo_mensaje.setText("inserte cuerpo del mensaje");

        } catch (Exception e) {

        }
    }//GEN-LAST:event_enviar_mensajeActionPerformed


    private void update_notActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_notActionPerformed
        loadNotifications();
    }//GEN-LAST:event_update_notActionPerformed

    private void actualizar_listado_alumnos_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_listado_alumnos_botonActionPerformed
        loadList(rbutton_alumnos.isSelected());
    }//GEN-LAST:event_actualizar_listado_alumnos_botonActionPerformed

    private void data_listadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_listadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_listadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        admin_tools admin = new admin_tools();
        admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campo_profesorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campo_profesorFocusGained
        campo_profesor.setText("");
    }//GEN-LAST:event_campo_profesorFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        login admin = new login();
        admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void loadList(boolean target) {

        listProf = "n°   NOMBRE         APELLIDO P.    APELLIDO M.\n";
        listAlumnos = "MATRICULA GRUPO     NOMBRE         APELLIDO P.    APELLIDO M.\n";
        Connection con;
        PreparedStatement st;
        ResultSet rs;
        String crow;

        if (target) {
            try {
                System.out.println("Flag 1");
                con = (Connection) DriverManager.getConnection(URL, mysql_user, mysql_pass);
                st = (PreparedStatement) con.prepareStatement("select nombre, apellido_p, apellido_m, noGrupo, matricula from alumno where nombre like ? or apellido_p like ? or apellido_m like ?");
                System.out.println("Flag 2: " + data_listado.getText());
                st.setString(1, "%" + data_listado.getText() + "%");
                st.setString(2, "%" + data_listado.getText() + "%");
                st.setString(3, "%" + data_listado.getText() + "%");
                System.out.println("Flag 3");
                rs = st.executeQuery();
                System.out.println("Flag 4");
                while (rs.next()) {
                    System.out.println("Flag 5");
                    crow = normalize(rs.getString("matricula"), 10) + normalize(rs.getString("noGrupo"), 10) + normalize(rs.getString("nombre"), 15) + normalize(rs.getString("apellido_p"), 15) + normalize(rs.getString("apellido_m"), 10);
                    System.out.println("termino, going next");
                    listAlumnos = listAlumnos + crow;
                    Listado.setText(listAlumnos);
                    listAlumnos = listAlumnos + "\n\n";
                    System.out.println("Flag 6");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {

            try {
                con = (Connection) DriverManager.getConnection(URL, mysql_user, mysql_pass);
                st = (PreparedStatement) con.prepareStatement("select nombre, apellido_p, apellido_m, noEmpleado from profesor where nombre like ? or apellido_p like ? or apellido_m like ?");
                st.setString(1, "%" + data_listado.getText() + "%");
                st.setString(2, "%" + data_listado.getText() + "%");
                st.setString(3, "%" + data_listado.getText() + "%");
                rs = st.executeQuery();
                while (rs.next()) {
                    crow = normalize(rs.getString("noEmpleado"), 5) + normalize(rs.getString("nombre"), 15) + normalize(rs.getString("apellido_p"), 15) + normalize(rs.getString("apellido_m"), 10);
                    System.out.println("termino, going next");
                    listProf = listProf + crow;
                    Listado.setText(listProf);
                    listProf = listProf + "\n\n";
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

    private String remitente(int numero){
        Connection con;
        PreparedStatement st;
        ResultSet rs;
        String crow = "";

        try {
            con = (Connection) DriverManager.getConnection(URL, mysql_user, mysql_pass);
            st = (PreparedStatement) con.prepareStatement("select nombre, apellido_p, apellido_m  from profesor where noEmpleado = ?");
            st.setInt(1, numero);
            rs = st.executeQuery();
            if (rs.next()) {
                crow = normalize(rs.getString("nombre"), 10) + normalize(rs.getString("apellido_p"), 10) + normalize(rs.getString("apellido_m"), 15);

            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Devolviendo crow");
        return crow;
    }
    
    
    public void loadNotifications() {
        listNotificaciones = "NOMBRE    APELLIDOS                FECHA\n";
        Connection con;
        PreparedStatement st;
        ResultSet rs;
        String crow;

        try {
            con = (Connection) DriverManager.getConnection(URL, mysql_user, mysql_pass);
            st = (PreparedStatement) con.prepareStatement("select fecha, nota, remitente from notificaciones, profesor where notificaciones.noEmpleado=profesor.noEmpleado and profesor.noEmpleado = ?");
            st.setInt(1, user_no);
            rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("Llamando a remitente con valor de: " + remitente(rs.getInt("remitente")));
                crow = remitente(rs.getInt("remitente")) + normalize(rs.getString("fecha"), 15);
                listNotificaciones = listNotificaciones + crow + "\n MENSAJE: " + rs.getString("nota");
                not_area.setText(listNotificaciones);
                listNotificaciones = listNotificaciones + "\n - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    public String normalize(String entrada, int length) {
        while (entrada.length() < length) {
            entrada = entrada + " ";
        }
        return entrada;
    }

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
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Level;
    private javax.swing.JTextArea Listado;
    private javax.swing.JButton actualizar_listado_alumnos_boton;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField campo_mensaje;
    private javax.swing.JTextField campo_profesor;
    private javax.swing.JLabel correo;
    private javax.swing.JTextField data_listado;
    private javax.swing.JButton enviar_mensaje;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel noEmpleado;
    private javax.swing.JTextArea not_area;
    private javax.swing.JPanel panel_listado;
    private javax.swing.JPanel panel_notificaciones;
    private javax.swing.JPanel panel_perfil;
    private javax.swing.JRadioButton rbutton_alumnos;
    private javax.swing.JRadioButton rbutton_prof;
    private javax.swing.JLabel telefono;
    private javax.swing.JButton update_not;
    private javax.swing.JLabel user_icon;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}