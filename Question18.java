import java.util.Scanner;

public class Question18 {
    /*Crie um programa que leia uma sequência de números inteiros do usuário e exiba quantos
números pares e quantos números ímpares foram digitados. O programa deve parar de ler quando
o usuário digitar o número 0 utilizando o while. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numPares = 0;
        int numImpares = 0;
        while (true) {
            int d = s.nextInt();
            if(d % 2 == 0) {
                numPares++;
            }
            else {
                numImpares++;
            }
            if (d == 0) {
                break;
            }
        }
        System.out.println("Números pares: "+numPares +", Números ímpares: "+numImpares);
    }
}
