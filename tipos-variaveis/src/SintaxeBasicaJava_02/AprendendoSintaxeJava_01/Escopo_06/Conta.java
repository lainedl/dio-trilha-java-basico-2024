package SintaxeBasicaJava_02.AprendendoSintaxeJava_01.Escopo_06;
//Não consegui executar.

public class Conta {

    public static void main(String[] args) {
        
    // variavel da classe conta
    double saldo = 10.0;

    /* Método incompleto, Edi
    public void sacar(Double valor) {
        // variavel local de método
        double novoSaldo = saldo - valor;
        return novoSaldo
    }
    */
    
    /*Método incompleto, Edi
    public void imprimirSaldo() {
        // disponível em toda classe
        System.out.println(saldo);
        // somente o método sacar conhece esta variavel
        System.out.println(novoSaldo);
    }
    */    
    
    /*Método incompleto, Edi
    public double calcularDividaExponencial() {        // variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; // começando a variável com valor zero
        for (int x = 1; x <= 5; x++) {// x variável de escopo de fluxo
            // esta variável será reiniciada a cada execução for
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        // escopo de fluxo
        // x e valorCalculado nunca estarão disponíveis fora do for

        return valorMontante;
    }
    */    

    }

}
