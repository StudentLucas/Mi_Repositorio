import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class Ejercicio02 {

public static void main(String[] args) throws SQLException {
		
		String nombre_BD="D:/4to año/Base de Datos/perfumeriaOriginal.accdb"; // ruta y nombre a corregir
		String usuarioBD="";
		String passwordBD="";
			    
		Connection conexion;
		conexion=DriverManager.getConnection("jdbc:ucanaccess://" + nombre_BD,usuarioBD,passwordBD);
				   
		Statement sentencia;
		sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			 
		ResultSet rs; 
		rs = sentencia.executeQuery("SELECT codart, nomart, nomrub "
				+ "FROM articulos inner join rubros  on codrub= articulos.codrub "
				+ "WHERE codprov = 2 ");
			  
		while(rs.next()){
			
			//Carga de datos en variables simples. Podrían también ser vectores
			
			int cod= rs.getInt("codart");
			String nom= rs.getString("nomart");
			String nomr= rs.getString("nomrub");
			
			
			System.out.println("\n El codigo del articulo");
                        System.out.println(""+cod);
                    	System.out.println("\n El nombre del articulo");
                        System.out.println(""+nom);
			System.out.println("\n El nombre de rubro del proveedor 2");
                        System.out.println(""+nomr);
		} 


		conexion.close();
	}

}
