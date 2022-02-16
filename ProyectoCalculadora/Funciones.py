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