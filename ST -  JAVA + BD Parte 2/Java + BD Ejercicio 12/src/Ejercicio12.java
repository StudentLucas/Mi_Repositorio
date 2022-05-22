import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;


public class Ejercicio12 {


	
	public static void main(String[] args) throws SQLException {
		
		String nombre_BD="D:/4to año/Base de Datos/PerfumeriaUpdate.accdb"; // ruta y nombre a corregir
		String usuarioBD="";
		String passwordBD="";
			    
		Connection conexion;
		conexion=DriverManager.getConnection("jdbc:ucanaccess://" + nombre_BD,usuarioBD,passwordBD);
				   
		Statement sentencia;
		sentencia=conexion.createStatement();
			 
		int cantidad; 
		cantidad = sentencia.executeUpdate("UPDATE articulos SET precio = precio*1.10 "
										+ "WHERE codprov = 3 ; ");
			  
		System.out.print(" Fueron Aumentados "+cantidad+" de precios del proveedor 3 al 10% ");
		
		sentencia.close();
		conexion.close();
	}

}

