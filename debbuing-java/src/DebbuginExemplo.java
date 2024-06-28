public class DebbuginExemplo {
    public static void main(String[] args) {
        System.out.println("Inicio do progama do metodo main");
        a();
        System.out.println("Fim do progama do metodo main");
    }

    public static void a() {
        System.out.println("Entrou no metodo A");
        b();
        System.out.println("Finalizou o metodo A");
    }

    public static void b() {
        System.out.println("Entrou no metodo B");
        for(int i = 0 ; i <= 4; i++ ) System.out.println(i);
        c();
        System.out.println("Finalizou o metodo B");
    }

    public static void c() {
        System.out.println("Entrou no metodo C");
        Thread.dumpStack();
        System.out.println("Finalizou o metodo C");
    }
}