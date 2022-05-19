#include <stdio.h>
#include <stdlib.h>

int main()
{
    float v1,porc,total;
    printf("Ingrese el valor: ");
    scanf("%f",&v1);
    porc=v1*13.2/100;
    total=v1+porc;
    printf("\n%15.3f",v1);
    printf("\n%15.3f",porc);
    printf("\n%15.3f\n",total);
    return 0;
}
