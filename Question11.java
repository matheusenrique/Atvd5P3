import java.util.Scanner;
public class Question11 {
    /*Crie um programa que leia uma sequência de números inteiros do usuário e exiba o maior e o
menor valor digitado. O programa deve parar de ler quando o usuário digitar o número 0
utilizando o while. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int digitoMaior = 1;
        int digitoMenor = 1000000;
        while (true) {
            int num = s.nextInt();
            if (num==0){
                System.out.println("Fim do programa.");
                break;
            }
            if (num < digitoMenor) {
                digitoMenor = num;
            }
            if (num > digitoMaior) {
                digitoMaior = num;
            }
            System.out.println("Maior: "+digitoMaior);
            System.out.println("Menor: "+digitoMenor);

        }
        
    }
}
