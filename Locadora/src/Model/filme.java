package Model;

public class filme {
    public String titulo;
    public String geneto;
    public String valoraluguel;

    public filme(String titulo, String geneto, String valoraluguel) {
        this.titulo = titulo;
        this.geneto = geneto;
        this.valoraluguel = valoraluguel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGeneto() {
        return geneto;
    }

    public void setGeneto(String geneto) {
        this.geneto = geneto;
    }

    public String getValoraluguel() {
        return valoraluguel;
    }

    public void setValoraluguel(String valoraluguel) {
        this.valoraluguel = valoraluguel;
    }

    public void exibirDetalhes(){

    }

    private void aplicarDesconto(){

    }
}
