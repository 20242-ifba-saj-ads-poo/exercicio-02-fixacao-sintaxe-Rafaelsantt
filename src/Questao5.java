//Imprima todos os números de 150 a 300.

public class Questao5 {
    public static void main(String[] args) throws Exception {
        int fatorial = 1;

        for (int n = 1; n <= 10; n++) {
            fatorial *= n;
            System.out.println("Fatorial de " + n + " é: " + fatorial);
        }
    }
}
