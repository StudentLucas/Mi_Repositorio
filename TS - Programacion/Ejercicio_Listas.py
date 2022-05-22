Lista_palabras = []

print(' ________________________________________________________________________________')
print('|     Alumno: Lucas Sanchez     Comisión: 1°B     Fecha:  07/05/2022             |')
print('|________________________________________________________________________________|')

rango_lista = int(input(' Escriba el rango de su lista: '))

while rango_lista == 5:

    for i in range(rango_lista):

        Agregar_palabra = input(' Agrege los elementos de la lista:  ')

        Lista_palabras.append(Agregar_palabra)

    break

Lista_ordenada = sorted(Lista_palabras,key=len)

print(' ________________________________________________________________________________ ')
print('|                   Respuestas del examen - Punto 2)                             |')
print('|________________________________________________________________________________|')

print(' ________________________________________________________________________________ ')
print('|  Elementos de la lista :  {}  |'.format(Lista_palabras))
print('|________________________________________________________________________________|')
print('|  Elementos ordenados de menor a mayor   : {}  |'.format(Lista_ordenada))
print(' ________________________________________________________________________________ ')

input()



