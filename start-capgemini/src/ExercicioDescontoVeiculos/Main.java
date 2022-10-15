package ExercicioDescontoVeiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int anoFabricacao = 0;
        float valorVeiculo = 00.0f;
        float porcDesconto = 00.0f;
        float valorDesconto = 00.0f;
        float valorPagar = 00.0f;

        int totalCarrosSeminovos = 0;
        int totalCarros = 0;

        char desejaRepetir = 'S';

        while (desejaRepetir == 'S' || desejaRepetir == 's') {
            System.out.print("Digite o ano de fabricação do veículo: ");
            anoFabricacao = leitor.nextInt();
            System.out.println("Digite o valor do veículo: ");
            valorVeiculo = leitor.nextFloat();

            if (anoFabricacao <= 2000) {
                porcDesconto = 0.12f;
                totalCarrosSeminovos ++;
            }else {
                porcDesconto = 0.07f;
            }
            totalCarros ++;

            valorDesconto = valorVeiculo * porcDesconto;
            valorPagar = valorVeiculo - valorDesconto;

            System.out.println("O valor de desconto foi de : " + valorDesconto);
            System.out.println("O valor a pagar é: " + valorPagar);

            System.out.println("Deseja fazer mais cadastro? S/N");
            desejaRepetir = leitor.next().charAt(0);
        }
        System.out.println("Total de carros Seminovos: " + totalCarrosSeminovos);
        System.out.println("Total de carros: " + totalCarros);
    }
}
