/* Escribir un programa que realice la factorización de enteros en factores primos. */
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool is_prime(int n){
    for (int i = 2; i < n; i++){
        if (n % i == 0) return false;
    }
    return true;
}
int main(int argc, char* argv[]) {
  int num = atoi(argv[1]);
    // bucle que se ejecuta mientras i sea menor a num 
    for (int i = 2; i <= num; i++){
      // si es primo y es un divisor de num lo imprime
        while(is_prime(i) && !(num % i)){
          printf("%i ", i);
          // divide num por el factor actual
          num /= i;
        }
    }
    printf("\n");
  return 0;
}
