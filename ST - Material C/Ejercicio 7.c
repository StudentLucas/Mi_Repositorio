#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n1,n2,n3;
    float prom;
    printf("(1.A.03) Hacer el diagrama de un proceso que permita ingresar las tres notas ");
    printf("\nque obtuvo un alumno y mostrar el promedio de ellas.");
    printf("\n\n Ingrese la primer nota : ");
    scanf("%i",&n1);
    printf("\n Ingrese la segunda nota : ");
    scanf("%i",&n2);
    printf("\n Ingrese la tercer nota : ");
    scanf("%i",&n3);
    prom =(n1+n2+n3)/3.0;
    printf("\n\n El promedio de las tres notas es : %f\n\n",prom);
    system("pause");
    return 0;
}
