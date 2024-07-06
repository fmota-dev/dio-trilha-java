public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo", 1),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 2),
    PIAUI("PI", "Piauí", 3),
    MARANHAO("MA", "Maranhão", 4),
    RIO_GRANDE_DO_NORTE("RN", "Rio de Grande do Norte", 5),
    ;

    private final String nome;
    private final String sigla;
    private final int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

}
