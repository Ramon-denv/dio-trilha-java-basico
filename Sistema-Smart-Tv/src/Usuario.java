public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.ligar();
        if(smartTv.ligada == false){
            System.out.println("Tv desligada");
        }else{
            System.out.println("Tv ligada");
        } 
        smartTv.aumentarCanal();
        System.out.println("Canal da Tv esta no " + smartTv.canal);
        smartTv.aumentarVolume();
        System.out.println("Volume da Tv esta no " + smartTv.volume);

        smartTv.desligar();
        if(smartTv.ligada == false){
            System.out.println("Tv desligada");
        }else{
            System.out.println("Tv ligada");
        } 
        smartTv.diminuirCanal();
        System.out.println("Canal da Tv esta no " + smartTv.canal);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume da Tv esta no " + smartTv.volume);

        smartTv.mudarCanal(30);
        System.out.println("Canal da Tv esta no " + smartTv.canal);

    }
}
