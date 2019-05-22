#include <stdio.h>

int main(){
	float graus;

	printf("Qual a temperatura: ");
	scanf("%f", &graus);

	if (graus >= 50) {
		printf("Quente demais!\n");
	} else if (graus >= 40 && graus < 50){
		printf("Preciso de uma praia!\n");
	} else if (graus >= 30 && graus < 40){
		printf("Liga o ventilador, me leva pro ar condicionado!\n");
	} else if (graus >= 20 && graus < 30){
		printf("Ambiente agradável, mas as vezes faz calor!\n");
	} else if (graus >= 10 && graus < 20){
		printf("Bom mas as vezes faz frio\n");
	} else if (graus >= 0 && graus < 10){
		printf("Tá frio, me da cobertor!\n");
	} else {
		printf("Picolé humano!\n");
	}

	return 0;
}