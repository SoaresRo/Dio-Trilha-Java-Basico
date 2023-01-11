public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("VolulmeAtual : " + smartTV.volume);

        smartTV.mudarCanal(13);

        System.out.println("VolulmeAtual : " + smartTV.volume);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("VolulmeAtual : " + smartTV.volume);





        System.out.println("Tv ligada ? " + smartTV.ligada);
        System.out.println("Canal Atual : " + smartTV.canal);
        System.out.println("VolulmeAtual : " + smartTV.volume);

        smartTV.ligar ();

        System.out.println("Novo Status -> Tv ligada ? " + smartTV.ligada);

        smartTV.desligada();

        System.out.println("Novo Status -> Tv ligada ? " + smartTV.ligada);

    }
}
