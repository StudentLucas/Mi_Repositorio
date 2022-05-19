#include <stdio.h>
#include <stdlib.h>

int main()
{
    float ing, impnac,colpro, mun, imptot;
    printf("\n \xc9\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xbb");
    printf("\n \xba Calculo de Impuestos \xba");
    printf("\n \xc8\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xcd\xbc");
    printf("\n\nCuanto es su ingreso ? ");
    scanf("%f",&ing);
    impnac=ing*5.0/100.0;
    colpro=ing*2.0/100.0;
    mun=ing*0.3/100.0;
    imptot=impnac+colpro+mun;
    printf("\n\nImpuesto Nacional : \t%f\n\nColegio Profesional : \t%f\n\nImpuesto Municipal : \t%f\n",impnac,colpro,mun);
    printf("\n\nImpuestos Totales : \t%f\n\n\n\n",imptot);
    system("pause");
    return 0;
}
