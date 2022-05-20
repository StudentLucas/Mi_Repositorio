/* funcad.c - Funciones para cadenas de caracteres
   -----------------------------------------------

Lista de funciones:
      
left(cadena,cantidad)  
--> devuelve una cadena con 'cantidad' de caracteres de la izquierda de 'cadena'

rigth(cadena,cantidad) 
--> devuelve una cadena con 'cantidad' de caracteres de la derecha de 'cadena'

mid(cadena,inicio,cantidad) 
--> devuelve una cadena con 'cantidad' de caracteres de la posición 'inicio' de 'cadena'

upper(cadena) 
--> devuelve la 'cadena' en mayúsculas

lower(cadena) 
--> devuelve la 'cadena' en minúsculas

trim(cadena)
--> devuelve la 'cadena' sin espacios por izquierda y derecha

EN TODOS LOS CASOS CADENA NO DEBE SUPERAR LOS 255 CARACTERES

*/

// Variables globales      
static char retorno[256] ;
int i;
int largo;
char mensaje[]="\n\nError en llamado de librería 'funcad'. Programa detenido.\n\n";

// Prototipos de funciones
char *left(char *cadena, int cantidad);
char *rigth(char *cadena, int cantidad);
char *mid(char *cadena, int inicio, int cantidad);
char *upper(char *cadena);
char *lower(char *cadena);

// Función   left     ----------------------------------------------------------

char *left(char *cadena, int cantidad)	
{
	largo=strlen(cadena);	
	if (largo>255 || cantidad>largo)
	{
		printf("%s",mensaje);
		system("PAUSE");
		exit(0);
	}
	else 
	{
		for (i=0;i<=(cantidad-1);i++)
		{
		        retorno[i]=cadena[i];
		}
	    	retorno[cantidad]='\0';
	    
	}
	return retorno;
}


// Función   rigth     ---------------------------------------------------------

char *rigth(char *cadena, int cantidad)	
{
	largo=strlen(cadena);	
	if (largo>255 || cantidad>largo)
	{
		printf("%s",mensaje);
		system("PAUSE");
		exit(0);
	}
	else 
	{
		for (i=0;i<=cantidad;i++)
		{
		        		retorno[i]=cadena[largo-cantidad+i];
		}
	    	
	    
	}
	return retorno;
}


// Función   mid      ----------------------------------------------------------

char *mid(char *cadena, int inicio, int cantidad)
{
	largo=strlen(cadena);	
	if (largo>255 || cantidad>largo || inicio>largo-1 || inicio+cantidad>largo)
	{
		printf("%s",mensaje);
		system("PAUSE");
		exit(0);
	}
	else 
	{
		for (i=0;i<=(cantidad-1);i++)
		{
		        retorno[i]=cadena[inicio+i];
		}
	    	retorno[cantidad]='\0';
	    
	}
	return retorno;
}


// Función   upper    ----------------------------------------------------------

char *upper(char *cadena)

{
	largo=strlen(cadena);	
	if (largo>255)
	{
		printf("%s",mensaje);
		system("PAUSE");
		exit(0);
	}
	else 
	{
		for (i=0;i<=(largo-1);i++)
		{
		        retorno[i]=toupper(cadena[i]);
		}
	    	retorno[largo]='\0';
	    
	}
	return retorno;
}


// Función   lower    ----------------------------------------------------------
char *lower(char *cadena)

{
	largo=strlen(cadena);	
	if (largo>255)
	{
		printf("%s",mensaje);
		system("PAUSE");
		exit(0);
	}
	else 
	{
		for (i=0;i<=(largo-1);i++)
		{
		        retorno[i]=tolower(cadena[i]);
		}
	    	retorno[largo]='\0';
	    
	}
	return retorno;
}



// Función   trim     ----------------------------------------------------------
char *trim(char *cadena)

{
	int p;
	largo=strlen(cadena);	
	if (largo>255)
	{
		printf("%s",mensaje);
		system("PAUSE");
		exit(0);
	}
	else 
	{
		p=0;
        while (cadena[p]==' ')
        {
              p++;
        }
		for (i=0;i<=largo-p;i++)
		{
            retorno[i]=cadena[i+p];
		}
		i=strlen(retorno)-1;
		while (retorno[i]==' ')
		{
              i--;
        }
		retorno[i+1]='\0';
	}
	return retorno;
}

