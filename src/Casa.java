public class Casa {
    private String endereco;
    private int nQuartos;
    private double area;
    private double valor;

    public Casa(String endereco, int nQuartos, double area, double valor) {
        this.endereco = endereco;
        this.nQuartos = nQuartos;
        this.area = area;
        this.valor = valor;

    }

    public void exibirDetalhes(){
        System.out.println(
                    "Casa{" +
                    "endereco='" + endereco + '\'' +
                    ", nQuartos=" + nQuartos +
                    ", area=" + area +
                    ", valor=" + valor +
                    '}');
    }

    public double calcularValorImposto(double taxa) {
        System.out.println("Imposto: "+this.valor * taxa);
        return this.valor * taxa;
    }

}
