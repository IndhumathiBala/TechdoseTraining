#include <stdio.h>
int main()
{
    int n,ind;
    scanf("%d",&n);
    int fact[n/2+1];
    for(int i=1;i*i<=n;i++)
    {
        if(n%i==0)
        {
            fact[ind++]=i;
            if(i*i!=n)
            fact[ind++]=n/i;
        }
    }
    for(int i=0;i<ind;i++)
    {
        printf("%d ",fact[i]);
    }
    return 0;
}
