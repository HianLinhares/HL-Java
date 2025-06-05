package ExercicosJava;

public class Ex02 {
    public static void main(String[] args) {
        Ex02 exercio = new Ex02();
        exercio.mediaDasMedias(exercio.media1(), exercio.media2());
    }

    public int media1(){
        int media1 = (8+9+7)/3;
        return media1;
    }

    public int media2(){
        int media2 = (4+5+6)/3;
        return media2;
    }

    public void mediaDasMedias(int media1, int media2){
        int mediafinal = (media1 + media2)/2;
        System.out.println(mediafinal); ;
    }

}
