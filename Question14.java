import java.util.Scanner;

public class Question14 {
    // Faça um programa que exiba os números ímpares de 1 a 100 utilizando o while.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numImpar = 0;
        while (numImpar <= 100) {
            if(numImpar % 2 != 0) {
                System.out.println(numImpar);
            }
            numImpar++;
        }
    }
}
