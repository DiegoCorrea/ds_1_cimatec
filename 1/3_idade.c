#include <stdio.h>

int main(){
	int idade, maior_de_idade = 18;

	printf("Qual é a idade? ");
	scanf("%d", &idade);

	if (idade >= maior_de_idade){
		printf("Maior de idade\n");
	} else {
		printf("Menor de idade\n");
	}
	
	return 0;
}