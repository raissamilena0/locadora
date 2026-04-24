package Model;

public class Filme {
    public String titulo;
    public String genero;
    public String valoraluguel;
    private double preco;

    public Filme(String titulo, String genero, String valoraluguel) {
        this.titulo = titulo;
        this.genero = genero;
        this.valoraluguel = valoraluguel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGeneto() {
        return genero;
    }

    public void setGeneto(String geneto) {
        this.genero = geneto;
    }

    public String getValoraluguel() {
        return valoraluguel;
    }

    public void setValoraluguel(String valoraluguel) {
        this.valoraluguel = valoraluguel;
    }

    public void exibirDetalhes(){

    }

    private void aplicarDesconto(double porcentagem){
        this.preco -= this.preco *(porcentagem/100);

    }
}
