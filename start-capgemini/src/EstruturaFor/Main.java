package EstruturaFor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nomeProduto;
        float precoCusto;
        float precoVenda;


        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < 40; i++){

            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitor.next();

            System.out.println("Digite o preço de custo do produto: ");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite o preço de venda do produto: ");
            precoVenda = leitor.nextFloat();

            if (precoCusto == precoVenda){
                System.out.println("Houve um empate de valores");
            }else {
                if (precoCusto < precoVenda){
                     System.out.println("Houve lucro");
                }else{
                    System.out.println("Houve prejuízo" );
                }
            }
        }
    }
}
