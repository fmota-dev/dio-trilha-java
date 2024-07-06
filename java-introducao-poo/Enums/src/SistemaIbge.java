public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
            System.out.println(estado.getSigla() + " - " + estado.getNome() + " - " + estado.getIbge());
        }
        ;

        EstadoBrasileiro eb = EstadoBrasileiro.RIO_GRANDE_DO_NORTE;
        System.out.println(eb.getSigla() + " - " + eb.getNome() + " - " + eb.getIbge());
    }
}
