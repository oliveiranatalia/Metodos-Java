/* Faça um algoritmo que contenha um método que receba um número do usuário e realize a 
somatório de todos os números no intervalo de 1 até o número digitado pelo usuário. 
Exiba o resultado final da somatória. */

import java.util.Scanner;
public class exercicio1 {
    public static int numero(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n ** somatória ** ");
        System.out.println("\n Digite um número: ");
        int numDigitado = leitor.nextInt();
        int resultado = 0;
        for(int i = 0; i < numDigitado; i++){
            resultado = resultado + numDigitado;
        }
        return resultado;
    }
    public static void main(String[] args){  
        System.out.println("A soma de todos os números até o que você digitou é: "+numero());
    }
}
