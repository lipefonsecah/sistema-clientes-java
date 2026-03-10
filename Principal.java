package cliente;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();

        int opcao;

        do {

            System.out.println("\n=== SISTEMA DE CLIENTES ===");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Mostrar cliente");
            System.out.println("3 - Sair");

            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.print("Nome: ");
                cliente.nome = scanner.nextLine();

                System.out.print("Telefone: ");
                cliente.telefone = scanner.nextLine();

                System.out.print("Email: ");
                cliente.email = scanner.nextLine();

                System.out.println("Cliente cadastrado!");

            }

            else if (opcao == 2) {

                System.out.println("\nNome: " + cliente.nome);
                System.out.println("Telefone: " + cliente.telefone);
                System.out.println("Email: " + cliente.email);

            }

        } while (opcao != 3);

        scanner.close();
    }

}