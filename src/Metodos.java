public class Metodos {

public boolean ligada = false;
public int canal = 0;
public int volume = 0;

    public Metodos(boolean ligada, int canal, int volume) {
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;

    }

    public void mudancaDeEstado(){
    if (ligada){
        this.ligada = false;
    }else if(!this.ligada){
        this.ligada = true;
    }
}

    public void impressaoDeEstados(){
        System.out.println("A TV ESTÁ LIGADA ? : " +this.ligada);
        System.out.println("O VOLUME DA TV É: "+this.volume);
        System.out.println("O CANAL DA TV É: " +this.canal);
    }

    public void aumentarVolume(){
        this.volume++;
    }

    public void diminuirrVolume(){
        this.volume--;
    }

    public void aumentarCanal(){
        this.canal = this.canal + 1;
    }

    public void diminuirCanal(){
        this.canal--;
    }





}
