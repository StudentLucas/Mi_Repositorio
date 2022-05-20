#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

int colorLetrasFondo(x){
    textcolor(x);
return x;
}
// no anda...

int main()
{
    int a,b,x;
    printf("Ingrese un numero del 1 al 15: ");
    scanf("%i",&a);
    colorLetrasFondo(a);
    printf("\n Texto Ejemplo...");
    printf("\n\n");
    b=colorLetrasFondo(x);
    printf("\n Variable x %i",b);
    printf("\n\n");

    system("pause");
    return 0;
}
