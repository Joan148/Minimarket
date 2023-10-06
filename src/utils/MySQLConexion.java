package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConexion {
	
	public static Connection getConexion() {
		Connection con = null;
		try {
			// carga_el_driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establece_conexion_con_la_BASE DE DATOS
			String url = "jdbc:mysql://localhost:3306/bd_sistema_ventas?useSSL=false&useTimezone=true&serverTimezone=UTC";
			//_USUARIO
			String usr = "root";
			//_CONTRASENA
			String psw = "mysql";
			con = DriverManager.getConnection(url, usr, psw);
		} catch (ClassNotFoundException e) {
			// Error_de_driver_no_instalado
			System.out.println("Error >> Driver no Instalado!!" + e.getMessage());
		} catch (SQLException e) {
			// muestra_error_en_la_conexion por_usuario_o_contrase�a
			System.out.println("Error >> de conexi�n con la BD" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error >> general : " + e.getMessage());
		}
		return con;
	}
}
