#include <stdio.h>
#include <stdlib.h>
#include <omp.h>
void fac(int factorial,int acum){
	for (int j = factorial; j > 1; j--){
		acum = acum * j;			
	}
	printf(" -> %i\n",acum);			
}
int main(){
	int factorial = 0, acum = 1;
	printf("Numero de factorial a mostrar: ");
	scanf("%i",&factorial);
	#pragma omp parallel for
	for (int i = 1; i<=factorial; i++){
		acum = 1;
		printf("%i",i);
		fac(i,acum);
	}
	return 0;	
}
