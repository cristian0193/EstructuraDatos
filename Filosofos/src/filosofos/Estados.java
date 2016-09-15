package filosofos;

public class Estados {

    private static final int estado_pensando = 0;
    private static final int estado_hambriento = 1;
    private static final int estado_comiendo = 2;
    private int numero_filosofos; 
    private int estado[];

    public Estados(int n) {
        this.numero_filosofos = n;
        estado = new int[n];
    }

    public synchronized void tomarTenedores(int id) {

        estado[id] = estado_hambriento;
        prueba(id);

        while (estado[id] != estado_comiendo)
        {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public synchronized void soltarTenedores(int identificador) {

        int derecha, izquierda;

        derecha = (identificador + 1) % numero_filosofos;
        izquierda = identificador - 1;
        if (izquierda < 0) {
            izquierda = numero_filosofos - 1;
        }

        estado[identificador] = estado_pensando;

        prueba(izquierda);
        prueba(derecha);
    }

    public void prueba(int identificador) {
        
        int derecha, izquierda;

        derecha = (identificador + 1) % numero_filosofos;
        izquierda = identificador - 1;
        if (izquierda < 0) {
            izquierda = numero_filosofos - 1;
        }

        if (estado[identificador] == estado_hambriento && estado[izquierda] != estado_comiendo && estado[derecha] != estado_comiendo) {
            estado[identificador] = estado_comiendo;
            notifyAll();
        }
    }

}
