#include <stdio.h>
#include <string.h>
 
int main()
{
   char source[1000], destination[1000];
   scanf("%[^\n]s",source);
   strcpy(destination, source);
   printf("The copied string is %s.", destination);
   return 0;
}