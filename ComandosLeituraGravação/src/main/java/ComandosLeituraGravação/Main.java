package ComandosLeituraGravação;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
       int idade = leitor.nextInt();
       float cotacaoDolar = leitor.nextFloat();
       double cotacaoEuro = leitor.nextDouble();
       String nome = leitor.nextLine();//lê uma linha inteira ou até que o usuário precione enter
       String codigoRua = leitor.next();//lê apenas uma palavra
       
        System.out.println("Texto que será exibido");
        System.out.print("Texto que será exibido");
    }
    
}
