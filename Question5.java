import java.util.Scanner;
public class Question5 {
    /*Faça um programa que exiba os números de 1 a 100, substituindo os múltiplos de 3 pela palavra
"Fizz" e os múltiplos de 5 pela palavra "Buzz". Para os números que são múltiplos de ambos,
utilize a palavra "FizzBuzz". */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(i);
            }

        }
    }
}
