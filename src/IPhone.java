public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    @Override
    public void tocar() {
        System.out.println("Tocando Musical");
    }
    @Override
    public void pausar(){
        System.out.println("Pausando faixa Musical");
    }
    @Override
    public void selecionarMusica(){
        System.out.println("Selecionando faixa Músical");
    }
    @Override
    public void ligar(){
        System.out.println("Ligando Para iPhone");
    }
    @Override
    public void atender() {
        System.out.println("Atendendo iPhone");
    }
    @Override
    public void iniciarCorreiodeVoz(){
        System.out.println("Desligando iPhone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo pagina: " + url);
    }
    @Override
    public void adicionarAba() {
        System.out.println("Fechando Pagina");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

}
