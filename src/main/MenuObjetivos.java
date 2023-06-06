package main;

import java.util.Scanner;

public class MenuObjetivos {

    public void exibirObjetivos(Scanner scanner) {
        int opcao;

        while (true) {
            System.out.println("Selecione uma opção que você deseja saber:");
            System.out.println("1. Otimização do ambiente");
            System.out.println("2. Gerenciamento de recursos");
            System.out.println("3. Monitoramento");
            System.out.println("4. Planejamento e tomada de decisão");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("A otimização do ambiente na agricultura vertical envolve o controle de luz, temperatura, umidade e outros fatores para criar condições ideais de crescimento das plantas.");
                    break;

                case 2:
                    System.out.println("O gerenciamento de recursos na agricultura vertical inclui a gestão eficiente de água, nutrientes e energia para garantir a sustentabilidade e maximizar a produção.");
                    break;

                case 3:
                    System.out.println("O monitoramento na agricultura vertical é realizado por meio de sensores e algoritmos de IA para identificar problemas de saúde das plantas e tomar medidas corretivas.");
                    break;

                case 4:
                    System.out.println("O planejamento e a tomada de decisão na agricultura vertical podem ser aprimorados com a IA, que analisa dados e fornece insights para otimizar a produção e tomar decisões mais informadas.");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                    break;
            }
        }
    }
}