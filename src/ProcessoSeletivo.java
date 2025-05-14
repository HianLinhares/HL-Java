import java.util.Random;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "BRUNA", "MARCELA", "ELISANGELA", "MONICA",
                "TATIANE", "DANIEL", "JOÃO", "PEDRO"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }

    }


    public static void analisarCandidato(float salarioPretendido) {
        float salarioBase = 2000;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    public static void selecaoDeCandidatos() {
        Random aleatorio = new Random();
        String[] candidatos = {"FELIPE", "BRUNA", "MARCELA", "ELISANGELA", "MONICA",
                "TATIANE", "DANIEL", "JOÃO", "PEDRO"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        float salarioBase = 2000;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            float salarioopretendido = aleatorio.nextFloat(10000);
            System.out.println("O CANDIDATO " + candidato + " SOLICITOU ESTE VALOR DE SÁLARIO " + salarioopretendido);
            if (salarioBase >= salarioopretendido) {
                System.out.println("O CANDIDATO " + candidato + " FOI SELECIONADO PARA VAGA");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    public static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "BRUNA", "MARCELA", "ELISANGELA", "MONICA",
                "TATIANE", "DANIEL", "JOÃO", "PEDRO"};
        System.out.println("IMPRIMINDO LISTA DE CANDIDADOS COM O INDICE DOS ELEMENTOS");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("CANDIDATO DE NÚMERO: " + (i + 1) + " É " + candidatos[i]);
        }
    }

    public static void impressaoDeSelecionadosComForEach() {
        String[] candidatos = {"FELIPE", "BRUNA", "MARCELA", "ELISANGELA", "MONICA",
                "TATIANE", "DANIEL", "JOÃO", "PEDRO"};
        for (String candidato : candidatos) {
            System.out.println("O CANDIDATO SELECIONADO FOI " + candidato);
        }
    }

    public static boolean trueOrNo() {
        Random random = new Random();
        boolean atendeu = random.nextBoolean();
        return atendeu;
    }

    public static void entrandoEmContato(String candidato) {
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = trueOrNo();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativas++;
            } else {
                System.out.println("CONTATO REALIZADO");
            }
        } while (continuarTentando == true && tentativas <= 3);
        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO " + candidato + " NA TENTATIVA: " + tentativas);
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " +candidato);
        }


    }


}
