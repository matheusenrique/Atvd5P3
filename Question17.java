import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        /*Elabore um programa que leia uma sequência de números inteiros do usuário e determine
quantos números pares foram digitados antes do primeiro número ímpar. O programa deve parar
de ler quando o usuário digitar o número 0 utilizando o while. */
        Scanner s = new Scanner(System.in);
        int numPares = 0;
        while (true) {
            int d = s.nextInt();
            if(d % 2 == 0) {
                numPares++;
            }
            else{
                break;
            }
        }
        System.out.println("Quantidade de números pares: "+numPares);
    }
}
