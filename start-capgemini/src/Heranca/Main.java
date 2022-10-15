package Heranca;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
    Vendedor vendedor1 = new Vendedor();
    vendedor1.setNome("Maria");
    vendedor1.setSalario(800f);
    vendedor1.setDataNascimento(new Date());
    vendedor1.setCpf("12378945612");
    vendedor1.setComissaoPorItem(10);
    vendedor1.setTotalItensVendidos(5);

        System.out.println(vendedor1.calcularSalario());
    }
}
