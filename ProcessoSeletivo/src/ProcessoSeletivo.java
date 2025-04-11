import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");

        analiseCadidate(1500.00, 2000.00);
        analiseCadidate(2200.00, 2000.00);
        analiseCadidate(2300.00, 2000.00);

        candidatesSelection(2500.00);
    }

    public static void candidatesSelection(double baseSalary) {
        System.out.println("Iniciando o processo de seleção de candidatos...");

        String candidates[] = {
            "Pedro",
            "Maria",
            "João",
            "Ana",
            "Lucas",
            "Fernanda",
            "Carlos",
            "Juliana",
            "Roberto",
            "Patrícia"
        };
        
        int candidatesSelected = 0;

        for (int i = 0; i < candidates.length; i++) {
            double desiredSalary = desiredValue();

            if (desiredSalary <= baseSalary) {
                System.out.println("Candidato selecionado: " + candidates[i] + " com salário desejado: " + desiredSalary);
                candidatesSelected++;
            }

            if (candidatesSelected == 5) {
                break;
            }
        }
    }

    public static double desiredValue() {
        return ThreadLocalRandom.current().nextDouble(1800.00, 3000.00);
    }
    
    public static void analiseCadidate(double desiredSalary, double baseSalary) {
        System.out.println("Analisando Candidato...");

        if (desiredSalary < baseSalary) {
            System.out.println("Ligar para o Candidato.");
        } else if (desiredSalary >= baseSalary && desiredSalary <= (baseSalary * 1.1)) {
            System.out.println("Oferecer contraposta ao Candidato.");
        } else {
            System.out.println("Candidato em Análise.");
        }
    }
}
