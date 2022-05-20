#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>
#define tot 5
//cambiar tot despues de las pruebas, por 40

int main()
{
    int c,ed,doc;
    for (c=1;c<=tot;c++){
        textcolor(LIGHTGRAY);
        printf("\n\tIngrese la edad: ");
        scanf("%i",&ed);
        printf("\n\tIngrese el documento: ");
        scanf("%i",&doc);
        if (ed<20){
            textcolor(LIGHTGREEN);
            printf("\n\tDentro del rango\n\n");
        }else{
            if (doc>30000000){
                textcolor(LIGHTGREEN);
                printf("\n\tDentro del rango\n\n");
            }else{
                textcolor(LIGHTRED);
                printf("\n\t Fuera del rango\n\n");
            }
        }

    }

    return 0;
}
