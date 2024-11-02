package SintaxeBasicaJava_02.Operadores_04;

public class OperadorUnario {

    public static void main(String[] args) {//classe Operadores.java
        int numero = 5;
                
        //Imprimindo o numero negativo
        System.out.println(- numero);
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        numero = numero++; //igual numero = numero+1;
        System.out.println("Incremento1 :" + numero++);
        System.out.println("Incremento1 :" + numero);

        numero = ++numero; //igual numero = numero+1;
        System.out.println("Incremento2 :" +numero);
        System.out.println("Incremento2 :" +numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);
        
        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo
        
        System.out.println(numero);// agora sim, numero virou 7
        
        //ordem de precedencia conta aqui
        System.out.println(++ numero);
        
        boolean verdadeiro = true;
        
        System.out.println("Inverteu " + !verdadeiro);

        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;

        System.out.println(variavel);
        
    }
    
}
