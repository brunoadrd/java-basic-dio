public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");

        analiseCadidate(1500.00);
        analiseCadidate(2200.00);
        analiseCadidate(2300.00);
    }

    public static void analiseCadidate(double desiredSalary) {
        double baseSalary = 2000.00;

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
