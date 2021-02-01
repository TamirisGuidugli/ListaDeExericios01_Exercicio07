package ListaDeExercicio01_Exercicio7;

public class TesteException {

    public static void main() {

        System.out.println("inicio do main");
        metodo1();
        System.out.println("fim do main");
    }

    private static void metodo1(){

        System.out.println("inicio do metodo1");
        metodo2();
        System. out.println("fim do metodol");
    }

    private static void metodo2(){

        System.out.println("inicio do metodo2");

        int[] array = new int[10];
        for (int i = 0; i <= 15; i++){
            try {
                array[i] = i;
                System.out.println(i);
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println(exception.getMessage());
            }
        }

        System.out.println("fim do metodo2");
    }
}