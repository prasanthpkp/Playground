#include<stdio.h>
 int main()
 {    
 	float celsius, fahrenheit;
 	scanf("%f", &celsius);
	fahrenheit = (celsius * 9 / 5) + 32;
	printf("%d\n%.2f", (int)celsius, fahrenheit);
	return 0;
 }