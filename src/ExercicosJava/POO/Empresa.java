package ExercicosJava.POO;

public class Empresa extends Departamento {
    protected String cnpj;
    protected String departamentos;

    public Empresa(String nome, double salario, String dataDeAdmissao) {
        super(nome, salario, dataDeAdmissao);
    }

    public static void main(String[] args) {
        Empresa dataBase[] = new Empresa[10];
        dataBase[0] = new Empresa("Rethink",0,"12/07/2017");
        dataBase[0].cnpj = "1235789";
        dataBase[0].departamentos = "contabilidade";

        for (int i = 0; i < dataBase.length ; i++) {
            if (dataBase[i]!=null){
                System.out.println(dataBase[i].nome);
                System.out.println(dataBase[i].cnpj);
            }
        }
    }
}
