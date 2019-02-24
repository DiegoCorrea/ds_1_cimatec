#include <stdio.h>

int main(){
	float preco_unidade, preco_total;
	int quantidade;

	printf("Digite o preço da unidade: ");
	scanf("%f", &preco_unidade);
	printf("Digite a quantidade: ");
	scanf("%d", &quantidade);

	preco_total = preco_unidade * quantidade;
	printf("O preco total é: %f\n", preco_total);

	return 0;
}