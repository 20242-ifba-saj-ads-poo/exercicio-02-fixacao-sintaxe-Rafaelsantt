public class Questao3 {
    public static void main(String[] args) throws Exception {
        for(int i = 1; i <= 100; i++) {
            int resto = i % 3;
            if(resto == 0) {
                System.out.println(i);
            }
        }
    }
}
