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
public class Compras {

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

    public int Guardar_Detalle(String[] array) {
        String prod = array[0];
        String cant = array[1];
        String sub = array[2];
        String iva = array[3];
        String total = array[4];
        String facturaID = array[5];
        String factura = array[6];

        int estado = Integer.parseInt(array[5]);
        int val = 0;
        try {
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("insert into compras_dt "
                    + "(factura_id,factura,producto_id,cantidad,subtotal,iva,total) "
                    + "values (?,?,?,?,?,?,?)");
            pst.setString(1, facturaID);
            pst.setString(2, factura);
            pst.setString(3, prod);
            pst.setString(4, cant);
            pst.setString(5, sub);
            pst.setString(6, iva);
            pst.setString(7, total);
            int a = pst.executeUpdate();
            if (a > 0) {
                // JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                val = 1;
                Actualizar_Stock(prod, cant);
                //limpiar(codigo, servicio, subtipo, costo);
            } else {
                //   JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR");
            }
            pst.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return val;
    }

    public int Actualizar_Stock(String ID, String cant) {

        int val = 0;
        try {
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("UPDATE productos set stock = stock + ?"
                    + " Where ID = ?");
            pst.setString(1, cant);
            pst.setString(2, ID);
            int a = pst.executeUpdate();
            if (a > 0) {
                // JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                val = 1;
                //limpiar(codigo, servicio, subtipo, costo);
            } else {
                //JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR");
            }
            pst.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return val;
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

    public String Guardar_Cabecera(String[] array) {
        String ID = array[0];
        String factura = array[1];
        String nota = array[2];
        String sub = array[3];
        String iva = array[4];
        Float total = Float.valueOf(array[5]);
        Object datos[] = new Object[1];
        String val = "";
        try {
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("INSERT into compras_cab"
                    + " (cliente,factura,subtotal,iva,total,nota) "
                    + "values(?,?,?,?,?,?)");
            // + " select max(ID) as FacturaID from ventas_cab vc ");
            pst.setString(1, ID);
            pst.setString(2, factura);
            pst.setString(3, sub);
            pst.setString(4, iva);
            pst.setFloat(5, total);
            pst.setString(6, nota);
            int a = pst.executeUpdate();
            if (a > 0) {
                // JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                try {
                    //PreparedStatement pst = (PreparedStatement) con.prepareStatement("{CALL Cargar_Productos (?)}");            PreparedStatement pst = (PreparedStatement) con.prepareStatement("{CALL Cargar_Productos (?)}");
                    PreparedStatement pst2 = (PreparedStatement) con.prepareStatement("select max(ID) as FacturaID from compras_cab ");
                    ResultSet res = pst2.executeQuery();
                    while (res.next()) {
                        for (int i = 0; i < 1; i++) {
                            datos[i] = res.getObject(i + 1);
                        }
                        System.out.println("FACURA ID");
                    }
                    val = datos[0].toString();
                    //System.out.println(val);

                    pst.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
                //limpiar(codigo, servicio, subtipo, costo);
            } else {
                //JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR");
            }

            pst.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return val;
    }

    public void Clear_Table(DefaultTableModel modelo, JTable tabla) {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    //********************************************************************
    public void Cargar_Historial_Venta(DefaultTableModel modelo, JTable tabla, String[] array) {
        try {
            Clear_Table(modelo, tabla);
            String fini = array[0];
            String ffin = array[1];

            String sql = "SELECT * from compras_cab where fecha_creado between '"+fini+"' and '"+ffin+"' ";
            PreparedStatement pst = con.prepareStatement(sql);
           //pst.setString(1, fini);
            //pst.setString(2, ffin);

            ResultSet res = pst.executeQuery();
            Object datos[] = new Object[8];
            while (res.next()) {
                for (int i = 0; i < 8; i++) {
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

}
