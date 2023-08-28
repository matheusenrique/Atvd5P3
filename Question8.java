public class Question8 {
    public static void main(String[] args) {
        // Elabore um programa que calcule a soma dos números de 1 a 100 utilizando o while.
        int soma = 0;
        int num = 1;
        while (num <= 100) {
            soma += num;
            num++;
        }
        System.out.println("Soma: " + soma);
    }
}
