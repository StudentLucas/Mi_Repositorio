#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

int main()
{
    int cod, conb=0, conc=0, totart=0, b, ancho=60, alto=25;
    float valart, pre, tota=0, totc=0, porb, proc, exi;
    textbackground(BLUE);
    textcolor(WHITE);
    clrscr();
    //dibujo bordes...
    for (b=2;b<=ancho;b++){
        gotoxy(b,2);
        printf("\xDB");
        gotoxy(ancho-b+2,alto);
        printf("\xDB");
        delay(50);
    }
    for (b=2;b<=alto;b++){
        gotoxy(ancho,b);
        printf("\xDB");
        gotoxy(2,alto-b+2);
        printf("\xDB");
        delay(50);
    }

    gotoxy(5,4);
    printf(" Ingrese Codigo (0 para salir) \t");
    scanf("%i",&cod);
    while (cod!=0){
        printf(" \xDB   Ingrese el precio \t\t\t");
        scanf("%f",&pre);
        printf(" \xDB   Ingrese existencia \t\t");
        scanf("%f",&exi);
        valart=pre*exi;
        tota=tota+valart;
        if (cod<200 || (pre>=5 && pre<=10)){
            conb=conb+1;
        }
        if (exi>50){
            conc=conc+1;
            totc=totc+pre;
        }
        totart=totart+1;
        printf("\n \xDB   Ingrese Codigo (0 para salir) \t");
        scanf("%i",&cod);
    }
    if (totart!=0){

         //dibujo bordes del resultado...
        for (b=2;b<=ancho;b++){
            gotoxy(b+60,2);
            printf("\xDB");
            gotoxy(120-b+2,alto);
            printf("\xDB");
            delay(20);
        }
        for (b=2;b<=alto;b++){
            gotoxy(ancho+60,b);
            printf("\xDB");
            gotoxy(2+60,alto-b+2);
            printf("\xDB");
            delay(20);
        }
        textcolor(LIGHTGREEN);
        porb=conb/totart*100.0;
        gotoxy(65,4);
        printf(" Valor Total = %.f",tota);
        gotoxy(65,6);
        printf(" Porcentaje B = %.f",porb);
        if (conc!=0){
            proc=totc/conc;
            gotoxy(65,8);
            printf(" Promedio C = %.f",proc);
            printf("\n\n");
        }else{
            gotoxy(65,10);
            printf(" No hay articulos para calcular Promedio C");
            printf("\n\n");
        }
    }else{
         //dibujo bordes del resultado...
        for (b=2;b<=ancho;b++){
            gotoxy(b+60,2);
            printf("\xDB");
            gotoxy(120-b+2,alto);
            printf("\xDB");
            delay(20);
        }
        for (b=2;b<=alto;b++){
            gotoxy(ancho+60,b);
            printf("\xDB");
            gotoxy(2+60,alto-b+2);
            printf("\xDB");
            delay(20);
        }
        gotoxy(78,12);
        printf("No se ingresaron Articulos ");
        printf("\n\n");
    }
    textcolor(WHITE);
    gotoxy(2,27);

    system("pause");
    return 0;
}
