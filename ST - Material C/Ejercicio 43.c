#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>
#define t 500

int main()
{
    int c;
    for (c=1;c<=50;c++){
            gotoxy(10,10);
            printf("*");
            delay(t);
            gotoxy(10,10);
            printf(" ");
            delay(t);
    }

    system("pause");
    return 0;
}
