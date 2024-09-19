
//Clase Prcoeso.

package AlgoritmoBanquero;

public class Proceso {
    //Variables.
    private static int nextId = 1;
    private final int id;
    private final int[] recursosMaximos;
    private int[] recursosAsignados;
    private int[] recursosNecesarios;

    //Constructor.
    public Proceso(int[] recursosMaximos) {
        this.id = nextId++;
        this.recursosMaximos = recursosMaximos;
        this.recursosAsignados = new int[recursosMaximos.length];
        this.recursosNecesarios = recursosMaximos.clone();
    }

    //Getters and Setters.
    public int getId() {
        return id;
    }

    public int[] getRecursosMaximos() {
        return recursosMaximos;
    }

    public int[] getRecursosAsignados() {
        return recursosAsignados;
    }

    public void setRecursosAsignados(int[] recursosAsignados) {
        this.recursosAsignados = recursosAsignados.clone();
    }

    public int[] getRecursosNecesarios() {
        return recursosNecesarios;
    }

    public void setRecursosNecesarios(int[] recursosNecesarios) {
        this.recursosNecesarios = recursosNecesarios.clone();
    }

    // - - - - - - - - - - - - - - - - - - - Métodos - - - - - - - - - - - - - - - - - - - //
    //Método para asignar los recursos.
    public void asignarRecursos(int[] recursosSolicitados) {
        for (int i = 0; i < recursosAsignados.length; i++) {
            recursosAsignados[i] += recursosSolicitados[i];
            recursosNecesarios[i] -= recursosSolicitados[i];
        }
    }

    //Método para liberar los recursos.
    public void liberarRecursos() {
        for (int i = 0; i < recursosAsignados.length; i++) {
            recursosAsignados[i] = 0; //Restablece los recursos asignados a cero
        }
    }

    //Método para verificar si se completó.
    public boolean esCompleto() {
        for (int i = 0; i < recursosMaximos.length; i++) {
            if (recursosAsignados[i] < recursosMaximos[i]) {
                return false;
            }
        }
        return true;
    }

    //Devuelve una representación en cadena del objeto Proceso.
    @Override
    public String toString() {
        return String.format("Proceso ID %d:\nRecursos Máximos: %s\nRecursos Asignados: %s\nRecursos Necesarios: %s",
                id, arrayToString(recursosMaximos), arrayToString(recursosAsignados), arrayToString(recursosNecesarios));
    }

    //Convierte un array de enteros en una cadena separada por comas.
    private String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        return sb.toString();
    }
}
