import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametro2 = terminal.nextInt();
        terminal.close();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.err.println(e.getMessage());
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametro1 >= parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Realizar o for para imprimir os números com base na variável contagem
        int contagem = parametro2 - parametro1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}