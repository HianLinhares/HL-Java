import java.util.Scanner;

public class EstruturasCondicionais {


    public static void main(String[] args) {
        Scanner hl = new Scanner(System.in);

        //exemplo de condicional simples
        double saldo = 26.0;
        double saldoSolicitado = 14.0;
        if (saldoSolicitado<=saldo){
            saldo = saldo - saldoSolicitado;
            System.out.println("O saldo é: "+saldo);
        }



        //exemplo de condicional composta
        int idadeHian = 24;
        if (idadeHian==70){
            System.out.println("HIAN TEM 30 ANOS");
        }else{
            System.out.println("HIAN NÂO TEM 30 ANOS");
        }



        //exemplo de condicional encadeado
        int idadeHiuri = 17;
        if (idadeHiuri==70){
            System.out.println("HIAN TEM 30 ANOS");
        }else if(idadeHiuri==17){
            System.out.println("HIURI TEM 17 ANOS");
        } else{
            System.out.println("HIAN NÂO TEM 30 ANOS");
        }


        //condição ternárias

        int umMaisUm = 2;
        String resultado = umMaisUm==2 ? "Dois" : "Não é dois";
        System.out.println(resultado);


        //Switch case
        String dia = "segunda";

        switch (dia) {
            case "segunda":
                System.out.println("Início da semana");
                break;
            case "sexta":
                System.out.println("Sextou!");
                break;
            default:
                System.out.println("Dia comum");
        }
    }


}
