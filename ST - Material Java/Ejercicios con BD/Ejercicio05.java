import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

 public class Ejercicio05 {

    public static void main(String[] args) throws SQLException {

        String nombre_BD = "D:/4to año/Base de Datos/perfumeria.accdb"; // ruta y nombre a corregir
        String usuarioBD = "";
        String passwordBD = "";

        Connection conexion;
        conexion = DriverManager.getConnection("jdbc:ucanaccess://" + nombre_BD, usuarioBD, passwordBD);

        Statement sentencia;
        sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        Scanner teclado = new Scanner(System.in);
        int numrub;
        System.out.print("Coloque el Numero de Rubro: ");
        numrub = teclado.nextInt();

        ResultSet rs;
        rs = sentencia.executeQuery("SELECT codart, nomart, codrub, precio*stock AS existencia "
                + " FROM articulos "
                + " WHERE codrub = " + numrub + ";");

        System.out.print(" Codart ");
        System.out.print(" Nomart ");
        System.out.print(" Precio por Stock ");

        while (rs.next()) {

            //Carga de datos en variables simples. Podrían también ser vectores
            int cod = rs.getInt("codart");
            String nom = rs.getString("nomart");
            float stock = rs.getInt("existencia");

            System.out.print(" \n" + cod);
            System.out.print(" \t" + nom);
            System.out.print(" \t" + stock);
        }

        teclado.close();
        conexion.close();
    }

}