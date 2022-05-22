import java.io.*;
import java.util.Arrays;

public class Ejercicio33 {

public static void main(String[] args) throws IOException {
		
	// Ruta y nombre del archivo
	String archivo="E:\\Prueba";	
	File fichero = new File(archivo);
        
    	fichero.mkdir(); // crea una carpeta
        //fichero.createNewFile(); // crea un archivo vacio
        //fichero.delete(); // borrar carpeta o archivo
        
	if (fichero.exists()) {
                
                System.out.println("Unidad de Carpeta: " +fichero.getParent());
                System.out.println("Ruta de Carpeta: "+fichero.getPath());
		System.out.println("Nombre de Carpeta: "+fichero.getName());
                System.out.println("Contenido de la carpeta: "+Arrays.toString (fichero.list()));
    		System.out.println("Se puede escribir? : " +fichero.canWrite());
    		System.out.println("Se puede leer? : "+fichero.canRead());
    		System.out.println("Es un archivo? : "+fichero.isFile());
    		System.out.println("Es una carpeta? : "+fichero.isDirectory());
                
    	} else {
    		
    		System.out.println("El fichero no existe !!!");
    	
    	}
    }
}
