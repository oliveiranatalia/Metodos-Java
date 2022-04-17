//Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo
//receberá um acréscimo de acordo com um percentual informado pelo usuário.
import java.util.Scanner;
public class exercicio07 {
    public static void main(String[] args) {
        System.out.println("\n---------------------------------------------\n         Calcule a sua média de lucro        \n---------------------------------------------\n");

        calculo();
    }
    public static void calculo(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o preço de custo de seu produto: ");
        double custo = leitor.nextDouble();
        System.out.print("Insira o valor da sua venda do mesmo produto: ");
        double venda = leitor.nextDouble();;
        double resultado = venda - custo;
        System.out.print("O valor do seu lucro bruto é de "+resultado+" reais.");
    }
}
