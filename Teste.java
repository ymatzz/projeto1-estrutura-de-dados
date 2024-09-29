// Luis Felipe 10420572 
// Marcos Minhano 10428577
// Matheus Fernandes 10420439
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoRepo produtoRepo = new ProdutoRepo();
        List<Produto> produtos = produtoRepo.getProdutos();

        Produto p1 = produtos.get(0);
        ItemCompra ic1 = new ItemCompra(p1.getDescricao(), 2, p1.getPreco());
        Produto p2 = produtos.get(1);
        ItemCompra ic2 = new ItemCompra(p2.getDescricao(), 1, p2.getPreco());

        List<ItemCompra> listaItens = new ArrayList<ItemCompra>();
        listaItens.add(ic1);
        listaItens.add(ic2);

        Carrinho carrinho = new Carrinho(listaItens, 10);

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
                    carrinho.adicionarItens(ic);
                    produtoEncontrado = true;
                }
            }
            if (!produtoEncontrado) System.out.println("Não foi encontrado nenhum produto.");
        }

        sc.close();
        carrinho.mostrarCarrinho();
    }

}
