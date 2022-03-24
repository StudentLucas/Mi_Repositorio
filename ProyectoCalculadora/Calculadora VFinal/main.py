from Calculos import * 

print("    +-----------------------------------------------------+")
print("    |              Calculadora en Python                  |")
print("    +-----------------------------------------------------+")
print("    |      ♥    | A --> Quiero Sumar       |      ♥       |")
print("    |      ♥    |                          |      ♥       |")
print("    |      ♥    | B --> Quiero Restar      |      ♥       |")
print("    |      ♥    |                          |      ♥       |")
print("    |      ♥    | C --> Quiero Multiplicar |      ♥       |")
print("    |      ♥    |                          |      ♥       |")
print("    |      ♥    | D --> Quiero Dividir     |      ♥       |")
print("    |      ♥    |                          |      ♥       |")
print("    |      ♥    | E --> Quiero Exponenciar |      ♥       |")
print("    |      ♥    |                          |      ♥       |")
print("    |      ♥    | F --> Quiero PAR o IMPAR |      ♥       |")
print("    |      ♥    |                          |      ♥       |")
print("    +------♥----|--------٩(◕‿◕)۶-----------+------♥-------|")

opcion = input("    |         Eliga la opción que va a usar:         ").upper()
print("    |-----------------------------------------------------|")

if opcion != "A" and opcion != "B" and opcion != "C"  and opcion != "D" and opcion != "E" and opcion != "F":
    print("    |  Opción invalida!. Sus opciones: A, B, C, D, E o F  |")
    print("    |-----------------------------------------------------|")
    
else:
    
    if opcion == "A":
        mi_suma(input("    |        Escriba el primer número:               "), input("    |        Escriba el segundo número:              "))
    elif opcion == "B":
        mi_resta(input("    |        Escriba el primer número:               "),input("    |        Escriba el segundo número:              "))
    elif opcion == "C":
        mi_mutiplicacion(input("    |        Escriba el primer número:               "),input("    |        Escriba el segundo número:              "))
    elif opcion == "D":
        mi_division(input("    |        Escriba el primer número:               "),input("    |        Escriba el segundo número:              "))
    elif opcion == "E":
        mi_exponencial(input("    |        Escriba el número Base:                 "),input("    |        Escriba el número Exponente:            "))
    elif opcion == "F":
        par_impar(input("    |        Escriba el número a comprobar:          "))
            
# Consultar si el usuario quiere seguir usando el programa  
 
respuesta = input("    |     Quiere volver a usar el programa? S/N:     ").upper()
print("    +-----------------------------------------------------+")

while respuesta != "S" and respuesta != "N":
    
    print("    |-----------------------------------------------------|")
    print("    |  Respuesta incorrecta. Sus opciones son S o N.      |")
    print("    |-----------------------------------------------------|")
    respuesta = input("    |     Quiere volver a usar el programa? S/N:     ").upper()
    print("    +-----------------------------------------------------+")   
    
else:
    
    while respuesta == "S":
        print("")   
        print("    +-----------------------------------------------------+")
        print("    |              Calculadora en Python                  |")
        print("    +-----------------------------------------------------+")
        print("    |      ♥    | A --> Quiero Sumar       |      ♥       |")
        print("    |      ♥    |                          |      ♥       |")
        print("    |      ♥    | B --> Quiero Restar      |      ♥       |")
        print("    |      ♥    |                          |      ♥       |")
        print("    |      ♥    | C --> Quiero Multiplicar |      ♥       |")
        print("    |      ♥    |                          |      ♥       |")
        print("    |      ♥    | D --> Quiero Dividir     |      ♥       |")
        print("    |      ♥    |                          |      ♥       |")
        print("    |      ♥    | E --> Quiero Exponenciar |      ♥       |")
        print("    |      ♥    |                          |      ♥       |")
        print("    |      ♥    | F --> Quiero PAR o IMPAR |      ♥       |")
        print("    |      ♥    |                          |      ♥       |")
        print("    +------♥----|--------٩(◕‿◕)۶-----------+------♥-------|")
        
        opcion = input("    |         Eliga la opción que va a usar:         ").upper()
        print("    |-----------------------------------------------------|")

        if opcion != "A" and opcion != "B" and opcion != "C"  and opcion != "D" and opcion != "E" and opcion != "F":
            print("    |  Opción invalida!. Sus opciones: A, B, C, D, E o F  |")
            print("    |-----------------------------------------------------|")
            
        else :
            if opcion == "A":
                mi_suma(input("    |        Escriba el primer número:             "),input("    |        Escriba el segundo número:            "))
            elif opcion == "B":
                mi_resta(input("    |        Escriba el primer número:             "),input("    |        Escriba el segundo número:            "))
            elif opcion == "C":
                mi_mutiplicacion(input("    |        Escriba el primer número:             "),input("    |        Escriba el segundo número:            "))
            elif opcion == "D":
                mi_division(input("    |        Escriba el primer número:             "),input("    |        Escriba el segundo número:            "))
            elif opcion == "E":
                mi_exponencial(input("    |        Escriba el número Base:           "),input("    |        Escriba el número Exponente:      "))
            elif opcion == "F":
                par_impar(input("    |        Escriba el número a comprobar:          "))
                
        respuesta = input("    |     Quiere volver a usar el programa? S/N:     ").upper()
        print("    +-----------------------------------------------------+")
        
    else:
        input("    |    Presione ENTER para finalizar el programa.       |") 
        print("    |-----------------------------------------------------|")