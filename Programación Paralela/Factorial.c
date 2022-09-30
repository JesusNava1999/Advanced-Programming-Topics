#include <stdio.h>
int main(){
	long int factorial = 0, acum = 1;
	printf("Numero de factorial a mostrar: ");
	scanf("%li",&factorial);
	for (int i = 1; i<=factorial; i++){	
	acum = 1;
	printf("%li",i);	
		for (int j = i; j > 1; j--){
			acum = acum * j;			
		}
		printf(" -> %li\n",acum);
	}
	return 0;	
}
