#include<stdio.h>
int main()
{
int i,j,n,a[50],frame[10],no,k,avail,count=0;
    printf("\n Enter number of pages : ");
	scanf("%d",&n);
    for(i=1;i<=n;i++){
	printf("Enter page number(%d) : ",i);
    scanf("%d",&a[i]);
	}
    printf("\n Enter number of frames :");
	scanf("%d",&no);
	printf("\n");
for(i=0;i<no;i++)
    frame[i]= -1;
	j=0;
	printf("ref string\t     page frames\t\tPage Hit\\fault\n");
for(i=1;i<=n;i++){
	printf("%5d\t\t",a[i]);
	avail=0;
	for(k=0;k<no;k++)
if(frame[k]==a[i])
	avail=1;
    if (avail==0){
		frame[j]=a[i];
        j=(j+1)%no;
        count++;
	}
    for(k=0;k<no;k++){
    	if(frame[k] == -1)
    	printf(" \t");
    	else
	    printf("%d\t",frame[k]);
	}
	printf("%s",avail==1 ? "Page Hit" : "Page Fault");
	printf("\n");
}

    printf("Page Fault : %d\n",count);
    printf("Page Hit : %d\n",n-count);
    printf("Page fault ratio : %.02f%%\n",count/(float)n * 100);
    printf("Page Hit ratio   : %.02f%%\%\n",(n-count)/(float)n * 100);
    return 0;
}
