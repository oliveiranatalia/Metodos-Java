//Faça um algoritmo que contenha uma função para ler as dimensões de um retângulo (base e altura)
// calcular e imprimir para o usuário a área do retângulo;

import java.util.Scanner;
public class exercicio4 {

    public static void main(String[] args) {
        System.out.println("\n----------------------------\n   área de um retângulo       \n----------------------------\n");
        calculo();
    }

    public static void calculo() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira a base: ");
        double b = leitor.nextDouble();
        System.out.println("Insira a altura");
        double h = leitor.nextDouble();
        double a = b * h;
        System.out.println("A área é: "+a);
    }
}