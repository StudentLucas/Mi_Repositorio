#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    //int c;

    int cod;
    char nom[25];
    float pre;

    FILE *archivo;
    archivo=fopen("f:/2018/precios.dat","a");

    if (archivo!=NULL){
        printf("\n Ingrese Codigo : ");
        scanf("%i",&cod);
        while (cod!=0){
            printf(" Ingrese Nombre : ");
            scanf("%s",nom);
            printf(" Ingrese Precio : ");
            scanf("%f",&pre);
            fprintf(archivo,"%i\n",cod);
            fprintf(archivo,"%s\n",nom);
            fprintf(archivo,"%f\n",pre);
            printf("\n Ingrese Codigo : ");
            scanf("%i",&cod);
        }
        fclose(archivo);
    }else{
        printf("\n Fallo al abrir archivo.");
    }

    printf("\n\n");
    system("pause");
    return 0;
}
