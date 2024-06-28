import java.util.Scanner;

public class Filme {
    private String nome;
    private String categoria;
    Scanner scan = new Scanner(System.in);

    public Filme(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public Filme cadastrar() {
        System.out.println("Digite o nome do filme: ");
        this.nome = scan.next();

        System.out.println("Digite a categoria do filme: ");
        this.categoria = scan.next();

        return this;
    }

    public void mostrarDetalherFilme() {
        System.out.println("Filme{" +
                "nome='" + nome + '\'' +
                '}');
    }
}
