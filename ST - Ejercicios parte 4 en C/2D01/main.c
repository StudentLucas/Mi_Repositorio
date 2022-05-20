#include <stdio.h>
#include <stdlib.h>
#define gen 100
int main()
{
    int c;
    float sue,tot=0;
    for (c=1;c<=gen;c++){
      printf("Ingrese Sueldo ");
      scanf("%f",&sue);
      tot=tot+sue;
    }
    printf("\n El total a pagar es %.f",tot);
    printf("\n");
    return 0;
}
