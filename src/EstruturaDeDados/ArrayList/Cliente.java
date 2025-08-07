package EstruturaDeDados.ArrayList;

public class Cliente {
    protected String nome;
    protected int idade;
    protected String rua;
    protected String bairro;
    protected String cidade;
    protected String CPF;


    public Cliente(String nome, int idade, String rua, String bairro, String cidade, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", CPF='" + CPF + '\'' +
                '}';
    }
}
