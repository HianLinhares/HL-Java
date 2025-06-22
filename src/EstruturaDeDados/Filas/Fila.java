package EstruturaDeDados.Filas;

public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null;
    }

    public void enqueue(No novoNo) {
        novoNo.setRefno(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefno() != null) {
                } else {
                    break;
                }
            }
        }
        return null;
    }


    public No dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefno() != null) {
                    noAuxiliar = primeiroNo;
                } else {
                    noAuxiliar.setRefno(null);
                    break;
                }
            }
        }
        return null;
    }


    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;
        if (refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[NO{objeto=" + noAuxiliar.getObject() + "}]--->";
                noAuxiliar = noAuxiliar.getRefno();
                if (noAuxiliar.getRefno() != null) {
                    noAuxiliar = noAuxiliar.getRefno();
                } else {
                    stringRetorno = "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
