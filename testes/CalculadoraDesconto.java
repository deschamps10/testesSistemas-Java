package testes;

//Teste de Análise Valor Limite
public class CalculadoraDesconto {

    public static double calcularDesconto(double valor, double percentualDesconto) {
        if (percentualDesconto < 0 || percentualDesconto > 100) {
            throw new IllegalArgumentException("Percentual de desconto inválido");
        }
        return valor - (valor * percentualDesconto / 100);
    }

    public static void main(String[] args) {
        // Testando valores limites
        System.out.println(calcularDesconto(100, 0));    // Limite inferior: Sem desconto (100)
        System.out.println(calcularDesconto(100, 1));    // Próximo ao limite inferior (99)
        System.out.println(calcularDesconto(100, 100));  // Limite superior: Desconto completo (0)
        System.out.println(calcularDesconto(100, 101));  // Acima do limite: Exceção
    }
}

