#include <stdio.h>
#ifdef _OPENMP
 #include <omp.h>
 #define TRUE 1
 #define FALSE 0
#else
 #define omp_get_thread_num() 0
 #define omp_get_num_threads() 1
#endif
#define N 24
int tid, nthr; // identificador del thread y numero de threads
int i, A[N];

main ()
{
// el numero de hilos se controla mediante la variable de entorno
 #pragma omp parallel private(tid)
 {
 tid = omp_get_thread_num();
 printf ("Thread %d en marcha \n", tid);
 A[tid] = tid + 10;
 printf ("El thread %d ha terminado \n", tid);
 }
 for (i=0; i<N; i++) printf ("A(%d) = %d \n", i, A[i]);
 printf("\n\n fin de la primera region paralela \n\n");
// el numero de hilos se controla mediante una funcion
 printf("\n\nIntroduce el numero de threads ---> ");
 scanf("%d",&nthr);
#ifdef _OPENMP
 omp_set_num_threads(nthr);
#endif
 #pragma omp parallel private(tid)
 {
 tid = omp_get_thread_num();
 printf ("Thread %d en marcha \n", tid);
 A[tid] = tid + 100;
 printf ("El thread %d ha terminado \n", tid);
 }
 for (i=0; i<N; i++) printf ("A(%d) = %d \n", i, A[i]);
 printf("\n\n fin de la segunda region paralela \n\n");
// el numero de hilos se controla mediante una clausula
 #pragma omp parallel private(tid) num_threads(6)
 {
 tid = omp_get_thread_num();
 printf ("Thread %d en marcha \n", tid);
 A[tid] = tid + 1000;
 printf ("El thread %d ha terminado \n", tid);
 }
 for (i=0; i<N; i++) printf ("A(%d) = %d \n", i, A[i]);
 printf("\n\n fin de la tercera region paralela \n\n");
}
