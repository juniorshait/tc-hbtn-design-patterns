import java.util.HashSet;
import java.util.stream.Collectors;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido>  itensForaCaixa = new HashSet<>();

    public void adicionarItemDentroCaixa(ItemPedido item){
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item){
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        System.out.println("\tFora da Caixa:");
        this.itensForaCaixa.stream()
                .forEach(System.out::println);

        System.out.println("\tDentro da Caixa:");
        this.itensDentroCaixa.stream()
                .forEach(System.out::println);
        return "";
    }
}
