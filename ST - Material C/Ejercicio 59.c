#include <stdio.h>
#include <stdlib.h>

int main()
{
    int cod, conb=0, conc=0, totart=0;
    float valart, pre, tota=0, totc=0, porb, proc, exi;
    printf("\n Ingrese Codigo (0 para salir) ");
    scanf("%i",&cod);
    while (cod!=0){
        printf(" Ingrese el precio ");
        scanf("%f",&pre);
        printf(" Ingrese existencia ");
        scanf("%f",&exi);
        valart=pre*exi;
        tota=tota+valart;
        if (cod<200 || (pre>=5 && pre<=10)){
            conb=conb+1;
            //printf(" pase por B ");
        }
        if (exi>50){
            conc=conc+1;
            totc=totc+pre;
            //printf(" pase por C ");
            printf("\n conc %.i ",conc);
            printf("\n totc %.f ",totc);
            printf("\n pre %.f ",pre);
        }
        totart=totart+1;
        printf("\n Ingrese Codigo (0 para salir) ");
        scanf("%i",&cod);
    }
    if (totart!=0){
        porb=conb/totart*100.0;
        printf("\n\n Valor Total = %.f",tota);
        printf("\n\n Porcentaje B = %.f",porb);
        if (conc!=0){
            proc=totc/conc;
            printf("\n\n Promedio C = %.f",proc);
            printf("\n\n");
        }else{
            printf("\n\n No hay articulos para calcular Promedio");
            printf("\n\n");
        }
    }else{
        printf("\n\n No se ingresaron Articulos ");
        printf("\n\n");
    }
    system("pause");
    return 0;
}
