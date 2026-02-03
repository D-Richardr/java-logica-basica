package menu;

import java.util.Scanner;

public class MenuBasico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Mostrar mensagem");
            System.out.println("2 - Somar dois números");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Olá! Você está praticando Java.");
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    int a = scanner.nextInt();

                    System.out.print("Digite o segundo número: ");
                    int b = scanner.nextInt();

                    System.out.println("Resultado: " + (a + b));
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
