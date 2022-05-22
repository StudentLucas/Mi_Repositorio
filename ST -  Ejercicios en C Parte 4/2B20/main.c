#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>
#define t 50

int main()
{
    int c,d;

    for (d=1;d<=40;c++){
            for (c=1;c<=75;c++){
                gotoxy(c,10);
                printf("Hector");
                delay(t);
                gotoxy(c,10);
                printf("      ");
                delay(t);
            }
            for (c=75;c>=1;c--){
                gotoxy(c,10);
                printf("Hector");
                delay(t);
                gotoxy(c,10);
                printf("      ");
                delay(t);
        }
    }

    system("pause");
    return 0;
}
