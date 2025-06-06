package ExercicosJava.POO;

public class Departamento extends Funcionario {
    public Departamento(String nome, double salario, String dataDeAdmissao) {
        super(nome, salario, dataDeAdmissao);
    }

    public static void main(String[] args) {
        Departamento dataBase[] = new Departamento[100];
        dataBase[0] = new Departamento("Hian",2935,"06/02/2024");

        for (int i = 0; i < dataBase.length ; i++) {
            if (dataBase[i]!=null){
                System.out.println(dataBase[i].nome);
            }


        }
    }
}
