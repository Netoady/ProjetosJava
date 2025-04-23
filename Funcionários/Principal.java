import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        Funcionario funcionario = new Funcionario(
            1, "João da Silva", "123.456.789-00", "Rua das Flores, 123", 
            "(11) 91234-5678", 30, 5000.00f
        );

        System.out.println("DADOS INICIAIS DO FUNCIONÁRIO:");
        System.out.println(funcionario.getEstado());

        System.out.print("\nDigite o novo salário: R$ ");
        float novoSalario = scanner.nextFloat();
        funcionario.setSalario(novoSalario);

        float salarioLiquido = funcionario.calculaSalarioLiquido();

        System.out.println("\nDADOS ATUALIZADOS DO FUNCIONÁRIO:");
        System.out.println(funcionario.getEstado());
        System.out.println("Salário líquido (com 11% de desconto do INSS): R$ " + df.format(salarioLiquido));

        scanner.close();
    }
}
