public class Aplicativo {
    private String nome;
    private String versao;

    public Aplicativo(String nome, String versao) {
        this.nome = nome;
        this.versao = versao;
    }

    public Aplicativo() {
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aplicativo{" +
                "nome='" + nome + '\'' +
                ", versao='" + versao + '\'' +
                '}';
    }
}
