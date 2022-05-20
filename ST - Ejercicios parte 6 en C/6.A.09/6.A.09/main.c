#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int cod,k,i,aux,vcod[1000],h,codant=9999;
    char nom[25],auxn[25],vnom[1000][25];
    float pre,vpre[1000],auxp;

    //se juntan los dos archivos

    FILE *artic;
    artic=fopen("f:/2018/artic.dat","a");
    FILE *nuevarti;
    nuevarti=fopen("f:/2018/nuevarti.dat","r");

    if (artic!=NULL && nuevarti!=NULL){

        fscanf(nuevarti,"%i",&cod);
        while (!feof(nuevarti)){
            fscanf(nuevarti,"%s",nom);
            fscanf(nuevarti,"%f",&pre);
            fprintf(artic,"%i\n",cod);
            fprintf(artic,"%s\n",nom);
            fprintf(artic,"%f\n",pre);
            fscanf(nuevarti,"%i",&cod);
        }

        fclose(artic);
        fclose(nuevarti);

        //leer el archivo y tenerlo en memoria

        FILE *artic;
        artic=fopen("f:/2018/artic.dat","r");

        int c=0;
        fscanf(artic,"%i",&cod);
        while (!feof(artic)){
            fscanf(artic,"%s",nom);
            fscanf(artic,"%f",&pre);

            vcod[c]=cod;
            strcpy(vnom[c],nom);
            vpre[c]=pre;
            fscanf(artic,"%i",&cod);
            c=c+1;
        }
        fclose(artic);

        /*

        // para ver como quedo artic...
        for (h=0;h<=c-1;h++){
            printf("\n %i ",vcod[h]);
            printf("\t\t %s ",vnom[h]);
            printf("\t\t %8.2f ",vpre[h]);
        }
        */
        // Ordenamiento

        for (k=0;k<=c-2;k++){
            for (i=k+1;i<=c-1;i++){
                if (vcod[i]<vcod[k]){

                    aux=vcod[i];
                    vcod[i]=vcod[k];
                    vcod[k]=aux;

                    strcpy(auxn,vnom[i]);
                    strcpy(vnom[i],vnom[k]);
                    strcpy(vnom[k],auxn);

                    auxp=vpre[i];
                    vpre[i]=vpre[k];
                    vpre[k]=auxp;
                }
            }
        }

        // para ver como quedo artic...
        for (h=0;h<=c-1;h++){
            printf("\n %i ",vcod[h]);
            printf("\t\t %s ",vnom[h]);
            printf("\t\t %8.2f ",vpre[h]);
        }

        scanf("Enter para seguir %i",&h);

        //Grabacion de archivos

        //FILE *artic;
        artic=fopen("f:/2018/artic.dat","w");
        FILE *repet;
        repet=fopen("f:/2018/repet.dat","w");

        for (h=0;h<=c-1;h++){
            if (codant!=vcod[h]){
                printf("\n %i ",vcod[h]);
                printf("\t\t %s ",vnom[h]);
                printf("\t\t %8.2f ",vpre[h]);
                fprintf(artic,"%i\n",vcod[h]);
                fprintf(artic,"%s\n",vnom[h]);
                fprintf(artic,"%f\n",vpre[h]);
            }else{
                printf("\n\t %i, esta repetido. ",vcod[h]);
                fprintf(repet,"%i\n",vcod[h]);
                fprintf(repet,"%s\n",vnom[h]);
                fprintf(repet,"%f\n",vpre[h]);
            }
            codant=vcod[h];
        }

    }else{
        printf("\n Fallo al abrir archivo.");
    }

    printf("\n\n");
    system("pause");
    return 0;
}
