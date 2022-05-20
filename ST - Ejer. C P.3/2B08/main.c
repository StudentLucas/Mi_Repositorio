#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

int main()
{
    int c;
    textcolor(BLUE);
    for(c=6;c<=22;c++){
        gotoxy(20,c);
        printf("*");
    }
    printf("\n\n");
    system("pause");
    return 0;
}
