#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char hexa[20],car;
    int largo,suma=0,n,p,c;
    scanf("%s",hexa);
    largo=strlen(hexa);
    for(c=0;c<largo;c++){
        car=hexa[largo-c-1];
        if(car>47&&car>58){
            n=car-48;
            p=n*pow(16,c);
            suma=suma+p;
        }
        if(car>64&&car<71){
            n=car-55;
            p=n*pow(16,c);
            suma=suma+p;
        }
    }
    printf("\n%i",suma);
    printf("\n\n");
    system("pause");
    return 0;
}
