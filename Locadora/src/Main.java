import Model.Aluguel;
import Model.Filme;
import Model.Cliente;




public class Main {
    public static void main(String[] args) {

    Cliente cliente = new Cliente("maria","9984533637");

    Filme filme = new Filme("velozes e furiosos","ação","30,0");

    Aluguel aluguel = new Aluguel("maria","velozes e furiosos","4");

        System.out.println();
    }
}