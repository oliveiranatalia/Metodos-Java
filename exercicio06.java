//Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em dólar.
// O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.
import java.util.Scanner;
public class exercicio06 {
    public static void main(String[] args) {
        System.out.println("\n---------------------------------------------\n    Faça a conversão de dólar para real  \n---------------------------------------------\n");
        conversor();
    }
    public static void conversor(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o valor da cotação atual: ");
        double cotacao = leitor.nextDouble();
        System.out.print("Insira o valor a ser covertido: ");
        double dolar = leitor.nextDouble();
        double resultado = dolar * cotacao;
        System.out.println("O valor equivale a "+resultado+" reais.");

    }
}
