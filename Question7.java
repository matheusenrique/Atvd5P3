import java.util.Scanner;
public class Question7 {
    /*Faça um programa que leia um número inteiro e exiba o número invertido. Por exemplo, se o
número lido for 123, o programa deve exibir 321. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int num = s.nextInt();
        int inverterNum = 0;
        while (num != 0) {
            int d = num % 10;
            inverterNum = inverterNum * 10 + d;
            num /= 10;
        }
        System.out.println(inverterNum);
        
    }
}
