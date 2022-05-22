import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Ejercicio13 {
	
public static void main(String[] args) throws SQLException {
		
		
		String nombre_BD="D:/4to año/Base de Datos/PerfumeriaUpdate.accdb"; // ruta y nombre a corregir
		String usuarioBD="";
		String passwordBD="";
			    
		Connection conexion;
		conexion=DriverManager.getConnection("jdbc:ucanaccess://" + nombre_BD,usuarioBD,passwordBD);
				   
		Statement sentencia;
		sentencia=conexion.createStatement();
		
		
		
		Scanner teclado = new Scanner (System.in);
		System.out.print("Ingrese un Numero de Rubro: ");
		int numrub = teclado.nextInt();
		System.out.print("Ingrese el porcentaje de aumento: ");
		int numporc = teclado.nextInt();
		
		
		int cantidad;
		cantidad = sentencia.executeUpdate("UPDATE articulos SET precio = precio*1."+numporc+" "
										 + "WHERE Codrub = "+numrub+";");
									 
		
		System.out.print("Los Articulos Aumentados fueron "+cantidad+" con exito!!!");
		
		System.out.print("\n");
		
		System.out.print("Muestra de lo Aumentado");
		
		System.out.print("\n");
		
		
		Statement muestra;
		muestra=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		
		ResultSet rs;
		rs = muestra.executeQuery("SELECT codart,codrub,nomart,precio "
								 + "FROM articulos "
								 + "WHERE codrub = "+numrub+";");
		
		
		System.out.print("CodArt\t");
		System.out.print("CodRub\t");
		System.out.print("NomArt\t");
		System.out.print("Precio Aumentado");
		
		
		
while(rs.next()){
			
			//Carga de datos en variables simples. Podrían también ser vectores
			
			int		cod		= 	rs.getInt		("CodArt");
			int		codrub  =	rs.getInt		("CodRub");
			String 	nom		= 	rs.getString	("NomArt");
			float 	pre		= 	rs.getFloat		("Precio");
			
			
			
			System.out.print(" \n "+cod);
			System.out.print(" \t "+codrub);
			System.out.print(" \t "+nom);
			System.out.print(" \t "+pre);
			
				
		} 
			
		teclado.close();
		sentencia.close();
		muestra.close();
		conexion.close();
		
		
	}

}


