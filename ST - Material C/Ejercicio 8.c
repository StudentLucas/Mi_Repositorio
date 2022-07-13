#include <stdio.h>
#include <stdlib.h>

int main()
{   int peraus;
    float porcen;
    printf("(1.A.04) Hacer el diagrama de un proceso que permita ingresar la");
    printf("\ncantidad de personas ausentes en un dia sobre un total de 70");
    printf("\ny que muestre el porcentaje de ausentes de ese dia.");
    printf("\n\nIngrese cantidad de personas ausentes: ");
    scanf ("%i", &peraus);
    porcen=peraus/70.0*100.0;
    printf ("\nEl porcentaje de ausentes es: %f",porcen);
    printf (" %%\n\n");
    system("pause");
    return 0;
}
