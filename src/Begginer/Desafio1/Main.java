package Begginer.Desafio1;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDeNinjas<Ninja> listaDeNinjas = new ListaDeNinjas<>();
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        int op = 0, opDeInicio;
        while(op != 4){
            menu.exibirInformacoesDeMenu();
            opDeInicio = scanner.nextInt();
            switch (opDeInicio){
                case 1:
                    System.out.println("Como ninja será chamado ? ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a idade do ninja: ");
                    short idade = scanner.nextShort();
                    System.out.println("Digite a missao do ninja: ");
                    String missao = scanner.nextLine();
                    System.out.println("Digite a Dificulade do ninja: ");
                    String dificuldade = scanner.nextLine();
                    listaDeNinjas.adicionarNinjas(new Ninja(nome, idade, missao, dificuldade));
                    break;
            }
        }







    }
}
