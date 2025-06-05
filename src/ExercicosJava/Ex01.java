package ExercicosJava;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Ex01 exercicio = new Ex01();
        exercicio.calculoemdias(3, 2, 15);
    }

    public void calculoemdias(int anos, int meses, int dias) {
        Scanner hl = new Scanner(System.in);
        int anosVividos;
        int mesesVividos;
        int diasVividos;
        System.out.print("Informe por favor os anos de vida: ");
        anosVividos = hl.nextInt();
        System.out.print("Informe por favor os meses de vida: ");
        mesesVividos = hl.nextInt();
        System.out.print("Informe por favor os dias de vida: ");
        diasVividos = hl.nextInt();
        System.out.println();
        int conversorDeAnos = anosVividos * 365;
        int conversorDeMeses = mesesVividos * 30;
        int resultadoFinal = conversorDeAnos + conversorDeMeses + diasVividos;
        System.out.println(anosVividos + " anos, " + mesesVividos + " meses e " + diasVividos + " dias = " + resultadoFinal);
    }


}
