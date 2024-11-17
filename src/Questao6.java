public class Questao6 {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 1;

        System.out.print(a + "\n");
        System.out.print(b + "\n");

        while (true) {
            int proximo = a + b;
            if (proximo > 100) {
                break;
            }
            System.out.print(proximo + "\n");
            a = b;
            b = proximo;
        }
    }
}
