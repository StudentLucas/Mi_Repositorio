# Funciones para los cuentas.

from decimal import DivisionByZero


def mi_suma(numero1,numero2):
    if numero1.isalpha() or numero2.isalpha():
        print("|_____________________________________________________|")
        print("| Error en los datos ingresados.No se admiten letras  |")
        print("|_____________________________________________________|")                 
    else:
        resultado = int (numero1) + int (numero2)
        print("|_____________________________________________________|")
        print(f"|        Su resultado total es:                  {resultado}      ")
        print("|_____________________________________________________|")
            

def mi_resta(numero1,numero2):
    if numero1.isalpha() or numero2.isalpha():
        print("|_____________________________________________________|")
        print("| Error en los datos ingresados.No se admiten letras  |")
        print("|_____________________________________________________|")                 
    else:
        resultado = int (numero1) - int (numero2)
        print("|_____________________________________________________|")
        print(f"|        Su resultado total es:                  {resultado}    |")
        print("|_____________________________________________________|")

def mi_mutiplicacion(numero1,numero2):
    if numero1.isalpha() or numero2.isalpha():
        print("|_____________________________________________________|")
        print("| Error en los datos ingresados.No se admiten letras  |")
        print("|_____________________________________________________|")                 
    else:
        resultado = int (numero1) * int (numero2)
        print("|_____________________________________________________|")
        print(f"|        Su resultado total es:                  {resultado}    |")
        print("|_____________________________________________________|")
        
def mi_division(numero1,numero2):
    if numero1.isalpha() or numero2.isalpha():
        print("|_____________________________________________________|")
        print("| Error en los datos ingresados.No se admiten letras  |")
        print("|_____________________________________________________|")                 
    else:
        try:
            resultado = int (numero1) / int (numero2)
            print("|_____________________________________________________|")
            print(f"|        Su resultado total es:                {resultado}    |")
            print("|_____________________________________________________|")
        except ZeroDivisionError:
            print("|_____________________________________________________|")
            print("|      Error!!!. No se puede dividir entre 0.         |")
            print("|_____________________________________________________|")
            
    
def mi_exponencial(Base,exponente):
    if Base.isalpha() or exponente.isalpha():
        print("|_____________________________________________________|")
        print("| Error en los datos ingresados.No se admiten letras  |")
        print("|_____________________________________________________|")                 
    else:
        resultado = int (Base) ** int (exponente)
        print("|_____________________________________________________|")
        print(f"|        Su resultado total es:                {resultado}    |")
        print("|_____________________________________________________|")   

def par_impar(verificar):
    if verificar.isalpha():
        print("|_____________________________________________________|")
        print("| Error en los datos ingresados.No se admiten letras  |")
        print("|_____________________________________________________|") 
    else:    
        resultado = int (verificar) % int (2)
        if resultado == 0 :
            print("|_____________________________________________________|")
            print(f"|          Tu número ({verificar}) es un número PAR.            |")
            print("|_____________________________________________________|")
        else :
            print("|_____________________________________________________|")
            print(f"|          Tu número ({verificar}) es un número IMPAR.          |")
            print("|_____________________________________________________|")           