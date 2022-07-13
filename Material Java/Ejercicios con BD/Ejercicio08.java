import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio08 {
	
public static void main(String[] args) throws SQLException {
		
		
		String nombre_BD="E:/4to año/Base de Datos/PerfumeriaInsert.accdb"; // ruta y nombre a corregir
		String usuarioBD="";
		String passwordBD="";
			    
		Connection conexion;
		conexion=DriverManager.getConnection("jdbc:ucanaccess://" + nombre_BD,usuarioBD,passwordBD);
				   
		Statement sentencia;
		sentencia=conexion.createStatement();
		
		
		
		Scanner teclado= new Scanner (System.in);
		
		System.out.print("\n Coloque el Nombre del Articulo Nuevo: ");
		String nomarticulo = teclado.nextLine ();
		
		System.out.print("\n Coloque el Precio del Articulo Nuevo: ");
		float precio = teclado.nextFloat ();
		
		System.out.print("\n Coloque el Codigo del Rubro del Articulo Nuevo: ");
		int codrubro = teclado.nextInt ();
		
		System.out.print("\n Coloque el Codigo del Proveedor del Articulo Nuevo: ");
		int codproveedor = teclado.nextInt ();
		
		System.out.print("\n Coloque el Stock del Articulo Nuevo: ");
		int existencia = teclado.nextInt ();
		
		System.out.print("\n Coloque el Codigo de Barra del Articulo Nuevo: ");
		int codbarra = teclado.nextInt ();
		
		System.out.println("\n Coloque la observacion del Articulo Nuevo: ");
		String obs = teclado.nextLine ();
			
		
		
		int cantidad; 
		cantidad = sentencia.executeUpdate(" INSERT INTO articulos (NomArt, Precio, CodRub, CodProv, Stock, CodBarras, ObsArt)"
								  + " VALUES ('"+nomarticulo+"',"+precio+","+codrubro+","+codproveedor+","+existencia+",'"+codbarra+"','"+obs+"');");
		
		teclado.close();
		conexion.close();
		sentencia.close();
		
		System.out.print("\n\n Registros Agregados Exitosamente "+cantidad);
		
	}
		
}
