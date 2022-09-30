#include <stdio.h>
#ifdef _OPENMP
	#include <omp.h>
	#define TRUE 1
	#define FALSE 0
#else
	#define omp_get_thread_num() 0
	#define omp_get_num_threads() 1
#endif
int tid, nthr=3;
double pi(int n, int x, int y){
	return n<=1 ? 1 : x+(y*y)/pi(n-1,x+2,y+1);
}
long fibo(int n, int x, int y){
	if(n>=1){
		return fibo(n-1,y,x+y);
	}
}
int es_primo(num){
	int j, primo;
	for (j=1; j<primo; j++){
		if((num %j )==0 && num != j && j != 1)
		return 0;
	}
	return 1;
};
int main(){
	#pragma omp parallel private(tid)
	{	
		if(tid==0){
			printf("\n\n--PI--\n");
			int x=1, y=1, n=20;
			double p=4;
				for (int i = 1; i<=n; i++){
				printf("\nPi en %i iteracion.- %.20lf",i,(p/pi(i,x,y)));
			}
		}
	}
	#pragma omp parallel private(tid)
	{
		if(tid==0){
			printf("\n\n--FIBONACCI--\n");
			int n=40, x=0, y=1 ,c=0;		
			for(int i = 1; i<=n; i++){		
				printf("El numero %i de la sucesion es: %li\n",i,fibo(i-1,x,y));
			}
		}
	}
	#pragma omp parallel private(tid)
	{
		if(tid==0){
			printf("\n\n--PRIMOS--\n");
			int i, num;
			num = 1000;
			printf("Son numeros primos: ");			
			for (i=1; i<=num; i++)
			{
				if(es_primo(i))
					printf("%d	",i);
			}
			printf("\n");
		}
	}
	return 0;
}
