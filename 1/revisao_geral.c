#include <stdio.h>
#include <stdlib.h>

int add(int a, int b){
	return a + b;
}

int sub(int a, int b){
	return a - b;
}

int mult(int a, int b){
	return a * b;
}

int divisao(int a, int b){
	return a / b;
}

void com_scanf(){
	int primeiro_numero, segundo_numero, resultado;
	char sinal;

	printf("\nDigite o primeiro valor: ");
	scanf("%d", &primeiro_numero);
	printf("\nDigite o segundo valor: ");
	scanf(" %d", &segundo_numero);
	printf("\nDigite o sinal: ");
	scanf(" %c", &sinal);
	
	switch(sinal) {
		case '+':
			resultado = add(primeiro_numero, segundo_numero);
		break;
		case '-':
			resultado = sub(primeiro_numero, segundo_numero);
		break;
		case '*':
			resultado = mult(primeiro_numero, segundo_numero);
		break;
		case '/':
			resultado = divisao(primeiro_numero, segundo_numero);
		break;
		default:
			printf("Operação não reconhecida!\n");
			exit(0);
	}
	printf("O resultado é: %d\n", resultado);
}

void com_getchar(){
	int primeiro_numero, segundo_numero, resultado;
	char sinal;

	printf("\nDigite o primeiro valor: ");
	scanf(" %d", &primeiro_numero);
	printf("\nDigite o segundo valor: ");
	scanf(" %d", &segundo_numero);
	getchar();
	printf("\nDigite o sinal: ");
	sinal = getchar();
	
	switch(sinal) {
		case '+':
			resultado = add(primeiro_numero, segundo_numero);
		break;
		case '-':
			resultado = sub(primeiro_numero, segundo_numero);
		break;
		case '*':
			resultado = mult(primeiro_numero, segundo_numero);
		break;
		case '/':
			resultado = divisao(primeiro_numero, segundo_numero);
		break;
		default:
			printf("Operação não reconhecida!\n");
			exit(0);
	}
	printf("O resultado é: %d\n", resultado);
}

int main(){
	int metodo;
	char sair;

	 while(sair != 's'){
		printf("\nA forma de ler do teclado");
		printf("\n1 - scanf");
		printf("\n2 - fgets");
		printf("\n3 - getchar\n");
		printf("\nEscolha: ");
		scanf("%d", &metodo);
		
		switch(metodo) {
			case 1:
				com_scanf();
			break;
			case 2:
				printf("2\n");
			break;
			case 3:
				com_getchar();
			break;
			default:
				printf("Operação não reconhecida!\n");
				exit(0);
		}
		printf("\nDeseja sair? (s ou n): ");
		scanf(" %c", &sair);
		printf("\n%c\n", sair);
	}

	return 0;
}
