#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

int main()
{
    int c;
    for(c=1;c<=80;c++){
        gotoxy(c,10);
        printf("*");
    }
    printf("\n\n");
    system("pause");
    return 0;
}
