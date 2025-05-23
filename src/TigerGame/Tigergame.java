package TigerGame;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Tigergame {

    public static void main(String[] args) {
        Random sorteio = new Random();
        Scanner hl = new Scanner(System.in);
        int chute;
        int numerosorteado = sorteio.nextInt(100);
        int dinheiro = 10;
        for (int i = 0; i < 20; i++) {
            System.out.print("Chute um número: ");
            chute = hl.nextInt();
            if (numerosorteado>chute){
                System.out.print("O número chutado é menor que o número sorteado " +numerosorteado);
                dinheiro--;
                System.out.println();
            }else if (numerosorteado<chute){
                System.out.print("O número chutado é maior que o número sorteado "+numerosorteado);
                dinheiro--;
                System.out.println();
            }else if (numerosorteado==chute){
                System.out.print("ACERTOUU");
                System.out.println();
                break;
            }
        }
        System.out.println("Seu dinheiro final foi: "+dinheiro);
    }


}
