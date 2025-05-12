import com.sun.tools.javac.Main;

import java.sql.SQLOutput;
import java.util.Random;

public class EstrturasDeRepeticoes {

    public static void main(String[] args) {

        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println("NUMERO RANDOMICO: "+num);

        // FOR
       String alunos[] = {"Hian", "Hiuri", "Diana"};
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }

        //WHILE
        int numero = 10;
        while (numero==10){
            System.out.println("Hello World");
            numero++;
        }



        // DO WHILE
       do {
           System.out.println("TOCANDO");
       }while (tocando()==true);
        System.out.println("ALÔ");


    }


    public static boolean tocando(){
        boolean atendeu = new Random().nextBoolean();
        boolean tocando = !atendeu;
        System.out.println("Atendeu ?" +atendeu);
        return tocando;
    }
}
