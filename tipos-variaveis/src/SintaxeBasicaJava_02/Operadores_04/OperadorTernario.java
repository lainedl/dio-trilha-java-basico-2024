package SintaxeBasicaJava_02.Operadores_04;
public class OperadorTernario {
    public static void main(String[] args) {
       
    // classe Operadores.java - OPERADOR TERNÁRIO
    int a, b;

    a = 5;
    b = 6;
    //String resultado = "";

    //* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
    // String resultado = "";
    //if(a==b)
        //resultado = "verdadeiro";
    //else
        //resultado = "falso";

    //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
    String resultado = (a==b) ? "verdadeiro" : "false";

    System.out.println(resultado);
    }  
}
