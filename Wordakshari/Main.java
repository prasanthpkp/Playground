#include<stdio.h>
#include<string.h>
int main()
{
    char a[10],b='\0',c[10]="####";
    do
    {
        scanf("%s",a);
        if(a[0]==b || b=='\0')
            printf("%s\n",a);
        b=a[strlen(a)-1];
    }
    while(strcmp(a,c)!=0);
    return 0;
}