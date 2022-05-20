#include <stdio.h>
#include <stdlib.h>

int main()
{
    int doc,eda;
    char ape[25];

    FILE *empleados;
    empleados=fopen("f:/2018/emplead.dat","r");
    FILE *jovenes;
    jovenes=fopen("f:/2018/joven.dat","w");
    FILE *maduros;
    maduros=fopen("f:/2018/maduros.dat","w");

    if (empleados!=NULL){

        fscanf(empleados,"%i",&eda);
        while (!feof(empleados)){
            fscanf(empleados,"%i",&doc);
            fscanf(empleados,"%s",ape);
            fscanf(empleados,"%i",&eda);

            if (eda<30){
                fprintf(jovenes,"%i\n",doc);
                fprintf(jovenes,"%s\n",ape);
                fprintf(jovenes,"%i\n",eda);
                printf("Joven %s\n",ape);
            }
            if (eda>=30&&eda<=49){
                fprintf(maduros,"%i\n",doc);
                fprintf(maduros,"%s\n",ape);
                fprintf(maduros,"%i\n",eda);
                printf("Maduro %s\n",ape);
            }
        }
        fclose(empleados);
        fclose(jovenes);
        fclose(maduros);
    }else{
        printf("\n Fallo al abrir archivo.");
    }

    printf("\n\n");
    system("pause");
    return 0;
}
