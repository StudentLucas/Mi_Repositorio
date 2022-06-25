import csv

def limpiar_consola():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')

def guardar_datos_csv(Datos):

    with open('Diccionario.csv', 'a', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(Datos)


