package EstruturaDeDados;

public class AtribuicaoEReferencia {
    public static void main(String[] args) {
        int a = 1;
        int b = a;

        System.out.println("A = " + a + " B = " + b);
        a = 2;
        //ATRIBUIÇÃO
        System.out.println("A = " + a + " B = " + b);


        MeuObj objA = new MeuObj(1);
        MeuObj objb = objA;
        //REFERÊRENCIA DE MEMÓRIA, objB está apontando para o
        // mesmo endereço de memória


        System.out.println("A = " + objA + " B = " + objb);
        objA.setNum(2);
        System.out.println("A = " + objA + " B = " + objb);
    }
}


/*

Em Java, variáveis de tipos primitivos (como int, double, boolean) armazenam valores diretamente.

Mas objetos (como instâncias de classes, arrays, Strings, etc.) são armazenados na memória heap, e as variáveis guardam apenas um ponteiro (referência)
para esse local na memória.

 */