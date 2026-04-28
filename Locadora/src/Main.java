import Model.Aluguel;
import Model.Filme;
import Model.Cliente;




public class Main {
    public static void main(String[] args) {

    Cliente cliente = new Cliente("maria","9984533637");
        System.out.println(cliente.getNome());

    Filme filme = new Filme("filme:" + " " + "velozes e furiosos","genero e valor:" + " " + "ação", 34.0);
    filme.exibirDetalhes();
    filme.aplicarDesconto();

    Aluguel aluguel = new Aluguel(cliente,filme,6);
    aluguel.calcularTotal();


    }
}