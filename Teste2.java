import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = sc.nextInt();
        int anterior = 0;
        int atual = 1;
        if (numero == 0 || numero == 1) {
            System.out.println("O número informado pertence à sequência de Fibonacci.");
            return;
        }
        while (atual <= numero) {
            if (atual == numero) {
                System.out.println("O número informado pertence à sequência de Fibonacci.");
                return;
            }
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        System.out.println("O número informado NÃO pertence à sequência de Fibonacci.");
        sc.close();
    }
}
