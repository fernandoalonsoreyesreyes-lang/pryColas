package uri.main;

import javax.swing.JOptionPane;
/**
 *
 * @author Vaju1
 */
public class EjemploCola1 {

    public static void main(String[] args) {
        ColaNombres objCola = new ColaNombres();
        int opcion;
        String nombre;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU DE OPCIONES - COLAS\n"
                    + "1. Poner elemento en la Cola\n"
                    + "2. Quitar elemento de la Cola\n"
                    + "3. Mostrar elementos de la Cola\n"
                    + "4. Salir\n\n"
                    + "Seleccione una opción:"));

            switch (opcion) {
                case 1:
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre que desea insertar:");
                    if (nombre != null && !nombre.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, objCola.poner(nombre));
                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Elemento eliminado: " + objCola.quitar());
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Elementos de la cola:\n" + objCola.mostrar());
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa de colas...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }

        } while (opcion != 4);
    }
}
