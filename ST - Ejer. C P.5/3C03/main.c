#include <stdio.h>
#include <stdlib.h>

int main()
{

    char nom1[20], nom2[20];
    int eda1,eda2;
    printf("Ingrese el Apellido 1 ");
    scanf("%s",nom1);
    printf("Ingrese la edad de %s ",nom1);
    scanf("%i",&eda1);
    printf("\n");
    printf("Ingrese el Apellido 2 ");
    scanf("%s",nom2);
    printf("Ingrese la edad de %s ",nom2);
    scanf("%i",&eda2);
    printf("\n\n");
    if (eda1>eda2){
        printf("%s es mayor que %s.",nom1,nom2);
    }else{
        printf("%s es mayor que %s.",nom2,nom1);
    }
    printf("\n\n");

    system("pause");
    return 0;
}
