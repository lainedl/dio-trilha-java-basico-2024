public class OperadoresRelacionais {

    public static void main(String[] args) {
    //classe Operadores.java - OPERADORES RELACIONAIS
    String nomeUm = "Edilaine";
    String nomeDois = new String("Edilaine");

    //System.out.println(nomeUm == nomeDois);
    System.out.println(nomeUm.equals(nomeDois));

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;
    System.out.println("numeroUm é igual a numeroDois? " + simNao); 

    simNao = numero1 != numero2;
    System.out.println("numeroUm é diferente de numeroDois? " + simNao); 

    if (numero1 == numero2){
        System.out.print("a nossa condição é verdadeira");
    }
    if(numero1 > numero2)
        System.out.print("Numero 1 maior que numero 2");

    if(numero1 < numero2)
        System.out.print("Numero 1 menor que numero 2");

    if(numero1 >= numero2)
        System.out.print("Numero 1 maior ou igual que numero 2");

    if(numero1 <= numero2)
        System.out.print("Numero 1 menor ou igual que numero 2");

    if(numero1 != numero2)
        System.out.println("Numero 1 é diferente de numero 2");
    
    // ComparacaoAvancada.java
    String nome1 = "JAVA";
    String nome2 = "JAVA";
   
    System.out.println("Teste Comparação Avançada");
    System.out.println(nome1 == nome2); //true

    String nome3 = new String("JAVA");
    
    System.out.println(nome1 == nome3); //false

    String nome4 = nome3;

    System.out.println(nome3 == nome4); //true
    
    //equals na parada
    System.out.println(nome1.equals(nome2)); //??
    System.out.println(nome2.equals(nome3)); //??
    System.out.println(nome3.equals(nome4)); //??

    // ComparacaoAvancada.java
    System.out.println("Teste Comparação Avançada 2");    
    //int numero11 = 130;
    //int numero21 = 130;
    //System.out.println(numero11 == numero21); //true
    
    Integer numero11 = 130;
    Integer numero21 = 130;

    //System.out.println(numero11 == numero21); //false
    
    // A razão pela qual o resultado é false, é devido o Java tratar os valores
    // Como objetos a partir de agora.
    // Qual a solução ?
    // Quando queremos comparar objetos, usamos o método equals
    
    System.out.println(numero11.equals(numero21)); 

    }
}