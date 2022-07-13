#include <stdio.h>
#include <stdlib.h>

int main()
{
    char nom[20];
    float sue;
    printf("Ingrese el Nombre ");
    scanf("%s",nom);
    printf("Ingrese el Sueldo ");
    scanf("%f",&sue);
    printf("\n\n");
    printf("El empleado %s gana %.f pesos.",nom,sue);
    printf("\n\n");

    system("pause");
    return 0;
}
