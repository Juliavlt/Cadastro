package ifsp.pdm.cadastro;

public class Formulario {
    private String nome;
    private String telefone;
    private String email;
    private Boolean ingressarLista;
    private String sexo;
    private String cidade;
    private String UF;

    public Formulario() {
    }

    public Formulario(String nome, String telefone, String email, Boolean ingressarLista, String sexo, String cidade, String UF) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.ingressarLista = ingressarLista;
        this.sexo = sexo;
        this.cidade = cidade;
        this.UF = UF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIngressarLista() {
        return ingressarLista;
    }

    public void setIngressarLista(Boolean ingressarLista) {
        this.ingressarLista = ingressarLista;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", ingressarLista=" + ingressarLista +
                ", sexo='" + sexo + '\'' +
                ", cidade='" + cidade + '\'' +
                ", UF='" + UF + '\'' +
                '}';
    }
}
