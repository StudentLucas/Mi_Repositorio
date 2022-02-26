from Calculos import * 

print(" _____________________________________________________ ")
print("|                                                     |")
print("|                MI PROGRAMA EN PYTHON                |")
print("|_____________________________________________________|")
print("|      ♥       | A) Suma.           |      ♥          |")
print("|      ♥       |                    |      ♥          |")
print("|      ♥       | B) Resta.          |      ♥          |")
print("|      ♥       |                    |      ♥          |")
print("|      ♥       | C) Multiplicación. |      ♥          |")
print("|      ♥       |                    |      ♥          |")
print("|      ♥       | D) División.       |      ♥          |")
print("|      ♥       |                    |      ♥          |")
print("|      ♥       | E) Exponencial.    |      ♥          |")
print("|      ♥       |                    |      ♥          |")
print("|      ♥       | F) ES PAR o IMPAR? |      ♥          |")
print("|      ♥       |                    |      ♥          |")
print("|      ♥       |     ٩(◕‿◕)۶        |      ♥          |")
print("|______________|____________________|_________________|")
opcion = input("|         Eliga la opción que va a usar:         ").upper()
print("|_____________________________________________________|")

if opcion != "A" and opcion != "B" and opcion != "C"  and opcion != "D" and opcion != "E" and opcion != "F":
    print("|  Respuesta no admitida. Opciones: A, B, C, D, E o F |")
    print("|_____________________________________________________|")
else :
    if opcion == "A":
        mi_suma(input("|        Escriba el primer número:           "),input("|        Escriba el segundo número:          "))
    elif opcion == "B":
        mi_resta(input("|        Escriba el primer número:           "),input("|        Escriba el segundo número:          "))
    elif opcion == "C":
        mi_mutiplicacion(input("|        Escriba el primer número:           "),input("|        Escriba el segundo número:          "))
    elif opcion == "D":
        mi_division(input("|        Escriba el primer número:           "),input("|        Escriba el segundo número:          "))
    elif opcion == "E":
        mi_exponencial(input("|        Escriba el número Base:         "),input("|        Escriba el número Exponente:    "))
    elif opcion == "F":
        par_impar(input("|        Escriba el número a comprobar:          "))
            
# Consultar si el usuario quiere seguir usando el programa  
 
respuesta = input("|     Quiere volver a usar el programa? Y/N:     ").upper()
while respuesta != "Y" and respuesta != "N":
    print("|_____________________________________________________|")
    print("|  Respuesta no admitida. Sus opciones son Y o N.     |")
    print("|_____________________________________________________|")
    respuesta = input("|     Quiere volver a usar el programa? Y/N:     ").upper()
else:
    if respuesta == "Y":   
        print("|_____________________________________________________|")
        print("|                                                     |")
        print("|                MI PROGRAMA EN PYTHON                |")
        print("|_____________________________________________________|")
        print("|      ♥       | A) Suma.           |      ♥          |")
        print("|      ♥       |                    |      ♥          |")
        print("|      ♥       | B) Resta.          |      ♥          |")
        print("|      ♥       |                    |      ♥          |")
        print("|      ♥       | C) Multiplicación. |      ♥          |")
        print("|      ♥       |                    |      ♥          |")
        print("|      ♥       | D) División.       |      ♥          |")
        print("|      ♥       |                    |      ♥          |")
        print("|      ♥       | E) Exponencial.    |      ♥          |")
        print("|      ♥       |                    |      ♥          |")
        print("|      ♥       | F) ES PAR o IMPAR? |      ♥          |")
        print("|      ♥       |                    |      ♥          |")
        print("|      ♥       |     ٩(◕‿◕)۶        |      ♥          |")
        print("|______________|____________________|_________________|")
        opcion = input("|        Eliga la opción que va a usar:       ").upper()
        print("|_____________________________________________________|")

        if opcion != "A" and opcion != "B" and opcion != "C"  and opcion != "D" and opcion != "E" and opcion != "F":
            print("|  Respuesta no admitida. Opciones: A, B, C, D, E o F |")
            print("|_____________________________________________________|")
        else :
            if opcion == "A":
                mi_suma(input("|        Escriba el primer número:           "),input("|        Escriba el segundo número:          "))
            elif opcion == "B":
                mi_resta(input("|        Escriba el primer número:           "),input("|        Escriba el segundo número:          "))
            elif opcion == "C":
                mi_mutiplicacion(input("|        Escriba el primer número:           "),input("|        Escriba el segundo número:          "))
            elif opcion == "D":
                mi_division(input("|        Escriba el primer número:           "),input("|        Escriba el segundo número:          "))
            elif opcion == "E":
                mi_exponencial(input("|        Escriba el número Base:         "),input("|        Escriba el número Exponente:    "))
            elif opcion == "F":
                par_impar(input("|        Escriba el número a comprobar:          "))
    else:
        print("|_____________________________________________________|")
        input("|    Presione ENTER para finalizar el programa.       ") 
        print("|_____________________________________________________|")