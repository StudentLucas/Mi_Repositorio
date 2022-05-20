#include <stdio.h>
#include <stdlib.h>
#define pru 500

int main()
{
    int c, entre=0, ed, menor=0, toted=0, cua=0;
    float prom, porc, sue, tot=0;
    for (c=1;c<=pru;c++){
            printf("\nIngrese sueldo ");
            scanf("%f",&sue);
            printf("Ingrese edad ");
            scanf("%i",&ed);
            if (sue>600){
                if (sue<900){
                    entre=entre+1;
                }
            }
            if (sue<500){
                menor=menor+1;
            }
            if (sue>1000){
                cua=cua+1;
            }else{
                if (ed>50){
                    cua=cua+1;
                }
            }
            tot=tot+sue;
            toted=toted+ed;
    }
    porc=menor*100/pru;
    prom=toted/pru;

    printf("\n%i \tGanan entre $600 y $900",entre);
    printf("\n%.f %% \tes el porcentaje que ganan menos de $ 500",porc);
    printf("\n%.f \tEs el total de sueldos a pagar",tot);
    printf("\n%.f \tEs el promedio de edades",prom);
    printf("\n%.i \tGanan mas de $10000 o tienen mas de 50 años",cua);

    printf("\n");
    return 0;
}
