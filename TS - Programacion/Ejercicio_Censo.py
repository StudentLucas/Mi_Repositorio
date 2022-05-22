Cont_censo = 0
Cont_menores = 0
Cont_coches = 0
Mas_joven = 1000
Mas_viejo = 0
Acum_integrantes = 0
acum_coches = 0
Acum_salario = 0

print(' ________________________________________________________________________________')
print('|     Alumno: Lucas Sanchez      Comisión: 1°B       Fecha:  07/05/2022          |')
print('|________________________________________________________________________________|')
print('|                      PROGRAMA DEL CENSO ARGENTINA 2022                         |')
print('|________________________________________________________________________________|')
cant_integrantes = int(input('|      (0 para salir) --> Cantidad de intregrantes que conforman su familia: '))
print('|________________________________________________________________________________|')
print()

while cant_integrantes > 0: # ABRO CON UN > 0 PORQUE NO PUEDE SER != 0 NO SE PUEDE INGRESAR UN FAMILIAR NEGATIVO ESTARIA MUERTO.

    for i in range (cant_integrantes):

        print(' ________________________________________________________________________________')
        nombre = input('|      Ingrese el nombre : ')
        print('|________________________________________________________________________________|')
        edad: int = int(input('|      Ingrese la edad: '))
        print('|________________________________________________________________________________|')
        salario = float(input('|      Ingrese el salario: '))
        print('|________________________________________________________________________________|')
        pregunta_V = input('|      Tiene vehiculo? si/no : ')
        print('|________________________________________________________________________________|')

        if pregunta_V == 'si':
            cant_coches = int(input('|      Cuantos vehiculos?: '))
            print('|________________________________________________________________________________|')
            Cont_coches += 1
            acum_coches += cant_coches

        elif pregunta_V == 'no':
            cant_coches = 0
            acum_coches += cant_coches
            if acum_coches > 0:
               pregunta_V = 'si'

        Cont_censo += 1
        Acum_integrantes += cant_integrantes
        Acum_salario += salario

        if edad < 18:
            Cont_menores = Cont_menores + 1


        if edad < Mas_joven:
            Mas_joven = edad

        if edad > Mas_viejo:
            Mas_viejo = edad

        # promedios & porcentajes
        promedio_Hogar = cant_integrantes / Cont_censo
        promedio_Censado = Acum_integrantes / Cont_censo
        porcentaje_coches = Cont_coches / Cont_censo * 100
        porcentaje_menor = Cont_menores / Cont_censo * 100

    break

print(' ________________________________________________________________________________')
cant_integrantes = int(input('|      (0 para salir) --> Cantidad de intregrantes que conforman su familia: '))


print(' ________________________________________________________________________________ ')
print('|                   Respuestas del examen - Punto 1)                             |')
print('|________________________________________________________________________________|')

# Cantidad de integrantes en la familia.
print('|          Cantidad de integrantes en la familia     :    {}                      |'.format(Acum_integrantes))

# Cantidad de menores de 18 años.
print('|          Cantidad de menores de 18 años            :    {}                      |'.format(Cont_menores))

# Edad de la persona más vieja y edad de la persona más joven.
print('|          Edad de la persona más joven              :    {}                     |'.format(Mas_joven))
print('|          Edad de la persona más vieja              :    {}                     |'.format(Mas_viejo))

# Ingreso salarial de la familia.
print('|          Ingreso salarial de la familia            :  ${} ARS.               |'.format(Acum_salario))

#Informar si tiene vehículos (s/n) y si tiene, cuantos.
print('|          Tienen  vehículos                         :    {}                     |\n'
      '|          Cuantos disponibles                       :    {}                      |'.format(pregunta_V,acum_coches))
print('|________________________________________________________________________________|')

print(' ________________________________________________________________________________ ')
print('|                   Respuestas del examen - Punto 1.b)                           |')
print('|________________________________________________________________________________|')

#Cantidad de habitantes censados.
print('|          Cantidad de habitantes censados                  :       {}            |'.format(Cont_censo))

#Promedio de habitantes por hogar censados.
print('|          Promedio de habitantes por hogar censados        :      {:.2f}          |'.format(promedio_Hogar))

#Porcentaje de menores.
print('|          Porcentaje de menores                            :     % {:.2f}        |'.format(porcentaje_menor))

#Informar cuantos años tiene la persona mas vieja y la más joven.

print('|          Edad de la persona más joven                     :       {}           |'.format(Mas_joven))
print('|          Edad de la persona más vieja                     :       {}           |'.format(Mas_viejo))

#Informar el promedio de ingreso familiar de todos los hogares censados.

print('|          Promedio de todos los hogares censados           :       {}          |'.format(promedio_Censado))

#Informar cuantos vehículos fueron censados.
print('|          Cuantos vehículos fueron censados                :       {}            |'.format(acum_coches))

#Porcentaje de vehículos por familia censados.
print('|          Porcentaje de vehículos por familia censados     :       %{:.2f}       |'.format(porcentaje_coches))
print('|________________________________________________________________________________|')

input()
