// Luis Felipe 10420572 
// Marcos Minhano 10428577
// Matheus Fernandes 10420439
import java.util.List;

public class Carrinho {
    private List<ItemCompra> listaItens;
    private double totalCompra;
    private double porcDesconto;
    private double valorPagar;
    
    public Carrinho(List<ItemCompra> listaItens, double porcDesconto) {
        this.listaItens = listaItens;
        this.porcDesconto = porcDesconto;
    }

    public List<ItemCompra> getListaItens() {
        return listaItens;
    }
    public void setListaItens(List<ItemCompra> listaItens) {
        this.listaItens = listaItens;
    }

    public void adicionarItens(ItemCompra itemCompra){
        listaItens.add(itemCompra);
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
    public double getValorPagar() {
        return valorPagar;
    }
    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public void mostrarCarrinho(){
        System.out.println("----- CARRINHO -----");
        int contadora = 1;
        for (ItemCompra item : listaItens){
            System.out.print(contadora + " - ");
            item.mostrarItem();
            System.out.println();
            contadora++;
        }
        double subTotal = somaValores();
        double descontos = calDesconto(subTotal);
        System.out.printf("Subtotal = R$ %.2f\n", subTotal);
        System.out.printf("Descontos = R$ -%.2f\n", descontos);
        System.out.printf("Total = R$ %.2f\n", totalCompra);
        System.out.println("--------------------");
    }


    private double calDesconto(double total){
        double desconto = (total * porcDesconto/100);
        this.totalCompra = total - desconto;
        return desconto;
    }

    private double somaValores(){
        double subTotal = 0;
        for (ItemCompra itemCompra : listaItens){
            subTotal += itemCompra.calcSubTotal();
        }
        return subTotal;
    }
}