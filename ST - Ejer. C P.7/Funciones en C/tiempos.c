/* tiempos.c - Funciones para fechas y horas
   -----------------------------------------

Lista de funciones:

now()
--> devuelve una cadena con la fecha y hora en el siguiente formato:

ddd mmm nd hh:mm:ss aaaa

donde
'ddd' es el nombre de día en inglés abreviado a 3 caracteres
'mmm' es el nombre de mes en inglés abreviado a 3 caracteres
'nd' es el número de día en dos caracteres
'hh' el número de horas en dos caracteres
'mm' el número de minutos en dos caracteres
'ss' el número de segundos en dos caracteres
'aaaa' es el número de año en cuatro caracteres

*/

#include <string.h>
#include <time.h>





static char tiemporet[25],ndc[10];


char *now()
	{
	long comienzo;
	comienzo = time( NULL );
	strcpy(tiemporet,ctime(&comienzo));
  	return tiemporet;
	}

char *day()
	{strcpy(tiemporet,mid(now(),8,2));
	return tiemporet;
	}

char *month(){
	char nd[4];
	strcpy(nd,mid(now(),4,3));
	if(strcmp(nd,"Jan")==0){
		strcpy(ndc,"01");
	}else{
		if(strcmp(nd,"Feb")==0){
			strcpy(ndc,"02");
		}else{
			if(strcmp(nd,"Mar")==0){
				strcpy(ndc,"03");
			}else{
				if(strcmp(nd,"Apr")==0){
					strcpy(ndc,"04");
				}else{
					if(strcmp(nd,"May")==0){
						strcpy(ndc,"05");
					}else{
						if(strcmp(nd,"Jun")==0){
							strcpy(ndc,"06");
						}else{
						    if(strcmp(nd,"Jul")==0){
                                strcpy(ndc,"07");
                                }else{
                                    if(strcmp(nd,"Aug")==0){
                                        strcpy(ndc,"08");
                                    }else{
                                        if(strcmp(nd,"Sep")==0){
                                            strcpy(ndc,"09");
                                        }else{
                                            if(strcmp(nd,"Oct")==0){
                                                strcpy(ndc,"10");
                                            }else{
                                                if(strcmp(nd,"Nov")==0){
                                                    strcpy(ndc,"11");
                                                }else{
                                                    strcpy(ndc,"12");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
	return ndc;
}

char *year()
	{strcpy(tiemporet,mid(now(),20,4));
	return tiemporet;
}

char *date(){
    char *fec[30];

    strcpy(fec, day());
    strcat(fec,"-");
    strcat(fec, month());
    strcat(fec,"-");
    strcat(fec, year());

    return &fec;
}

char *nameday(){
	char nd[4];
	strcpy(nd,left(now(),3));
	if(strcmp(nd,"Mon")==0){
		strcpy(ndc,"Lunes");
	}else{
		if(strcmp(nd,"Tue")==0){
			strcpy(ndc,"Martes");
		}else{
			if(strcmp(nd,"Wed")==0){
				strcpy(ndc,"Miercoles");
			}else{
				if(strcmp(nd,"Thu")==0){
					strcpy(ndc,"Jueves");
				}else{
					if(strcmp(nd,"Fri")==0){
						strcpy(ndc,"Viernes");
					}else{
						if(strcmp(nd,"Sat")==0){
							strcpy(ndc,"Sabado");
						}else{
							strcpy(ndc,"Domingo");
						}
					}
				}
			}
		}
	}
	return ndc;
}

char *namemonth(){
	char nd[4];
	strcpy(nd,mid(now(),4,3));
	if(strcmp(nd,"Jan")==0){
		strcpy(ndc,"Enero");
	}else{
		if(strcmp(nd,"Feb")==0){
			strcpy(ndc,"Febrero");
		}else{
			if(strcmp(nd,"Mar")==0){
				strcpy(ndc,"Marzo");
			}else{
				if(strcmp(nd,"Apr")==0){
					strcpy(ndc,"Abril");
				}else{
					if(strcmp(nd,"May")==0){
						strcpy(ndc,"Mayo");
					}else{
						if(strcmp(nd,"Jun")==0){
							strcpy(ndc,"Junio");
						}else{
						    if(strcmp(nd,"Jul")==0){
                                strcpy(ndc,"Julio");
                                }else{
                                    if(strcmp(nd,"Aug")==0){
                                        strcpy(ndc,"Agosto");
                                    }else{
                                        if(strcmp(nd,"Sep")==0){
                                            strcpy(ndc,"Septiembre");
                                        }else{
                                            if(strcmp(nd,"Oct")==0){
                                                strcpy(ndc,"Octubre");
                                            }else{
                                                if(strcmp(nd,"Nov")==0){
                                                    strcpy(ndc,"Noviembre");
                                                }else{
                                                    strcpy(ndc,"Diciembre");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
	return ndc;
}


char *largedate(){
    char *dat[50];
    strcpy(dat, nameday());
    strcat(dat," ");
    strcat(dat, day());
    strcat(dat," de ");
    strcat(dat, namemonth());
    strcat(dat," de ");
    strcat(dat, year());
    strcat(dat," ");
    return &dat;

}

char *times()
	{
	char *tim[30];
    strcpy(tim,mid(now(),11,8));
	return &tim;
}

char *shorttime()
	{
	char *sho[30];
    strcpy(sho,mid(now(),11,5));
	return &sho;
}

char *hours()
	{
	char *hor[5];
    strcpy(hor,mid(now(),11,2));
	return &hor;
}

char *minutes()
	{
	char *min[5];
    strcpy(min,mid(now(),14,2));
	return &min;
}

char *seconds()
	{
	char *sec[5];
    strcpy(sec,mid(now(),17,2));
	return &sec;
}


char *ahora(){
    char *aho[50];
    strcpy(aho,day());
    strcat(aho," de ");
    strcat(aho,namemonth());
    strcat(aho," de ");
    strcat(aho,year());
    strcat(aho," , ");
    strcat(aho,shorttime());
    return &aho;
}

int *nday(){
    char ndia[3];
    strcpy(ndia,day());
    int var1;
	var1=atoi(ndia);
	return var1;
}

char *nmonth(){
	char nd[4];
	strcpy(nd,mid(now(),4,3));
	if(strcmp(nd,"Jan")==0){
		strcpy(ndc,"01");
	}else{
		if(strcmp(nd,"Feb")==0){
			strcpy(ndc,"02");
		}else{
			if(strcmp(nd,"Mar")==0){
				strcpy(ndc,"03");
			}else{
				if(strcmp(nd,"Apr")==0){
					strcpy(ndc,"04");
				}else{
					if(strcmp(nd,"May")==0){
						strcpy(ndc,"05");
					}else{
						if(strcmp(nd,"Jun")==0){
							strcpy(ndc,"06");
						}else{
						    if(strcmp(nd,"Jul")==0){
                                strcpy(ndc,"07");
                                }else{
                                    if(strcmp(nd,"Aug")==0){
                                        strcpy(ndc,"08");
                                    }else{
                                        if(strcmp(nd,"Sep")==0){
                                            strcpy(ndc,"09");
                                        }else{
                                            if(strcmp(nd,"Oct")==0){
                                                strcpy(ndc,"10");
                                            }else{
                                                if(strcmp(nd,"Nov")==0){
                                                    strcpy(ndc,"11");
                                                }else{
                                                    strcpy(ndc,"12");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
	int var2;
	var2=atoi(ndc);
	return var2;
}

int *nyear(){
    char anio[30];
    strcpy(anio,year());
    int var3;
	var3=atoi(anio);
	return var3;
}

char *nweekday(){
	char nd[4];
	strcpy(nd,left(now(),3));
	if(strcmp(nd,"Mon")==0){
		strcpy(ndc,"1");
	}else{
		if(strcmp(nd,"Tue")==0){
			strcpy(ndc,"2");
		}else{
			if(strcmp(nd,"Wed")==0){
				strcpy(ndc,"3");
			}else{
				if(strcmp(nd,"Thu")==0){
					strcpy(ndc,"4");
				}else{
					if(strcmp(nd,"Fri")==0){
						strcpy(ndc,"5");
					}else{
						if(strcmp(nd,"Sat")==0){
							strcpy(ndc,"6");
						}else{
							strcpy(ndc,"7");
						}
					}
				}
			}
		}
	}
	int var4;
	var4=atoi(ndc);
	return var4;
}

int *nhours(){
	char *hor[5];
    strcpy(hor,hours());
	int var5;
	var5=atoi(hor);
	return var5;
}

int *nminutes(){
	char *min[5];
    strcpy(min,minutes());
	int var6;
	var6=atoi(min);
	return var6;
}

int *nseconds(){
	char *sec[5];
    strcpy(sec,seconds());
	int var7;
	var7=atoi(sec);
	return var7;
}
