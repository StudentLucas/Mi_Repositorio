import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class Ejercicio01 {


	
	public static void main(String[] args) throws SQLException {
		
		String nombre_BD="D:/4to año/Base de Datos/perfumeriaOriginal.accdb"; // ruta y nombre a corregir
		String usuarioBD="";
		String passwordBD="";
			    
		Connection conexion;
		conexion=DriverManager.getConnection("jdbc:ucanaccess://" + nombre_BD,usuarioBD,passwordBD);
				   
		Statement sentencia;
		sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			 
		ResultSet rs; 
		rs = sentencia.executeQuery("SELECT codart, nomart, precio "
				+ "FROM articulos "
				+ "ORDER BY nomart ");
			  
		System.out.print(" codigo del articulo ");
		System.out.print(" nombre del articulo ");
		System.out.print(" precio del articulo ");
		
		while(rs.next()){
			
			//Carga de datos en variables simples. Podrían también ser vectores
			
			int cod= rs.getInt("codart");
			String nom= rs.getString("nomart");
			float pre= rs.getFloat("precio");
			
			System.out.print("\n "+cod);
			System.out.print("\t "+nom);
			System.out.print("\t "+pre);
		} 


		conexion.close();
	}

}
