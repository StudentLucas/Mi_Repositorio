import java.io.*;

public class Ejercicio32 {

public static void main(String[] args) throws IOException {
		
	// Ruta y nombre del archivo
	String archivo="E:\\6to año\\51 y 52-J File";
		
	File fichero = new File(archivo);
    	
	if (fichero.exists()) {
		System.out.println("Nombre: "+fichero.getName());
		System.out.println("Ruta: "+fichero.getPath());
		System.out.println("Carpeta padre: "+fichero.getParent());
    		System.out.println("Se puede escribir?:" +fichero.canWrite());
    		System.out.println("Se puede leer?: "+fichero.canRead());
    		System.out.println("Es un archivo?: "+fichero.isFile());
    		System.out.println("Es una carpeta?: "+fichero.isDirectory());
    		System.out.println("Bytes: "+fichero.length());
    	
    	} else {
    		
    		System.out.println("El fichero no existe !!!");
    	
    	}
}
}

