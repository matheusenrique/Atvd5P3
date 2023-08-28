import java.util.Scanner;
public class Question6 {
    //Elabore um programa que leia um número inteiro e exiba a soma dos dígitos pares desse número.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numInt = s.nextInt();
        int somaInt = 0;
        while (numInt > 0) {
            int soma = numInt % 10;
            if (soma % 2 == 0) {
                somaInt += soma;
            }
            numInt /= 10;
        } 
        System.out.println("Soma dos digitos pares: "+ somaInt);
    }
}
