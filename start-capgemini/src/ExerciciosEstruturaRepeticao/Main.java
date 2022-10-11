package ExercicioEstruturaRepeticao;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner leitorScaner = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.println("Digite um número: ");

            int numero = leitorScaner.nextInt();

            if (numero == 0) {
                System.out.println("O número é igual a zero");
            } else {
                if (numero > 0) {
                    System.out.println("O número é maior que zero");
                } else {
                    System.out.println("O número é menor que zero");
                }
            }
            System.out.println("Deseja continuar? S/N");
            desejaContinuar = leitorScaner.next().charAt(0);
        }
    }
}
