import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[4];

        String opcao = "";
        int index = 0;

        while (!opcao.equalsIgnoreCase("Sair") && index < produtos.length) {
            produtos[index] = cadastrarProduto(scanner);
            index++;

            System.out.println("Produto cadastrado");
            System.out.println("Pré-visualização do produto:");
            System.out.println(produtos[index - 1].toString());

            System.out.println("Digite 'Sair' para encerrar o programa, 'Editar' para modificar o último produto ou qualquer outra tecla para cadastrar outro produto:");
            opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("Editar")) {
                index--;
            }
        }

        for (Produto produto : produtos) {
            if (produto != null) {
                System.out.println(produto.toString());
                System.out.println();
            }
        }
    }

    private static Produto cadastrarProduto(Scanner scanner) {
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("Escolha o tipo do produto:");
        System.out.println("1 - Camisa de time");
        System.out.println("2 - Camisa de grife");
        int tipoEscolhido = scanner.nextInt();
        scanner.nextLine();

        if (tipoEscolhido == 1) {
            return cadastrarCamisaTime(scanner, nome, "Camisa de time");
        } else if (tipoEscolhido == 2) {
            return cadastrarCamisaGrife(scanner, nome, "Camisa de grife");
        } else {
            System.out.println("Opção inválida. Criando produto comum por padrão.");
            return cadastrarCamisaTime(scanner, nome, "Camisa de time");
        }
    }

    private static Produto cadastrarCamisaTime(Scanner scanner, String nome, String tipo) {
        System.out.println("Digite o preço da camisa:");
        double preco = scanner.nextDouble();
        System.out.println("Digite o peso da camisa:");
        double peso = scanner.nextDouble();
        System.out.println("Digite o código de barras da camisa:");
        String codigoBarras = scanner.next();
        System.out.println("Digite o código de identificação da camisa:");
        String codigoIdentificacao = scanner.next();
        System.out.println("Digite o time da camisa:");
        String time = scanner.next();
        scanner.nextLine();

        return new CamisaTime(nome, preco, tipo, peso, codigoBarras, codigoIdentificacao, time);
    }

    private static Produto cadastrarCamisaGrife(Scanner scanner, String nome, String tipo) {
        System.out.println("Digite o preço da camisa de grife:");
        double preco = scanner.nextDouble();
        System.out.println("Digite o peso da camisa de grife:");
        double peso = scanner.nextDouble();
        System.out.println("Digite o código de barras da camisa de grife:");
        String codigoBarras = scanner.next();
        System.out.println("Digite o código de identificação da camisa de grife:");
        String codigoIdentificacao = scanner.next();
        System.out.println("Digite a marca da camisa de grife:");
        String marca = scanner.next();
        scanner.nextLine();

        return new CamisaGrife(nome, preco, tipo, peso, codigoBarras, codigoIdentificacao, marca);
    }
}
