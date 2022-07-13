#include <stdio.h>
#include <stdlib.h>

int main()
{
    int c,r,i;
    printf("Ingrese un numero, para imprimir la tabla del mismo ");
    scanf("%i",&i);
    for(c=1;c<=10;c++){
            r=c*i;
            printf("%i * %i = %i\n",i,c,r);
    }
    system("pause");
    return 0;
}

