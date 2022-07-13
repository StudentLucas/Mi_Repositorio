#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>
#include <string.h>
#define tot 1  // punto de consiga 200 , 3 para testear.

int main()
{
    int cont,exi,cod,a=0,bcant=0,btot=0,c=0,dcont=0,max=0,totart=0,i,r=8;
    float pre,bprom,dporc;
    char nom[30],e[30]=" ";

    for (i=5;i<=40;i++){
        cputsxy (17,20,"Cargando Espere Por Favor...");
        gotoxy(5,i);
        r=r+1;
        textcolor(r);
        printf("\xDB");
        delay (35);
        gotoxy(60,i);
        printf("\xDB");
        delay (35);
        if (r>=15){
            r=1;
        }
    }

    for (i=5;i<=60;i++){
        cputsxy (17,20,"Cargando Espere Por Favor...");
        gotoxy(i,40);
        r=r+1;
        textcolor(r);
        printf("\xDB");
        delay (35);
        gotoxy(i,5);
        textcolor(r);
        printf("\xDB");
        delay (35);
        if (r>=15){
            r=1;
        }
    }
        textcolor(BLACK);
        cputsxy (17,20,"                               ");

     // Comienzo del Ejercicio


    for (cont=1;cont<=tot;cont++){
        textcolor(YELLOW);
        gotoxy(16,7);
        printf("\xC9\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xBB");
        gotoxy(16,8);
        printf("\xBA  Ingrese Codigo del Articulo \xBA");
        gotoxy(16,9);
        printf("\xC8\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xBC");
        gotoxy(30,11);
        scanf("%i",&cod);



        gotoxy(16,13);
        printf("\xC9\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xBB");
        gotoxy(16,14);
        printf("\xBA  Ingrese Nombre del Articulo \xBA");
        gotoxy(16,15);
        printf("\xC8\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xBC");
        gotoxy(28,17);
        scanf("%s",nom);

        gotoxy(16,19);
        printf("\xC9\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xBB");
        gotoxy(16,20);
        printf("\xBA  Ingrese Precio del Articulo \xBA");
        gotoxy(16,21);
        printf("\xC8\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xBC");
        gotoxy(30,23);
        scanf("%f",&pre);

        gotoxy(14,25);
        printf("\xC9\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xBB");
        gotoxy(14,26);
        printf("\xBA  Ingrese Existencia del Articulo \xBA");
        gotoxy(14,27);
        printf("\xC8\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xBC");
        gotoxy(30,29);
        scanf("%i",&exi);

        textcolor(BLACK);
        clrscr();

        for (i=5;i<=40;i++){
        gotoxy(5,i);
        r=r+1;
        textcolor(r);
        printf("\xDB");
        gotoxy(60,i);
        printf("\xDB");
        if (r>=15){
            r=1;
        }
    }
        for (i=5;i<=60;i++){
        gotoxy(i,40);
        r=r+1;
        textcolor(r);
        printf("\xDB");
        gotoxy(i,5);
        textcolor(r);
        printf("\xDB");
        if (r>=15){
            r=1;
        }
    }


        //Cuentas

        if (pre>10 && exi<200){
            a=a+1;
         }
        if (exi>50 || pre<20){
            bcant=bcant+1;
            btot=btot+pre;
        }
        if (pre<3.0 || pre>7.0){
            c=c+1;
        }
        if (cod<200 || (pre>=5 && pre <=10)){
            dcont=dcont+1;
        }
        if (max<pre){
            max=pre;
            strcpy(e,nom);
        }
        totart=totart+1;
    }
    if (bcant!=0){
        bprom=btot/bcant;
    }
    if (totart=0){
        dporc=dcont/totart*100.0;
    }else{
        textcolor(BLACK);
        clrscr();
        printf("\n No se Ingreso ningun dato de Articulo!! ");
    }

    //Resultados

    // Punto A: Los Articulos con un precio mayor a 10 y con un stock menor a 200
    textcolor(LIGHTCYAN);
    gotoxy(8,8);
    printf("\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC");
    gotoxy(8,9);
    printf("\xDB Punto A son:         %i              ",a);
    gotoxy(8,10);
    printf("\xDB\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDB");

    // Punto B: El precio promedio de los articulos con stock mayor a 50 o precio menor a 20
    gotoxy(8,12);
    printf("\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC");
    gotoxy(8,13);
    printf("\xDB Punto B son:         %2.2f              ",bprom);
    gotoxy(8,14);
    printf("\xDB\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDB");

    // Punto C: Los articulos que no estan entre 3 y 7 pesos
    gotoxy(8,16);
    printf("\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC");
    gotoxy(8,17);
    printf("\xDB Punto C son:          %i                ",c);
    gotoxy(8,18);
    printf("\xDB\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDB");

    //Punto D: El porcentaje de los articulos con Codigo menor a 200 o que el precio este entre 5 y 10
    gotoxy(8,20);
    printf("\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC");
    gotoxy(8,21);
    printf("\xDB Punto D es:           %2.2f            ",dporc);
    gotoxy(8,22);
    printf("\xDB\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDB");

    //Punto E: El Nombre del Articulo con Mayor precio
    gotoxy(8,24);
    printf("\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC");
    gotoxy(8,25);
    printf("\xDB Punto E es:           %s               ",e);
    gotoxy(8,26);
    printf("\xDB\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDC\xDB");

    textcolor(WHITE);
    gotoxy(10,30);
    system("pause");
    return 0;
}
