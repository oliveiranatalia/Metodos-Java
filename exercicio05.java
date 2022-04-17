//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
import java.util.Scanner;
public class exercicio05 {
    public static void main(String[] args) {
        System.out.println("\n---------------------------------------------\n     Faça a conversão para Fahrenheit   \n---------------------------------------------\n");
        conversor();
    }
    public static void conversor(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira a temperatura que quer converter: ");
        double celsius = leitor.nextDouble();
        double fahrenheit = ((9 * celsius) + 160) / 5;
        System.out.println("A temperatura equivale a "+fahrenheit+"°F");
    }
}
