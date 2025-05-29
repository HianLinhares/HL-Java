
AGLOMERAR FUNCIONALIDADES QUE SÓ VÃO ACONTECER DENTRO DA PRÓPRIA CLASSE


Encapsulamento é um dos pilares da programação orientada a objetos.
Seu objetivo é ocultar os detalhes internos de uma classe e expor apenas o necessário para o uso externo.
Isso é feito protegendo os dados por meio de atributos privados e fornecendo acesso controlado com métodos públicos, como getters e setters.

✅ Benefícios:
Segurança: impede alterações indesejadas nos dados.

Organização: separa o "como funciona" do "como é usado".

Manutenção: facilita ajustes sem impactar quem usa a classe.

Em resumo: encapsular é proteger e organizar.

Se quiser, posso adaptar o design com ícones, cores ou aplicar um layout gráfico em imagem para uso em painéis verticais ou apresentações. Deseja isso?



// Classe com encapsulamento
public class ContaBancaria {

    // Atributos privados (não acessíveis diretamente)
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getter para o titular
    public String getTitular() {
        return titular;
    }

    // Setter para o titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Getter para o saldo (somente leitura)
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // Método para sacar dinheiro com verificação
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria", 1000);

        conta.depositar(500);
        conta.sacar(300);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}


