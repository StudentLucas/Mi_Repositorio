#include <stdio.h>
#include <stdlib.h>

int main()
{
    int c,lar;
    char pal[30];
    printf("Ingrese una palabra ");
    scanf("%s",pal);
    lar=strlen(pal);
    for (c=0;c<lar;c++){
        printf("%c",pal[lar-c-1]);
    }
    printf("\n\n");
    system("pause");
    return 0;
}
