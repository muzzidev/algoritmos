/* Escribir un programa que imprima la suma de dos enteros aleatorios entre 1 y 6 como si estuvieras tirando dos
dados. */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

int suma_random(){
    srand(time(NULL));
    int rdm1 = (rand() % 6) + 1;
    int rdm2 = (rand() % 6) + 1;
    printf("La suma entre %i y %i es: ", rdm1, rdm2);
    return rdm1 + rdm2;
}

int main(void){
    printf("%d\n", suma_random());
    return 0;
}
