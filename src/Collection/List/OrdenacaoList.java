package Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) {
        List<Gato> listaDeGatos = new ArrayList<>();
        listaDeGatos.add(new Gato("John", 12, "Preto"));
        listaDeGatos.add(new Gato("Simba", 6, "amarelo"));
        listaDeGatos.add(new Gato("Rogério", 12, "Preto"));

        Collections.shuffle(listaDeGatos);
        System.out.println(listaDeGatos); // embaralhando a lista

        Collections.sort(listaDeGatos); //ordenando pelo nome
        System.out.println(listaDeGatos);


    }
}


class Gato implements Comparable<Gato> {
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}' +
                '\n';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
