#include <stdio.h>
#include <stdlib.h>

int main()
{
    short a,b;
    printf("\n Ingrese un valor dentro del rango (-32768 a 32767) ");
    scanf("%i",&a);
    printf("\n Ingrese un valor fuera del rango (-32768 a 32767) ");
    scanf("%i",&b);
    printf("\n\n valor dentro del rango %i ",a);
    printf("\n\n valor fuera del rango %i ",b);
    printf("\n\n");
    return 0;
}
