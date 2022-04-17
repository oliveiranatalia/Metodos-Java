//Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por
// ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
// informar o seu nome, o salário fixo e salário no final do mês
import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {
        dados();
    }

    public static void dados(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Insira o valor do seu salário fixo: ");
        Double salario = leitor.nextDouble();
        System.out.println("Insira o valor total das vendas efetuadas no mês: ");
        Double vendas = leitor.nextDouble();
        info(nome, salario, vendas);
    }
    public static void info(String nome, double salario, double vendas) {
        double comissao = vendas * 0.15 + salario;
        System.out.println("Nome inserido: "+nome+"\nSalário inserido: "+salario+"\nValor total de vendas: "+vendas+"\nSalário com comissão: "+comissao+".");

    }
}