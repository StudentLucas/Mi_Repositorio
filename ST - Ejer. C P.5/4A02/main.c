#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

void colorLetrasNro(x){
    textcolor(x);
return;
}

int main()
{
    int a;
    printf("Ingrese un numero del 1 al 15: ");
    scanf("%i",&a);
    colorLetrasNro(a);
    printf("\n Texto Ejemplo...");
    printf("\n\n");

    system("pause");
    return 0;
}


