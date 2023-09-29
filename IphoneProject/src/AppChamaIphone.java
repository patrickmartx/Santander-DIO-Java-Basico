import edu.patrickmartx.models.Iphone;

public class AppChamaIphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();

        System.out.println();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}