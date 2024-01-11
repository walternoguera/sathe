package com.sathe;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args) {
        try {
            //Intenta obtener una conexión utilizando la clase de conexión
            Connection conexion = ConexionDb.getConnection();
            System.out.println("Conexión exitosa");

            //cerramos conexion
            conexion.close();
            System.out.println("Conexión cerrada correctamente");

        } catch (SQLException e) {
            //Captura cualquier excepción de SQL que pueda ocurrir
            e.printStackTrace();
            System.out.println("Error al conectar la base de datos");
        }
    }
}
