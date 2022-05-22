#include <stdio.h>
#include <stdlib.h>

int main()
{
    float hora,min,seg;
    printf("(1.A.02) Hacer el diagrama de un proceso que permita ingresar una cantidad de");
    printf("\nhoras y que muestre la cantidad de minutos y la cantidad de segundos ");
    printf("\nequivalentes a dicha cantidad de horas.");
    printf("\n\nIngrese una cantidad de horas ? ");
    scanf("%f",&hora);
    min=hora*60;
    seg=min*60;
    printf("\n\n %f horas equivalen a \n\n %f minutos y \n\n %f segundos \n\n",hora,min,seg);
    system("pause");
    return 0;
}
