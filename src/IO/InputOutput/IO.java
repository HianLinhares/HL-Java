package IO.InputOutput;

import java.io.*;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) throws IOException {
        indicacaoDeFilmes();
        receberDoTecladoEImprimirConsole();
    }

    //Abrir o teclado e recomendando 3 filmes e indicando by Hian Linhares
    static void indicacaoDeFilmes() {
        Scanner hl = new Scanner(System.in);
        System.out.println("Digite 3 filmes que você gostaria de recomendar: ");
        System.out.print("Filme 1: ");
        String filmeum = hl.nextLine();
        System.out.println();
        System.out.print("Filme 2: ");
        String filmedois = hl.nextLine();
        System.out.println();
        System.out.print("Filme 3: ");
        String filmetres = hl.nextLine();
        System.out.println();
        System.out.println("Suas indicações: ");
        System.out.println(filmeum);
        System.out.println(filmedois);
        System.out.println(filmetres);

    }

    static void receberDoTecladoEImprimirConsole() throws IOException {
//        InputStream is = System.in;
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);

        //Padrão decorator
        System.out.println("Recomende 3 filmes: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

//        OutputStream os = System.out;
//        OutputStreamWriter osw = new OutputStreamWriter(os);
//        BufferedWriter bw = new BufferedWriter(osw);

        //Padrão decorator
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!(line.isEmpty()));
        bw.flush();
        br.close();
        br.close();
    }


}
