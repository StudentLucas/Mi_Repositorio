#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

int main()
{
    int c;
    textcolor(LIGHTRED);
    for(c=20;c<=100;c=c+1){
        gotoxy(c,9);
        printf("*");
    }
    for(c=10;c<=22;c=c+1){
        gotoxy(20,c);
        printf("*");
        gotoxy(100,c);
        printf("*");
    }
    for(c=20;c<=100;c=c+1){
        gotoxy(c,22);
        printf("*");
    }
    printf("\n\n");
    system("pause");
    return 0;
}
