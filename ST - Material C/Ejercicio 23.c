#include <stdio.h>
#include <stdlib.h>

int main()
{
    float num;
    printf("Ingrese un numero mayor que 17: ");
    scanf("%f",&num);
    if (num<=17){
        printf("\n\nEl numero %2.0f no es mayor a 17",num);
    }
    printf("\n\n");
    return 0;
}
