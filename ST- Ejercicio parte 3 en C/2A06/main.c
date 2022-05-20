#include <stdio.h>
#include <stdlib.h>

int main()
{
    float ing,imp,ext,imp2,imptot;

    printf("Cuales fueron los ingresos anuales ");
    scanf("%f",&ing);
    imp=ing*3/100;
    if (ing<=200000){
        //printf("\nLos impuestos son : %10.2f",imp);
        printf("\n\n");
    }else{
        //printf("\n imp : %10.2f",imp);
        ext=ing-200000;
        //printf("\n ext : %10.2f",ext);
        imp2=ext*0.2/100;
        //printf("\n imp2 : %10.2f",imp2);
        imptot=imp+imp2;
        printf("\nLos impuestos son : %10.2f",imptot);
        printf("\n\n");
    }
    system("pause");
    return 0;
}
