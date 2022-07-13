from pathlib import Path
import os

def limpiar_consola():

    comando = 'clear'
    if os.name in ('nt', 'dos'):  # si la maquina esta corriendo en Windows, use cls
        comando = 'cls'
    os.system(comando)

def opcion_A():

    print                                                               ('  │              ╔═════════════╦════════════════════════════════════════════╗             │')
    print                                                               ('  │              ║  Opción A   ║       Crear un Archivo de Texto            ║             │')
    print                                                               ('  │              ╚═════════════╩════════════════════════════════════════════╝             │')
    print                                                               ('  │              ╔══════════════════════════════════════════════════════════╗             │')
    archivo = input                                                     ('  |              ║          Escriba el nombre de su archivo:     ')
    print                                                               ('  │              ╠══════════════════════════════════════════════════════════╣             │')
    print                                                               ('  |              ║          Su archivo se llamará :  {}.txt               ║             │'.format(archivo))
    print                                                               ('  │              ╠══════════════════════════════════════════════════════════╣             │')
    print                                                               ('  |              ║          Escriba la RUTA donde lo quiere guardar.        ║             |')
    ruta = input                                                        ('  |              ║          Ruta -->    ')

    nombre_archivo = Path (f'{archivo}.txt')
    ruta_completa = Path (ruta.joinpath('{}\\{}'.format(ruta,nombre_archivo)))

    if not ruta.exists(): 

        print                                                       ('  │              ╔══════════════════════════════════════════════════════════╗             │') 
        print                                                       ('  |              ║       La ruta que esta brindando NO EXISTE!.             ║             |')
        print                                                       ('  │              ╚══════════════════════════════════════════════════════════╝             │')   
        
    else:

        if not ruta_completa.exists():
            
            open ('{}'.format(ruta_completa),'w+')
            print                                                           ('  │              ╠══════════════════════════════════════════════════════════╣             │')
            print                                                           ('  |              ║         El archivo fue creado exitosamente!              ║             |')
            print                                                           ('  │              ╚══════════════════════════════════════════════════════════╝             │')
        
        else:

            if ruta_completa.exists():
                print                                                       ('  │              ╔══════════════════════════════════════════════════════════╗             │')
                print                                                       ('  |              ║         El archivo que intenta crear YA EXISTE!          ║             |')
                print                                                       ('  │              ╚══════════════════════════════════════════════════════════╝             │')
                print                                                       ('  │                                                                                       │') 


def opcion_B():

    print                                                               ('  │              ╔══════════════╦═══════════════════════════════════════════╗             │')
    print                                                               ('  │              ║   Opción B   ║     Agregar texto en el Archivo           ║             │')
    print                                                               ('  │              ╚══════════════╩═══════════════════════════════════════════╝             │')
    
    print                                                               ('  │              ╔══════════════════════════════════════════════════════════╗             │')
    print                                                               ('  |              ║      Escriba la RUTA donde se encuentra el archivo       ║             |')
    ruta = Path(input                                                   ('  |              ║                   '))
    print                                                               ('  │              ╠══════════════════════════════════════════════════════════╣             │')
    
    if ruta.exists():
        
        nombre_archivo = Path (input                                        ('  │              ║      Bien!, Ahora escriba el nombre de su archivo:   '))
        print                                                               ('  │              ╠══════════════════════════════════════════════════════════╣             │')

        ruta_completa = ruta.joinpath('{}\\{}.txt'.format(ruta,nombre_archivo))

        if ruta_completa.exists():

            print                                                               ('  │              ║ Ahora escriba el texto que quiere agregarle al archivo   ║             |')
            print                                                               ('  │              ╠══════════════════════════════════════════════════════════╣             │')
            texto = input                                                       ('  │              ║  ')
            ruta_completa.write_text(texto)
            
            print(ruta_completa)
        
    
    else:
        
        print(' | la ruta no existe |')