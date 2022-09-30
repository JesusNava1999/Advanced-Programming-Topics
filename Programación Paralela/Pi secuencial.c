#include <stdio.h>
double pi(int n, int x, int y){
	return n<=1 ? 1 : x+(y*y)/pi(n-1,x+2,y+1);
}
int main(){
	int x=1, y=1, n=20;
	double p=4;
	//printf("Numero de iteraciones: ");
	//scanf("%i",&n);
	for (int i = 1; i<=n; i++){
		printf("\nPi en %i iteracion.- %.20lf",i,(p/pi(i,x,y)));
	}
	return 0;
}
