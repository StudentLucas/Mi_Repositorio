#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

int main()
{
    float ing, impnac,colpro, mun, imptot;
    textcolor(15);
    textbackground(2);
    clrscr();
    printf("(1.A.05) Un odontologo sabe que de sus ingresos totales debe pagar 5%% de ");
    printf("\nimpuestos nacionales, el 2%% al colegio profesional y un 0,3%% al municipio.");
    printf("\nHacer el diagrama de un proceso que permita mostrar cuanto es cada parcial");
    printf("\ny cuanto es el total a pagar.");
    printf("\n\n");
    system("pause");
    textcolor(10);
    textbackground(1);
    clrscr();
    gotoxy(5,3);
    printf("Cuanto es su ingreso ? ");
    scanf("%f",&ing);
    impnac=ing*5.0/100.0;
    colpro=ing*2.0/100.0;
    mun=ing*0.3/100.0;
    imptot=impnac+colpro+mun;
    printf("\n\n\tImpuesto Nacional : \t%10.2f\n\tColegio Profesional : \t%10.2f\n\tImpuesto Municipal : \t%10.2f\n",impnac,colpro,mun);
    printf("\n\n\tImpuestos Totales : \t%10.2f\n\n",imptot);
    textcolor(WHITE);
    textbackground(RED);
    printf("\n\n\tA usted le quedaria: \t%10.2f\n\n\n",ing-imptot);
    textcolor(10);
    textbackground(1);
    system("pause");
    return 0;
}
