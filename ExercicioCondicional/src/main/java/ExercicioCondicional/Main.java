
package ExercicioCondicional;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        int numero;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o numero desejado: ");
        numero = leitor.nextInt();
        
        if(numero >= 100 && numero <= 200){
            System.out.println("Numero n�o est� no intervalo");
        }else{
            System.out.println("Numero est� no intervalo"); 
        }
    }
}
