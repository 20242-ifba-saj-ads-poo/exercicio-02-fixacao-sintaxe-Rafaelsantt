public class Questao5 {
    public static void main(String[] args) throws Exception {
        long fatorial = 1;

        for (int n = 1; n <= 40; n++) {
            fatorial *= n;
            System.out.println("Fatorial de " + n + " é: " + fatorial);
        }
    }
}
