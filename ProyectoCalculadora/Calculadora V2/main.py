from Funciones import * 
 
print(" _________________________________________________________")
print("|                                                         |")
print("|                MI PROGRAMA EN PYTHON                    |")
print("|_________________________________________________________|")
print("|      ♥       |  A) Suma.           |                    |")
print("|      ♥       |                     |   ♥♥♥       ♥♥♥    |")
print("|      ♥       |  B) Resta.          |   ♥♥♥       ♥♥♥    |")
print("|      ♥       |                     |        ♥♥♥         |")
print("|      ♥       |  C) Multiplicación. |       ♥ ♥ ♥        |")
print("|      ♥       |                     |                    |")
print("|      ♥       |  D) División.       |  ♥♥♥          ♥♥♥  |")
print("|      ♥       |                     |   ♥            ♥   |")
print("|      ♥       |  E) Exponencial.    |    ♥♥♥♥♥♥♥♥♥♥♥♥    |")
print("|      ♥       |                     |                    |")
print("|      ♥       |  F) PAR o IMPAR?.   |                    |")
print("|      ♥       |                     |                    |")
print("|      ♥       |     ٩(◕‿◕)۶       |                    |")
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
        print("|      ♥       |  A) Suma.           |                    |")
        print("|      ♥       |                     |   ♥♥♥       ♥♥♥    |")
        print("|      ♥       |  B) Resta.          |   ♥♥♥       ♥♥♥    |")
        print("|      ♥       |                     |        ♥♥♥         |")
        print("|      ♥       |  C) Multiplicación. |       ♥ ♥ ♥        |")
        print("|      ♥       |                     |                    |")
        print("|      ♥       |  D) División.       |  ♥♥♥          ♥♥♥  |")
        print("|      ♥       |                     |   ♥            ♥   |")
        print("|      ♥       |  E) Exponencial.    |    ♥♥♥♥♥♥♥♥♥♥♥♥    |")
        print("|      ♥       |                     |                    |")
        print("|      ♥       |  F) PAR o IMPAR?.   |                    |")
        print("|      ♥       |                     |                    |")
        print("|      ♥       |     ٩(◕‿◕)۶       |                    |")
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