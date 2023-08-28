import java.util.Scanner;
public class Question4 {
    //Desenvolva um programa que calcule a média de altura de 5 pessoas.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double alturas = 0;
        System.out.println("Insira as alturas");
        for (int i = 1; i <= 5; i++) {
           System.out.println("Altura: "); 
           double h = s.nextDouble();
           alturas += h;
        }
        double media = alturas/5; 
        System.out.println("A média das alturas é: "+media);

        
        
    }
}
