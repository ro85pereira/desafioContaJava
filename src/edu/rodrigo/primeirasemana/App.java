package edu.rodrigo.primeirasemana;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

            String nome = "Nina";
            String sobrenome = "Rodrigues";
            System.out.println(NomeCompleto(nome,sobrenome));
        
        }

        public static String NomeCompleto(String nome, String sobrenome){
            return nome.concat(" ").concat(sobrenome)   ; 
            
    }



}
