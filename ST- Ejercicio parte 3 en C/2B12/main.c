#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

int main()
{
    int c,d=120;
    textcolor(LIGHTGREEN);
    for(c=1;c<=23;c=c+1){
        d=d-5;
        gotoxy(d,c);
        printf("*");
    }
    printf("\n\n");
    system("pause");
    return 0;
}
