

public class Main {
    public static void main(String[] args) {

        int[] notas = {7, 4, 6, 8, 10};

        int soma =0;
        for (int i = 0; i < notas.length; i++) {
             soma += notas[i];
           //  int media = soma / notas.length;
            System.out.println(soma );
        }
    }
}