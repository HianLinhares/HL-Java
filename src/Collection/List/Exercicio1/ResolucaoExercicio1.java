package Collection.List.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class ResolucaoExercicio1 {
    public static void main(String[] args) {
        List<mesesDoAno> temperaturas = new ArrayList<>();
        temperaturas.add(new mesesDoAno("JANEIRO",45d));
        temperaturas.add(new mesesDoAno("FEVEREIRO",32d));
        temperaturas.add(new mesesDoAno("MARÇO",23d));
        temperaturas.add(new mesesDoAno("ABRIL",17d));
        temperaturas.add(new mesesDoAno("MAIO",32d));
        temperaturas.add(new mesesDoAno("JUNHO",30d));


        double mediaSemestral  = 0;
        double somatorio = 0;
        for (int i = 0; i <temperaturas.size() ; i++) {
            somatorio += temperaturas.get(i).getTemperatura();
        }
        mediaSemestral = (int) somatorio/temperaturas.size();
        System.out.println(mediaSemestral);

        for (int i = 0; i <temperaturas.size() ; i++) {
            if (temperaturas.get(i).getTemperatura()>mediaSemestral){
                System.out.println(+(i+1)+"-"+temperaturas.get(i).getMes());
            }
        }

    }
}


class mesesDoAno{
    private String mes;
    private double temperatura;

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public mesesDoAno(String mes, double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "mesesDoAno{" +
                "mes='" + mes + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }
}