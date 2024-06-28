import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//1 - Classe Pessoa
        Pessoa pessoa = new Pessoa("Marina", 35, 1.75, 72);
        pessoa.envelhecer(1);
        pessoa.emagrecer(5);
        pessoa.engordar(2);
        pessoa.mostrarInformacoes();
//2 - Classe Produto
        Produto produto = new Produto("Notebook Acer", 5200, 20);
        produto.atualizarEstoque(-3);
        produto.exibirDetalhes();
//3 - Classe Filme
        Scanner scan = new Scanner(System.in);
        ArrayList<Filme> filmes = new ArrayList<>();
        Boolean flag = true;
        while (flag) {
            System.out.println("1-Cadastrar novo Filme\n2-Ver Filmes cadastrados\n3-Sair");
            int op = scan.nextInt();
            switch (op){
                case 1:
                    Filme filme = new Filme("Corra", "Terror psicologico");
                    filme.cadastrar();
                    filmes.add(filme);
                    break;
                case 2:
                    System.out.println("----------Filmes-------");
                    for (Filme film: filmes){
                        film.mostrarDetalherFilme();
                    }
                    break;
                case 3:
                    System.out.println("Saindo do Sistema");
                    flag = false;
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
            if(op==3){
                flag = false;
            }
        }
//4 - Classe Funcionario
        Funcionario funcionario = new Funcionario("Emilly", Cargo.JUNIOR, 3000.0, "Desenvolvimento web");
        funcionario.promover();
        funcionario.exibirDetalhes();

//5 - Classe Casa
        Casa casa = new Casa("av. Bernardo Vieira de Melo", 3, 75.0, 445000.00);
        casa.calcularValorImposto(0.02);
        casa.exibirDetalhes();
//6 - Classe Celular
        ArrayList<Aplicativo> aplicativos = new ArrayList<>();

        Celular celular = new Celular("Sansung Galaxy", "2.0", "Sansung", "ARX200", 32.0, aplicativos );
        celular.instalarAplicativo("Instagram", "34");
        celular.exibirInformacoes();

    }
}