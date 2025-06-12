package EstruturaDeDados.Pilha;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }


    //verificação de referênica nula
    public boolean isEmpty() {
        if (refNoEntradaPilha == null) {
            return true;
        } else {
            return false;
        }
    }

    //retorno de referência
    public No top() {
        return refNoEntradaPilha;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReferencia(refAuxiliar);
    }

    //Excluir o último elementp de referênica
    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getReferencia();
            return noPoped;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "refNoEntradaPilha=" + refNoEntradaPilha +
                '}';
    }
}

