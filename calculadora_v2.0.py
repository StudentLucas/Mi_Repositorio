# Caclculadora en Python

# Funciones 

def mi_suma(numero1,numero2):
    print("|_________________________________________________________|")
    resultado = int (numero1) + int (numero2)
    print(f"|             Su resultado total es:                {resultado}     |")
    print( "|_________________________________________________________|")

def mi_resta(numero1,numero2):
    print("|_________________________________________________________|")
    resultado = int (numero1) - int (numero2)
    print(f"|             Su resultado total es:                {resultado}     |")
    print( "|_________________________________________________________|")

def mi_mutiplicacion(numero1,numero2):
    print("|_________________________________________________________|")
    resultado = int (numero1) * int (numero2)
    print(f"|             Su resultado total es:               {resultado}     |")
    print( "|_________________________________________________________|")

def mi_division(numero1,numero2):
    print("|_________________________________________________________|")
    resultado = int (numero1) / int (numero2)
    print(f"|             Su resultado total es:               {resultado}    |")
    print( "|_________________________________________________________|")            

def mi_exponencial(Base,exponente):
    print("|_________________________________________________________|")
    resultado = int (Base) ** int (exponente)
    print(f"|             Su resultado total es:           {resultado}         |")
    print( "|_________________________________________________________|")

def par_impar(verificar):
    resultado = int (verificar) % int (2)
    if resultado == 0 :
        print("|_________________________________________________________|")
        print(f"|          Número elegido {verificar}. Es un número PAR             |")
        print("|_________________________________________________________|")
    else :
        print("|_________________________________________________________|")
        print(f"|          Número elegido {verificar}. Es un número IMPAR           |")
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
        mi_suma(input("|             Escriba el primer número:             "),input("|             Escriba el segundo número:            "))
    elif opcion == "B":
        mi_resta(input("|             Escriba el primer número:             "),input("|             Escriba el segundo número:            "))
    elif opcion == "C":
        mi_mutiplicacion(input("|             Escriba el primer número:             "),input("|             Escriba el segundo número:            "))
    elif opcion == "D":
        mi_division(input("|             Escriba el primer número:             "),input("|             Escriba el segundo número:            "))
    elif opcion == "E":
        mi_exponencial(input("|             Escriba el número Base:           "),input("|             Escriba el número Exponente:      "))
    elif opcion == "F":
        par_impar(input("|             Escriba el número a comprobar:          "))
           
    
# Consultar si quiere seguir usando el programa  
 
respuesta = input("|        Quiere continuar usando el programa? Y/N:    ").upper()
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
                 mi_suma(input("|             Escriba el primer número:             "),input("|             Escriba el segundo número:            "))
            elif opcion == "B":
                mi_resta(input("|             Escriba el primer número:             "),input("|             Escriba el segundo número:            "))
            elif opcion == "C":
                mi_mutiplicacion(input("|             Escriba el primer número:             "),input("|             Escriba el segundo número:            "))
            elif opcion == "D":
                mi_division(input("|             Escriba el primer número:             "),input("|             Escriba el segundo número:            "))
            elif opcion == "E":
                mi_exponencial(input("|             Escriba el número Base:           "),input("|             Escriba el número Exponente:      "))
            elif opcion == "F":
                par_impar(input("|             Escriba el número a comprobar:          "))
        respuesta = input("|        Quiere continuar usando el programa? Y/N:    ").upper()
else:
    print("|_________________________________________________________|")
    input("|______Presione ENTER para finalizar el Programa._________|")