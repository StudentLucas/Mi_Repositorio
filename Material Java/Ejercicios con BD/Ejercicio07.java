import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio07 {
	
public static void main(String[] args) throws SQLException {
		
		
		String nombre_BD="D:/4to año/Base de Datos/PerfumeriaInsert.accdb"; // ruta y nombre a corregir
		String usuarioBD="";
		String passwordBD="";
			    
		Connection conexion;
		conexion=DriverManager.getConnection("jdbc:ucanaccess://" + nombre_BD,usuarioBD,passwordBD);
				   
		Statement sentencia;
		sentencia=conexion.createStatement();
		
		
		
		int cantidad; 
		cantidad = sentencia.executeUpdate(" INSERT INTO articulos (nomart, precio, stock )"
											+ " values ('Jabon verde 250gr', 25.0, 10 );");
		
		
		sentencia.close();
		conexion.close();
		
		
		
		System.out.print("\n\n Registro Añadido satisfactoriamente!!" +cantidad);

	}
		
}

