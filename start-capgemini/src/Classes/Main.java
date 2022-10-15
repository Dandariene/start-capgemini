package Classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Pessoa objetoPessoa = new Pessoa(70.0f, 1.70f);

        System.out.println("Digite o peso: ");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite a altura: ");
        objetoPessoa.setAltura(leitor.nextFloat());

        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    }
}
