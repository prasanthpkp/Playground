#include<stdio.h>
#include<string.h>
int main()
{
    char a[10][20];
    int i=0,k,j;
    while(1)
    {
        scanf("%s",a[i]);
        if(!strcmp(a[i],"####"))
        break;
        i++;
    }
    printf("%s\n",a[0]);
    for(j=1;j<i;j++)
    {
        k=0;
        while(a[j-1][k++]!='\0');
            if(a[j-1][k-2]==a[j][0])
            {
                printf("%s\n",a[j]);
            }
    }
    return 0;
}