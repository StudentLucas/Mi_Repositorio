#include <stdio.h>
#include <stdlib.h>

int main()
{
    float hortra, paghor, jub, obrsoc, cuosin, suebru, suecob;
    printf("(1.A.07) Hacer un diagrama de un proceso que permita ingresar ");
    printf("\nla cantidad de horas trabajadas y el valor que se paga por hora.");
    printf("\nSe descuentan 11%% de jubilacion, 3%% para la obra social ");
    printf("\ny 2%% de cuota sindical. Informar todos los parciales y el sueldo a cobrar. ");
    printf("\n\nIngrese las horas trabajadas : ");
    scanf("%f",&hortra);
    printf("\nIngrese el pago por hora : ");
    scanf("%f",&paghor);
    jub=(hortra*paghor)*11.0/100.0;
    obrsoc=(hortra*paghor)*3.0/100.0;
    cuosin=(hortra*paghor)*2.0/100.0;
    suebru=(hortra*paghor);
    suecob=(hortra*paghor)-jub-obrsoc-cuosin;
    printf("\nHoras trabajadas: \t%f",hortra);
    printf("\nPago por hora: \t\t%f",paghor);
    printf("\nSueldo bruto: \t\t%f",suebru);
    printf("\nJubilacion: \t\t%f",jub);
    printf("\nObra social: \t\t%f",obrsoc);
    printf("\nCuota sindical: \t%f",cuosin);
    printf("\n\nSueldo a cobrar: \t%f",suecob);
    printf("\n\n");
    system("pause");
    return 0;

}
