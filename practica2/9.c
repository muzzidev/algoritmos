#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

int main(void){
    printf("%d", suma_random());
    return 0;
}

int suma_random(){
    srand(time(NULL));
    int rdm1 = (rand() % 5) + 1;
    int rdm2 = (rand() % 5) + 1;
    printf("La suma entre %i y %i es: ", rdm1, rdm2);
    return rdm1 + rdm2;
}