#include <stdio.h>
#include <stdlib.h>

int main()
{
    float vcasa, vsellado, imp, inmob, gastos, vend, comp;
    printf("(1.A.08) Hacer el diagrama de un proceso que permita ingresar el valor ");
    printf("\nde venta de una casa y el valor de sellado para formularios. Por la ");
    printf("\nventa se debe pagar un 21%% de impuestos y un 5%% a la inmobiliaria. ");
    printf("\nTodos los gastos se dividen a medias entre el comprador y el vendedor.");
    printf("\nInformar: impuesto a pagar, cuanto cobra la inmobiliaria,");
    printf("\ncuanto cobra el vendedor y cuanto paga el comprador.");
    printf("\n\nValor casa : ");
    scanf("%f",&vcasa);
    printf("\nValor sellados : ");
    scanf("%f",&vsellado);
    imp=21.0*vcasa/100.0;
    inmob=5.0*vcasa/100.0;
    gastos=vsellado+inmob;
    vend=vcasa-gastos/2.0;
    comp=vcasa+imp+gastos/2.0;
    printf("\n\nImpuestos: \t\t%f",imp);
    printf("\n\nComision Inmobiliaria: \t%f",inmob);
    printf("\n\nVendedor Cobra: \t%f",vend);
    printf("\n\nComprador Paga: \t%f",comp);
    printf("\n\n");
    system("pause");
    return 0;
}
