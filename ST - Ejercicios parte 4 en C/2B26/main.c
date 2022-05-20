#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>
#define tot 1000000000

int main()
{
    int x=40,y=10,c,t;
    gotoxy(x,y);
    printf("*");                 //muestra el primer asterisco
    for (c=1;c<=tot;c++){
        if (kbhit()){            //detecta si se toco una tecla
            t=getch();
            if (t==80){          //detecta si se toco flecha abajo
                if (y<25){
                    gotoxy(x,y);
                    printf(" ");
                    y=y+1;
                    gotoxy(x,y);
                    printf("*");
                }else{           //si llego al borde rebota
                    gotoxy(x,y);
                    printf(" ");
                    y=y-1;
                    gotoxy(x,y);
                    printf("*");
                }
            }
            if (t==72){          //detecta si se toco flecha arriba
                if (y>1){
                    gotoxy(x,y);
                    printf(" ");
                    y=y-1;
                    gotoxy(x,y);
                    printf("*");
                }else{           //si llego al borde rebota
                    gotoxy(x,y);
                    printf(" ");
                    y=y+1;
                    gotoxy(x,y);
                    printf("*");
                }
            }
            if (t==27){           //si toco ESC sale del for
                c=tot+1;
            }
        }
    }
    printf("\n\n");
    system("pause");
    return 0;
}
