import java.util.Scanner;

public class Question12 {
    /*Crie um programa que leia uma sequência de números inteiros do usuário e exiba a média dos
números digitados. O programa deve parar de ler quando o usuário digitar o número -1 utilizando
o while. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int digitoMaior = 1;
        int digitoMenor = 1000000;
        while (true) {
            int num = s.nextInt();
            if (num == -1){
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
