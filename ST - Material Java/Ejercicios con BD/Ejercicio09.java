import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Ejercicio09 {
	
public static void main(String[] args) throws SQLException {
		
		
		String nombre_BD="E:/4to año/Base de Datos/PerfumeriaDelete.accdb"; // ruta y nombre a corregir
		String usuarioBD="";
		String passwordBD="";
			    
		Connection conexion;
		conexion=DriverManager.getConnection("jdbc:ucanaccess://" + nombre_BD,usuarioBD,passwordBD);
				   
		Statement sentencia;
		sentencia=conexion.createStatement();
		
		
		
		int cantidad; 
		cantidad = sentencia.executeUpdate(" DELETE FROM articulos"
										+ (" WHERE Stock = 0 OR Precio <= 1;"));
		
		
		sentencia.close();
		conexion.close();
		
		
		
		System.out.print("\n\n Registro Borrado Exitosamente!!" +cantidad);

	}
		
}
