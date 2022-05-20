#include <stdio.h>
#include <stdlib.h>
#define tot 70

int main()
{
    float porcB, porcC;
    int contA=0, contB=0, contC=0, contD=0,c ,aus, he;

    for (c=1;c<=tot;c++){
        printf("Ingrese dias Ausente ");
        scanf("%i",&aus);
        printf("Horas Extras trabajadas ");
        scanf("%i",&he);
        if (aus==0){
            contA=contA+1;
        }
        if (he<=10){
            contB=contB+1;
        }
        if (he>=5){
                if (aus<3){
                    contC=contC+1;
        }
        }
    }
    printf("Hello world!\n");
    return 0;
}
