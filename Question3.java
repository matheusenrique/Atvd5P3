import java.util.Scanner;
public class Question3 {
    /*3. Elabore um programa que leia um número inteiro e exiba todos os seus divisores. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int inteiro = s.nextInt();
        for (int i = 0; i >= inteiro; i++) {
            if(inteiro % i == 0){
                System.out.println(i);
            }

        }
        s.close();
    }
}
