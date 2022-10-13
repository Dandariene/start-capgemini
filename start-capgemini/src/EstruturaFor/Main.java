package EstruturaFor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nomeProduto;
        float precoCusto = 0.0f;
        float precoVenda = 0.0f;

        float totalCusto = 0.0f;
        float totalVenda = 0.0f;


        Scanner leitor = new Scanner(System.in);
        int i = 0;
        for(; i < 40; i++){

            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitor.next();

            System.out.println("Digite o preço de custo do produto: ");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite o preço de venda do produto: ");
            precoVenda = leitor.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto == precoVenda){
                System.out.println("Houve um empate de valores");
            }else {
                if (precoCusto < precoVenda){
                     System.out.println("Houve lucro");
                }else{
                    System.out.println("Houve prejuízo" );
                }
            }
            System.out.println(nomeProduto + ", preço de custo - " + precoCusto
                    + ", preço de venda - " + precoVenda);
        }
        System.out.println("A média do preço de custo é de: " + totalCusto);
        System.out.println("A média do preço de venda é de: " + totalVenda);
    }
}
