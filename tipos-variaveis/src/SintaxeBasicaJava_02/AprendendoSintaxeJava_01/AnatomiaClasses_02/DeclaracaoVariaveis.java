package SintaxeBasicaJava_02.AprendendoSintaxeJava_01.AnatomiaClasses_02;

public class DeclaracaoVariaveis {

    public static void main(String[] args) {
        
    // Declação inválida de variáveis

    //int numero&um=1; // Os únicos símbolos permitidos são _ e $
    //int 1 numero=1; // Uma variável não pode começar com númerico
    //int numero um=1; // Não pode ter espaço no nome da variável
    //int long=1; // long faz parte das palavras reservadas da linguagem

    // Declaração válida de veriáveis
    // Não usada Edi int numero$um = 1;
    // Não usada Edi int numero1 = 1;
    // Não usada Edi int numeroum = 1;
    // Não usada Edi int longo = 1;

    /*
    //Não recomendado
    double salMedio = 1500.23  //variável abreviada, o que dificulta a compreensão
    String emails = "aluno@escola.com" //confuso se a variável seria um array ou único e-mail
    String myName = "JOSEPH" //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não 

    //Recomendado
    double salarioMedio=1500.23;
    String email ="aluno@escola.com";
    String [] emails = {"aluno@escola.com","professor@escola.com"}
    String meuNome = "JOSEPH"     
    */
        
    // Não usada Edi final String BR = "Brasil"; // Não pode mudar esse valor em todo o programa.  
    System.out.println("Teste");
    }

}
