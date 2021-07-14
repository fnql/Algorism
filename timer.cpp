#include <time.h>

int main(void) {
	clock_t start = clock();

	clock_t end = clock();
	printf("Time: %.0lf\n", (double)(end - start) / CLOCKS_PER_SEC);
	return 0;
}