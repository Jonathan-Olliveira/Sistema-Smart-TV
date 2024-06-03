public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("");

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        System.out.println("");
        smartTv.mudarCanal(13);
        System.out.println("Mudando canal para: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo status - Tv ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo status - Tv ligada? " + smartTv.ligada);
    }
}
