
//Clase Algoritmo Banquero.

package AlgoritmoBanquero;

//Imports.
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlgoritmoBanquero {
    //Variables.
    private final int[] recursosTotales;
    private int[] recursosDisponibles;
    private final List<Proceso> procesos;

    //Constructor.
    public AlgoritmoBanquero(int[] recursosTotales) {
        this.recursosTotales = recursosTotales;
        this.recursosDisponibles = recursosTotales.clone();
        this.procesos = new ArrayList<>();
    }

    //Método para agregar los procesos.
    public void agregarProceso(int[] recursosMaximos) {
        procesos.add(new Proceso(recursosMaximos));
    }

    //Método para solicitar los recursos.
    public boolean solicitarRecursos(int procesoId, int[] recursosSolicitados) {
        //Busca el ID del Proceso.
        Proceso proceso = encontrarProcesoPorId(procesoId);

        //Si no se encuentra, muestra un error.
        if (proceso == null) {
            JOptionPane.showMessageDialog(null, "Proceso no encontrado: ID " + procesoId, "Error", JOptionPane.ERROR_MESSAGE);  
            return false;
        }

        //Verifica la longitud del arreglo.
        if (recursosSolicitados.length != recursosDisponibles.length) {
            JOptionPane.showMessageDialog(null, "Error: Longitud del array de recursos solicitados no coincide con la de recursos disponibles.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    
        //Verifica si la solicitud es válida.
        for (int i = 0; i < recursosSolicitados.length; i++) {
            if (recursosSolicitados[i] > proceso.getRecursosNecesarios()[i]) {
                JOptionPane.showMessageDialog(null, "Error: Solicitud excede recursos necesarios.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (recursosSolicitados[i] > recursosDisponibles[i]) {
                JOptionPane.showMessageDialog(null, "Recursos no disponibles.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        //Simula la asignación temporal de recursos.
        int[] recursosDisponiblesTemp = recursosDisponibles.clone(); //Crea una copia para revertir si es necesario.
        int[] recursosAsignadosTemp = proceso.getRecursosAsignados().clone(); //Copia los recursos asignados actuales.
        int[] recursosNecesariosTemp = proceso.getRecursosNecesarios().clone(); //Copia los recursos necesarios actuales.

        //Realiza la asignación temporal.
        for (int i = 0; i < recursosDisponibles.length; i++) {
            recursosDisponibles[i] -= recursosSolicitados[i];
        }
        proceso.asignarRecursos(recursosSolicitados);

        //Verifica si el sistema está en un estado seguro después de la asignación.
        boolean seguro = esSolicitudSegura();

        if (seguro) {
            return true; //La solicitud es segura.
        } else {
            //Revierte la asignación si la solicitud no es segura.
            recursosDisponibles = recursosDisponiblesTemp; //Restaura recursos disponibles.
            proceso.setRecursosAsignados(recursosAsignadosTemp); //Restaura recursos asignados del proceso.
            proceso.setRecursosNecesarios(recursosNecesariosTemp); //Restaura recursos necesarios del proceso.

            //Muestra un mensaje y devuelve falso.
            JOptionPane.showMessageDialog(null, "La solicitud no es segura.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    //Método para liberar los recursos.
    public boolean liberarRecursos(int procesoId) {
        //Busca el Proceso por su ID:
        Proceso proceso = encontrarProcesoPorId(procesoId);
        
        //Si no lo encuentra, muestra error.
        if (proceso == null) {
            System.out.println("Proceso no encontrado: ID " + procesoId);
            return false;
        }

        //Verifica si el proceso está completo antes de liberarlo.
        if (!proceso.esCompleto()) {
            JOptionPane.showMessageDialog(null, "El proceso ID " + procesoId + " no está completo y no puede liberar recursos.", "Error", JOptionPane.ERROR_MESSAGE);  
            return false;
        }

        //Obtiene los recursos liberados.
        int[] recursosLiberados = proceso.getRecursosAsignados();
        
        //Devuelve los recursos al sistema.
        for (int i = 0; i < recursosDisponibles.length; i++) {
            recursosDisponibles[i] += recursosLiberados[i];
        }
        
        //Libera recursos en el proceso.
        proceso.liberarRecursos();

        //Elimina el proceso.
        procesos.remove(proceso);

        //Muestra mensaje.
        JOptionPane.showMessageDialog(null, "Recursos liberados del Proceso ID: " + procesoId, "Éxito", JOptionPane.INFORMATION_MESSAGE);
        
        //Devuelve true.
        return true;
    }

    //Método para buscar el proceso por ID.
    Proceso encontrarProcesoPorId(int id) {
        //Recorre los procesos en busca del ID y si lo encuentra lo deuvele, sino devuelve null.
        for (Proceso p : procesos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    //Método para obtener el siguiente ID.
    public int obtenerSiguienteId() {
        //Obtiene la lista de procesos
        List<Proceso> listProcesos = getProcesos();

        //Si no hay procesos, el siguiente ID es 1.
        if (listProcesos.isEmpty()) {
            return 1;
        }

        //Encuentra el ID máximo en la lista de procesos.
        int maxId = 0;
        for (Proceso p : listProcesos) {
            if (p.getId() > maxId) {
                maxId = p.getId();
            }
        }

        //El siguiente ID es el máximo ID + 1.
        return maxId + 1;
    }

    //Método para verficiar si la solicitud es segura o no.
    private boolean esSolicitudSegura() {
        //Inicializa un arreglo para rastrear los procesos que han terminado.
        boolean[] finish = new boolean[procesos.size()];
        
        //Crea una copia del array de recursos disponibles para simular el trabajo.
        int[] work = recursosDisponibles.clone();
        int count = 0; //Contador de procesos terminados.

        //Repite hasta que todos los procesos hayan terminado.
        while (count < procesos.size()) {
            boolean found = false; //Marca si se encontró algún proceso que pueda ser satisfecho.

            //Recorre la lista de procesos para verificar si alguno puede ser satisfecho.
            for (int i = 0; i < procesos.size(); i++) {
                if (!finish[i]) { //Solo revisa procesos que aún no han terminado.
                    Proceso p = procesos.get(i);
                    boolean puedeSatisfacer = true;

                    //Verifica si los recursos necesarios por el proceso pueden ser satisfechos con los recursos disponibles.
                    for (int j = 0; j < p.getRecursosNecesarios().length; j++) {
                        if (p.getRecursosNecesarios()[j] > work[j]) {
                            puedeSatisfacer = false;
                            break;
                        }
                    }

                    //Si el proceso puede ser satisfecho, actualiza los recursos disponibles.
                    if (puedeSatisfacer) {
                        for (int j = 0; j < work.length; j++) {
                            work[j] += p.getRecursosAsignados()[j];
                        }
                        finish[i] = true;
                        count++;
                        found = true;
                    }
                }
            }

            //Si no se encontró ningún proceso que pueda ser satisfecho, la solicitud no es segura.
            if (!found) {
                return false;
            }
        }

        //Si todos los procesos han terminado, la solicitud es segura.
        return true;
    }

    //Getters.
    public int[] getRecursosTotales() {
        return recursosTotales;
    }

    public int[] getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public List<Proceso> getProcesos() {
        return procesos;
    }

    //Crea un StringBuilder para construir la cadena de salida de manera eficiente.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Recursos Totales: ").append(arrayToString(recursosTotales)).append("\n");
        sb.append("Recursos Disponibles: ").append(arrayToString(recursosDisponibles)).append("\n");
        sb.append("Procesos:\n");
        for (Proceso p : procesos) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }

    //Crea un StringBuilder para construir la cadena de representación del array.
    private String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(i);
        }
        return sb.toString();
    }
}
