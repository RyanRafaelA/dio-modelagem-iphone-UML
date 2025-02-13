package model;

import model.interfaces.AparelhoTelefonico;
import model.interfaces.NavegadorInternet;
import model.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    private String senha;

    public Iphone(String senhaInicial){
        this.senha = senhaInicial;
    }

    public boolean confirmacaoSenha(String senha){
        if(this.senha.equals(senha)){
            return true;
        }

        return false;
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para o numero: %s\n", numero);
    }

    @Override
    public boolean atender() {
        return true;
    }

    @Override
    public boolean desligar() {
        return false;
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("Pagina %s abrindo\n", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

    @Override
    public String tocar() {
        return "Musica tocando";
    }

    @Override
    public String pausar() {
        return "Musica pausada";
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("A musica %s foi selecionada\n", musica);
    }
}
