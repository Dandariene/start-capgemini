package ComandosLeituraGrava��o;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
       int idade = leitor.nextInt();
       float cotacaoDolar = leitor.nextFloat();
       double cotacaoEuro = leitor.nextDouble();
       String nome = leitor.nextLine();//l� uma linha inteira ou at� que o usu�rio precione enter
       String codigoRua = leitor.next();//l� apenas uma palavra
       
        System.out.println("Texto que ser� exibido");
        System.out.print("Texto que ser� exibido");
    }
    
}
