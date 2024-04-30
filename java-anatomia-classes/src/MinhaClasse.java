public class MinhaClasse {
  public static void main(String[] args) {
    String nome = "Filipe";
    String sobrenome = "Mota";

    String nomeCompleto = nomeCompleto(nome, sobrenome);
    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto (String nome, String sobrenome) {
    return nome + " " + sobrenome;
  }
}
