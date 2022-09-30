#include <stdio.h>
long fibo(int n, int x, int y){
	if(n>=1){
		return fibo(n-1,y,x+y);
	}
}
int main(){
	int n=40, x=0, y=1 ,c=0;
	//printf("Numero de Iteraciones: ");
	//scanf("%i",&n);
	for(int i = 1; i<=n; i++){		
		printf("El numero %i de la sucesion es: %li\n",i,fibo(i-1,x,y));
	}
	return 0;
}
