#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

int main()
{
    int c;
    for(c=1;c<=15;c++){
         textcolor(c);
         printf("Hola\n");
    }
    system("pause");
    return 0;
}
