/* Faça um algoritmo que contenha uma função que calcule o IMC de um usuário a partir 
da inserção do seu peso e de sua altura. Exiba a classificação do usuário após a 
verificação do seu IMC.  */
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        imc();
    }
    public static void imc(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o seu peso: ");
        double peso = leitor.nextDouble();
        System.out.println("Insira a sua altura: ");
        double altura = leitor.nextDouble();
        double calculo = peso / (altura * altura);

        if(calculo < 18.5){
            System.out.println("Sua Classificação é: Magreza");
        }else if(calculo > 18.5 & calculo <= 24.9){
            System.out.println("Sua Classificação é: Normal");
        }if(calculo >= 25.0 & calculo <= 29.9){
            System.out.println("Sua Classificação é: Sobrepeso I");
        }else if(calculo >= 30.0 & calculo <= 39.9){
            System.out.println("Sua Classificação é: Obesidade II");
        }else if(calculo >= 40.0 ){
            System.out.println("Sua Classificação é: Obesidade Grave III");
        }
    }
}