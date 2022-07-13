#include <stdio.h>
#include <stdlib.h>

int main()
{
    int ed;
    printf("Ingrese la edad ");
    scanf("%i",&ed);
    if (ed<20){
            printf("\nJoven\n\n");
        }else{
            if (ed<=39){
                    printf("\nAdulto\n\n");
                }else{
                    if (ed<=60){
                            printf("\nMayor\n\n");
                        }else{
                            printf("\nTercera Edad\n");
                    }
            }
    }
    return 0;
}
