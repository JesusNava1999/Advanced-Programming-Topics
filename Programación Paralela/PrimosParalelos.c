#include<stdio.h>
#include<stdlib.h>
#include<omp.h>
int es_primo(num){
	int j, primo;
	for (j=1; j<primo; j++){
		if((num %j )==0 && num != j && j != 1)
		return 0;
	}
	return 1;
};
int main(){
	int i, num;
	num = 1000;
	printf("Son numeros primos: ");
	#pragma omp parallel for
	for (i=1; i<=num; i++)
	{
		if(es_primo(i))
			printf("%d	",i);
	}
	printf("\n");
	return 0;
}
