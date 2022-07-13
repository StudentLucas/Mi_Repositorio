#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

int main()
{
    int c;
    textcolor(GREEN);
    for(c=40;c>=23;c--){
        gotoxy(c,5);
        printf("*");
    }
    printf("\n\n");
    system("pause");
    return 0;
}

