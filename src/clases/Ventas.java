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
public class Ventas {

    conexion.conexion arc = new conexion.conexion();
    Connection con = arc.conex();

    public void Agregar_Productos_Tabla_Ventas(DefaultTableModel modelo, JTable tabla, String[] array) {

        String cant = array[0];
        String ID = array[1];

        String datos[] = new String[8];
        try {
            //PreparedStatement pst = (PreparedStatement) con.prepareStatement("{CALL Cargar_Productos (?)}");            PreparedStatement pst = (PreparedStatement) con.prepareStatement("{CALL Cargar_Productos (?)}");
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("select ID, codigo,nombre,precio,iva from Productos"
                    + " WHERE ID = ?;");
            pst.setString(1, ID);
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                for (int i = 0; i < 5; i++) {
                    datos[i] = res.getString(i + 1);
                }

                //modelo.addRow(datos);
            }
            double IV = 0;
            String iva = datos[4];
            Float Sub = Float.parseFloat(datos[3]) * Float.parseFloat(cant);
            if (iva.equals("0")) {
                datos[6] = "0";
            } else {
                String IVA_B = Obtener_Iva();
                IV = (Float.parseFloat(IVA_B) / 100) * Sub;
                IV = Math.round(IV * 100);
                IV = IV / 100;
                datos[6] = String.valueOf(IV);
            }
            datos[4] = cant;
            datos[5] = String.valueOf(Sub);
            double total = Sub + IV;
            total = Math.round(total * 100);
            total = total / 100;
            datos[7] = String.valueOf(total);

            System.out.println(Arrays.toString(datos));
            modelo.addRow(datos);
            pst.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public String Obtener_Iva() {
        return "12.00";
    }

    public Object[] Cargar_Cliente(String[] array) {
        String ID = array[0];
        Object datos[] = new Object[3];
        try {
            //PreparedStatement pst = (PreparedStatement) con.prepareStatement("{CALL Cargar_Productos (?)}");            PreparedStatement pst = (PreparedStatement) con.prepareStatement("{CALL Cargar_Productos (?)}");
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("select * from Clientes"
                    + " WHERE cedula = ?;");
            pst.setString(1, ID);
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                for (int i = 0; i < 3; i++) {
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

    public int Guardar_Cabecera(String[] array) {
        String ID = array[0];
        String factura = array[1];
        String nota = array[2];
        String sub = array[3];
        String iva = array[4];
        Float total = Float.valueOf(array[5]) ;
        int val = 0;
        try {
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("INSERT into ventas_cab"
                    + " (factura,cliente,subtotal,iva,total,nota) "
                    + "values(?,?,?,?,?,?)");
            pst.setString(1, ID);
            pst.setString(2, factura);
            pst.setString(3, sub);
            pst.setString(4, iva);
            pst.setFloat(5, total);
            pst.setString(6, nota);
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

}
