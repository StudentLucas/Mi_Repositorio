#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

int main()
{
    float num,doble;
    printf("Ingrese un numero, yo le mostrare el doble... ");
    scanf("%f",&num);
    doble=num*2;
    if (doble>0){
            textcolor(4);
            printf("\n\nEl doble de %10.0f es %10.0f",num,doble);
        }else{
            textcolor(2);
            printf("\n\nEl doble de %10.0f es %10.0f",num,doble);
    }
    printf("\n\n");
    return 0;
}
