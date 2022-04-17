//Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
// No final, informar o nome do aluno e a sua média. Obs: use vetores para a resolução do exercício
import java.util.Scanner;
public class exercicio04 {
    public static void main(String[] args) {
        System.out.println("\n---------------------------------------------\n         Calcule a sua média final      \n---------------------------------------------\n");
        dadosInseridos();
    }

    public static void dadosInseridos() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o seu nome: ");
        String nome = leitor.nextLine();
        int lista[] = new int[4];
        int soma = 0;
        for(int i = 0; i < lista.length; i++) {
            System.out.println("Insira a sua " + (i + 1) + "ª nota: ");
            lista[i] = leitor.nextInt();
            soma = soma + lista[i];
        }
        int media = soma / 4;
        System.out.println(nome+", sua nota média é: "+media+".");
    }
}
