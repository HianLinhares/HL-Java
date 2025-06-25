package EstruturaDeDados.ListaEncadeada;

public class No<T> {
    private T conteudo;
    private No proximoNo;

    public No(No proximoNo) {
        this.proximoNo = null;
    }

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }


    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                ", proximoNo=" + proximoNo +
                '}';
    }

    public String toStringEncadeado() {
        String str = "No{" +
                "conteudo=" + conteudo +
                ", proximoNo=" + proximoNo +
                '}';
            if(proximoNo!=null){
                str += "->" +proximoNo.toString();
            }else{
                str += "-> null";
            }

        return str;
    }


}
