// Luis Felipe 10420572 
// Marcos Minhano 10428577
// Matheus Fernandes 10420439
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ProdutoRepo produtoRepo = new ProdutoRepo();
    List<Produto> produtos = produtoRepo.getProdutos();

    List<ItemCompra> listaItens = new ArrayList<ItemCompra>();

    while (true) {
        boolean produtoEncontrado = false;
        int codigo = InputHelper.getIntInput("Digite o código: ", sc);
        if (codigo == 99999) {
            System.out.println("Finalizando inserção de itens no carrinho...");
            break;
        }
        for (Produto p : produtos) {
            if (codigo == p.getCodigo()) {
                System.out.println(p);
                int quantidade = InputHelper.getIntInput("Insira a quantidade: ", sc);
                ItemCompra ic = new ItemCompra(p.getDescricao(), quantidade, p.getPreco());
                System.out.println("Item adicionado com sucesso!");
                System.out.println(ic.toString());
                listaItens.add(ic);
                produtoEncontrado = true;
            }
        }
        if (!produtoEncontrado) System.out.println("Não foi encontrado nenhum produto.");
    }

    Carrinho carrinho = new Carrinho(listaItens, 10);

    sc.close();
    carrinho.mostrarCarrinho();
  }
}