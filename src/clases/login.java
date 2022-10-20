/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class login {

    conexion.conexion arc = new conexion.conexion();
    Connection con = arc.conex();

    public void iniciar(String[] array) {
        String usu = array[0];
        String pass = array[1];
        try {
            PreparedStatement us = con.prepareStatement("SELECT * FROM usuarios");
            ResultSet res = us.executeQuery();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
