
package ExercicioCondicional;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        int numero;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o numero desejado: ");
        numero = leitor.nextInt();
        
        if(numero >= 100 && numero <= 200){
            System.out.println("Numero não está no intervalo");
        }else{
            System.out.println("Numero está no intervalo"); 
        }
    }
}
