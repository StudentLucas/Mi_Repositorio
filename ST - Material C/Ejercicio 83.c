#include <stdio.h>
#include <stdlib.h>

int main()
{
    int ven,can;

    FILE *sucursal;
    sucursal=fopen("f:/2018/sucurs.dat","w");
    FILE *suc1;
    suc1=fopen("f:/2018/suc1.dat","r");
    FILE *suc2;
    suc2=fopen("f:/2018/suc2.dat","r");
    FILE *suc3;
    suc3=fopen("f:/2018/suc3.dat","r");

    if (suc1!=NULL && suc2!=NULL && suc3!=NULL){

        fscanf(suc1,"%i",&ven);
        while (!feof(suc1)){
            fscanf(suc1,"%i",&can);
            fprintf(sucursal,"1\n");
            fprintf(sucursal,"%i\n",ven);
            fprintf(sucursal,"%i\n",can);
            fscanf(suc1,"%i",&ven);
        }

        fscanf(suc2,"%i",&ven);
        while (!feof(suc2)){
            fscanf(suc2,"%i",&can);
            fprintf(sucursal,"2\n");
            fprintf(sucursal,"%i\n",ven);
            fprintf(sucursal,"%i\n",can);
            fscanf(suc2,"%i",&ven);
        }

        fscanf(suc3,"%i",&ven);
        while (!feof(suc3)){
            fscanf(suc3,"%i",&can);
            fprintf(sucursal,"3\n");
            fprintf(sucursal,"%i\n",ven);
            fprintf(sucursal,"%i\n",can);
            fscanf(suc3,"%i",&ven);
        }

        fclose(sucursal);
        fclose(suc1);
        fclose(suc2);
        fclose(suc3);
    }else{
        printf("\n Fallo al abrir archivo.");
    }

    printf("\n\n");
    system("pause");
    return 0;
}
