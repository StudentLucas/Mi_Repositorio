# Caclculadora en Python

# Funciones 

def mi_suma():
    numero1 = input("|             Escriba el primer número:             ")
    print("|_________________________________________________________|")
    numero2 = input("|             Escriba el segundo número:            ")
    print("|_________________________________________________________|")
    resultado = int (numero1) + int (numero2)
    print(f"|             Su resultado total es:                {resultado}     |")
    print( "|_________________________________________________________|")

def mi_resta():
    numero1 = input("|             Escriba el primer número:             ")
    print("|_________________________________________________________|")
    numero2 = input("|             Escriba el segundo número:            ")
    print("|_________________________________________________________|")
    resultado = int (numero1) - int (numero2)
    print(f"|             Su resultado total es:                {resultado}     |")
    print( "|_________________________________________________________|")

def mi_mutiplicacion():
    numero1 = input("|             Escriba el primer número:             ")
    print("|_________________________________________________________|")
    numero2 = input("|             Escriba el segundo número:            ")
    print("|_________________________________________________________|")
    resultado = int (numero1) * int (numero2)
    print(f"|             Su resultado total es:                {resultado}     |")
    print( "|_________________________________________________________|")

def mi_division():
    numero1 = input("|             Escriba el primer número:             ")
    print("|_________________________________________________________|")
    numero2 = input("|             Escriba el segundo número:            ")
    print("|_________________________________________________________|")
    resultado = int (numero1) / int (numero2)
    print(f"|             Su resultado total es:               {resultado}    |")
    print( "|_________________________________________________________|")            

def mi_exponencial():
    numero1 = input("|             Escriba el número Base:           ")
    print("|_________________________________________________________|")
    numero2 = input("|             Escriba el número Exponente:      ")
    print("|_________________________________________________________|")
    resultado = int (numero1) ** int (numero2)
    print(f"|             Su resultado total es:           {resultado}         |")
    print( "|_________________________________________________________|")

def par_impar():
    numero1 = input("|             Escriba el número a comprobar:          ")
    resultado = int (numero1) % int (2)
    if resultado == 0 :
        print("|_________________________________________________________|")
        print(f"|          Número elegido {numero1}. Es un número PAR             |")
        print("|_________________________________________________________|")
    else :
        print("|_________________________________________________________|")
        print(f"|          Número elegido {numero1}. Es un número IMPAR           |")
        print("|_________________________________________________________|")

 
print(" _________________________________________________________")
print("|                                                         |")
print("|                MI PROGRAMA EN PYTHON                    |")
print("|_________________________________________________________|")
print("|      ♥       |  A) Suma.           |  ♥                 |")
print("|      Y       |                     |    L               |")
print("|      O       |  B) Resta.          |      U             |")
print("|              |                     |        C           |")
print("|      M       |  C) Multiplicación. |          A         |")
print("|      E       |                     |   S         S      |")
print("|              |  D) División.       |     A              |")
print("|      L       |                     |       N            |")
print("|      L       |  E) Exponencial.    |         C          |")
print("|      A       |                     |           H        |")
print("|      M       |  F) PAR o IMPAR?.   |             E      |")
print("|      O       |                     |               Z    |")
print("|      ♥       |     ٩(◕‿◕)۶         |                 ♥  |")
print("|______________|_____________________|____________________|")
opcion = input("|        Escriba la opción que quiere utilizar:     ").upper()
print("|_________________________________________________________|")

if opcion != "A" and opcion != "B" and opcion != "C"  and opcion != "D" and opcion != "E" and opcion != "F":
    print("|              La opción no es correcta!                  |")
    print("|_________________________________________________________|")
else :
    if opcion == "A":
        mi_suma()
    elif opcion == "B":
        mi_resta()
    elif opcion == "C":
        mi_mutiplicacion()
    elif opcion == "D":
        mi_division()
    elif opcion == "E":
        mi_exponencial()
    elif opcion == "F":
        par_impar()
           
    
# Consultar si quiere seguir usando el programa  
 
respuesta = input("|        Quiere continuar usando el programa? Y/N:    ").upper()
print( "|_________________________________________________________|")
while respuesta == "Y" :
        print(" _________________________________________________________")
        print("|                                                         |")
        print("|                MI PROGRAMA EN PYTHON                    |")
        print("|_________________________________________________________|")
        print("|      ♥       |  A) Suma.           |  ♥                 |")
        print("|      Y       |                     |    L               |")
        print("|      O       |  B) Resta.          |      U             |")
        print("|              |                     |        C           |")
        print("|      M       |  C) Multiplicación. |          A         |")
        print("|      E       |                     |   S         S      |")
        print("|              |  D) División.       |     A              |")
        print("|      L       |                     |       N            |")
        print("|      L       |  E) Exponencial.    |         C          |")
        print("|      A       |                     |           H        |")
        print("|      M       |  F) PAR o IMPAR?.   |             E      |")
        print("|      O       |                     |               Z    |")
        print("|      ♥       |     ٩(◕‿◕)۶         |                 ♥  |")
        print("|______________|_____________________|____________________|")
        opcion = input("|        Escriba la opción que quiere utilizar:     ").upper()
        print("|_________________________________________________________|")

        if opcion != "A" and opcion != "B" and opcion != "C"  and opcion != "D" and opcion != "E" and opcion != "F":
            print("|              La opción no es correcta!                  |")
            print("|_________________________________________________________|")
        else :
            if opcion == "A":
                mi_suma()
            elif opcion == "B":
                mi_resta()
            elif opcion == "C":
                mi_mutiplicacion()
            elif opcion == "D":
                mi_division()
            elif opcion == "E":
                mi_exponencial()
            elif opcion == "F":
                par_impar()
        respuesta = input("|        Quiere continuar usando el programa? Y/N:    ").upper()
        print( "|_________________________________________________________|")
else:
    print("|              El programa esta Finalizado.               |")
    print("|_________________________________________________________|")
    
        
        
          




