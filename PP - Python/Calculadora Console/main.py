import time
from opciones import *

print()
print()

time.sleep(0.35)

print                                                                               ('              ┌───────────────────────────────────────────────────────────────┐            ')
print                                                                               ('  ┌───────────┤    Developed for Lucas Ezequiel Sanchez in Python Language    ├───────────┐')
print                                                                               ('  │           └───────────────────────────────────────────────────────────────┘           │')
print                                                                               ('  │                                                                                       │')  
print                                                                               ('  │              ╔═════════════════════════════════════════╦════════════════╗             │')
nombre = input                                                                      ('  │              ║   Hola Usuario, ¿ Cuál es su nombre ?   ║     ').capitalize()
print                                                                               ('  │              ╚═════════════════════════════════════════╩════════════════╝             │')

while not nombre.isalpha() and nombre.isalnum() or nombre.isnumeric() or nombre == '' or nombre.isspace():
    
    if nombre == '' or nombre.isspace():
        
        limpiar_consola()
        
        print                                                                       ('              ┌───────────────────────────────────────────────────────────────┐            ')
        print                                                                       ('  ┌───────────┤    Developed for Lucas Ezequiel Sanchez in Python Language    ├───────────┐')
        print                                                                       ('  │           └───────────────────────────────────────────────────────────────┘           │')
        print                                                                       ('  │                                                                                       │')  
        print                                                                       ('  │              ╔═══════════════╦══════════════════════════════════════════╗             │') 
        print                                                                       ('  │              ║ ⚠  Error  ⚠   ║  NO se detecto ningun dato o esta vacío  ║             │'.format(nombre))           
        print                                                                       ('  │              ╠═══════════════╩═══════════════════════════════╦══════════╝             │')
        respuesta = input                                                           ('  │              ║      Quiere SALIR (S) o REINTENTAR (R)        ║     ').upper()
        print                                                                       ('  │              ╚═══════════════════════════════════════════════╩══════════╝             │')
    
    else:
         
        limpiar_consola() 
        time.sleep(0.35)
        
        
        print                                                                       ('              ┌───────────────────────────────────────────────────────────────┐            ')
        print                                                                       ('  ┌───────────┤    Developed for Lucas Ezequiel Sanchez in Python Language    ├───────────┐')
        print                                                                       ('  │           └───────────────────────────────────────────────────────────────┘           │')
        print                                                                       ('  │                                                                                       │')  
        print                                                                       ('  │              ╔═══════════════╦══════════════════════════════════════════╗             │') 
        print                                                                       ('  │              ║ ⚠  Error  ⚠   ║  NO es válido tener números como nombre  ║             │'.format(nombre))           
        print                                                                       ('  │              ╠═══════════════╩═══════════════════════════════╦══════════╝             │')
        respuesta = input                                                           ('  │              ║      Quiere SALIR (S) o REINTENTAR (R)        ║     ').upper()
        print                                                                       ('  │              ╚═══════════════════════════════════════════════╩══════════╝             │')
    
    
           
    while respuesta != "S" and respuesta != "R":
        
        time.sleep(0.35)
        
        print                                                                       ('  │                                                                                       │')        
        print                                                                       ('  │              ╔═══════════════╦══════════════════════════════════════════╗             │') 
        print                                                                       ('  │              ║ ⚠  Error  ⚠   ║  Respuestas que se esperan son S o R     ║             │')           
        print                                                                       ('  │              ╠═══════════════╩════════════════════════════════╦═════════╝             │')
        respuesta = input                                                           ('  │              ║      Quiere SALIR (S) o REINTENTAR (R)         ║     ').upper()
        print                                                                       ('  │              ╚════════════════════════════════════════════════╩═════════╝             │')
        
    else: 
        
        if respuesta == "S":
            
            time.sleep(0.35)
            
            print                                                                   ('  │                                                                                       │')             
            print                                                                   ('  │              ╔══════════════════════════════════════════════════════════╗             │')  
            print                                                                   ('  │              ║          Gracias por utilizar mi proyecto                ║             │') 
            print                                                                   ('  │              ║    Presione ENTER para finalizar con el programa         ║             │')                     
            print                                                                   ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print                                                                   ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                                   ('  └─────────┤  Made in Argentina Ciudad Autónoma de Buenos Aires Año Lectivo 2022  ├──────┘')
            print                                                                   ('            └──────────────────────────────────────────────────────────────────────┘       ')
            
            break
        
        if respuesta == "R":
            
            limpiar_consola()
            time.sleep(0.35)
            
            print()
            print()
            
            print                                                                   ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                                   ('  ┌───────────┤    Developed for Lucas Ezequiel Sanchez in Python Language    ├───────────┐')
            print                                                                   ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                                   ('  │                                                                                       │')  
            print                                                                   ('  │              ╔═════════════════════════════════════════╦════════════════╗             │')
            nombre = input                                                          ('  │              ║   Hola Usuario, ¿ Cuál es su nombre ?   ║      ').capitalize()
            print                                                                   ('  │              ╚═════════════════════════════════════════╩════════════════╝             │')

while nombre.isalpha():
            
    limpiar_consola()
    time.sleep(0.35)
    
    print()
    print()
    
    print                                                                           ('              ┌───────────────────────────────────────────────────────────────┐           ')
    print                                                                           ('  ┌───────────┤    Developed for Lucas Ezequiel Sanchez in Python Language    ├──────────┐')
    print                                                                           ('  │           └───────────────────────────────────────────────────────────────┘          │')
    print                                                                           ('  │                                                                                      │')      
    print                                                                           ('  │              ╔═════════════════════════════════════════════════════════╗             │') 
    print                                                                           ('  │              ║     Hola {}, Bienvenido/a a mi Proyecto Personal     ║             │'.format(nombre))
    print                                                                           ('  │              ╚═════════════════════════════════════════════════════════╝             │')
    print                                                                           ('  │                                                                                      │')
    print                                                                           ('  │              ╔═════════════════════════════════════════════════════════╗             │')
    print                                                                           ('  │              ║            Calculadora interactiva Python               ║             │')
    print                                                                           ('  │              ╠══════════════════════════════════════════╦══════════════╣             │')
    print                                                                           ('  │              ║     A ► Adición                     (+)  ║    SUMAR     ║             │')
    print                                                                           ('  │              ║══════════════════════════════════════════╬══════════════╣             │')
    print                                                                           ('  │              ║     B ► Sustracción                 (-)  ║    RESTAR    ║             │')
    print                                                                           ('  │              ║══════════════════════════════════════════╬══════════════╣             │')
    print                                                                           ('  │              ║     C ► Multiplicación              (*)  ║  MULTIPLICAR ║             │')
    print                                                                           ('  │              ║══════════════════════════════════════════╬══════════════╣             │')
    print                                                                           ('  │              ║     D ► División                    (/)  ║    DIVIDIR   ║             │')
    print                                                                           ('  │              ║══════════════════════════════════════════╬══════════════╣             │')
    print                                                                           ('  │              ║     E ► Exponenciación            (b,e)  ║   EXPONENTE  ║             │')
    print                                                                           ('  │              ║══════════════════════════════════════════╬══════════════╣             │')
    print                                                                           ('  │              ║     F ► Radicación                  (√)  ║    RAICES    ║             │')
    print                                                                           ('  │              ║══════════════════════════════════════════╬══════════════╣             │')
    print                                                                           ('  │              ║     G ► El Número es PAR o IMPAR         ║    PARIDAD   ║             │')
    print                                                                           ('  │              ╚══════════════════════════════════════════╩══════════════╝             │')
    print                                                                           ('  │              ╔══════════════════════════════════════════╦══════════════╗             │')
    opcion = input                                                                  ('  │              ║   {}, Elegi la opción que vas a usar  ║       '.format(nombre)).upper()
    print                                                                           ('  │              ╚══════════════════════════════════════════╩══════════════╝             │')
    
    print()
        
    if opcion == 'A' or opcion == 'B' or opcion == 'C' or opcion == 'D' or opcion == 'E' or opcion == 'F' or opcion == 'G':
        
        limpiar_consola()

        if opcion == "A":
            
            time.sleep(0.35)
            
            print()
            print()
            
            print                                                                   ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                                   ('  ┌───────────┤    Developed for Lucas Ezequiel Sanchez in Python Language    ├───────────┐')
            print                                                                   ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                                   ('  │                                                                                       │')
            print                                                                   ('  │              ╔══════════════════════════════════════════════════════════╗             │')
            print                                                                   ('  │              ║       Hola {}, has elegido la opción SUMAR            ║             |'.format(nombre))
            print                                                                   ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print                     
            opcion_A()
            print                                                                   ('  │                                                                                       │')
            print                                                                   ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                                   ('  └─────────┤  Made in Argentina Ciudad Autónoma de Buenos Aires Año Lectivo 2022  ├──────┘')
            print                                                                   ('            └──────────────────────────────────────────────────────────────────────┘       ')
            break
        
        if opcion == "B":
            
            time.sleep(0.35)
            
            print()
            print()
    
            print                                                                   ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                                   ('  ┌───────────┤    Developed for Lucas Ezequiel Sanchez in Python Language    ├───────────┐')
            print                                                                   ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                                   ('  │                                                                                       │')
            print                                                                   ('  │              ╔══════════════════════════════════════════════════════════╗             │')
            print                                                                   ('  │              ║       Hola {}, has elegido la opción RESTAR           ║             │'.format(nombre))
            print                                                                   ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print                                                                   ('  │                                                                                       │')
            opcion_B()
            print                                                                   ('  │                                                                                       │')
            print                                                                   ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                                   ('  └─────────┤  Made in Argentina Ciudad Autónoma de Buenos Aires Año Lectivo 2022  ├──────┘')
            print                                                                   ('            └──────────────────────────────────────────────────────────────────────┘       ')
            
            break
                     
        if opcion == "C":
            
            time.sleep(0.35)
            
            print()
            print()
            
            print                                                                   ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                                   ('  ┌───────────┤    Developed for Lucas Ezequiel Sanchez in Python Language    ├───────────┐')
            print                                                                   ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                                   ('  │                                                                                       │')
            print                                                                   ('  │              ╔══════════════════════════════════════════════════════════╗             │')
            print                                                                   ('  │              ║       Hola {}, has elegido la opción MULTIPLICAR      ║             │'.format(nombre))
            print                                                                   ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print                                                                   ('  │                                                                                       │')
            opcion_C()
            print                                                                   ('  │                                                                                       │')
            print                                                                   ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                                   ('  └─────────┤  Made in Argentina Ciudad Autónoma de Buenos Aires Año Lectivo 2022  ├──────┘')
            print                                                                   ('            └──────────────────────────────────────────────────────────────────────┘       ')
            
            break            
        
        if opcion == "D":
            
            time.sleep(0.35)
            
            print()
            print()
    
            print                                                                   ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                                   ('  ┌───────────┤    Developed for Lucas Ezequiel Sanchez in Python Language    ├───────────┐')
            print                                                                   ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                                   ('  │                                                                                       │')
            print                                                                   ('  │              ╔══════════════════════════════════════════════════════════╗             │')
            print                                                                   ('  │              ║       Hola {}, has elegido la opción DIVIDIR          ║             │'.format(nombre))
            print                                                                   ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print                                                                   ('  │                                                                                       │')
            opcion_D()
            print                                                                   ('  │                                                                                       │')
            print                                                                   ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                                   ('  └─────────┤  Made in Argentina Ciudad Autónoma de Buenos Aires Año Lectivo 2022  ├──────┘')
            print                                                                   ('            └──────────────────────────────────────────────────────────────────────┘       ')
            
            break
        
        if opcion == "E":
            
            time.sleep(0.35)
            
            print()
            print()
            
            print                                                                   ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                                   ('  ┌───────────┤    Developed for Lucas Ezequiel Sanchez in Python Language    ├───────────┐')
            print                                                                   ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                                   ('  │                                                                                       │')
            print                                                                   ('  │              ╔══════════════════════════════════════════════════════════╗             │')
            print                                                                   ('  │              ║       Hola {}, has elegido la opción EXPONENTE        ║             │'.format(nombre))
            print                                                                   ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print                                                                   ('  │                                                                                       │')
            opcion_E()
            print                                                                   ('  │                                                                                       │')
            print                                                                   ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                                   ('  └─────────┤  Made in Argentina Ciudad Autónoma de Buenos Aires Año Lectivo 2022  ├──────┘')
            print                                                                   ('            └──────────────────────────────────────────────────────────────────────┘       ')
            
            break
        
        if opcion == "F":
            
            time.sleep(0.35)
            
            print()
            print()
            
            print                                                                   ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                                   ('  ┌───────────┤    Developed for Lucas Ezequiel Sanchez in Python Language    ├───────────┐')
            print                                                                   ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                                   ('  │                                                                                       │')
            print                                                                   ('  │              ╔══════════════════════════════════════════════════════════╗             │')
            print                                                                   ('  │              ║       Hola {}, has elegido la opción RAICES           ║             │'.format(nombre))
            print                                                                   ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print                                                                   ('  │                                                                                       │')
            opcion_F()      
            print                                                                   ('  │                                                                                       │')
            print                                                                   ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                                   ('  └─────────┤  Made in Argentina Ciudad Autónoma de Buenos Aires Año Lectivo 2022  ├──────┘')
            print                                                                   ('            └──────────────────────────────────────────────────────────────────────┘       ')
            
            break
        
        if opcion == "G":
            
            time.sleep(0.35)
            
            print()
            print()
            
            print                                                                   ('              ┌───────────────────────────────────────────────────────────────┐            ')
            print                                                                   ('  ┌───────────┤    Developed for Lucas Ezequiel Sanchez in Python Language    ├───────────┐')
            print                                                                   ('  │           └───────────────────────────────────────────────────────────────┘           │')
            print                                                                   ('  │                                                                                       │')
            print                                                                   ('  │              ╔══════════════════════════════════════════════════════════╗             │')
            print                                                                   ('  │              ║       Hola {}, has elegido la opción PARIDAD          ║             │'.format(nombre))
            print                                                                   ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            print                                                                   ('  │                                                                                       │')
            opcion_G()
            print                                                                   ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
            input                                                                   ('  └─────────┤  Made in Argentina Ciudad Autónoma de Buenos Aires Año Lectivo 2022  ├──────┘')  
            print                                                                   ('            └──────────────────────────────────────────────────────────────────────┘       ')
            
            break 
        
    else:
        
        limpiar_consola()
        time.sleep(0.35)
        
        print()
        print()
        
        print                                                                       ('              ┌───────────────────────────────────────────────────────────────┐             ')
        print                                                                       ('  ┌───────────┤    Developed for Lucas Ezequiel Sanchez in Python Language    ├───────────┐')
        print                                                                       ('  │           └───────────────────────────────────────────────────────────────┘           │')
        print                                                                       ('  │                                                                                       │')  
        print                                                                       ('  │              ╔══════════════╦═══════════════════════════════════════════╗             │')
        print                                                                       ('  │              ║ ⚠  Error  ⚠  ║  La opción elegida no esta en la lista    ║             │')
        print                                                                       ('  │              ╠══════════════╩═══════════════════════════════╦═══════════╝             │')
        respuesta = input                                                           ('  │              ║      Quiere SALIR (S) o REINTENTAR (R)       ║     ').upper()
        print                                                                       ('  │              ╚══════════════════════════════════════════════╩═══════════╝             │')
        
        while respuesta != "S" and respuesta != "R": 
            
            time.sleep(0.35)
            
            print                                                                   ('  │                                                                                       │')        
            print                                                                   ('  │              ╔═══════════════╦══════════════════════════════════════════╗             │') 
            print                                                                   ('  │              ║ ⚠  Error  ⚠   ║  Respuestas que se esperan son S o R     ║             │')           
            print                                                                   ('  │              ╠═══════════════╩════════════════════════════════╦═════════╝             │')
            respuesta = input                                                       ('  │              ║      Quiere SALIR (S) o REINTENTAR (R)         ║     ').upper()
            print                                                                   ('  │              ╚════════════════════════════════════════════════╩═════════╝             │')
                
        else: 

            if respuesta == "S":
                
                time.sleep(0.35)
                
                print                                                               ('  │                                                                                       │')             
                print                                                               ('  │              ╔══════════════════════════════════════════════════════════╗             │')  
                print                                                               ('  │              ║          Gracias por utilizar mi proyecto                ║             │') 
                print                                                               ('  │              ║    Presione ENTER para finalizar con el programa         ║             │')                     
                print                                                               ('  │              ╚══════════════════════════════════════════════════════════╝             │')
                print                                                               ('  │         ┌──────────────────────────────────────────────────────────────────────┐      │')
                input                                                               ('  └─────────┤  Made in Argentina Ciudad Autónoma de Buenos Aires Año Lectivo 2022  ├──────┘')
                print                                                               ('            └──────────────────────────────────────────────────────────────────────┘       ')
                
                break  
           

