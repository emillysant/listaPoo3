import java.util.ArrayList;

public class Celular extends Aplicativo {
    private String marca;
    private String modelo;
    private Double armazenamento;
    private ArrayList<Aplicativo> aplicativosInstalados = new ArrayList<>();

    public Celular(String nome, String versao, String marca, String modelo, Double armazenamento, ArrayList<Aplicativo> aplicativosInstalados) {
        super(nome, versao);
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.aplicativosInstalados = aplicativosInstalados;
    }

    public void instalarAplicativo(String nome, String versao){
        Aplicativo aplicativo = new Aplicativo(nome, versao);
        this.aplicativosInstalados.add(aplicativo);
        System.out.println("Aplicativo "+aplicativo.getNome()+" instalado com sucesso!");
    }

    public void exibirInformacoes(){
        System.out.println("Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", armazenamento=" + armazenamento +
                ", aplicativosInstalados=" + aplicativosInstalados +
                '}');
    }
}
