import java.util.Scanner;

public class Question20 {
    /*Desenvolva um programa que leia uma sequência de números inteiros do usuário e exiba a média
dos números divisíveis por 3. O programa deve parar de ler quando o usuário digitar o número 0
utilizando o while. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int div3 = 0;
        int num = 0;
        int d;
        while (true) {
            d = s.nextInt();
             if(d == 0) {
                break;
            }
            if(d % 3 == 0) {
                div3++;
                num +=d;
            }
           
        }
        System.out.println(num/div3);
    }
}
