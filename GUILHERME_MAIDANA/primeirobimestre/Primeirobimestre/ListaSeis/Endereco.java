package primeirobimestre.Primeirobimestre.ListaSeis;public class Endereco {
    String estado;
    String cidade;
    String bairro;
    String numero;
    String complemento;

    public Endereco(String estado, String cidade, String bairro, String numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void apresentarSe() {
        System.out.println("EndereÃ§o: " + numero + ", " + complemento + ", " + bairro + ", " + cidade + " - " + estado);
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return numero + ", " + complemento;
    }
}   