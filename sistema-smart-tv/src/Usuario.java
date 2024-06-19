public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada: " + smartTv.ligado);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume aumentado: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume aumentado novamente: " + smartTv.volume);
    }
}