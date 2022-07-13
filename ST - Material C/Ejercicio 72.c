#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

void letrasRojas();

void letrasBlancas(){
        textcolor(WHITE);
return;
}

int main()
{
    printf("Hello world!\n");
    letrasRojas();
    printf("\n\n");
    printf("Hello world!\n");
    letrasBlancas();
    printf("\n\n");

    system("pause");
    return 0;
}

void letrasRojas(){
        textcolor(12);
return;
}
