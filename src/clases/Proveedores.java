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
public class Proveedores {

    conexion.conexion arc = new conexion.conexion();
    Connection con = arc.conex();

    public int Nuevo_Cliente(String[] array) {
        String cedula = array[0];
        String nombre = array[1];
        String direccion = array[2];
        String email = array[3];
        String telefono = array[4];
        int estado = Integer.parseInt(array[5]);
        int val = 0;
        try {
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("{CALL nuevo_cliente (?,?,?,?,?,?)}");
            pst.setString(1, cedula);
            pst.setString(2, nombre);
            pst.setString(3, direccion);
            pst.setString(4, email);
            pst.setString(5, telefono);
            pst.setInt(6, estado);

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

    public int Actualizar_Cliente(String[] array) {
        String cedula = array[0];
        String nombre = array[1];
        String direccion = array[2];
        String email = array[3];
        String telefono = array[4];
        int estado = Integer.parseInt(array[5]);
        String ID = array[6];
        int val = 0;
        try {
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("UPDATE Clientes set"
                    + " cedula=?,nombre=?,direccion=?,email=?,telefono=?,estado=? where ID = ?");
            pst.setString(1, cedula);
            pst.setString(2, nombre);
            pst.setString(3, direccion);
            pst.setString(4, email);
            pst.setString(5, telefono);
            pst.setInt(6, estado);
            pst.setString(7, ID);

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

    public void Cargar_Clientes(DefaultTableModel modelo, JTable tabla) {
        try {
            Clear_Table(modelo, tabla);
            String sql = "select ID,cedula,nombre,email,estado from clientes";
            PreparedStatement us = con.prepareStatement(sql);
            ResultSet res = us.executeQuery();
            Object datos[] = new Object[5];
            while (res.next()) {
                for (int i = 0; i < 5; i++) {
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

    public void Cargar_Clientes_Buscar(DefaultTableModel modelo, JTable tabla, String[] array) {
        try {
            Clear_Table(modelo, tabla);
            String codigo = array[0];
            String sql = "select * from Clientes where cedula like '%" + codigo + "%' or nombre like '%" + codigo + "%'";
            PreparedStatement us = con.prepareStatement(sql);
            //us.setString(1, codigo);
            //us.setString(2, codigo);

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

    public Object[] Cargar_Clientes_click_Tabla(String[] array) {
        String ID = array[0];
        Object datos[] = new Object[7];
        try {
            //PreparedStatement pst = (PreparedStatement) con.prepareStatement("{CALL Cargar_Productos (?)}");            PreparedStatement pst = (PreparedStatement) con.prepareStatement("{CALL Cargar_Productos (?)}");
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("select * from Clientes"
                    + " WHERE ID = ?;");
            pst.setString(1, ID);
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                for (int i = 0; i < 7; i++) {
                    datos[i] = res.getObject(i + 1);
                }
                System.out.println(Arrays.toString(datos));
            }
            pst.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return datos;
    }

    private void Clear_Table(DefaultTableModel modelo, JTable tabla) {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
}
