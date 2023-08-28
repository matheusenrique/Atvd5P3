import java.util.Scanner;

public class Question16 {
    /*Crie um programa que leia 5 notas de alunos e exiba quantos deles foram aprovados (nota maior
ou igual a 7) utilizando o while. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int aprovados = 0;
        int reprovados = 0;
        int d = 0;
        while (d < 5) {
            double nota = s.nextDouble();
            if (nota < 0) {
                System.out.println("Insira uma nota válida.");
                break;
            }
            if (nota <= 7){
                aprovados++;
            }
            else {
                reprovados++;
            }
            d++;

        }
        System.out.println("Aprovados: "+aprovados+ ", Reprovados: "+ reprovados);
    }
}
