package Model;

public class Aluguel {
    private String cliente;
    private String filme;
    private String dias;

    public Aluguel(String cliente, String filme, String dias) {
        this.cliente = cliente;
        this.filme = filme;
        this.dias = dias;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public double calcularTotal(){

        return 0;
    }

    public String resumo;

    public String getResumo() {
        return resumo;
    }
}
