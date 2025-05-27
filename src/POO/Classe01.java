package POO;

public class Classe01 {

    public static void main(String[] args) {

        Aluno hian = new Aluno();
        hian.idade = 24;
        hian.nome = "Hian";
        System.out.println("Meu nome é " + hian.nome);
        System.out.println(hian.getIdade());
    }


    public static class Aluno {
        String nome;
        int idade;

        public Aluno(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
    }
}


