import java.util.Scanner;

public class Question19 {
    /*Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
números são divisíveis por 2, quantos são divisíveis por 3 e quantos são divisíveis por 5. O
programa deve parar de ler quando o usuário digitar o número 0 utilizando o while. */
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int num2 = 0;
        int num3 = 0;
        int num5 = 0;
        while (true) {
            int d = s.nextInt();
            if (d == 0) {
                break;
            }
            if (d % 2 == 0) {
                num2++;
            }
            else if (d % 3 == 0) {
                num3++;
            }
            else if (d % 5 == 0) {
                num5++;
            }
            
        }
        System.out.println("Números divisíveis por 2: "+num2);
        System.out.println("Números divisíveis por 3: "+num3);
        System.out.println("Números divisíveis por 5: "+num5);
    }
}
