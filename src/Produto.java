public class Produto {

    private String nome;
    private double preco;
    private Integer qEstoque;

    public Produto(String nome, double preco, Integer qEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qEstoque = qEstoque;
    }

    public void atualizarEstoque(int quantidade) {
        if (quantidade < 0 && Math.abs(quantidade) > qEstoque) {
            System.out.println("Erro: Quantidade insuficiente em estoque para realizar a retirada.");
        } else {
            this.qEstoque += quantidade;
            ;
            System.out.println("Estoque atualizado. Nova quantidade em estoque de " + this.nome + ": " + this.qEstoque);
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Quantidade em Estoque: " + this.qEstoque);
    }
}
