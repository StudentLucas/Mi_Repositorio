from funciones import *

mayor_cantidad_caracteres   = 0
porcentaje_personas_solas   = 0
persona_sola                = 0
minimo_salario              = 100000000
contar_departamentos        = 0
contar_superficies          = 0
cantidad_sin_coches         = 0
contador_censados           = 0
contador_sueldos            = 0
contador_coches             = 0
contador_edad_menores       = 0
contador_edad_mayores       = 0
contador_censados           = 0
acumulador_integrantes      = 0
edad_joven                  = 1000
edad_vieja                  = 0

print                                                       ("┌───────────────────────────────────────────┬────────────────┬───────────────┬──────────────────┐")
print                                                       ("│ Apellido & Nombre: Sanchez Lucas Ezequiel │                │ Comision: 1°B │ Fecha: 11/6/2022 │")
print                                                       ("├───────────────────────────────────────────┴────────────────┴───────────────┴──────────────────┤")
print                                                       ("│                      Upgrade del programa del CENSO Argentina 2022                            │")
print                                                       ("└───────────────────────────────────────────────────────────────────────────────────────────────┘")
print                                                       ("       ┌─────────────────────────────────────────────────────────────────────────────────┐")
cant_integrantes                        = int      (  input ("       │               ¿Cuántos integrantes hay en su familia?:          "))
print                                                       ("       └─────────────────────────────────────────────────────────────────────────────────┘")

while cant_integrantes >= 0:

    if cant_integrantes == 0 :

        

        try:

            limpiar_consola()
            
            print                                           ("       ┌─────────────────────────────────────────────────────────────────────────────────┐")
            print                                           ("       │                Punto 1 - Resultado de los Registros                             │")
            print                                           ("       └─────────────────────────────────────────────────────────────────────────────────┘")
            print                                           ()
            print                                           ("       ┌─────────────────────────────────────────────────────────────────────────────────┐")
            print                                           ("       │             Cantidad de integrantes en la famila :   {} persona/s                │".format(cant_integrantes))
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │        Nombre del ultimo jefe de Familia agregado:   {}                          │".format(nombre))
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │    Cantidad de personas que son menores de 18 son:   {} personas                 │".format(contador_edad_menores))
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │    Cantidad de personas que son mayores de 65 son:   {} personas                 │".format(contador_edad_mayores))
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │                      Edad de la persona mas vieja:   {} años                     │".format(edad_vieja))
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │                      Edad de la persona mas joven:   {} años                     │".format(edad_joven))
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │                    Ingreso Salarial de la Familia: $ {} .                      │".format(contador_sueldos))
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │                  Cantidad de coches en la Familia:   {} coches                 │".format(contador_coches))
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │                             Vivo en departamento :   {} , de {} m2 .             │".format(respuesta_propiedad, superficie))
            print                                           ("       └─────────────────────────────────────────────────────────────────────────────────┘")

            print                                           ()

            print                                           ("       ┌─────────────────────────────────────────────────────────────────────────────────┐")
            print                                           ("       │                Punto 2 - Resultado Calcular e Informar                          │")
            print                                           ("       └─────────────────────────────────────────────────────────────────────────────────┘")
            print                                           ()
            print                                           ("       ┌─────────────────────────────────────────────────────────────────────────────────┐")
            print                                           ("       │                         Cantidad de habitantes censados :  {} habitantes        │".format(contador_censados))
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │        Jefe/a de familia con mas cantidad de caracteres :  {} con {} letras.    │".format(nombre_mayor_cantidad_caracteres, mayor_cantidad_caracteres))
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │                    Cantidad de personas que viven solas :  {} persona/s         │".format(persona_sola))
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │                  Porcentaje de personas que viven solas :  % {}          │".format(porcentaje_personas_solas))
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │               Menores de 18 años registrados en el censo:  {}                   │".format(contador_edad_menores)) 
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │            Menor salario registrado dentro de la familia:  $ {}                 │".format(minimo_salario))
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │                       Cantidad de Familias sin Vehiculos:  {} Familia/s               │".format(cantidad_sin_coches))   
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │               Cantidad de Familias viven en Departamento:  {}                   │".format(contar_departamentos))
            print                                           ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            print                                           ("       │                             Promedio de metros cuadrados:  {}                   │".format(contar_superficies))
            print                                           ("       └─────────────────────────────────────────────────────────────────────────────────┘")

        except NameError:
            print                                           ("       ┌─────────────────────────────────────────────────────────────────────────────────┐")
            print                                           ("       │           No hay resultados porque no hay datos ingresados                      │")
            print                                           ("       └─────────────────────────────────────────────────────────────────────────────────┘")
        
        break
    
    for i in range (cant_integrantes):

        limpiar_consola()

        print                                                       ("┌───────────────────────────────────────────┬────────────────┬───────────────┬──────────────────┐")
        print                                                       ("│ Apellido & Nombre: Sanchez Lucas Ezequiel │                │ Comision: 1°B │ Fecha: 11/6/2022 │")
        print                                                       ("├───────────────────────────────────────────┴────────────────┴───────────────┴──────────────────┤")
        print                                                       ("│                      Upgrade del programa del CENSO Argentina 2022                            │")
        print                                                       ("└───────────────────────────────────────────────────────────────────────────────────────────────┘")
        
        i += 1
        
        print                                                       ("       ┌─────────────────────────────────────────────────────────────────────────────────┐")
        print                                                       ("       │           Solicitud para la Familia N°{} - Integrante N° {} de {} .                │".format(i, i, cant_integrantes))
        print                                                       ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
        nombre                              =           input       ("       │                       Nombre del jefe de la Familia:           ")
        print                                                       ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
        edad                                = int      (input       ("       │                                     Ingrese su edad:           "))
        print                                                       ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
        salario_individual                  = float      (input     ("       │                Ingrese su salario mensual en brutos:           "))
        print                                                       ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
        cantidad_coches_en_la_familia       = int      (input       ("       │                Ingrese cantidad de coches que tiene:           "))
        print                                                       ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
        respuesta_propiedad                 =           input       ("       │                    Vive en un departamento? (si/no):           ")
        
        if respuesta_propiedad == "si":

            print                                                   ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            superficie                          = float (   input   ("       │                     Ingrese los m2 del departamento:           "))
            print                                                   ("       └─────────────────────────────────────────────────────────────────────────────────┘")
            respuesta_propiedad = "si"
            contar_departamentos += 1
            contar_superficies += superficie
            
        
        elif respuesta_propiedad == "no":
            
            print                                                   ("       └─────────────────────────────────────────────────────────────────────────────────┘")
            print()
            respuesta_propiedad = "no"
            superficie = 0
      
        contador_censados += 1
        contador_coches                     += cantidad_coches_en_la_familia
        contador_sueldos                    += salario_individual
        porcentaje_personas_solas = persona_sola / cant_integrantes * 100
                
        if edad < 18:
            contador_edad_menores += 1

        if edad > 65:
            contador_edad_mayores += 1

        if edad < edad_joven:
            edad_joven = edad

        if edad > edad_vieja:
            edad_vieja = edad
        
        if cant_integrantes == 1:
            persona_sola += 1

        if salario_individual < minimo_salario:
            minimo_salario = salario_individual
        
        if cantidad_coches_en_la_familia == 0:
            cantidad_sin_coches += 1
        
        Datos = {   
                    "nombre del jefe de Familia": nombre ,
                    "edad": edad ,
                    "salario_individual": salario_individual ,
                    "cantidad_coches_en_la_familia": cantidad_coches_en_la_familia ,
                    "respuesta_propiedad": respuesta_propiedad, 
                    "superficie": superficie
                }
        #mayor cantidad de caracteres en una cadena
        if len(nombre) > mayor_cantidad_caracteres:
            mayor_cantidad_caracteres = len (nombre)
        #nombre con mayor cantidad de caracteres
        if len(nombre) == mayor_cantidad_caracteres:
            nombre_mayor_cantidad_caracteres = nombre

        for c in Datos.items():
            guardar_datos_csv (Datos = {c})
        
        for y in range (cant_integrantes-1):

            y += i + 1

            print                                                       ("       ┌─────────────────────────────────────────────────────────────────────────────────┐")
            print                                                       ("       │                       Integrante de la Familia N° {} de {} .                       │".format(y, cant_integrantes))
            print                                                       ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            nombre_otro__integrante             =           input       ("       │                              Nombre del integrante:           ")
            print                                                       ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            Parentezco                          =           input       ("       │                             Parentezco con el jefe:           ")
            print                                                       ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            edad                                = int      (input       ("       │                                    Ingrese la edad:           "))
            print                                                       ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            salario_individual                  = float      (input     ("       │                Ingrese el salario mensual en bruto:           "))
            print                                                       ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            cantidad_coches_en_la_familia       = int      (input       ("       │               Ingrese cantidad de coches que tiene:           "))
            print                                                       ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
            respuesta_propiedad                 =           input       ("       │                   Vive en un departamento? (si/no):           ")
            
            if respuesta_propiedad == "si":

                print                                                   ("       ├─────────────────────────────────────────────────────────────────────────────────┤")
                superficie                          = float (   input   ("       │                    Ingrese los m2 del departamento:           "))
                print                                                   ("       └─────────────────────────────────────────────────────────────────────────────────┘")
                respuesta_propiedad = "si"
                contar_departamentos += 1
                contar_superficies += superficie

            elif respuesta_propiedad == "no":
                
                print                                                   ("       └─────────────────────────────────────────────────────────────────────────────────┘")
                print()
                superficie = 0
                respuesta_propiedad = "no"
                
            contador_censados += 1
            contador_coches += cantidad_coches_en_la_familia
            contador_sueldos += salario_individual
            porcentaje_personas_solas = persona_sola / cant_integrantes * 100 

            if edad < 18:
                contador_edad_menores += 1

            if edad > 65:
                contador_edad_mayores += 1

            if edad < edad_joven:
                edad_joven = edad

            if edad > edad_vieja:
                edad_vieja = edad 
            
            if salario_individual < minimo_salario:
                minimo_salario = salario_individual

            Datos = {

                    "nombre del otro integrante": nombre_otro__integrante,
                    "Vinculo con el jefe": Parentezco,
                    "edad": edad,
                    "salario_individual": salario_individual,
                    "cantidad_coches_en_la_familia": cantidad_coches_en_la_familia,
                    "respuesta_propiedad": respuesta_propiedad,
                    "superficie": superficie

                    }

            for p in Datos.items():
                guardar_datos_csv (Datos = {p})

        break

    print()

    print                                                       ("       ┌─────────────────────────────────────────────────────────────────────────────────┐")
    cant_integrantes                        = int      (  input ("       │      Nuevo ingreso, ¿Cuántos integrantes hay en su familia?:          "))
    print                                                       ("       └─────────────────────────────────────────────────────────────────────────────────┘")
        