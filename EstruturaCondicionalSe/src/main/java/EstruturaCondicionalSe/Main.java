
package EstruturaCondicionalSe;

public class Main {

    public static void main(String[] args) {
        int media = 5;

        if (media >= 7) {
            System.out.println("Aprovado");

            if (media == 10) {
                System.out.println("Parabéns!!");

            } else {
                System.out.println("Se esforce um pouco mais");
            }
        } else {
            System.out.println("Reprovado");
        }
    }
}
