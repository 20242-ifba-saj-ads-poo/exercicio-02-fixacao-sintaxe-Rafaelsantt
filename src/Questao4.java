//Imprima todos os números de 150 a 300.

public class Questao4 {
    public static int fat(int n){
        if(n == 0 || n == 1){
            return 1;
        }else {
            return n * fat(n-1);
        }
    }
    public static void main(String[] args) throws Exception {
        int numero = 10;
        System.out.println("O fatorial de" + numero + "é:" + fat(numero));
    }
}
