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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Usuarios {

    conexion.conexion arc = new conexion.conexion();
    Connection con = arc.conex();
    
    //******************************************
    // CARGAR LISTA DE USUARIOS
    public void Cargar_usuarios(DefaultTableModel modelo, JTable tabla) {
        try {
            Clear_Table(modelo, tabla);

            String sql = "select usuario,email,tipo_usuario FROM usuarios";
            PreparedStatement us = con.prepareStatement(sql);
            ResultSet res = us.executeQuery();
            Object datos[] = new Object[3];
            while (res.next()) {
                for (int i = 0; i < 3; i++) {
                    datos[i] = res.getObject(i + 1);
                }
                System.out.println(Arrays.toString(datos));
                modelo.addRow(datos);

            }

            res.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    //***************************************
    // CREAR NUEVO USUARIO
    public int Nuevo_Usuario(String[] array) {
        String usu = array[0];
        String pass = array[1];
        String email = array[2];
        String tipo = array[3];
        int val = 0;
        try {
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("INSERT INTO usuarios(usuario,"
                    + "pass,email,tipo_usuario)" + "VALUES(?,?,?,?)");
            pst.setString(1, usu);
            pst.setString(2, pass);
            pst.setString(3, email);
            pst.setString(4, tipo);
            int a = pst.executeUpdate();
            if (a > 0) {
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                val = 1;
                //limpiar(codigo, servicio, subtipo, costo);
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR");
            }

            pst.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return val;
    }

    
    private void Clear_Table(DefaultTableModel modelo, JTable tabla) {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
}
