
public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.pausar();
        iphone.tocar();
        iphone.selecionarMusica();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreiodeVoz();
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarAba();
        iphone.atualizarPagina();
    }
}