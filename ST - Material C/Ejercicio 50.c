#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>
#define cant 1000000
#define t 20

int main()
{
    int x=1,y=1,vx=1,vy=1,c;
    for (c=1;c<=cant;c++){
        gotoxy(x,y);
        printf("*");
        delay(t);
        gotoxy(x,y);
        //printf(" ");
        if (x==80){
            vx=-1;
        }
        if (x==1){
            vx=1;
        }
        if (y==43){
            vy=-1;
        }
        if (y==1){
            vy=1;
        }
        x=x+vx;
        y=y+vy;
    }

    system("pause");
    return 0;
}
