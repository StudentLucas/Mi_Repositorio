#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio2.h>

int c;
float s;
float promedio(float s, int c){
         int p;
         p= s/c;

        return p;
}

int cont1,c;
float porcentaje (int cont1,int c){
        float por;
        por=cont1/c*100;

        return por;
}

int main()
{
    int c,cod,exi,cont1=0,nummay=-1;
    float pre,totpre=0,captot=0,/*promA,porcB*/p,por;
    char nom[20],nommay[20];
    for (c=1;c<=2;c=c+1){
        printf("\n Ingrese codigo del Articulo:");
        scanf("%i",&cod);
        printf("\n Ingrese Nombre del Articulo:");
        scanf("%s",&nom);
        printf("\n Ingrese el precio del Articulo:");
        scanf("%f",&pre);
        printf("\n Ingrese Existencia del Articulo:");
        scanf("%i",&exi);
    if (pre>50 || cod <25){
               cont1=cont1+1;
    }
    if (exi>nummay){
            strcpy(nommay,nom);
                   nummay= exi;
    }
    totpre=totpre+pre;
    captot=captot+(pre*exi);
    }
    /*promA=totpre/5;*/
    p = promedio(totpre,2);
    por = porcentaje(cont1,2);
    /*porcB=cont1/2*100;*/

    textcolor (RED);
    printf(" \n El Promedio es: %2.2f \n",p) ;
    printf(" \n El Porcentaje es: %2.3f \n",por);
    printf(" \n Nombre del Articulo de Mayor Existencia es: %s \n",nommay);
    printf(" \n El capital Total es: %4.2f \n",captot);

    printf("\n\n");

    system("PAUSE");
    return 0;
}
