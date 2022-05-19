#include <stdio.h>
#include <stdlib.h>

int main()
{
    float ing, impnac,colpro, mun, imptot,gasfij,gan;
    printf("(1.A.06) Agregar al diagrama anterior la posibilidad de indicar el valor ");
    printf("\nde sus gastos fijos y mostrar la ganancia que obtiene.");
    printf("\n\nCuanto es su ingreso ? ");
    scanf("%f",&ing);
    printf("\nIngrese sus gastos fijos : ");
    scanf("%f",&gasfij);
    impnac=ing*5.0/100.0;
    colpro=ing*2.0/100.0;
    mun=ing*0.3/100.0;
    imptot=impnac+colpro+mun;
    gan=ing-imptot-gasfij;
    printf("\nImpuesto Nacional : \t%f\nColegio Profesional : \t%f\nImpuesto Municipal : \t%f\n",impnac,colpro,mun);
    printf("\nImpuestos Totales : \t%f\n\n",imptot);
    printf("\nIngresos Totales : \t%f",ing);
    printf("\nGastos : \t\t%f",gasfij);
    printf("\nGanancia : \t\t%f",gan);
    printf("\n\n");
    system("pause");
    return 0;
}
