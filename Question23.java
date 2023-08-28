import java.util.Scanner;

public class Question23 {
    /*Elabore um programa que leia uma sequência de números inteiros do usuário e exiba o menor
valor digitado que seja positivo e ímpar. O programa deve parar de ler quando o usuário digitar o
número 0 utilizando o while. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        int valor = 100000;
        int d;
        while (true) {
            d = s.nextInt();
            if(d == 0) {
                break;
            }
            if(d > 0 && d % 2 != 0) {
                if (d < valor) {
                    valor = d;
                }
            }
        }
        System.out.println("Menor valor digitado positivo e ímpar: "+valor);
    }
}
