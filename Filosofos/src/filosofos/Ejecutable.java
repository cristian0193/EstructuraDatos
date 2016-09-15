package filosofos;

public class Ejecutable {

    public static void main(String[] args) {

        Estados c = new Estados(5);
        Filosofo f[] = new Filosofo[5];

        for (int contador = 0; contador < 5; contador++) {
            f[contador] = new Filosofo(contador, c);
            f[contador].start();
        }

        try {
            Thread.sleep((int) (8000));
        } catch (Exception ex1) {
            System.out.println(ex1);
        }
        System.exit(0);
    }
}
