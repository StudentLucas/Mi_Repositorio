#include <stdio.h>
#include <stdlib.h>

int main()
{
    float num,dob,tri;
    printf("Ingrese un numero: ");
    scanf("%f",&num);
    dob=num*2;
    tri=num*3;
    if (num==5){
            printf("\n\nIngreso el numero 5 !");
    }
    if (num>5){
            printf("\n\nIngreso el doble de %10.0f",dob);
        }else{
            printf("\n\nIngreso el triple de %10.0f",tri);
    }
    printf("\n\n");
    return 0;
}
