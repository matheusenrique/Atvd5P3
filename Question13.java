import java.util.Scanner;

public class Question13 {
    /*Faça um programa que leia um número inteiro e exiba a soma dos seus dígitos elevados ao cubo
utilizando o while. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int soma = 0;
        while (num > 0) {
            int d = num % 10;
            soma = soma + (d*d*d);
            num = num/10;
        }
        System.out.println(soma);
    }
}
