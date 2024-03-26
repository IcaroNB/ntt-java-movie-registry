import models.Diretor;
import models.Filme;
import models.Ator;
import models.Pessoa;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Seja bem vindo ao Movies Registry da NTT:");
        System.out.println("Digite o nome do filme que deseja registrar:");
        Filme filme = new Filme();
        filme.setNomeFilme(ler.next());

        System.out.println("Onde esse filme foi gravado?");
        filme.setEnderecoGravacao(ler.next());

        System.out.println("Qual a duração desse filme?");
        filme.setDuracaoFilme(ler.nextInt());

        System.out.println("Quando foram os inícios da Gravação?");
        filme.setDataInicioGravacao(ler.next());

        System.out.println("Quando as gravações terminaram?");
        filme.setDataFimGravacao(ler.next());

        Ator ator = new Ator();

        System.out.println("Qual ator participou desse filme?");
        ator.setNome(ler.next());

        System.out.println("Ele era o ator principal? (true para sim, false para não");
        ator.setAtorPrincipal(ler.nextBoolean());

        System.out.println("Em qual outro filme esse ator já atuou?");
        ator.setFilmeAtuado(ler.next());

        Diretor diretor = new Diretor();

        System.out.println("Quem foi o diretor desse filme?");
        diretor.setNome(ler.next());

        System.out.println("Qual outro filme ele já dirigiu?");
        diretor.setFilmeDirigido(ler.next());

        System.out.println("O filme cadastrado foi: \n" + filme.getNomeFilme() + "\n" + "Que foi gravado em " +
                filme.getEnderecoGravacao() + "\n" + "Esse filme tem a duração de " + filme.getDuracaoFilme() + " minutos\n"
        + "O ator " + ator.getNome() + " participou desse filme, que também foi dirigido por " + diretor.getNome() + "\n");


    }
}