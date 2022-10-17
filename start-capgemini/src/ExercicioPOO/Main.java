package ExercicioPOO;

public class Main {
    public static void main(String[] args) {

        Invoice inv = new Invoice(1, "Teclado", 10, 35.0f);

        System.out.println("Valor total: " + inv.getInvoiceAmount());
    }
}
