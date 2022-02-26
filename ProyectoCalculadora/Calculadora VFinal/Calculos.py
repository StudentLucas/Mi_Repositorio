# Funciones para los cuentas.

def mi_suma(numero1,numero2):
    print("|_____________________________________________________|")
    resultado = int (numero1) + int (numero2)
    print(f"|        Su resultado total es:              {resultado}        |")
    print("|_____________________________________________________|")

def mi_resta(numero1,numero2):
    print("|_____________________________________________________|")
    resultado = int (numero1) - int (numero2)
    print(f"|             Su resultado total es:                {resultado}        |")
    print("|_____________________________________________________|")

def mi_mutiplicacion(numero1,numero2):
    print("|_____________________________________________________|")
    resultado = int (numero1) * int (numero2)
    print(f"|             Su resultado total es:               {resultado}        |")
    print("|_____________________________________________________|")

def mi_division(numero1,numero2):
    print("|_____________________________________________________|")
    resultado = int (numero1) / int (numero2)
    print(f"|             Su resultado total es:               {resultado}        |")
    print("|_____________________________________________________|")            

def mi_exponencial(Base,exponente):
    print("|_____________________________________________________|")
    resultado = int (Base) ** int (exponente)
    print(f"|             Su resultado total es:           {resultado}        |")
    print("|_____________________________________________________|")

def par_impar(verificar):
    resultado = int (verificar) % int (2)
    if resultado == 0 :
        print("|_____________________________________________________|")
        print(f"|          Número elegido {verificar}. Es un número PAR             |")
        print("|_____________________________________________________|")
    else :
        print("|_____________________________________________________|")
        print(f"|          Número elegido {verificar}. Es un número IMPAR           |")
        print("|_____________________________________________________|")