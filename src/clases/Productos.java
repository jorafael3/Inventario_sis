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
 * @author G1-GAMING
 */
public class Productos {

    conexion.conexion arc = new conexion.conexion();
    Connection con = arc.conex();

    public int Nuevo_Producto(String[] array) {
        String codigo = array[0];
        String nombre = array[1];
        String desc = array[2];
        String costo = array[3];
        String precio = array[4];
        int stock = Integer.parseInt(array[5]);
        int estado = Integer.parseInt(array[6]);
        int val = 0;
        try {
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("INSERT into Productos ("
                    + "codigo,nombre,descripcion,costo,precio,stock,estado)"
                    + "values(?,?,?,?,?,?,?)");
            pst.setString(1, codigo);
            pst.setString(2, nombre);
            pst.setString(3, desc);
            pst.setString(4, costo);
            pst.setString(5, precio);
            pst.setInt(6, stock);
            pst.setInt(7, estado);

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

    public Object[] Cargar_Productos(String[] array) {
        String ID = array[0];
        Object datos[] = new Object[8];
        try {
            //PreparedStatement pst = (PreparedStatement) con.prepareStatement("{CALL Cargar_Productos (?)}");            PreparedStatement pst = (PreparedStatement) con.prepareStatement("{CALL Cargar_Productos (?)}");
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("select * from Productos");
            //pst.setString(1, ID);
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                for (int i = 0; i < 8; i++) {
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

    public int Cargar_Productos_Tabla(DefaultTableModel modelo, JTable tabla) {
        try {
            Clear_Table(modelo, tabla);
            String sql = "select ID,codigo,nombre,costo,precio FROM Productos";
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
        return 0;
    }

    public int Actualizar_Producto(String[] array) {
        String codigo = array[0];
        String nombre = array[1];
        String desc = array[2];
        String costo = array[3];
        String precio = array[4];
        int stock = Integer.parseInt(array[5]);
        int estado = Integer.parseInt(array[6]);
        String ID = array[7];
        int val = 0;
        try {
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(""
                    + "UPDATE Productos set codigo = ?,nombre =?,descripcion=?,costo=?,precio=?,stock=?,estado=?"
                    + " WHERE ID = ?;");
            pst.setString(1, codigo);
            pst.setString(2, nombre);
            pst.setString(3, desc);
            pst.setString(4, costo);
            pst.setString(5, precio);
            pst.setInt(6, stock);
            pst.setInt(7, estado);
            pst.setString(8, ID);

            int a = pst.executeUpdate();
            if (a > 0) {
                JOptionPane.showMessageDialog(null, "ACTUALIZACION EXITOSA");
                val = 1;
                //limpiar(codigo, servicio, subtipo, costo);
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
            }

            pst.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return val;
    }

    public void Buscar_Producto(DefaultTableModel modelo, JTable tabla, String[] array) {
        try {
            Clear_Table(modelo, tabla);
            String codigo = array[0];
            String sql = "{CALL Buscar_Producto (?)}";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, codigo);
            ResultSet res = pst.executeQuery();
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

    private void Clear_Table(DefaultTableModel modelo, JTable tabla) {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

}
