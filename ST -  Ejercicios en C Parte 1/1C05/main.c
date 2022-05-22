#include <stdio.h>
#include <stdlib.h>

int main()
{
    float ing, impnac,colpro, mun, imptot;
    printf("(1.A.05) Un odontologo sabe que de sus ingresos totales debe pagar 5%% de ");
    printf("\nimpuestos nacionales, el 2%% al colegio profesional y un 0,3%% al municipio.");
    printf("\nHacer el diagrama de un proceso que permita mostrar cuanto es cada parcial");
    printf("\ny cuanto es el total a pagar.");
    printf("\n\nCuanto es su ingeso ? ");
    scanf("%f",&ing);
    impnac=ing*5.0/100.0;
    colpro=ing*2.0/100.0;
    mun=ing*0.3/100.0;
    imptot=impnac+colpro+mun;
    printf("\n\nImpuesto Nacional : \t%f\nColegio Profesional : \t%f\nImpuesto Municipal : \t%f\n",impnac,colpro,mun);
    printf("\n\nImpuestos Totales : \t%f\n\n",imptot);
    system("pause");
    return 0;
}
