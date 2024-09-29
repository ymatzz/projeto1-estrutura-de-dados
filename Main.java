// Luis Felipe 10420572 
// Marcos Minhano 10428577
// Matheus Fernandes 10420439
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Produto> produtos = new ProdutoRepo().getProdutos();

    List<ItemCompra> listaItens = lerItens(sc, produtos);

    Carrinho carrinho = new Carrinho(listaItens, 10);

    sc.close();
    carrinho.mostrarCarrinho();
  }

  /**
   * Lê itens a partir da entrada do usuário e retorna uma lista de objetos ItemCompra.
   *
   * @param sc        o objeto Scanner para ler a entrada do usuário
   * @param produtos  a lista de objetos Produto
   * @return          a lista de objetos ItemCompra
   */
  private static List<ItemCompra> lerItens(Scanner sc, List<Produto> produtos) {
    List<ItemCompra> listaItens = new ArrayList<>();

    while (true) {
      boolean produtoEncontrado = false;
      int codigo = InputHelper.getIntInput("Digite o código: ", sc);
      if (codigo == 99999) {
        System.out.println("Finalizando inserção de itens no carrinho...");
        System.out.println();
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

      if (!produtoEncontrado) {
        System.out.println("Não foi encontrado nenhum produto.");
      }
    }

    return listaItens;
  }
}