import java.util.Scanner;;
public class Question2 {
    /*Faça um programa que exiba a soma dos dígitos de um número inteiro fornecido pelo usuário. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int soma = s.nextInt();
        while (soma != 0) {
            int digitos = soma % 10;
            System.out.println(digitos);
        }
        s.close();

    }
}
