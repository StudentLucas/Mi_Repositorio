from pathlib import Path
from io import open

print("          +------------------------------------------------------------+")
print("          |           MANIPULACION DE ARCHIVOS DE TEXTO                |")
print("          |------------------------------------------------------------|")
print("          |        A --> Quiero Crear un Archivo de Texto              |")
print("          |------------------------------------------------------------|")
print("          |        B --> Quiero Agregar texto al Archivo               |")
print("          |------------------------------------------------------------|")        
print("          |        C --> Quiero Ver el contenido del Archivo           |")
print("          |------------------------------------------------------------|")
print("          |        D --> Quiero Borrar el contenido o el Archivo       |")
print("          +------------------------------------------------------------+")
                 
opcion = input("          |          Escriba la opción que va a utilizar:   ").upper()

if opcion != "A" and opcion != "B" and opcion != "C" and opcion != "D":
    print("          |------------------------------------------------------------|")
    print("          |      El dato ingresado no esta dentro de las Opciones.     |")
    print("          |------------------------------------------------------------|")
    
else:
    
    if opcion == "A":
        
        print("          |------------------------------------------------------------|")
        print("          |          Elegiste la opción 'Crear un Archivo'             |")
        print("          |------------------------------------------------------------|")
    
        archivo = Path (input("          |          Escriba el nombre de su archivo:     "))
        
        print("          |------------------------------------------------------------|")
        print("          |          El nombre de su archivo será:  {}.txt             |".format(archivo))
        print("          |------------------------------------------------------------|")
        
        ruta= Path(input("          |          Escriba la RUTA donde va a guardar el Archivo:    |\n          |               "))
        print("          |------------------------------------------------------------|")
        
        if ruta.exists():
            
            respuesta = input("          |  El archivo se Guardará en {} \n          |          ¡Para completar! - Desea Continuar? (S/N):  ".format(ruta)).upper()
            
            if respuesta != "S" and respuesta != "N":
            
                print("          |------------------------------------------------------------|") 
                print("          |   Respuesta invalida, no esta dentro de las opciones.      |")
                print("          |------------------------------------------------------------|")
                
            else:
        
                if respuesta == "S":
            
                    ruta_completa = ruta.joinpath("{}\\{}.txt".format(ruta,archivo))
            
                    if not ruta_completa.exists() :
                        open("{}".format(ruta_completa),"w+")
                        print("          |------------------------------------------------------------|")
                        print("          |              El archivo se creo en la ruta:                | \n          |              {}                 |".format(ruta))
                        print("          |------------------------------------------------------------|")
        
                    else:
                        print("          |------------------------------------------------------------|")
                        print("          |          El archivo que intenta crear ya existe!           |")
                        print("          |------------------------------------------------------------|")
                
                else:
                    print("          |------------------------------------------------------------|")
                    print("          |          La creación del archivo fue cancelado             |")
                    print("          |------------------------------------------------------------|")

        else:
            
            print("          |             La ruta que esta brindando NO EXISTE!          |")
            print("          |------------------------------------------------------------|")
                
    
    if opcion == "B":
        
        print("          |------------------------------------------------------------|")
        print("          |       Elegiste la opción 'Agregar texto al archivo'        |")
        print("          |------------------------------------------------------------|")
        
        ruta = Path(input("          |          Escriba la RUTA donde está el Archivo:    |\n |               "))
        print("          |------------------------------------------------------------|")
        
        if ruta.exists():
            
            nombre_archivo = input("|    Escriba solo el nombre del archivo a agregar texto:  ")
            ruta_completa = ruta.joinpath("{}\\{}.txt".format(ruta,nombre_archivo))
            texto = input("          |      Escriba el texto que quiere agregar al archivo:    |\n |")
            ruta_completa.write_text(texto)
            print(ruta_completa)
            
        
        else:
            
            print(" | la ruta no existe |")
    
    
            
        
        
    
reusar = input("          |          Quiere re-utilizar el programa (S/N):  ").upper()
print("          |------------------------------------------------------------|")
    
if reusar != "S" and reusar != "N":
    print("          |    Respuesta invalida, no esta dentro de las opciones.     |")
    print("          |------------------------------------------------------------|")
        
else:
    
    while reusar == "S":
        print("")
        print("          +------------------------------------------------------------+")
        print("          |           MANIPULACION DE ARCHIVOS DE TEXTO                |")
        print("          |------------------------------------------------------------|")
        print("          |        A --> Quiero Crear un Archivo de Texto              |")
        print("          |------------------------------------------------------------|")
        print("          |        B --> Quiero Agregar texto al Archivo               |")
        print("          |------------------------------------------------------------|")        
        print("          |        C --> Quiero Ver el contenido del Archivo           |")
        print("          |------------------------------------------------------------|")
        print("          |        D --> Quiero Borrar el contenido o el Archivo       |")
        print("          +------------------------------------------------------------+")
                        
        opcion = input("          |          Escriba la opción que va a utilizar:   ").upper()

        if opcion != "A" and opcion != "B" and opcion != "C" and opcion != "D":
            print("          |------------------------------------------------------------|")
            print("          |      El dato ingresado no esta dentro de las Opciones.     |")
            print("          |------------------------------------------------------------|")
            
            
        else:
            
            if opcion == "A":
        
                print("          |------------------------------------------------------------|")
                print("          |          Elegiste la opción 'Crear un Archivo'             |")
                print("          |------------------------------------------------------------|")
            
                archivo = Path (input("          |          Escriba el nombre de su archivo:     "))
                
                print("          |------------------------------------------------------------|")
                print("          |          El nombre de su archivo será:  {}.txt             |".format(archivo))
                print("          |------------------------------------------------------------|")
                
                ruta= Path(input("          |          Escriba la RUTA donde va a guardar el Archivo:    |\n |               "))
                print("          |------------------------------------------------------------|")
                
                respuesta = input("          |  El archivo se Guardará en {} \n |          ¡Para Guardar! - Desea Continuar? (S/N):  ".format(ruta)).upper()
                        
                if respuesta != "S" and respuesta != "N":
                    
                    print("          |------------------------------------------------------------|") 
                    print("          |   Respuesta invalida, no esta dentro de las opciones.      |")
                    print("          |------------------------------------------------------------|")
                    
                else:
               
                    if respuesta == "S":
                        
                        ruta_completa = ruta.joinpath("{}\\{}.txt".format(ruta,archivo))
            
                        if not ruta_completa.exists() :
                            open("{}".format(ruta_completa),"w+")
                            print("          |------------------------------------------------------------|")
                            print("          |          El archivo se creo en:                | \n |          {}              |".format(ruta))
                            print("          |------------------------------------------------------------|")
        
                        else:
                            print("          |------------------------------------------------------------|")
                            print("          |          El archivo que intenta crear ya existe!           |")
                            print("          |------------------------------------------------------------|")
                
                    else:
                        print("          |------------------------------------------------------------|")
                        print("          |          La creación del archivo fue cancelado             |")
                        print("          |------------------------------------------------------------|")
                        
        intento = input("          |       Quiere re-utilizar el programa (S/N):  ").upper()
        print("          |------------------------------------------------------------|")
    
    else:
        input("          |        Presione ENTER para finalizar con el programa.")
        print("          +------------------------------------------------------------+")