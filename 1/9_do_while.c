#include <stdio.h>

int main() {
	int contador = 10;

	do {
		printf("%d\n", contador);
		contador = contador - 1;
	} while(contador > 0);

	return 0;
}