#include <stdio.h>

int main(){
	float graus;

	printf("Qual a temperatura: ");
	scanf("%f", &graus);
	switch(int (graus/10)) {
		case 0:
			printf("Tá frio, me da cobertor!\n");
		break;
		case 1:
			printf("Bom mas as vezes faz frio\n");
		break;
		case 2:
			printf("Ambiente agradável, mas as vezes faz calor!\n");
		break;
		case 3:
			printf("Liga o ventilador, me leva pro ar condicionado!\n");
		break;
		case 4:
			printf("Preciso de uma praia!\n");
		break;
		case 5:
			printf("Quente demais!\n");
		break;
		case 6 ... 10:
			printf("Extinção!\n");
		break;
		default:
			printf("Picolé humano!\n");
	}

	return 0;
}