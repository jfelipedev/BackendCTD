package entities;

public class Hotel {
    private Integer id;
    private String nomeFilial;
    private String rua;
    private Integer numero;
    private String cidade;
    private String estado;
    private boolean e5estrelas;

    public Hotel(int id, String nomeFilial, String cidade, String rua, int numero, String estado, boolean e5estrelas) {
        this.id = id;
        this.nomeFilial = nomeFilial;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.estado = estado;
        this.e5estrelas = e5estrelas;
    }

    public Hotel(String nomeFilial, String cidade, String rua, int numero, String estado, boolean e5estrelas) {
        this.numero = numero;
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.e5estrelas = e5estrelas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isE5estrelas() {
        return e5estrelas;
    }

    public void e(boolean e5esterelas) {
        this.e5estrelas = e5estrelas;
    }

    @Override
    public String toString() {
        return "Nome='" + nomeFilial + '\'' +
                ", Rua='" + rua + '\'' +
                ", Numero='" + numero + '\'' +
                ", Cidade='" + cidade + '\'' +
                ", Estado='" + estado + '\'' +
                ", 5 estrelas? = " + e5estrelas +
                '}';
    }
}
