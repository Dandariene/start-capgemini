package ExercicioEstruturaRepeticao;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner leitorScaner = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.println("Digite um n?mero: ");

            int numero = leitorScaner.nextInt();

            if (numero == 0) {
                System.out.println("O n?mero ? igual a zero");
            } else {
                if (numero > 0) {
                    System.out.println("O n?mero ? maior que zero");
                } else {
                    System.out.println("O n?mero ? menor que zero");
                }
            }
            System.out.println("Deseja continuar? S/N");
            desejaContinuar = leitorScaner.next().charAt(0);
        }
    }
}
