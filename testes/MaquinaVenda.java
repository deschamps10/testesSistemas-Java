package testes;

public class MaquinaVenda {

    // Constantes para os estados
    private static final String SELECIONAR_PRODUTO = "SELECIONAR_PRODUTO";
    private static final String INSERIR_DINHEIRO = "INSERIR_DINHEIRO";
    private static final String ENTREGAR_PRODUTO = "ENTREGAR_PRODUTO";

    private String estado = SELECIONAR_PRODUTO;

    // Constante para o valor do produto
    private static final double PRECO_PRODUTO = 1.50;

    public void selecionarProduto() {
        if (estado.equals(SELECIONAR_PRODUTO)) {
            estado = INSERIR_DINHEIRO;
            System.out.println("Produto selecionado. Insira o dinheiro.");
        } else {
            throw new IllegalStateException("Ação inválida neste estado: " + estado);
        }
    }

    public void inserirDinheiro(double valor) {
        if (estado.equals(INSERIR_DINHEIRO)) {
            if (valor >= PRECO_PRODUTO) {
                estado = ENTREGAR_PRODUTO;
                System.out.println("Dinheiro inserido. Produto sendo entregue.");
            } else {
                System.out.println("Valor insuficiente. O valor mínimo é: " + PRECO_PRODUTO);
            }
        } else {
            throw new IllegalStateException("Ação inválida neste estado: " + estado);
        }
    }

    public void entregarProduto() {
        if (estado.equals(ENTREGAR_PRODUTO)) {
            estado = SELECIONAR_PRODUTO;
            System.out.println("Produto entregue. Selecione outro produto.");
        } else {
            throw new IllegalStateException("Ação inválida neste estado: " + estado);
        }
    }

    public static void main(String[] args) {
        // Teste baseado em modelo: fluxo correto
        try {
            MaquinaVenda maquina = new MaquinaVenda();
            maquina.selecionarProduto();
            maquina.inserirDinheiro(1.50);
            maquina.entregarProduto();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // Teste baseado em modelo: fluxo incorreto
        try {
            MaquinaVenda maquina = new MaquinaVenda();
            maquina.inserirDinheiro(1.50);  // Ação inválida: sem produto selecionado
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
