public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("70865807400", "Filipe");
        marcos.setEndereco("RUA DAS MARIAS");
        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
