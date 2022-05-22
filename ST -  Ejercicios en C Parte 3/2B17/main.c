#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>
#define t 100

int main()
{
    int c;
    for (c=80;c>=1;c--){
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
