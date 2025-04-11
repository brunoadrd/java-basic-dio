import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int firstParam = keyboard.nextInt();

        System.out.println("Digite o segundo número: ");
        int secondParam = keyboard.nextInt();

        try {
            printValues(firstParam, secondParam);
        } catch (InvalidParamsException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            keyboard.close();
        }
    }

    public static void printValues(int firstParam, int secondParam) throws InvalidParamsException {
        if (firstParam < 0 || secondParam < 0 || firstParam > secondParam) {
            throw new InvalidParamsException("Os números devem ser positivos e o primeiro deve ser menor que o segundo.");
        } else {
            for (int i = 0; i <= (secondParam - firstParam); i++) {
                System.out.println("Valor: " + i);
            }
        }
    }
}
