
public class Question9 {
    // Faça um programa que calcule o produto dos números de 1 a 5 utilizando o while.
    public static void main(String[] args) {
        int produto = 1;
        int n = 1;
        while (produto <= 5) {
            produto *= n;
            n++;
        }
        System.out.println(produto);
    }
}
