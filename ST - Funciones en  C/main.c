#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "funcad.c"
#include "tiempos.c"


int main()
{
    printf("Ejercicio con resultados de texto")  ;
    printf("\n\n")                               ;
    printf("     Dia:  %s ",day())               ;
    printf("\n\n")                               ;
    printf("     Mes:  %s ",month())             ;
    printf("\n\n")                               ;
    printf("    Anio:  %s ",year())              ;
    printf("\n\n")                               ;
    printf("   Fecha:  %s ",date())              ;
    printf("\n\n")                               ;
    printf("     Dia:  %s ",nameday())           ;
    printf("\n\n")                               ;
    printf("     Mes:  %s ",namemonth())         ;
    printf("\n\n")                               ;
    printf("   Fecha:  %s ",largedate())         ;
    printf("\n\n")                               ;
    printf("    Hora:  %s ",times())             ;
    printf("\n\n")                               ;
    printf("    Hora:  %s ",shorttime())         ;
    printf("\n\n")                               ;
    printf("    Hora:  %s ",hours())             ;
    printf("\n\n")                               ;
    printf("  Minuto:  %s ",minutes())           ;
    printf("\n\n")                               ;
    printf(" Segundo:  %s ",seconds())           ;
    printf("\n\n")                               ;
    printf(" Ahora  :  %s ",ahora())             ;
    printf("\n\n")                               ;
    printf("Ejercicio con resultados Numericos") ;
    printf("\n\n")                               ;
    printf("              Dia: %i ", nday())     ;
    printf("\n\n")                               ;
    printf("              Mes: %i ", nmonth())   ;
    printf("\n\n")                               ;
    printf("             Anio: %i ", nyear() )   ;
    printf("\n\n")                               ;
    printf(" Dia de la Semana: %i ", nweekday()) ;
    printf("\n\n")                               ;
    printf("             Hora: %i ", nhours())   ;
    printf("\n\n")                               ;
    printf("          Minutos: %i ", nminutes()) ;
    printf("\n\n")                               ;
    printf("         Segundos: %i ", nseconds()) ;
    printf("\n\n")                               ;
    system("pause");
    return 0;
}
