# mi calculadora en python

print("#########################################################")
print("###                                                   ###")
print("###           MI PROGRAMA EN PYTHON                   ###")
print("###                                                   ###")
print("###             A) Suma.                              ###")
print("###             B) Resta.                             ###")
print("###             C) Multiplicación.                    ###")
print("###             D) División.                          ###")
print("###             E) Exponencial.                       ###")
print("###             F) PAR o IMPAR?.                      ###")
print("###                                                   ###")

opcion = input("###             Escriba la opcion a realizar: ").upper()

if opcion != "A" and opcion != "B" and opcion != "C"  and opcion != "D" and opcion != "E" and opcion != "F":
    print("###                                                   ###")
    print("###             La opción no es correcta!             ###")
    print("###                                                   ###")
    print("#########################################################")
else :
    if opcion == "A":
        print("###                                                   ###")
        numero1 = input("###             Escriba el primer número:    ")
        numero2 = input("###             Escriba el segundo número:   ")
        resultado = int (numero1) + int (numero2)
        print("###                                                   ###")
        print(f"###             El resultado de su suma es:  {resultado}        ###")
        print("#########################################################")
    elif opcion == "B":
        print("###                                                   ###")
        numero1 = input("###             Escriba el primer número:     ")
        numero2 = input("###             Escriba el segundo número:    ")
        resultado = int (numero1) - int (numero2)
        print("###                                                   ###")
        print(f"###             El resultado de su resta es:  {resultado}       ###")
        print("#########################################################")
    elif opcion == "C":
        print("###                                                   ###")
        numero1 = input("###             Escriba el primer número:     ")
        numero2 = input("###             Escriba el segundo número:    ")
        resultado = int (numero1) * int (numero2)
        print("###                                                   ###")
        print(f"###    El resultado de su multiplicación es:  {resultado}       ###")
        print("#########################################################")
    elif opcion == "D":
        print("###                                                   ###")
        numero1 = input("###             Escriba el primer número:     ")
        numero2 = input("###             Escriba el segundo número:    ")
        resultado = int (numero1) / int (numero2)
        print("###                                                   ###")
        print(f"###        El resultado de su división es:  {resultado}       ###")
        print("#########################################################")
    elif opcion == "E":
        print("###                                                   ###")
        numero1 = input("###             Escriba el número de Base:        ")
        numero2 = input("###             Escriba el número de Exponente:   ")
        resultado = int (numero1) ** int (numero2)
        print("###                                                   ###")
        print(f"###           El resultado de la exponencial es: {resultado}   ###")
        print("#########################################################")
    elif opcion == "F":
        print("###                                                   ###")
        numero1 = input("###             Escriba el número a comprobar: ")
        resultado = int (numero1) % int (2)
        if resultado == 0 :
            print("###                                                   ###")
            print(f"###   El número elegido es {numero1}. Es un número PAR      ###")
        else :
            print("###                                                   ###")
            print(f"###  El número elegido es {numero1}. Es un número IMPAR     ###")
        print("###                                                   ###")
        print("#########################################################")
        
input("|-----> ¡Pulse enter pára finalizar con el programa! <-----|")