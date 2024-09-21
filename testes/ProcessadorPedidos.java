package testes;

import java.util.List;

//Testes Exploratórios
public class ProcessadorPedidos {

    public static String processarPedido(List<String> itens, double valorTotal) {
        if (itens.isEmpty()) {
            return "Carrinho vazio. Adicione itens ao carrinho.";
        }
        if (valorTotal <= 0) {
            return "Valor total inválido.";
        }
        return "Pedido processado com sucesso. Total: " + valorTotal;
    }

    public static void main(String[] args) {
        // Explorando diferentes cenários
        System.out.println(processarPedido(List.of(), 100));          // Carrinho vazio
        System.out.println(processarPedido(List.of("item1"), 0));     // Valor total zero
        System.out.println(processarPedido(List.of("item1"), -10));   // Valor total negativo
        System.out.println(processarPedido(List.of("item1"), 100));   // Pedido válido
    }
}

