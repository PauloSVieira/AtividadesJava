import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n1. Adicionar funcionário");
            System.out.println("2. Excluir funcionário");
            System.out.println("3. Editar funcionário");
            System.out.println("4. Listar funcionários");
            System.out.println("5. Cancelar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do funcionário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o cargo do funcionário: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Digite o salário do funcionário: ");
                    Double salario = Double.parseDouble(scanner.nextLine());
                    funcionarios.add(new Funcionario(nome, cargo, salario));
                    break;
                case 2:
                    System.out.print("\nDigite o nome do funcionário a ser excluído: ");
                    String nomeExcluir = scanner.nextLine();
                    funcionarios.removeIf(funcionario -> funcionario.getNome().equals(nomeExcluir));
                    break;
                case 3:
                    System.out.print("\nDigite o nome do funcionário a ser editado: ");
                    String nomeEditar = scanner.nextLine();
                    for (Funcionario funcionario : funcionarios) {
                        if (funcionario.getNome().equals(nomeEditar)) {
                            System.out.print("\nDigite o novo nome do funcionário: ");
                            funcionario.setNome(scanner.nextLine());
                            System.out.print("Digite o novo cargo do funcionário: ");
                            funcionario.setCargo(scanner.nextLine());
                            System.out.print("Digite o novo salário do funcionário: ");
                            funcionario.setSalario(Double.parseDouble(scanner.nextLine()));
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Lista de funcionários:");
                    for (Funcionario funcionario : funcionarios) {
                        System.out.println(funcionario);
                    }
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
        System.out.println("\nPrograma encerrado.\n");
    }
}