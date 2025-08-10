package EstruturaDeDados.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<>();
        stackCarros.push(new Carro("Ford")); // adicionar na pilha
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop()); //remoção do último ‘item’ da pilha
        System.out.println(stackCarros);
        System.out.println(stackCarros.peek()); // mostra o último ‘item’ da pilha
        System.out.println(stackCarros.empty()); // retorna se a pilha esta vázia ou não (true ou false)

    }
}
