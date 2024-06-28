public class Funcionario {
    private String nome;
    private Cargo cargo;
    private Double salario;
    private String departamento;

    public Funcionario(String nome, Cargo cargo, Double salario, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;

    }

    public void promover(){
        if(this.cargo.equals(Cargo.JUNIOR)){
            System.out.println("Parabéns vc foi promovido para pleno");
            this.cargo = Cargo.PLENO;
        } else if (this.cargo.equals(Cargo.PLENO)) {
            System.out.println("Parabéns vc foi promovido para Senior");
            this.cargo = Cargo.SENIOR;
        } else if (this.cargo.equals(Cargo.SENIOR)){
            System.out.println("Parabéns vc foi promovido para CEO");
            this.cargo = Cargo.CEO;
        } else {
            System.out.println("Voce não pode mais ser promovido");
        }
    }

    public void exibirDetalhes(){
        System.out.println("Funcionario{" +
                "nome='" + nome + '\'' +
                ", cargo=" + cargo +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '}');
    }
}