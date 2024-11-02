package SintaxeBasicaJava_02.AprendendoSintaxeJava_01.AnatomiaClasses_02;

public class MinhaClasse {

    public static void main(String[] args) {
        System.out.println("Olá turma, sejam bem vindos");

        String primeiroNome = "Edilaine";
        String segundoNome = "Lima";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }    
        public static String nomeCompleto (String primeiroNome, String segundoNome){
            return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
        }
    
}
