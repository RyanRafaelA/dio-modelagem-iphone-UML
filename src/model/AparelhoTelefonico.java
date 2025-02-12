package model;

public interface AparelhoTelefonico {
    void ligar(String numero);
    boolean atender();
    boolean desligar();
    void iniciarCorreioVoz();
}
