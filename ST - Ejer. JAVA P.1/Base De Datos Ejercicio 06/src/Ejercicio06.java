import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio06 {
	
public static void main(String[] args) throws SQLException {
		
		
		String nombre_BD="D:/4to año/Base de Datos/perfumeria.accdb"; // ruta y nombre a corregir
		String usuarioBD="";
		String passwordBD="";
			    
		Connection conexion;
		conexion=DriverManager.getConnection("jdbc:ucanaccess://" + nombre_BD,usuarioBD,passwordBD);
				   
		Statement sentencia;
		sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		
		Scanner teclado= new Scanner (System.in);
		String nomrub;
		System.out.print("Coloque el Nombre del Rubro: ");
		nomrub = teclado.nextLine();
			
		
		ResultSet rs; 
		rs = sentencia.executeQuery(" SELECT codart, nomart, nomrub, precio"
								  + " FROM articulos inner join rubros on rubros.codrub = articulos.codrub"
								  + " WHERE rubros.nomrub = '"+nomrub+"';");
				
		
		
		System.out.print(" codart ");
		System.out.print(" nomart ");
		System.out.print(" nomrub ");
		System.out.print(" precio ");
		
		while(rs.next()){
			
			//Carga de datos en variables simples. Podrían también ser vectores
			
			int 	cod= rs.getInt		("codart");
			String 	nom= rs.getString	("nomart");
			String  nomr= rs.getString	("nomrub");
			float 	pre= rs.getFloat	("precio");
			
			
			System.out.print(" \n"+cod);
			System.out.print(" \t"+nom);
			System.out.print(" \t"+nomr);
			System.out.print(" \t"+pre);
		} 

		teclado.close();
		conexion.close();
	}

}
