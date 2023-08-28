import java.util.Scanner;

public class Question22 {
    /*Desenvolva um programa que leia uma sequência de números inteiros do usuário e exiba a média
dos números que estão entre 50 e 100. O programa deve parar de ler quando o usuário digitar o
número 0 utilizando o while. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numInteiros = 0;
        int contador = 0;
        int d;
        while (true) {
            d = s.nextInt();
            if(d == 0) {
                break;
            }
            if(d >= 50 && 100 > d) {
                contador++;
                numInteiros += d;
            }
        }
        System.out.println(numInteiros/contador);
    }
}
