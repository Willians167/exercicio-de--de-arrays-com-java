

public class Main {
    public static void main(String[] args) {

        double[] notas = {7,0,9.5, 8.6, 10};

        double soma =0;
        for (int i = 0; i < notas.length; i++) {
             soma += notas[i];

            //System.out.println(soma );
        }

        double media = soma/ notas.length;

        System.out.printf("Média final: %.2f%n", media);    }
}