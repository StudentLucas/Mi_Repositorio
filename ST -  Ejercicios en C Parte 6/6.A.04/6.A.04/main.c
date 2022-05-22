#include <stdio.h>
#include <stdlib.h>

int main()
{
    int c=0;
    float sue;
    char ape[25];

    FILE *archivo;
    archivo=fopen("g:/2018/personas.dat","r");

    if (archivo!=NULL){
        printf("\n Apellido");
        printf("\t Sueldo");
        c=c+1;
        while (feof(archivo)==0){
            fscanf(archivo,"%s",ape);
            fscanf(archivo,"%f",&sue);
            printf("\n %i : %s",c,ape);
            printf("\t %.f",sue);
        }
        fclose(archivo);
    }else{
        printf("\n Fallo al abrir archivo.");
    }

    printf("\n\n");
    system("pause");
    return 0;
}
