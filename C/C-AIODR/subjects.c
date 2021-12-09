#include <stdio.h>

int main(){
	char subname[32];
	int iq;
	float wages;

	printf("Input subject name: ");
	scanf("%s", &subname);
	printf("Input subject IQ: ");
	scanf("%d",&iq);
	printf("Input subject hourly wage: ");
	scanf("%f",&wages);

	printf("Subject\tIQ\tWage\n");
	printf("%s\t%d\t%f\n", subname, iq, wages);
	
	return(0);
}