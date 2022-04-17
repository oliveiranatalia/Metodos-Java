//Escreva um programa que receba 2 num e ao final mostre a soma, subtração, multiplicação e a divisão dos números
//use ao menos um método além do principal
import java.util.Scanner;
public class exercicio01 {
    public static void main(String[] args) {
        System.out.println("\n----------------------------\n        calculadora     \n----------------------------\n");
        input();
    }

    public static void input() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        double num1 = leitor.nextDouble();
        System.out.println("Insira o segundo número: ");
        double num2 = leitor.nextDouble();

        soma((int) num1, (int) num2);
        sub((int) num1, (int) num2);
        mult((int) num1, (int) num2);
        div((int) num1, (int) num2);
    }


    public static int soma(int num1, int num2) {
        int soma = num1 + num2;
        System.out.println("A soma dos números é igual a: "+soma);
        return soma;
    }
    public static int sub(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println("A subtração dos números é igual a: "+sub);
        return sub;
    }
    public static int mult(int num1, int num2){
        int mult = num1 * num2;
        System.out.println("A multiplicação dos números é igual a: "+mult);
        return mult;
    }
    public static int div(int num1, int num2) {
        int div = num1 / num2;
        System.out.println("A divisão dos números é igual a: "+div);
        return div;
    }
}
