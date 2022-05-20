#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char pat[30];
    int lar,e,f1,f2,f3,f4,f5,f6,f7,g1,g2,g3,g4,g5,g6,g7;
    printf("\n Ingrese una patente (0 para salir) ");
    scanf("%s",pat);

    f1=pat[0];g1=("%i",f1);
    f2=pat[1];g2=("%i",f2);
    f3=pat[2];g3=("%i",f3);
    f4=pat[3];g4=("%i",f4);
    f5=pat[4];g5=("%i",f5);
    f6=pat[5];g6=("%i",f6);
    f7=pat[6];g7=("%i",f7);
    while (g1!=48){
        lar=strlen(pat);
        printf("\n");
        /*
        for (e=0;e<=lar;e++){
            //printf("\n %c",pat[e]);
            printf(" %i",pat[e]);
            delay(100);
        }
        */

        if ((lar==6 || lar==7)){
            //patente largo ok
            //if (pat[0]>=65) || (pat[0]<=90){
            if (lar==6){
                //formato AAA111
                if ((f1>=65 && f1<=90)&&(f2>=65 && f2<=90)&&(f3>=65 && f3<=90)&&(f4>=48 && f4<=57)&&(f5>=48 && f5<=57)&&(f6>=48 && f6<=57)){
                    printf("\n Patente %s Correcta OK",pat);
                    //printf("\n d %i",d);
                }else{
                    printf("\n Patente invalida...");
                }
            }else{
                //formato AA123AA
                if ((f1>=65 && f1<=90)&&(f2>=65 && f2<=90)&&(f3>=48 && f3<=57)&&(f4>=48 && f4<=57)&&(f5>=48 && f5<=57)&&(f6>=65 && f6<=90)&&(f7>=65 && f7<=90)){
                    printf("\n Patente %s Correcta OK",pat);
                }else{
                    printf("\n Patente invalida...");
                }
            }
            printf("\n");


        }else{
            printf("\n Patente invalida...");
        }
        printf("\n");

        printf("\n Ingrese una patente (0 para salir) ");
        scanf("%s",pat);
        f1=pat[0];g1=("%i",f1);
        f2=pat[1];g2=("%i",f2);
        f3=pat[2];g3=("%i",f3);
        f4=pat[3];g4=("%i",f4);
        f5=pat[4];g5=("%i",f5);
        f6=pat[5];g6=("%i",f6);
        f7=pat[6];g7=("%i",f7);
    }

    return 0;
}
