import model.Iphone;
import service.IphoneService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Iphone iphone = new Iphone("12345");

        boolean confirmacaoSenha = true;
        int opc = 0;

        System.out.print("Digite a senha: ");
        confirmacaoSenha = iphone.confirmacaoSenha(sc.next());

        if(confirmacaoSenha){
            while(opc !=4){
                System.out.println("[1] - Musica\n[2] - Telefone\n[3] - Internet\n[4] - Desligar Telefone");
                opc = sc.nextInt();

                switch(opc){
                    case 1:
                        IphoneService.musicaIphone(sc, iphone);
                        break;
                    case 2:
                        IphoneService.telefonema(sc, iphone);
                        break;
                    case 3:
                        IphoneService.internet(sc, iphone);
                        break;
                    case 4:
                        System.out.println("Desligado");
                        break;
                    default:
                        System.out.println("Não existe essa opção!");
                }
            }
        }
    }

}
