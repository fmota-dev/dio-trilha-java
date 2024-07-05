package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno filipe = new Aluno();
        filipe.setNome("Filipe Mota");
        filipe.setIdade(22);
        

        System.out.println("O aluno " + filipe.getNome() + " tem " + filipe.getIdade() + " anos ");
    }
}