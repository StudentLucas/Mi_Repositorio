#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num, pos=0, neg=0, par=0, imp=0, res;
    printf("\n Ingrese un numero (0 para salir) ");
    scanf("%i",&num);
    while (num != 0){

        res=num%2;
        if (res==0){
            par=par+1;
            //printf("\n Par ");
        }else{
            imp=imp+1;
            //printf("\n Impar ");
        }
    printf("\n Ingrese un numero (0 para salir) ");
    scanf("%i",&num);
    }

    //printf("\n\n Cantidad postivos: %i",pos);
    //printf("\n Cantidad negativos: %i",neg);
    printf("\n Cantidad pares: %i",par);
    printf("\n Cantidad impares: %i",imp);
    printf("\n\n");
    system("pause");
    return 0;
}
