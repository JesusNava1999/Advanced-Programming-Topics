#include <ctime>
#include <cstdlib>
#include "windows.h"
//-----------------//
#include <omp.h>
#include <stdio.h>
int main(){
	srand((unsigned)time(NULL));
	#pragma omp parallel
	{
		printf("%i, Proceso 1\n",5+rand());
		Sleep(1);
		printf("%i, Proceso 2\n\n",10+rand());				
	}
	return 0;
}
