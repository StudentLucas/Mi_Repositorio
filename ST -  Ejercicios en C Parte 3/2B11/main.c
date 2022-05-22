#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

int main()
{
    int c;
    textcolor(LIGHTBLUE);
    for(c=1;c<=26;c=c+1){
        gotoxy(c*4,c);
        printf("*");
    }
    printf("\n\n");
    system("pause");
    return 0;
}
