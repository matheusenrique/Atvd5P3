import java.util.Scanner;

public class Question24 {
    /*Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
números são pares e quantos números são ímpares entre o primeiro e o último número digitado.
O programa deve parar de ler quando o usuário digitar o número 0 utilizando o while. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int d;
        while (true) {
            d = s.nextInt();
            if (d == 0) {
                break;
            }
            if(d % 2 == 0){
                par++;
            }
            else {
                impar++;
            }
        }
        System.out.println("Par: "+par+", Ímpar: "+impar);
    }
}
