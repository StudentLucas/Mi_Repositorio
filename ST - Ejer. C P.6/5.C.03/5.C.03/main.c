#include <stdio.h>
#include <stdlib.h>

int main()
{
    int c,cod[4],codbus,pos=-1;
    float pre[4];
    char nom[4][20];
    for (c=0;c<=3;c++){
        printf("\n Ingrese codigo = ");
        scanf("%i",&cod[c]);
        printf(" Ingrese Nombre = ");
        scanf("%s",nom[c]);
        printf(" Ingrese precio = ");
        scanf("%f",&pre[c]);
    }
    for (k=0;k<=4;k++){
        for (i=k+1;4-1;i++){

        }
    }




    printf("\n Codigo a buscar (0 para salir) ");
    scanf("%i",&codbus);
    while (codbus!=0){
        pos=-1;
        for (c=0;c<=3;c++){
            if (cod[c]==codbus){
                pos=c;
                c=3;
            }
         }
         if (pos!=-1){
                printf("\n Codigo = %i ",cod[pos]);
                printf("\n Nombre = %s ",nom[pos]);
                printf("\n Precio = %.f ",pre[pos]);
            }else{
                printf("\n No se encontro el Codigo Buscado %i ",codbus);
         }

        printf("\n\n Codigo a buscar (0 para salir) ");
        scanf("%i",&codbus);
    }
    printf("\n\n");
    system("pause");
    return 0;
}
