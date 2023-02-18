#include <stdio.h>

int factorial(unsigned int i) {

   if(i <= 1) {
      return 1;
   }
   return i * factorial(i - 1);
}

int  main() {
   int i;
   printf("Enter Number: ");
   scanf("%d", &i);
   printf("Factorial of %d is %d\n", i, factorial(i));
   return 0;
}