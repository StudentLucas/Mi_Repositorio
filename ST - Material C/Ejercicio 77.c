#include <stdio.h>
#include <stdlib.h>

int main()
{
    int c;
    float sue;
    char ape[25];

    FILE *archivo;
    archivo=fopen("g:/2018/personas.dat","w");

    if (archivo!=NULL){
        for (c=1;c<=5;c++){
            printf("\n Ingrese Apellido %i : ",c);
            scanf("%s",ape);
            printf(" Ingrese Sueldo %i : ",c);
            scanf("%f",&sue);
            fprintf(archivo,"%s\n",ape);
            fprintf(archivo,"%f\n",sue);
        }
        fclose(archivo);
    }else{
        printf("\n Fallo al abrir archivo.");
    }

    printf("\n\n");
    system("pause");
    return 0;
}
