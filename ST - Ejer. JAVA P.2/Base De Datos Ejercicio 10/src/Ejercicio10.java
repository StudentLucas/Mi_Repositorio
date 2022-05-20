import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio10 {
	
public static void main(String[] args) throws SQLException {
		
		
		String nombre_BD="D:/4to año/Base de Datos/PerfumeriaDelete.accdb"; // ruta y nombre a corregir
		String usuarioBD="";
		String passwordBD="";
			    
		Connection conexion;
		conexion=DriverManager.getConnection("jdbc:ucanaccess://" + nombre_BD,usuarioBD,passwordBD);
				   
		Statement sentencia;
		sentencia=conexion.createStatement();
		
		
		
		Scanner teclado = new Scanner (System.in);
		System.out.print("¿Que Rubro desea Eliminar?");
		int numrub = teclado.nextInt();
		
		
		int cantidad; 
		cantidad = sentencia.executeUpdate(" DELETE FROM Articulos"
										+ (" WHERE Codrub = "+numrub+""));
		
		
		
		System.out.print(" Usted Borro "+cantidad+" Articulos del rubro "+numrub);
		
		
		Statement muestra;
		muestra = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		
		ResultSet rs; 
		rs = muestra.executeQuery("SELECT CodArt,NomArt,Costo,Precio,Stock,CodRub,CodProv "
								+ "FROM Articulos;");
		
		System.out.print("\n Quedaron los Siguientes Datos Despues del Borrado!! \n");
		
		System.out.print("CodArt\t\t");
		System.out.print("NomArt\t\t\t");
		System.out.print("Costo\t\t\t");
		System.out.print("Precio\t\t\t");
		System.out.print("Stock\t\t\t");
		System.out.print("CodRub\t\t\t");
		System.out.print("CodProv\t\t\t");
		
		
		
		while(rs.next()){
			
			//Carga de datos en variables simples. Podrían también ser vectores
			
			int		cod		= 	rs.getInt		("CodArt");
			String 	nom		= 	rs.getString	("NomArt");
			float 	cos		= 	rs.getFloat		("Costo");
			float 	pre		= 	rs.getFloat		("Precio");
			int 	exis	= 	rs.getInt		("Stock");
			int 	codrub	= 	rs.getInt		("CodRub");
			int 	codprov	= 	rs.getInt		("CodProv");
			
			
			System.out.print(" \n "+cod);
			System.out.print(" \t "+nom);
			System.out.print(" \t "+cos);
			System.out.print(" \t "+pre);
			System.out.print(" \t "+exis);
			System.out.print(" \t "+codrub);
			System.out.print(" \t "+codprov);
		} 
			
		teclado.close();
		sentencia.close();
		muestra.close();
		conexion.close();
		
	}

}

