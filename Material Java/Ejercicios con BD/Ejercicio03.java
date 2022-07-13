import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio03 {

public static void main(String[] args) throws SQLException {
		
		int codprov;
		String nombre_BD="D:/4to año/Base de Datos/perfumeriaOriginal.accdb"; // ruta y nombre a corregir
		String usuarioBD="";
		String passwordBD="";
			    
		Connection conexion;
		conexion=DriverManager.getConnection("jdbc:ucanaccess://" + nombre_BD,usuarioBD,passwordBD);
				   
		Statement sentencia;
		sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		  
		Scanner teclado= new Scanner (System.in);
		System.out.print("Coloque el Numero de proveedor: ");
		codprov=teclado.nextInt();
			
		
		ResultSet rs; 
		rs = sentencia.executeQuery("SELECT codart, nomart, nomrub "
				+ "FROM articulos inner join rubros  on codrub= articulos.codrub "
				+ "WHERE codprov = "+codprov+";");
		
		
		System.out.print(" Codart ");
		System.out.print(" Nomart ");
		System.out.print(" Nomrub ");
		
		while(rs.next()){
			
			//Carga de datos en variables simples. Podrían también ser vectores
			
			int cod= rs.getInt("codart");
			String nom= rs.getString("nomart");
			String nomr= rs.getString("nomrub");
			
			
			System.out.print(" \n"+cod);
			System.out.print(" \t"+nom);
			System.out.print(" \t"+nomr);
		} 

		teclado.close();
		conexion.close();
	}

}
