import java.util.Scanner;
public class Question1 {
    /*Crie um programa que leia 5 notas de alunos e exiba quantos deles foram aprovados (nota maior
ou igual a 7). */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira as notas dos alunos: ");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Nota do aluno: ");
            double nota = s.nextDouble();
            
            if(nota >= 7){
                System.out.println("Aprovado");
            }
            else {
                System.out.println("Reprovado.");
            }
        }
        
    }
}
