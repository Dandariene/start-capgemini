package Classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Pessoa obejtoPessoa = new Pessoa();

        System.out.println("Digite o peso: ");
        obejtoPessoa.peso = leitor.nextFloat();
        System.out.println("Digite a altura: ");
        obejtoPessoa.altura = leitor.nextFloat();

        System.out.println("IMC = " + obejtoPessoa.calcularIMC());
    }
}
