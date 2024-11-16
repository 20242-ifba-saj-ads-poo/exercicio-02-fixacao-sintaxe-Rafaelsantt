//Imprima todos os números de 150 a 300.

public class Questao6 {
    public static void main(String[] args) throws Exception {
        long fatorial = 1;

        for (int n = 1; n <= 40; n++) {
            fatorial *= n;
            System.out.println("Fatorial de " + n + " é: " + fatorial);
        }
    }
}
