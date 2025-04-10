import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        int number = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String agency = scanner.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        String customerName = scanner.next();

        System.out.println("Por favor, digite o sobrenome do cliente: ");
        String customerLastName = scanner.next();
        
        System.out.println("Por favor, digite o saldo da conta: ");
        double balance = scanner.nextDouble();

        scanner.close();

        System.out.println("\n*----------------------------------------------------------------*");

        String message = String.format("""
            Olá %s %s, obrigado por criar uma conta em nosso banco, sua agência
            é %s, conta %d e seu saldo R$ %.2f já está disponível para saque."""
        , customerName, customerLastName, agency, number, balance);

        System.out.println(message);
        System.out.println("*----------------------------------------------------------------*\n\n");
    }
}
