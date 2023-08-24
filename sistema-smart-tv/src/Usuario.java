public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();

        System.out.println("TV Ligada? -> " + smartTV.ligada);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
        smartTV.diminuirCanal();
        smartTV.mudarCanal(13);

        System.out.println("Canal atual: " + smartTV.canal);
    }
}
