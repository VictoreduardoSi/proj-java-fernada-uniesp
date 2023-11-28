import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[4];

        String opcao = "";
        int index = 0;

        while (!opcao.equalsIgnoreCase("Sair") && index < pessoas.length) {
            pessoas[index] = cadastrarPessoa(scanner);
            index++;

            System.out.println("Pessoa cadastrada");
            System.out.println("Pré-visualização da pessoa:");
            System.out.println(pessoas[index - 1].toString());

            System.out.println("Digite 'Sair' para encerrar o programa, 'Editar' para modificar a última pessoa ou qualquer outra tecla para cadastrar outra pessoa:");
            opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("Editar")) {
                index--;
            }
        }

        for (Pessoa pessoa : pessoas) {
            if (pessoa != null) {
                System.out.println(pessoa.toString());
                System.out.println();
            }
        }
    }

    private static Pessoa cadastrarPessoa(Scanner scanner) {
        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();
        System.out.println("Escolha o tipo de pessoa:");
        System.out.println("1 - Usuário");
        System.out.println("2 - Usuário Institucional");
        int tipoEscolhido = scanner.nextInt();
        scanner.nextLine();

        if (tipoEscolhido == 1) {
            return cadastrarUsuario(scanner, nome, "Usuário");
        } else if (tipoEscolhido == 2) {
            return cadastrarUsuarioInstitucional(scanner, nome, "Usuário Institucional");
        } else {
            System.out.println("Opção inválida. Criando usuário por padrão.");
            return cadastrarUsuario(scanner, nome, "Usuário");
        }
    }

    private static Pessoa cadastrarUsuario(Scanner scanner, String nome, String tipo) {
        System.out.println("Digite o número de inscrição do usuário:");
        int numeroInscricao = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a data de nascimento do usuário (formato: dd/mm/yyyy):");
        String dataNascimento = scanner.nextLine();

        return new Usuario(nome, tipo, numeroInscricao, dataNascimento);
    }

    private static Pessoa cadastrarUsuarioInstitucional(Scanner scanner, String nome, String tipo) {
        System.out.println("Digite o número de inscrição do usuário institucional:");
        int numeroInscricao = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a data de nascimento do usuário institucional (formato: dd/mm/yyyy):");
        String dataNascimento = scanner.nextLine();
        System.out.println("Digite o nome da instituição do usuário institucional:");
        String instituicao = scanner.nextLine();

        return new UsuarioInstitucional(nome, tipo, numeroInscricao, dataNascimento, instituicao);
    }
}
