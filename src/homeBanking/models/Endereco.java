package homeBanking.models;

public class Endereco {
    private String logradouro;
    private int numero;
    private String cidade;
    private Estado estado;
    private String cep;

    public Endereco(String logradouro, int numero, String cidade, Estado estado, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Logradouro ='" + logradouro + '\'' +
                ", Número =" + numero +
                ", Cidade ='" + cidade + '\'' +
                ", Estado =" + estado +
                ", CEP ='" + cep + '\'' +
                '}';
    }
}
