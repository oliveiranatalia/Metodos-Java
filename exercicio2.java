/*Faça um algoritmo que contenha uma função que receba o nome de um
usuário e retorne a mensagem Meu nome é <NomeDigitado>.*/ 
import java.util.Scanner;
public class exercicio2 {
   
    public static void main(String[] args){
        nome();
    }
    public static void nome(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n\nDigite o seu nome: ");
        String nomeInserido = leitor.nextLine();
        System.out.println("Meu nome é "+nomeInserido);
    }
}
