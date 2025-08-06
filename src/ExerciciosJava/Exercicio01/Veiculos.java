package ExerciciosJava.Exercicio01;

    abstract class Veiculos {
        protected String modelo;
        protected String placa;
        protected int ano;
        protected boolean disponivel;

        public Veiculos(String modelo, String placa, int ano) {
            this.modelo = modelo;
            this.placa = placa;
            this.ano = ano;
            this.disponivel = true;
        }

        public void alugar() {
            if (disponivel) {
                disponivel = false;
                System.out.println("Veículo alugado com sucesso!");
            } else {
                System.out.println("Veículo já está alugado.");
            }
        }

        public void devolver() {
            if (!disponivel) {
                disponivel = true;
                System.out.println("Veículo devolvido com sucesso!");
            } else {
                System.out.println("Veículo já está disponível.");
            }
        }

        public String getPlaca() {
            return placa;
        }

        public boolean isDisponivel() {
            return disponivel;
        }

        public abstract void exibirDetalhes();
    }

