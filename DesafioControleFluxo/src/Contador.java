import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int numUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int numDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(numUm, numDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(" O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int numUm, int numDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(numUm > numDois){
            throw new ParametrosInvalidosException();
        }
            int cont = numDois - numUm;		
		//realizar o for para imprimir os números com base na variável contagem
        for(int i=0; i<=cont;i++){
           System.out.println("Imprimindo o número " + i); 
        }
	}
}
// Definição da exceção personalizada
class ParametrosInvalidosException extends Exception {
}