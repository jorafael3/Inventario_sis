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
public class Inventario {

    conexion.conexion arc = new conexion.conexion();
    Connection con = arc.conex();

    public int Cargar_Inventario(DefaultTableModel modelo, JTable tabla) {
        try {
            Clear_Table(modelo, tabla);
            String sql = "select ID,codigo,nombre,stock,precio FROM Productos";
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

    public void Buscar_Producto(DefaultTableModel modelo, JTable tabla, String[] array) {
        try {
            Clear_Table(modelo, tabla);
            String codigo = array[0];
            String sql = "select ID,codigo,nombre,stock,precio from Productos where codigo like '%" + codigo + "%' or nombre like '%" + codigo + "%'";
            PreparedStatement pst = con.prepareStatement(sql);
            // pst.setString(1, codigo);
            ResultSet res = pst.executeQuery();
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

    public void Clear_Table(DefaultTableModel modelo, JTable tabla) {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
}
