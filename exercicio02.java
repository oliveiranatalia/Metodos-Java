//Faça um programa que receba sete números e imprima o menor número (suponha números diferentes)
// entre eles.  Obs: use vetores para a resolução do exercício
import java.util.Arrays;
import java.util.Scanner;
public class exercicio02 {
    public static void main(String[] args) {
        System.out.println("\n----------------------------\n");
        output();
    }

    public static void output() {
        Scanner leitor = new Scanner(System.in);
        int lista[] = new int[7];
        for(int i = 0; i < lista.length; i++) {
            System.out.println("Insira o " + (i + 1) + "° número: ");
            lista[i] = leitor.nextInt();
        }
        Arrays.sort(lista);
        int menor = lista[0];
        System.out.println("O menor valor inserido foi: "+menor);
    }
}
