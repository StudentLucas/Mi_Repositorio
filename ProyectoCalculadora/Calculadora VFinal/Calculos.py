
def mi_suma( numero1, numero2):
    
    if numero1.isnumeric() or numero2.isnumeric():
        
        try:
            
            resultado = int (numero1) + int (numero2)
            print("    |-----------------------------------------------------|")
            print(f"    |        El resultado total de la suma es:      {resultado}    |")
            print("    |-----------------------------------------------------|")  
             
        except ValueError:
            print("    |-----------------------------------------------------|")
            print("    |         Algun valor ingresado no es numérico        |")
            print("    |-----------------------------------------------------|")
            
    else:
        
        print("    |-----------------------------------------------------|")
        print("    |     Error no se admiten letras en los valores       |")
        print("    |-----------------------------------------------------|")         

def mi_resta ( numero1, numero2 ):
    
    if numero1.isnumeric() or numero2.isnumeric():
        
        try:
            
            resultado = int (numero1) - int (numero2)
            print("    |-----------------------------------------------------|")
            print(f"    |        El resultado total de la resta es:     {resultado}    |")
            print("    |-----------------------------------------------------|")  
             
        except ValueError:
            print("    |-----------------------------------------------------|")
            print("    |         Algun valor ingresado no es numérico        |")
            print("    |-----------------------------------------------------|")
            
    else:
        
        print("    |-----------------------------------------------------|")
        print("    |     Error no se admiten letras en los valores       |")
        print("    |-----------------------------------------------------|")     

def mi_mutiplicacion( numero1, numero2):
    
    if numero1.isnumeric() or numero2.isnumeric():
        
        try:
            
            resultado = int (numero1) * int (numero2)
            print("    |-----------------------------------------------------|")
            print(f"    |      El resultado total de la multiplicación es:   {resultado}    |")
            print("    |-----------------------------------------------------|")  
             
        except ValueError:
            print("    |-----------------------------------------------------|")
            print("    |         Algun valor ingresado no es numérico        |")
            print("    |-----------------------------------------------------|")
            
    else:
        
        print("    |-----------------------------------------------------|")
        print("    |     Error no se admiten letras en los valores       |")
        print("    |-----------------------------------------------------|")     
        
def mi_division( numero1, numero2 ):
    
    if numero1.isnumeric() or numero2.isnumeric():
        
        try:
            
            resultado = int (numero1) / int (numero2)
            print("    |-----------------------------------------------------|")
            print(f"    |      El resultado de la división es:     {resultado}    |")
            print("    |-----------------------------------------------------|")  
             
        except ValueError:
            
            print("    |-----------------------------------------------------|")
            print("    |         Algun valor ingresado no es numérico        |")
            print("    |-----------------------------------------------------|")
            
        except ZeroDivisionError:
            
            print("    |-----------------------------------------------------|")
            print("    |      Error!!!. No se puede dividir entre 0.         |")
            print("    |-----------------------------------------------------|")
            
    else:
        
        print("    |-----------------------------------------------------|")
        print("    |     Error no se admiten letras en los valores       |")
        print("    |-----------------------------------------------------|")          
              
def mi_exponencial(Base,exponente):
    
    if Base.isnumeric() or exponente.isnumeric():
        
        try:
            
            resultado = int (Base) ** int (exponente)
            print("    |-----------------------------------------------------|")
            print(f"    |        El resultado del Exponente es:       {resultado}    |")
            print("    |-----------------------------------------------------|")   
             
        except ValueError:
            
            print("    |-----------------------------------------------------|")
            print("    |         Algun valor ingresado no es numérico        |")
            print("    |-----------------------------------------------------|")
                       
    else:
        
        print("    |-----------------------------------------------------|")
        print("    | Error en los datos ingresados.No se admiten letras  |")
        print("    |-----------------------------------------------------|")  
        
def par_impar(verificar):
    
    if verificar.isnumeric():
        
        try:
        
            resultado = int (verificar) % int (2)
        
        
            if resultado == 0 :
                print("    |-----------------------------------------------------|")
                print(f"    |          El número ({verificar}) es PAR.            |")
                print("    |-----------------------------------------------------|")
                
            else :
                
                print("    |-----------------------------------------------------|")
                print(f"    |          El número ({verificar}) es IMPAR.          |")
                print("    |-----------------------------------------------------|")
                
        except ValueError:
            
            print("    |-----------------------------------------------------|")
            print("    |         Algun valor ingresado no es numérico        |")
            print("    |-----------------------------------------------------|")
        
    else:    
        
        print("    |-----------------------------------------------------|")
        print("    |     Error no se admiten letras en los valores       |")
        print("    |-----------------------------------------------------|")   