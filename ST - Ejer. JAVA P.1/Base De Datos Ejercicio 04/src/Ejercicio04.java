import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio04 {

public static void main(String[] args) throws SQLException {
		
		
		String nombre_BD="E:/4to año/Base de Datos/perfumeriaOriginal.accdb"; // ruta y nombre a corregir
		String usuarioBD="";
		String passwordBD="";
			    
		Connection conexion;
		conexion=DriverManager.getConnection("jdbc:ucanaccess://" + nombre_BD,usuarioBD,passwordBD);
				   
		Statement sentencia;
		sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		  
		Scanner teclado= new Scanner (System.in);
		float precio1,precio2;
		System.out.print("Coloque el primer precio: ");
		precio1=teclado.nextFloat();
		System.out.print("Coloque el segundo precio: ");
		precio2=teclado.nextFloat();
			
		
		ResultSet rs; 
		rs = sentencia.executeQuery("SELECT codart, nomart, precio"
				+ " FROM articulos "
				+ " WHERE precio >=  "+precio1+" AND precio <= " +precio2
				+ " ORDER BY precio desc,nomart");
		
		
		System.out.print(" Codart ");
		System.out.print(" Nomart ");
		System.out.print(" Precio ");
		
		while(rs.next()){
			
			//Carga de datos en variables simples. Podrían también ser vectores
			
			int cod= rs.getInt("codart");
			String nom= rs.getString("nomart");
			float pre= rs.getFloat("precio");
			
			
			System.out.print(" \n"+cod);
			System.out.print(" \t"+nom);
			System.out.print(" \t"+pre);
		} 

		teclado.close();
		conexion.close();
	}

}