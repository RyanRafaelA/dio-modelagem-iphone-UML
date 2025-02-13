package service;

import model.Iphone;

import java.util.Scanner;

public class IphoneService {
    public static void musicaIphone(Scanner sc, Iphone iphone){
        char pausar =  'n';

        while (pausar != 's') {
            System.out.print("Selecione a musica");
            iphone.selecionarMusica(sc.nextLine());

            iphone.tocar();

            System.out.print("Pausar? [n]ão [s]im");
            pausar = sc.next().charAt(0);

            if (pausar == 's') {
                iphone.pausar();
            }
        }
    }

    public static void telefonema(Scanner sc, Iphone iphone){
        boolean ligar = true;
        char opcDesligamento;

        System.out.print("Digite o numero: ");
        iphone.ligar(sc.next());
        while (ligar) {
            ligar = iphone.atender();

            System.out.print("Desligar? [s]im [n]ão ");
            opcDesligamento = sc.next().charAt(0);

            if(opcDesligamento == 's'){
                ligar = iphone.desligar();
            }
        }
    }

    public static void internet(Scanner sc, Iphone iphone){
        int opc = 0;

        System.out.print("Url site: ");
        iphone.exibirPagina(sc.nextLine());
        while(opc != 3) {
            System.out.println("[1] - Nova Aba\n[2] - Atualizar Pagina\n[3] - sair");
            opc =sc.nextInt();

            if(opc == 1){
                System.out.print("Url site: ");
                iphone.exibirPagina(sc.nextLine());
            } else if(opc == 2){
                iphone.atualizarPagina();
            }
        }
    }
}
