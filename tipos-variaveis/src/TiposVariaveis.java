public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double salarioMinimo = 2500.33;
        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
    }
}
