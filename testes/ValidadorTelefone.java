package testes;

public class ValidadorTelefone {

    public static String validarTelefone(String telefone) {
        if (telefone.length() == 10) {
            return "Número válido";
        } else if (telefone.length() == 11) {
            return "Número válido com DDD";
        } else {
            return "Número inválido";
        }
    }

    public static void main(String[] args) {
        System.out.println(validarTelefone("1234567890"));   // Válido sem DDD
        System.out.println(validarTelefone("11234567890"));  // Válido com DDD
        System.out.println(validarTelefone("12345"));        // Inválido
        System.out.println(validarTelefone("1234567890123")); // Inválido
    }
}
