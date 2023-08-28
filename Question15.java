public class Question15 {
    /*Desenvolva um programa que exiba todos os múltiplos de 3 no intervalo de 1 a 50 utilizando o
while. */
    public static void main(String[] args) {
        int multiplo = 0;
        while (multiplo <= 50) {
            if(multiplo % 3 == 0) {
                System.out.println(multiplo);
            }
            multiplo++;    
        }
        
    }
}
