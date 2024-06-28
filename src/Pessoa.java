public class Pessoa {
    private String nome;
    private Integer idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, Integer idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }


    public void envelhecer(Integer anos) {
        this.idade +=anos;
    }

    public void engordar(double peso) {
        this.peso +=peso;
    }

    public void emagrecer(double peso) {
        this.peso -=peso;
    }

    public void mostrarInformacoes() {
        System.out.println(
                "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                '}');

    }

}
