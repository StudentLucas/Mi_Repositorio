import time
from opciones import *

print()
print()

time.sleep(0.35)

print                                                               ('                ╔══════════════════════════════════════════════════════════╗             ')
print                                                               ('                ║         Hola Usuario ¿Cuál es tu nombre?                 ║             ')
nombre = input                                                      ('                                         ').capitalize()
print                                                               ('                ╚══════════════════════════════════════════════════════════╝             ')

while not nombre.isalpha() and nombre.isalnum() or nombre.isnumeric() or nombre == '' or nombre.isspace():
    
    if nombre == '' or nombre.isspace():
        
        #limpiar_consola()
        
        print                                                       ('                ╔═══════════════╦══════════════════════════════════════════╗             ')
        print                                                       ('                ║   X Error X   ║  No se detecto ningun dato ingresado     ║             ')
        print                                                       ('                ╠═══════════════╩═══════════════════════════════╦══════════╝             ')
        respuesta = input                                           ('                ║      Quiere SALIR (s) o REINTENTAR (r)        ║     ').lower()
        print                                                       ('                ╚═══════════════════════════════════════════════╩══════════╝             ')
    
    else:
         
        #limpiar_consola()
        time.sleep(0.35)

        print                                                       ('                ╔═══════════════╦══════════════════════════════════════════╗             ')
        print                                                       ('                ║   X Error X   ║  El formato del nombre no es válido      ║             ')
        print                                                       ('                ╠═══════════════╩═══════════════════════════════╦══════════╝             ')
        respuesta = input                                           ('                ║      Quiere SALIR (s) o REINTENTAR (r)        ║     ').lower()
        print                                                       ('                ╚═══════════════════════════════════════════════╩══════════╝             ')

    while respuesta != "s" and respuesta != "r":
        
        time.sleep(0.35)

        print                                                       ('                ╔═══════════════╦══════════════════════════════════════════╗             ')
        print                                                       ('                ║   X Error X   ║  Datos que se esperan (s)  o  (r)        ║             ')
        print                                                       ('                ╠═══════════════╩════════════════════════════════╦═════════╝             ')
        respuesta = input                                           ('                ║      Quiere SALIR (s) o REINTENTAR (r)         ║     ').lower()
        print                                                       ('                ╚════════════════════════════════════════════════╩═════════╝             ')
        
    else: 
        
        if respuesta == "s":
            
            time.sleep(0.35)

            print                                                   ('                ╔══════════════════════════════════════════════════════════╗             ')
            print                                                   ('                ║          Gracias por utilizar mi proyecto                ║             ')
            print                                                   ('                ║    Presione ENTER para finalizar con el programa         ║             ')
            print                                                   ('                ╚══════════════════════════════════════════════════════════╝             ')
            print                                                   ('            ┌──────────────────────────────────────────────────────────────────────┐     ')
            input                                                   ('            │   Desarrollado por Lucas Ezequiel Sanchez con Python. Año 2022.      │     ')
            print                                                   ('            └──────────────────────────────────────────────────────────────────────┘     ')
            
            break
        
        if respuesta == "r":
            
            limpiar_consola()
            time.sleep(0.35)
            
            print()
            print()
            
            print                                                   ('                ╔══════════════════════════════════════════════════════════╗             ')
            print                                                   ('                ║         Hola Usuario, ¿ Cuál es tu nombre ?              ║             ')
            nombre = input                                          ('                ║                        ').capitalize()
            print                                                   ('                ╚══════════════════════════════════════════════════════════╝             ')

while nombre.isalpha():
            
    limpiar_consola()
    time.sleep(0.35)
    
    print()
    print()

    print                                                           ('                ╔═════════════════════════════════════════════════════════╗             ')
    print                                                           (f'                ║  Hola bienvenido/a {nombre} a mi calculadora interactiva  ║          ')
    print                                                           ('                ╚═════════════════════════════════════════════════════════╝             ')
    print                                                           ('                                                                                        ')
    print                                                           ('                ╔═════════════════════════════════════════════════════════╗             ')
    print                                                           ('                ║     A ► Adición                     (+)  ║    SUMAR     ║             ')
    print                                                           ('                ║══════════════════════════════════════════╬══════════════╣             ')
    print                                                           ('                ║     B ► Sustracción                 (-)  ║    RESTAR    ║             ')
    print                                                           ('                ║══════════════════════════════════════════╬══════════════╣             ')
    print                                                           ('                ║     C ► Multiplicación              (*)  ║  MULTIPLICAR ║             ')
    print                                                           ('                ║══════════════════════════════════════════╬══════════════╣             ')
    print                                                           ('                ║     D ► División                    (/)  ║    DIVIDIR   ║             ')
    print                                                           ('                ║══════════════════════════════════════════╬══════════════╣             ')
    print                                                           ('                ║     E ► Exponenciación            (b,e)  ║   EXPONENTE  ║             ')
    print                                                           ('                ║══════════════════════════════════════════╬══════════════╣             ')
    print                                                           ('                ║     F ► Radicación                  (√)  ║    RAICES    ║             ')
    print                                                           ('                ║══════════════════════════════════════════╬══════════════╣             ')
    print                                                           ('                ║     G ► El Número es PAR o IMPAR         ║    PARIDAD   ║             ')
    print                                                           ('                ╚══════════════════════════════════════════╩══════════════╝             ')
    print                                                           ('                ╔══════════════════════════════════════════╦══════════════╗             ')
    opcion = input                                                  (f'                ║  {nombre}, Elegi la opción que vas a usar  ║       ').upper()
    print                                                           ('                ╚══════════════════════════════════════════╩══════════════╝             ')
    
    print()
        
    if opcion == 'A' or opcion == 'B' or opcion == 'C' or opcion == 'D' or opcion == 'E' or opcion == 'F' or opcion == 'G':
        
        limpiar_consola()

        if opcion == "A":
            
            time.sleep(0.35)
            
            print()
            print()

            print                                                   ('                ╔══════════════════════════════════════════════════════════╗             ')
            print                                                   (f'                ║       Hola {nombre}, has elegido la opción SUMAR            ║             ')
            print                                                   ('                ╚══════════════════════════════════════════════════════════╝             ')


            opcion_A()

            print                                                   ('            ┌──────────────────────────────────────────────────────────────────────┐     ')
            input                                                   ('            │   Desarrollado por Lucas Ezequiel Sanchez con Python. Año 2022.      │     ')
            print                                                   ('            └──────────────────────────────────────────────────────────────────────┘     ')
            break
        
        if opcion == "B":
            
            time.sleep(0.35)
            
            print()
            print()

            print                                                   ('                ╔══════════════════════════════════════════════════════════╗             ')
            print                                                   (f'                ║       Hola {nombre}, has elegido la opción RESTAR           ║             ')
            print                                                   ('                ╚══════════════════════════════════════════════════════════╝             ')
            print                                                   ('                                                                                         ')
            
            opcion_B()

            print                                                   ('            ┌──────────────────────────────────────────────────────────────────────┐     ')
            input                                                   ('            │   Desarrollado por Lucas Ezequiel Sanchez con Python. Año 2022.      │     ')
            print                                                   ('            └──────────────────────────────────────────────────────────────────────┘     ')
            
            break
                     
        if opcion == "C":
            
            time.sleep(0.35)
            
            print()
            print()

            print                                                   ('                ╔══════════════════════════════════════════════════════════╗             ')
            print                                                   (f'                ║       Hola {nombre}, has elegido la opción MULTIPLICAR      ║             ')
            print                                                   ('                ╚══════════════════════════════════════════════════════════╝             ')
            print                                                   ('                                                                                         ')
            
            opcion_C()
            
            print                                                   ('            ┌──────────────────────────────────────────────────────────────────────┐     ')
            input                                                   ('            │   Desarrollado por Lucas Ezequiel Sanchez con Python. Año 2022.      │     ')
            print                                                   ('            └──────────────────────────────────────────────────────────────────────┘     ')
            
            break            
        
        if opcion == "D":
            
            time.sleep(0.35)
            
            print()
            print()

            print                                                   ('                ╔══════════════════════════════════════════════════════════╗             ')
            print                                                   (f'                ║       Hola {nombre}, has elegido la opción DIVIDIR          ║             ')
            print                                                   ('                ╚══════════════════════════════════════════════════════════╝             ')
            print                                                   ('                                                                                         ')
            
            opcion_D()

            print                                                   ('            ┌──────────────────────────────────────────────────────────────────────┐     ')
            input                                                   ('            │   Desarrollado por Lucas Ezequiel Sanchez con Python. Año 2022.      │     ')
            print                                                   ('            └──────────────────────────────────────────────────────────────────────┘     ')
            
            break
        
        if opcion == "E":
            
            time.sleep(0.35)
            
            print()
            print()

            print                                                   ('                ╔══════════════════════════════════════════════════════════╗             ')
            print                                                   (f'                ║       Hola {nombre}, has elegido la opción EXPONENTE        ║             ')
            print                                                   ('                ╚══════════════════════════════════════════════════════════╝             ')
            print                                                   ('                                                                                         ')
            
            opcion_E()

            print                                                   ('            ┌──────────────────────────────────────────────────────────────────────┐     ')
            input                                                   ('            │   Desarrollado por Lucas Ezequiel Sanchez con Python. Año 2022.      │     ')
            print                                                   ('            └──────────────────────────────────────────────────────────────────────┘     ')
            
            break
        
        if opcion == "F":
            
            time.sleep(0.35)
            
            print()
            print()

            print                                                   ('                ╔══════════════════════════════════════════════════════════╗             ')
            print                                                   (f'                ║       Hola {nombre}, has elegido la opción RAICES           ║             ')
            print                                                   ('                ╚══════════════════════════════════════════════════════════╝             ')
            print                                                   ('                                                                                         ')
            
            opcion_F()

            print                                                   ('            ┌──────────────────────────────────────────────────────────────────────┐     ')
            input                                                   ('            │   Desarrollado por Lucas Ezequiel Sanchez con Python. Año 2022.      │     ')
            print                                                   ('            └──────────────────────────────────────────────────────────────────────┘     ')
            
            break
        
        if opcion == "G":
            
            time.sleep(0.35)
            
            print()
            print()

            print                                                   ('                ╔══════════════════════════════════════════════════════════╗             ')
            print                                                   (f'                ║       Hola {nombre}, has elegido la opción PARIDAD          ║             ')
            print                                                   ('                ╚══════════════════════════════════════════════════════════╝             ')
            print                                                   ('                                                                                         ')
            
            opcion_G()

            print                                                   ('            ┌──────────────────────────────────────────────────────────────────────┐     ')
            input                                                   ('            │   Desarrollado por Lucas Ezequiel Sanchez con Python. Año 2022.      │     ')
            print                                                   ('            └──────────────────────────────────────────────────────────────────────┘     ')
            
            break 
        
    else:
        
        limpiar_consola()
        time.sleep(0.35)
        
        print()
        print()

        print                                                       ('                ╔══════════════╦═══════════════════════════════════════════╗             ')
        print                                                       ('                ║   X Error X  ║  La Opción elegida no está en la lista    ║             ')
        print                                                       ('                ╠══════════════╩═══════════════════════════════╦═══════════╝             ')
        respuesta = input                                           ('                ║      Quiere SALIR (s) o REINTENTAR (r)       ║     ').lower()
        print                                                       ('                ╚══════════════════════════════════════════════╩═══════════╝             ')
        
        while respuesta != "s" and respuesta != "r": 
            
            time.sleep(0.35)
            
            print                                                   ('                                                                                         ')
            print                                                   ('                ╔═══════════════╦══════════════════════════════════════════╗             ')
            print                                                   ('                ║   X Error X   ║  Datos que se esperan (s)  o  (r)        ║             ')
            print                                                   ('                ╠═══════════════╩════════════════════════════════╦═════════╝             ')
            respuesta = input                                       ('                ║      Quiere SALIR (s) o REINTENTAR (r)         ║     ').lower()
            print                                                   ('                ╚════════════════════════════════════════════════╩═════════╝             ')
                
        else: 

            if respuesta == "s":
                
                time.sleep(0.35)
                
                print                                               ('                                                                                         ')
                print                                               ('                ╔══════════════════════════════════════════════════════════╗             ')
                print                                               ('                ║          Gracias por utilizar mi proyecto                ║             ')
                print                                               ('                ║    Presione ENTER para finalizar con el programa         ║             ')
                print                                               ('                ╚══════════════════════════════════════════════════════════╝             ')
                print                                               ('            ┌──────────────────────────────────────────────────────────────────────┐     ')
                input                                               ('            │   Desarrollado por Lucas Ezequiel Sanchez con Python. Año 2022.      │     ')
                print                                               ('            └──────────────────────────────────────────────────────────────────────┘     ')
                
                break  
           

