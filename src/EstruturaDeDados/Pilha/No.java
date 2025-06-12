package EstruturaDeDados.Pilha;

public class No {
    private int dado;
    private No referencia = null;


    public No(int dado) {
        this.dado = dado;
    }


    public No() {
    }


    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getReferencia() {
        return referencia;
    }

    public void setReferencia(No referencia) {
        this.referencia = referencia;
    }


    @Override
    public String toString() {
        return "\n"+ "No{" +
                "dado=" + dado +
                ", referencia=" + referencia +
                '}';
    }
}

//last in fist out = lifo