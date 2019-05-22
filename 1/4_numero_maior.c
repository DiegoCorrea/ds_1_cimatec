#include <stdio.h>

int main(){
	int primeiro_numero, segundo_numero;

	printf("Escreve o primeiro numero: ");
	scanf("%d", &primeiro_numero);

	printf("Escreve o segundo numero: ");
	scanf("%d", &segundo_numero);

	if (primeiro_numero > segundo_numero) {
		printf("O primeiro número é maior que o segundo: %d > %d\n", primeiro_numero, segundo_numero);
	} else {
		printf("O segundo número é maior que o primeiro: %d < %d\n", primeiro_numero, segundo_numero);
	}

	return 0;
}