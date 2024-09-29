// Luis Felipe 10420572 
// Marcos Minhano 10428577
// Matheus Fernandes 10420439

public class ItemCompra{
  private String descricao;
  private int qtd;
  private double preco;

  public ItemCompra(String descricao, int qtd, double preco) {
    this.descricao = descricao;
    this.qtd = qtd;
    this.preco = preco;
  }

  public String getDescricao() {
	 return descricao;
  }
  
  public void setDescricao(String descricao) {
  	this.descricao = descricao;
  }
  public int getQtd() {
  	return qtd;
  }
  public void setQtd(int qtd) {
  	this.qtd = qtd;
  }
  public double getPreco() {
  	return preco;
  }
  public void setPreco(double preco) {
  	this.preco = preco;
  }

  @Override
  public String toString() {
      return String.format(String.format("Item: [descricao = %s | preco = R$%.2f | quantidade = %d | subtotal = R$%.2f]", descricao, preco, qtd, calcSubTotal()));
  }

  public double calcSubTotal(){
    return preco*qtd;
  }

  public void mostrarItem(){
    System.out.print(String.format("Item: [descricao = %s | preco = R$%.2f | quantidade = %d | subtotal = R$%.2f]", descricao, preco, qtd, calcSubTotal()));
  }
}
