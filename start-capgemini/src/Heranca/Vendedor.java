package Heranca;

import java.util.Date;

public class Vendedor extends Funcionario {

    private int totalItensVendidos;
    private  int comissaoPorItem;

    public Vendedor() {
        super();
    }

    public float calcularSalario(){
        return super.getSalario() + (this.comissaoPorItem * totalItensVendidos);
    }

    public float getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public int getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(int comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
}
