import time
from opciones import *


print()
print()

time.sleep(0.35)

print                                                             ('              ┌───────────────────────────────────────────────────────────────┐            ')
print                                                             ('  ┌───────────┤       Desarrollado por Lucas Sanchez en Lenguaje Python       ├───────────┐')
print                                                             ('  │           └───────────────────────────────────────────────────────────────┘           │')
print                                                             ('  │                                                                                       │')  
print                                                             ('  │              ╔══════════════════════════════════════════════════════════╗             │')
print                                                             ('  │              ║         Hola Usuario, ¿ Cuál es su nombre ?              ║             │')
nombre = input                                                    ('  │              ║                        ').capitalize()
print                                                             ('  │              ╚══════════════════════════════════════════════════════════╝             │')

while not nombre.isalpha() and nombre.isalnum() or nombre.isnumeric() or nombre == '' or nombre.isspace():
    
    if nombre == '' or nombre.isspace():
        
        
        print                                                      ('  │              ╔═══════════════╦══════════════════════════════════════════╗             │') 
        print                                                      ('  │              ║ ¡¡ Error !!   ║  No se detecto ningun dato ingresado     ║             │'.format(nombre))
        print                                                      ('  │              ╠═══════════════╩═══════════════════════════════╦══════════╝             │')
        respuesta = input                                          ('  │              ║      Quiere SALIR (s) o REINTENTAR (r)        ║     ').lower()
        print                                                      ('  │              ╚═══════════════════════════════════════════════╩══════════╝             │')
    
    else:
         
        time.sleep(0.35)

        print                                                      ('  │              ╔═══════════════╦══════════════════════════════════════════╗             │')
        print                                                      ('  │              ║ ¡¡ Error !!   ║  El fomato del nombre no es válido       ║             │'.format(nombre))
        print                                                      ('  │              ╠═══════════════╩═══════════════════════════════╦══════════╝             │')
        respuesta = input                                          ('  │              ║      Quiere SALIR (s) o REINTENTAR (r)        ║     ').lower()
        print                                                      ('  │              ╚═══════════════════════════════════════════════╩══════════╝             │')

    while respuesta != "s" and respuesta != "r":
        
        time.sleep(0.35)

        print                                                      ('  │              ╔═══════════════╦══════════════════════════════════════════╗             │') 
        print                                                      ('  │              ║ ¡¡ Error !!   ║  Datos que se esperan (s)  o  (r)        ║             │')
        print                                                      ('  │              ╠═══════════════╩════════════════════════════════╦═════════╝             │')
        respuesta = input                                          ('  │              ║      Quiere SALIR (s) o REINTENTAR (r)         ║     ').lower()
        print                                                      ('  │              ╚════════════════════════════════════════════════╩═════════╝             │')
        
    else: 
        
        if respuesta == "s":
            
            time.sleep(0.35)

            print                                                  ('  │              ╔══════════════════════════════════════════════════════════╗             │')  
            print                                                  ('  │              ║          Gracias por utilizar mi proyecto                ║             │') 
            print                                                  ('  │              ║    Presione ENTER para finalizar con el programa         ║             │')                     
            print                                                  ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print                                                  ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                  ('  └─────────┤    Hecho en Argentina, Ciudad Autónoma de Buenos Aires Año 2022      ├──────┘')
            print                                                  ('            └──────────────────────────────────────────────────────────────────────┘       ')
            
            break
        
        if respuesta == "r":
            
            limpiar_consola()
            time.sleep(0.35)
            
            print()
            print()
            
            print                                                  ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                  ('  ┌───────────┤      Desarrollado por Lucas Sanchez en Lenguaje Python        ├───────────┐')
            print                                                  ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                  ('  │                                                                                       │')  
            print                                                  ('  │              ╔══════════════════════════════════════════════════════════╗             │')
            print                                                  ('  │              ║         Hola Usuario, ¿ Cuál es su nombre ?              ║             │')
            nombre = input                                         ('  │              ║                        ').capitalize()
            print                                                  ('  │              ╚══════════════════════════════════════════════════════════╝             │')

while nombre.isalpha():
            
    limpiar_consola()
    time.sleep(0.35)
    
    print()
    print()
    
    print                                                          ('              ┌───────────────────────────────────────────────────────────────┐           ')
    print                                                          ('  ┌───────────┤      Desarrollado por Lucas Sanchez en Lenguaje Python        ├──────────┐')
    print                                                          ('  │           └───────────────────────────────────────────────────────────────┘          │')
    print                                                          ('  │                                                                                      │')      
    print                                                          ('  │              ╔═════════════════════════════════════════════════════════╗             │') 
    print                                                          ('  │              ║     Hola {}, Bienvenido/a a mi Proyecto Personal     ║             │'.format(nombre))
    print                                                          ('  │              ╚═════════════════════════════════════════════════════════╝             │')
    print                                                          ('  │                                                                                      │')
    print                                                          ('  │              ╔═════════════════════════════════════════════════════════╗             │')
    print                                                          ('  │              ║            Calculadora interactiva Python               ║             │')
    print                                                          ('  │              ╠══════════════════════════════════════════╦══════════════╣             │')
    print                                                          ('  │              ║     A ► Adición                     (+)  ║    SUMAR     ║             │')
    print                                                          ('  │              ║══════════════════════════════════════════╬══════════════╣             │')
    print                                                          ('  │              ║     B ► Sustracción                 (-)  ║    RESTAR    ║             │')
    print                                                          ('  │              ║══════════════════════════════════════════╬══════════════╣             │')
    print                                                          ('  │              ║     C ► Multiplicación              (*)  ║  MULTIPLICAR ║             │')
    print                                                          ('  │              ║══════════════════════════════════════════╬══════════════╣             │')
    print                                                          ('  │              ║     D ► División                    (/)  ║    DIVIDIR   ║             │')
    print                                                          ('  │              ║══════════════════════════════════════════╬══════════════╣             │')
    print                                                          ('  │              ║     E ► Exponenciación            (b,e)  ║   EXPONENTE  ║             │')
    print                                                          ('  │              ║══════════════════════════════════════════╬══════════════╣             │')
    print                                                          ('  │              ║     F ► Radicación                  (√)  ║    RAICES    ║             │')
    print                                                          ('  │              ║══════════════════════════════════════════╬══════════════╣             │')
    print                                                          ('  │              ║     G ► El Número es PAR o IMPAR         ║    PARIDAD   ║             │')
    print                                                          ('  │              ╚══════════════════════════════════════════╩══════════════╝             │')
    print                                                          ('  │              ╔══════════════════════════════════════════╦══════════════╗             │')
    opcion = input                                                 ('  │              ║   {}, Elegi la opción que vas a usar  ║       '.format(nombre)).upper()
    print                                                          ('  │              ╚══════════════════════════════════════════╩══════════════╝             │')
    
    print()
        
    if opcion == 'A' or opcion == 'B' or opcion == 'C' or opcion == 'D' or opcion == 'E' or opcion == 'F' or opcion == 'G':
        
        limpiar_consola()

        if opcion == "A":
            
            time.sleep(0.35)
            
            print()
            print()
            
            print                                                  ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                  ('  ┌───────────┤      Desarrollado por Lucas Sanchez en Lenguaje Python        ├───────────┐')
            print                                                  ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                  ('  │                                                                                       │')
            print                                                  ('  │              ╔══════════════════════════════════════════════════════════╗             │')
            print                                                  ('  │              ║       Hola {}, has elegido la opción SUMAR            ║             |'.format(nombre))
            print                                                  ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print

            opcion_A()
            
            print                                                  ('  │                                                                                       │')
            print                                                  ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                  ('  └─────────┤    Hecho en Argentina, Ciudad Autónoma de Buenos Aires Año 2022      ├──────┘')
            print                                                  ('            └──────────────────────────────────────────────────────────────────────┘       ')
            break
        
        if opcion == "B":
            
            time.sleep(0.35)
            
            print()
            print()
    
            print                                                  ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                  ('  ┌───────────┤      Desarrollado por Lucas Sanchez en Lenguaje Python        ├───────────┐')
            print                                                  ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                  ('  │                                                                                       │')
            print                                                  ('  │              ╔══════════════════════════════════════════════════════════╗             │')
            print                                                  ('  │              ║       Hola {}, has elegido la opción RESTAR           ║             │'.format(nombre))
            print                                                  ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print                                                  ('  │                                                                                       │')
            
            opcion_B()
            
            print                                                  ('  │                                                                                       │')
            print                                                  ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                  ('  └─────────┤    Hecho en Argentina, Ciudad Autónoma de Buenos Aires Año 2022      ├──────┘')
            print                                                  ('            └──────────────────────────────────────────────────────────────────────┘       ')
            
            break
                     
        if opcion == "C":
            
            time.sleep(0.35)
            
            print()
            print()
            
            print                                                  ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                  ('  ┌───────────┤      Desarrollado por Lucas Sanchez en Lenguaje Python        ├───────────┐')
            print                                                  ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                  ('  │                                                                                       │')
            print                                                  ('  │              ╔══════════════════════════════════════════════════════════╗             │')
            print                                                  ('  │              ║       Hola {}, has elegido la opción MULTIPLICAR      ║             │'.format(nombre))
            print                                                  ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print                                                  ('  │                                                                                       │')
            
            opcion_C()
            
            print                                                  ('  │                                                                                       │')
            print                                                  ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                  ('  └─────────┤    Hecho en Argentina, Ciudad Autónoma de Buenos Aires Año 2022      ├──────┘')
            print                                                  ('            └──────────────────────────────────────────────────────────────────────┘       ')
            
            break            
        
        if opcion == "D":
            
            time.sleep(0.35)
            
            print()
            print()
    
            print                                                  ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                  ('  ┌───────────┤      Desarrollado por Lucas Sanchez en Lenguaje Python        ├───────────┐')
            print                                                  ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                  ('  │                                                                                       │')
            print                                                  ('  │              ╔══════════════════════════════════════════════════════════╗             │')
            print                                                  ('  │              ║       Hola {}, has elegido la opción DIVIDIR          ║             │'.format(nombre))
            print                                                  ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print                                                  ('  │                                                                                       │')
            
            opcion_D()
            
            print                                                  ('  │                                                                                       │')
            print                                                  ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                  ('  └─────────┤    Hecho en Argentina, Ciudad Autónoma de Buenos Aires Año 2022      ├──────┘')
            print                                                  ('            └──────────────────────────────────────────────────────────────────────┘       ')
            
            break
        
        if opcion == "E":
            
            time.sleep(0.35)
            
            print()
            print()
            
            print                                                 ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                 ('  ┌───────────┤      Desarrollado por Lucas Sanchez en Lenguaje Python        ├───────────┐')
            print                                                 ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                 ('  │                                                                                       │')
            print                                                 ('  │              ╔══════════════════════════════════════════════════════════╗             │')
            print                                                 ('  │              ║       Hola {}, has elegido la opción EXPONENTE        ║             │'.format(nombre))
            print                                                 ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print                                                 ('  │                                                                                       │')
            
            opcion_E()
            
            print                                                 ('  │                                                                                       │')
            print                                                 ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                 ('  └─────────┤    Hecho en Argentina, Ciudad Autónoma de Buenos Aires Año 2022      ├──────┘')
            print                                                 ('            └──────────────────────────────────────────────────────────────────────┘       ')
            
            break
        
        if opcion == "F":
            
            time.sleep(0.35)
            
            print()
            print()
            
            print                                                 ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                 ('  ┌───────────┤      Desarrollado por Lucas Sanchez en Lenguaje Python        ├───────────┐')
            print                                                 ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                 ('  │                                                                                       │')
            print                                                 ('  │              ╔══════════════════════════════════════════════════════════╗             │')
            print                                                 ('  │              ║       Hola {}, has elegido la opción RAICES           ║             │'.format(nombre))
            print                                                 ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print                                                 ('  │                                                                                       │')
            
            opcion_F()      
            
            print                                                 ('  │                                                                                       │')
            print                                                 ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                 ('  └─────────┤    Hecho en Argentina, Ciudad Autónoma de Buenos Aires Año 2022      ├──────┘')
            print                                                 ('            └──────────────────────────────────────────────────────────────────────┘       ')
            
            break
        
        if opcion == "G":
            
            time.sleep(0.35)
            
            print()
            print()
            
            print                                                 ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                 ('  ┌───────────┤      Desarrollado por Lucas Sanchez en Lenguaje Python        ├───────────┐')
            print                                                 ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                 ('  │                                                                                       │')
            print                                                 ('  │              ╔══════════════════════════════════════════════════════════╗             │')
            print                                                 ('  │              ║       Hola {}, has elegido la opción PARIDAD          ║             │'.format(nombre))
            print                                                 ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print                                                 ('  │                                                                                       │')
            
            opcion_G()
            
            print                                                 ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                 ('  └─────────┤    Hecho en Argentina, Ciudad Autónoma de Buenos Aires Año 2022      ├──────┘')  
            print                                                 ('            └──────────────────────────────────────────────────────────────────────┘       ')
            
            break 
        
    else:
        
        limpiar_consola()
        time.sleep(0.35)
        
        print()
        print()
        
        print                                                     ('              ┌───────────────────────────────────────────────────────────────┐             ')
        print                                                     ('  ┌───────────┤      Desarrollado por Lucas Sanchez en Lenguaje Python        ├───────────┐')
        print                                                     ('  │           └───────────────────────────────────────────────────────────────┘           │')
        print                                                     ('  │                                                                                       │')  
        print                                                     ('  │              ╔══════════════╦═══════════════════════════════════════════╗             │')
        print                                                     ('  │              ║  ¡¡ Error !! ║  La Opción elegida no está en la lista    ║             │')
        print                                                     ('  │              ╠══════════════╩═══════════════════════════════╦═══════════╝             │')
        respuesta = input                                         ('  │              ║      Quiere SALIR (s) o REINTENTAR (r)       ║     ').lower()
        print                                                     ('  │              ╚══════════════════════════════════════════════╩═══════════╝             │')
        
        while respuesta != "s" and respuesta != "r": 
            
            time.sleep(0.35)
            
            print                                                 ('  │                                                                                       │')        
            print                                                 ('  │              ╔═══════════════╦══════════════════════════════════════════╗             │') 
            print                                                 ('  │              ║ ¡¡ Error !!   ║  Datos que se esperan (s)  o  (r)        ║             │')           
            print                                                 ('  │              ╠═══════════════╩════════════════════════════════╦═════════╝             │')
            respuesta = input                                     ('  │              ║      Quiere SALIR (s) o REINTENTAR (r)         ║     ').lower()
            print                                                 ('  │              ╚════════════════════════════════════════════════╩═════════╝             │')
                
        else: 

            if respuesta == "s":
                
                time.sleep(0.35)
                
                print                                             ('  │                                                                                       │')             
                print                                             ('  │              ╔══════════════════════════════════════════════════════════╗             │')  
                print                                             ('  │              ║          Gracias por utilizar mi proyecto                ║             │') 
                print                                             ('  │              ║    Presione ENTER para finalizar con el programa         ║             │')                     
                print                                             ('  │              ╚══════════════════════════════════════════════════════════╝             │')
                print                                             ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
                input                                             ('  └─────────┤    Hecho en Argentina, Ciudad Autónoma de Buenos Aires Año 2022      ├──────┘')
                print                                             ('            └──────────────────────────────────────────────────────────────────────┘       ')
                
                break  
           

