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

/**
 *
 * @author User
 */
public class principal {

    conexion.conexion arc = new conexion.conexion();
    Connection con = arc.conex();

    public Object[] Clientes() {
        Object datos[] = new Object[1];
        try {
            //PreparedStatement pst = (PreparedStatement) con.prepareStatement("{CALL Cargar_Productos (?)}");            PreparedStatement pst = (PreparedStatement) con.prepareStatement("{CALL Cargar_Productos (?)}");
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("select count(*) from Clientes");
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                for (int i = 0; i < 1; i++) {
                    datos[i] = res.getObject(i + 1);
                }
            }
            pst.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return datos;
    }
}
