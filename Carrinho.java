import java.util.ArrayList;

public class Carrinho {
    private ArrayList<ItemCompra> listaItens;
    private double totalCompra;
    private double porcDesconto;
    private double valorPago;
    
    public Carrinho(ArrayList<ItemCompra> listaItens, double totalCompra, double porcDesconto, double valorPago) {
        this.listaItens = listaItens;
        this.totalCompra = totalCompra;
        this.porcDesconto = porcDesconto;
        this.valorPago = valorPago;
    }

    public ArrayList<ItemCompra> getListaItens() {
        return listaItens;
    }
    public void setListaItens(ArrayList<ItemCompra> listaItens) {
        this.listaItens = listaItens;
    }
    public double getTotalCompra() {
        return totalCompra;
    }
    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }
    public double getPorcDesconto() {
        return porcDesconto;
    }
    public void setPorcDesconto(double porcDesconto) {
        this.porcDesconto = porcDesconto;
    }
    public double getValorPago() {
        return valorPago;
    }
    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public void mostrarCarrinho(){}
    public void calDesconto(double total){}
    public void somaValores(){}
}