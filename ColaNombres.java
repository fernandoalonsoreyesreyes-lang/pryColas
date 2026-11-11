package uri.main;

/**
 *
 * @author Vaju1
 */
public class ColaNombres {
    final int MAX = 10;
    String[] cola;
    int frente, fin;

    public ColaNombres() {
        cola = new String[MAX];
        frente = 0;
        fin = -1;
    }
    
    private boolean colaVacia() {
        return (frente > fin);
    }
    
    private boolean colaLlena() {
        return (fin == MAX - 1);
    }
    
    public String poner(String dato) {
        if (colaLlena())
            return "Cola llena";
        else {
            fin++;
            cola[fin] = dato;
            return "Elemento insertado en la cola"; 
        }               
    }   
    
    public String quitar() {
        String dato;
        if (colaVacia()) {
            return "Subdesbordamiento - Cola Vacia";
        } else {
            dato = cola[frente];
            frente++;
            // Reiniciar índices si la cola queda vacía para aprovechar el espacio
            if (frente > fin) {
                frente = 0;
                fin = -1;
            }
            return dato;
        }
    }
    
    public String mostrar() {
        String datos = "";
        if (colaVacia()) {
            return "La cola está vacía";
        } else {
            for (int i = frente; i <= fin; i++) {
                datos += cola[i] + "\n";
            }
            return datos;
        }
    }
}
