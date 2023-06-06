package main;

import simulador.Alface;
import simulador.Alimento;
import simulador.Morango;
import simulador.Uva;

import java.util.Scanner;

public class MenuSimulador {
    public void teste(Scanner scanner) {
        System.out.println("Qual alimento você deseja:");
        while (true) {
            System.out.println("1. Morango");
            System.out.println("2. Uva");
            System.out.println("3. Alface");
            System.out.println("0. Voltar");

            int selecaoAlimento = scanner.nextInt();
            scanner.nextLine();

            Alimento alimento = null;

            if (selecaoAlimento == 0) {
                break;
            }

            if (selecaoAlimento == 1) {
                alimento = new Morango();
            } else if (selecaoAlimento == 2) {
                alimento = new Uva();
            } else if (selecaoAlimento == 3) {
                alimento = new Alface();
            } else {
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                continue;
            }

            System.out.println("Quantos graus Celsius?");
            int celsius = scanner.nextInt();
            scanner.nextLine();

            if (alimento.temperaturaAdequada(celsius)) {
                System.out.println("Alimento aprovado.");
            } else {
                System.out.println("Alimento NÃO aprovado.");
            }
        }
    }
}