#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

int main()
{
    int c;
    float cos,por,sub,tot;
    textcolor(LIGHTBLUE);
    for(c=1;c<=50;c=c+1){
        printf("\n\n");
        printf("Ingrese el costo del articulo %i : ",c);
        textcolor(LIGHTGREEN);
        scanf("%f",&cos);
        printf("\n");
        textcolor(LIGHTBLUE);
        printf("Ingrese la ganancia del articulo %i : ",c);
        textcolor(LIGHTGREEN);
        scanf("%f",&por);
        sub=cos+(cos*por/100);
        tot=sub*1.21;
        printf("\n");
        textcolor(LIGHTBLUE);
        printf("El precio final del articulo %i es: ",c);
        textcolor(LIGHTGREEN);
        printf("%.2f ",tot);
        textcolor(LIGHTBLUE);
        printf("\n\n\n");
    }
    printf("\n\n");
    system("pause");
    return 0;
}
