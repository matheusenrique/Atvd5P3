import java.util.Scanner;

public class Question21 {
    /*Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
números possuem mais de três dígitos. O programa deve parar de ler quando o usuário digitar o
número 0 utilizando o while. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int contador = 0;
        while (true) {
            int n = s.nextInt();
            if (n == 0) {
                System.out.println("Fim.");
                break;
            } else {
                int numDigitos = 0;
                int numero = n;
                while (numero > 0) {
                    numero = numero / 10;
                    numDigitos++;
                }
                if (numDigitos > 3) {
                    contador++;
                }

    }
}
}
}
