/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vistas.Principal;

/**
 *
 * @author User
 */
public class login {

    conexion.conexion arc = new conexion.conexion();
    Connection con = arc.conex();

    public int iniciar(String[] array, JFrame ve) {
        String usu = array[0];
        String pass = array[1];
        int val = 0;
        Object datos[] = new Object[4];
        try {
            PreparedStatement pst = con.prepareStatement("SELECT usuario,pass,email,tipo_usuario"
                    + " FROM usuarios where usuario = ? and pass = ?");
            pst.setString(1, usu);
            pst.setString(2, pass);
            try ( ResultSet res = pst.executeQuery()) {
                if (res.next()) {
                    String u = res.getString("usuario");
                    String p = res.getString("pass");
                    String t = res.getString("tipo_usuario");
                    System.out.println(u);
                    System.out.println(p);
                    System.out.println(t);

                    Principal m = new Principal();
                    m.setVisible(true);
                    //m.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    m.lb_usuario.setText(u);
                    m.lbtipo.setText(t);
                    ve.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecta", "", 1);
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return val;
    }

}
