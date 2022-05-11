# Funciones
import math
import os

def limpiar_consola():

    comando = 'clear'
    if os.name in ('nt', 'dos'):  # si la maquina esta corriendo en Windows, use cls
        comando = 'cls'
    os.system(comando)

def opcion_A():
    
    
    print                                                      ('  │              ╔══════════════════════════════════════════╦═══════════════╗             │')
    print                                                      ('  │              ║     A ► Adición                     (+)  ║    SUMAR      ║             │')
    print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════╣             │')
             
    try:
        
        numero1 = int (input                                          ('  │              ║    Escriba el primer valor numérico      ║      '))
        print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════╣             │')
        numero2 = int (input                                          ('  │              ║    Escriba el segundo valor numérico     ║      '))

        resultado = numero1 + numero2
            
        print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════║             │')
        print                                                      ('  │              ║   Resultado total de la Adición es       ║      {}        ║             │'.format(resultado))
        print                                                      ('  │              ╚══════════════════════════════════════════╩═══════════════╝             │')          
                      
    except ValueError:
            
        print                                                      ('  │              ║═══════════════╦══════════════════════════╩═══════════════╗             │') 
        print                                                      ('  │              ║ ¡¡ Error !!   ║   No se admiten letras como valores      ║             │')           
        print                                                      ('  │              ╚═══════════════╩══════════════════════════════════════════╝             │') 
            
    
def opcion_B():
    
    print                                                      ('  │              ╔══════════════════════════════════════════╦═══════════════╗             │')
    print                                                      ('  │              ║   B ► Sustracción            (-)         ║    RESTAR     ║             │')
    print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════╣             │')
            
    try:
        
        numero1 = int (input                                          ('  │              ║    Escriba el primer valor numérico      ║      '))
        print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════╣             │')
        numero2 = int (input                                          ('  │              ║    Escriba el segundo valor numérico     ║      '))

        resultado = numero1 - numero2
            
        print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════║             │')
        print                                                      ('  │              ║   Resultado total de la Sustracción es   ║      {}        ║             │'.format(resultado))
        print                                                      ('  │              ╚══════════════════════════════════════════╩═══════════════╝             │')           
                    
    except ValueError:
            
        print                                                      ('  │              ║═══════════════╦══════════════════════════╩═══════════════╗             │') 
        print                                                      ('  │              ║ ¡¡ Error !!   ║   No se admiten letras como valores      ║             │')           
        print                                                      ('  │              ╚═══════════════╩══════════════════════════════════════════╝             │')              
            
def opcion_C():
    
    print                                                      ('  │              ╔══════════════════════════════════════════╦═══════════════╗             │')
    print                                                      ('  │              ║   C ► Multiplicación         (*)         ║  MULTIPLICAR  ║             │')
    print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════╣             │')
            
    try:
        
        numero1 = int (input                                          ('  │              ║    Escriba el primer valor numérico      ║       '))
        print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════╣             │')
        numero2 = int (input                                          ('  │              ║    Escriba el segundo valor numérico     ║       '))

        resultado = numero1 * numero2
            
        print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════║             │')
        print                                                      ('  │              ║  Resultado total de la Multiplicación es ║       {}       ║             │'.format(resultado))
        print                                                      ('  │              ╚══════════════════════════════════════════╩═══════════════╝             │')           
                    
    except ValueError:
            
        print                                                      ('  │              ║═══════════════╦══════════════════════════╩═══════════════╗             │') 
        print                                                      ('  │              ║ ¡¡ Error !!   ║   No se admiten letras como valores      ║             │')           
        print                                                      ('  │              ╚═══════════════╩══════════════════════════════════════════╝             │')                      
            
def opcion_D():
    
    print                                                      ('  │              ╔══════════════════════════════════════════╦═══════════════╗             │')
    print                                                      ('  │              ║   D ► División               (/)         ║   DIVIDIR     ║             │')
    print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════╣             │')
        
    try:
            
        numero1 = int (input                                          ('  │              ║    Escriba el primer valor numérico      ║       '))
        print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════╣             │')
        numero2 = int (input                                          ('  │              ║    Escriba el segundo valor numérico     ║       '))
        
        resultado = numero1 / numero2
                    
        print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════║             │')
        print                                                      ('  │              ║   Resultado total de la División es      ║    {:.2f}       ║             │'.format(resultado))
        print                                                      ('  │              ╚══════════════════════════════════════════╩═══════════════╝             │')  
        
    except ValueError:
        
        print                                                      ('  │              ║═══════════════╦══════════════════════════╩═══════════════╗             │') 
        print                                                      ('  │              ║ ¡¡ Error !!   ║   No se admiten letras como valores      ║             │')           
        print                                                      ('  │              ╚═══════════════╩══════════════════════════════════════════╝             │')               
                

    except ZeroDivisionError:
    
            print                                                       ('  │              ║═══════════════╦══════════════════════════╩═══════════════╗             │') 
            print                                                       ('  │              ║ ¡¡ Error !!   ║   No se puede dividir (/) por 0          ║             │')           
            print                                                       ('  │              ╚═══════════════╩══════════════════════════════════════════╝             │')
             

def opcion_E():
    
    print                                                      ('  │              ╔══════════════════════════════════════════╦═══════════════╗             │')
    print                                                      ('  │              ║   E ► Exponenciación              (b,e)  ║   EXPONENTE   ║             │')
    print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════╣             │')
         
    try:   
            
        base = int (input                                          ('  │              ║      Escriba el número de base           ║      '))
        print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════╣             │')
        exponente = int (input                                          ('  │              ║     Escriba el número exponencial        ║      '))
        resultado = base ** exponente
            
        print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════║             │')
        print                                                      ('  │              ║  Resultado total de la Exponenciación es ║     {}        ║             │'.format(resultado))
        print                                                      ('  │              ╚══════════════════════════════════════════╩═══════════════╝             │')           
                    
    except ValueError:
            
        
        print                                                      ('  │              ║═══════════════╦══════════════════════════╩═══════════════╗             │') 
        print                                                      ('  │              ║ ¡¡ Error !!   ║   No se admiten letras como valores      ║             │')           
        print                                                      ('  │              ╚═══════════════╩══════════════════════════════════════════╝             │')
         

def opcion_F():
       
    print                                                      ('  │              ╔══════════════════════════════════════════╦═══════════════╗             │')
    print                                                      ('  │              ║   F ► Radicación                    (√)  ║    RAICES     ║             │')
    print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════╣             │')   
    
    try:
        
        numero_base = int (input                                          ('  │              ║       Escriba el número base             ║       '))        
        
        if numero_base > 0 :  
            print                                                       ('  │              ║══════════════════════════════════════════╬═══════════════╣             │')
            numero_raiz = int (input                                          ('  │              ║    Escriba el número de elevación        ║       '))
            resultado = math.pow(numero_base,1 / numero_raiz)
            
            print                                                       ('  │              ║══════════════════════════════════════════╬═══════════════║             │')
            print                                                       ('  │              ║   Resultado total de la Radicación es    ║     {:.2f}      ║             │'.format(resultado))
            print                                                       ('  │              ╚══════════════════════════════════════════╩═══════════════╝             │') 
        
        else:
            print                                                       ('  │              ║═══════════════╦══════════════════════════╩═══════════════╗             │') 
            print                                                       ('  │              ║ ¡¡ Error !!   ║    No se admiten valores negativos       ║             │')           
            print                                                       ('  │              ╚═══════════════╩══════════════════════════════════════════╝             │')
            
    except ValueError:
            
        print                                                      ('  │              ║═══════════════╦══════════════════════════╩═══════════════╗             │') 
        print                                                      ('  │              ║ ¡¡ Error !!   ║   No se admiten letras como valores      ║             │')           
        print                                                      ('  │              ╚═══════════════╩══════════════════════════════════════════╝             │')       
    
def opcion_G():
    
    print                                                      ('  │              ╔══════════════════════════════════════════╦═══════════════╗             │')
    print                                                      ('  │              ║   G ► El Número es PAR o IMPAR           ║   PARIDAD     ║             │')
    print                                                      ('  │              ║══════════════════════════════════════════╬═══════════════╣             │')   
       
    try:   
            
        numero1 = int (input                                          ('  │              ║   Escriba el número a verificar          ║     '))
        
         
        resultado = numero1 % int (2)
    
        if resultado == 0 :
            
            print                                                       ('  │              ║══════════════════════════════════════════╩═══════════════║             │')
            print                                                       ('  │              ║     El ({}) esta dentro de los números PARES            ║             │'.format(numero1))
            print                                                       ('  │              ╚══════════════════════════════════════════════════════════╝             │')
            
        else :
            
            print                                                       ('  │              ║══════════════════════════════════════════╩══════════════║              │')
            print                                                       ('  │              ║   El ({}) esta dentro de los números IMPARARES         ║              │'.format(numero1))
            print                                                       ('  │              ╚═════════════════════════════════════════════════════════╝              │')
                
    except ValueError:
            
        print                                                      ('  │              ║═══════════════╦══════════════════════════╩═══════════════╗             │') 
        print                                                      ('  │              ║ ¡¡ Error !!   ║   No se admiten letras como valores      ║             │')           
        print                                                      ('  │              ╚═══════════════╩══════════════════════════════════════════╝             │')
            
