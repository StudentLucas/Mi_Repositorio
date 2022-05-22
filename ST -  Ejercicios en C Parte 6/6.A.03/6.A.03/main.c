#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    //int c;
    float sue;
    char ape[25];

    FILE *archivo;
    archivo=fopen("g:/2018/personas.dat","a");

    if (archivo!=NULL){
        printf("\n Ingrese Apellido : ");
        scanf("%s",ape);
        while (strcmp(ape,"x")!=0){
            printf(" Ingrese Sueldo : ");
            scanf("%f",&sue);
            fprintf(archivo,"%s\n",ape);
            fprintf(archivo,"%f\n",sue);
            printf("\n Ingrese Apellido : ");
            scanf("%s",ape);
        }
        fclose(archivo);
    }else{
        printf("\n Fallo al abrir archivo.");
    }

    printf("\n\n");
    system("pause");
    return 0;
}
