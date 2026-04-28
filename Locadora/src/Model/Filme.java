package Model;

public class Filme {
    public String titulo;
    public String genero;
    private Double valor;

    public Filme(String titulo, String genero, Double valor) {
        this.titulo = titulo;
        this.genero = genero;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String geneto) {
        this.genero = geneto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void exibirDetalhes(){
        System.out.println(getTitulo() + " " + getGenero() + " " + getValor());
    }

    public void aplicarDesconto(){
        double desc = -10;

        System.out.println("valor com desconto é: " + desc);
    }

}
