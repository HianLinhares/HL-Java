package EstruturaDeDados.Filas;

public class No {

    private Object object;
    private No refno;


    public No(Object object) {
        this.refno = null;
        this.object = object;
    }

    public No() {
    }


    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getRefno() {
        return refno;
    }

    public void setRefno(No refno) {
        this.refno = refno;
    }


    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                ", refno=" + refno +
                '}';
    }
}
