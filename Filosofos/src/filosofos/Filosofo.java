package filosofos;

public class Filosofo extends Thread {

    private int id;
    private Estados estado;
    private int nComidas;

    public Filosofo(int id, Estados c) {
        this.id = id;
        estado = c;
        nComidas = 0;
    }

    public void pensando() {
        System.out.println("Filosofo " + id + " pensando");
        try {
            Thread.sleep((int) (Math.random() * 400));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void comer() {
        nComidas++;
        System.out.println("Filosofo " + id + " comiendo -> Numero comidas:" + nComidas);
        try {
            Thread.sleep((int) (Math.random() * 500));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void run() {
        do {
            pensando();

            comer();
            estado.soltarTenedores(id);
        } while (true);
    }

}
