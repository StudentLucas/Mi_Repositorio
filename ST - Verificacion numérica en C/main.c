#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num,pos=0,neg=0,res=0,par=0;
    printf("Ingrese un Numero(0 para salir):");
    scanf("%i",&num);
    while (num != 0){
        if (num > 0) {
            pos= pos + 1;
        }else {
            neg= neg + 1;
        }
        res=num%2;
        if (res==0){
            par = par + 1;
        }
        printf("Ingrese un Numero: (0 para salir)");
        scanf("%i",&num);
    }
      if (pos > neg){
          if (pos > par) {
                           printf("Los Positivos Fueron Mas Numeros");
           } else {
                   if (neg > par){
                           printf("Los Negativos Fueron mas Numeros");
                    }
               }
        }
        printf("\n\n");
        printf("La Cantidad de Positivos %i\n",pos);
        printf("\n\n");
        printf("La Cantidad de Negativos %i\n",neg);
        printf("\n\n");
        printf("La Cantidad de Pares %i\n",par);
        printf("\n\n");


    system("pause");
    return 0;
}
