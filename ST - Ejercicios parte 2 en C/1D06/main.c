#include <stdio.h>
#include <stdlib.h>

int main()
{
    textbackground(15);
    clrscr();
    textcolor(8);
    printf("Black\n");
    textcolor(9);
    printf("Blue\n");
    textcolor(10);
    printf("Green\n");
    textcolor(11);
    printf("Cyan\n");
    textcolor(12);
    printf("Red\n");
    textcolor(13);
    printf("Magenta\n");
    textbackground(0);
    textcolor(14);
    printf("Brown\n");
    textcolor(15);
    textbackground(0);
    printf("LightGray\n");


    return 0;
}
