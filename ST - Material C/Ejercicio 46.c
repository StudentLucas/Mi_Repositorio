#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>
#define t 100

int main()
{
    int c;
    for (c=1;c<=80;c++){
            gotoxy(c,10);
            printf("*");
            delay(t);
            gotoxy(c,10);
            printf(" ");
            delay(t);
    }
    for (c=79;c>=1;c--){
            gotoxy(c,10);
            printf("*");
            delay(t);
            gotoxy(c,10);
            printf(" ");
            delay(t);
    }

    system("pause");
    return 0;
}
