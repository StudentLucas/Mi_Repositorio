#include <stdio.h>
#include <stdlib.h>

int main()
{
    float num,cua;
    printf("(1.A.01) Hacer el diagrama de un proceso que permita ingresar un numero, \nque calcule la cuarta parte del mismo y que muestre ese resultado.");
    printf("\n\nIngrese un numero ? ");
    scanf("%f",&num);
    cua=num/4;
    printf("\n La cuarta parte de %f es %f \n\n",num,cua);
    system("pause");
    return 0;
}
