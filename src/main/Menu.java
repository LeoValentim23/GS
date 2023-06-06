package main;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        MenuDoacao aplicacao = new MenuDoacao();
        MenuObjetivos aplicar = new MenuObjetivos();
        MenuSimulador aplicavel = new MenuSimulador();


        System.out.println("Bem-vindo à Urban farm! Espero que voce goste da experiencia com nossa comunidade .");

        while (true) {
            System.out.println("Selecione o que você deseja saber ou realizar:");
            System.out.println("1. Doação");
            System.out.println("2. Objetivos");
            System.out.println("3. Simulador");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    aplicacao.realizarDoacao(scanner);
                    break;
                case 2:
                    aplicar.exibirObjetivos(scanner);
                    break;
                case 3:
                    aplicavel.teste(scanner);
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o sistema da Urban farm!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                    break;
            }
        }
    }

}