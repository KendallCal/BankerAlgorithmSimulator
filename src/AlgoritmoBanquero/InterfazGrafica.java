
/*
    Universidad Estatal a Distancia.
    Kendall Andrey Calderón Burgos.
    Segundo Cuatrimestre 2024.
 */

//Interfaz Grafica.
package AlgoritmoBanquero;

//Imports.
import java.awt.Color;
import javax.swing.JOptionPane;

public class InterfazGrafica extends javax.swing.JFrame {
    //Instancias.
    private AlgoritmoBanquero algoritmo;

    //Constructor.
    public InterfazGrafica() {
        //Inicializa los componentes.
        initComponents();
        
        //Asigna un titulo al programa.
        setTitle("Algoritmo del Banquero. Sistemas Operativos.");
        
        //Inicializa los recursos.
        algoritmo = new AlgoritmoBanquero(new int[]{0, 0, 0});
    }

    //Design.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        tituloControlProcesos4 = new javax.swing.JLabel();
        contenedorDatos = new javax.swing.JPanel();
        panelRecursosSistema = new javax.swing.JPanel();
        tituloRecursosSistema = new javax.swing.JLabel();
        panelRecursos = new javax.swing.JPanel();
        panelRecursosTotales = new javax.swing.JPanel();
        textoRecursosTotales = new javax.swing.JLabel();
        recursosTotales = new javax.swing.JTextField();
        panelAgregarRecursosSistemaBtn = new javax.swing.JPanel();
        btnAgregarRecursosSistema = new javax.swing.JLabel();
        panelDatosProceso = new javax.swing.JPanel();
        tituloDatosProceso1 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        panelID = new javax.swing.JPanel();
        textoID = new javax.swing.JLabel();
        idProceso = new javax.swing.JTextField();
        panelRecursosMaximos = new javax.swing.JPanel();
        textoRecursosMaximos2 = new javax.swing.JLabel();
        recursosMaximos = new javax.swing.JTextField();
        panelAgregarProcesoBtn = new javax.swing.JPanel();
        btnAgregarProceso = new javax.swing.JLabel();
        panelOperacionRecursps = new javax.swing.JPanel();
        tituloOperacionRecursps = new javax.swing.JLabel();
        panelDatosOperaciones = new javax.swing.JPanel();
        panelIDOperacion = new javax.swing.JPanel();
        textoIDOperacion = new javax.swing.JLabel();
        idOperacion = new javax.swing.JComboBox<>();
        panelRecursosSolicitados = new javax.swing.JPanel();
        textoRecursosSolicitados = new javax.swing.JLabel();
        recursosSolicitados = new javax.swing.JTextField();
        panelSolicitarRecursoBtn = new javax.swing.JPanel();
        btnSolicitarRecurso = new javax.swing.JLabel();
        panelLiberarRecursoBtn = new javax.swing.JPanel();
        btnLiberarRecurso = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        contenedorEstado = new javax.swing.JPanel();
        tituloEstadoSistema = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        estadoSistema = new javax.swing.JTextArea();
        panelMostrarDatos = new javax.swing.JPanel();
        panelMostrarTotales = new javax.swing.JPanel();
        textoTotales = new javax.swing.JLabel();
        mostrarRecursosTotales = new javax.swing.JTextField();
        panelMostrarDisponibles = new javax.swing.JPanel();
        textoRecursosDisponibles = new javax.swing.JLabel();
        mostrarRecursosDisponibles = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(925, 650));
        setMinimumSize(new java.awt.Dimension(925, 650));
        setSize(new java.awt.Dimension(925, 650));

        panelPrincipal.setBackground(new java.awt.Color(19, 34, 50));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(925, 650));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(925, 650));
        panelPrincipal.setName(""); // NOI18N
        panelPrincipal.setPreferredSize(new java.awt.Dimension(925, 650));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloControlProcesos4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        tituloControlProcesos4.setForeground(new java.awt.Color(255, 255, 255));
        tituloControlProcesos4.setText("Algoritmo del Banquero");
        panelPrincipal.add(tituloControlProcesos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        contenedorDatos.setOpaque(false);

        panelRecursosSistema.setMaximumSize(new java.awt.Dimension(245, 158));
        panelRecursosSistema.setMinimumSize(new java.awt.Dimension(245, 158));
        panelRecursosSistema.setOpaque(false);
        panelRecursosSistema.setPreferredSize(new java.awt.Dimension(245, 158));

        tituloRecursosSistema.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tituloRecursosSistema.setForeground(new java.awt.Color(255, 255, 255));
        tituloRecursosSistema.setText("Recursos del sistema");

        panelRecursos.setOpaque(false);
        panelRecursos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 8));

        panelRecursosTotales.setMaximumSize(new java.awt.Dimension(320, 30));
        panelRecursosTotales.setMinimumSize(new java.awt.Dimension(320, 30));
        panelRecursosTotales.setOpaque(false);
        panelRecursosTotales.setPreferredSize(new java.awt.Dimension(230, 30));
        panelRecursosTotales.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 4));

        textoRecursosTotales.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        textoRecursosTotales.setForeground(new java.awt.Color(255, 255, 255));
        textoRecursosTotales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textoRecursosTotales.setText("Recursos Totales:");
        textoRecursosTotales.setMaximumSize(new java.awt.Dimension(140, 17));
        textoRecursosTotales.setMinimumSize(new java.awt.Dimension(140, 17));
        textoRecursosTotales.setPreferredSize(new java.awt.Dimension(125, 17));
        panelRecursosTotales.add(textoRecursosTotales);

        recursosTotales.setBackground(new java.awt.Color(255, 255, 255));
        recursosTotales.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        recursosTotales.setForeground(new java.awt.Color(0, 0, 0));
        recursosTotales.setMaximumSize(new java.awt.Dimension(80, 23));
        recursosTotales.setMinimumSize(new java.awt.Dimension(80, 23));
        recursosTotales.setPreferredSize(new java.awt.Dimension(80, 23));
        panelRecursosTotales.add(recursosTotales);

        panelRecursos.add(panelRecursosTotales);

        panelAgregarRecursosSistemaBtn.setBackground(new java.awt.Color(242, 242, 242));
        panelAgregarRecursosSistemaBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)));
        panelAgregarRecursosSistemaBtn.setMaximumSize(new java.awt.Dimension(150, 35));
        panelAgregarRecursosSistemaBtn.setMinimumSize(new java.awt.Dimension(150, 35));
        panelAgregarRecursosSistemaBtn.setPreferredSize(new java.awt.Dimension(150, 35));
        panelAgregarRecursosSistemaBtn.setLayout(new java.awt.BorderLayout());

        btnAgregarRecursosSistema.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarRecursosSistema.setForeground(new java.awt.Color(19, 34, 50));
        btnAgregarRecursosSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregarRecursosSistema.setText("Agregar Recursos");
        btnAgregarRecursosSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarRecursosSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarRecursosSistemaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarRecursosSistemaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarRecursosSistemaMouseExited(evt);
            }
        });
        panelAgregarRecursosSistemaBtn.add(btnAgregarRecursosSistema, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout panelRecursosSistemaLayout = new javax.swing.GroupLayout(panelRecursosSistema);
        panelRecursosSistema.setLayout(panelRecursosSistemaLayout);
        panelRecursosSistemaLayout.setHorizontalGroup(
            panelRecursosSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecursosSistemaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRecursosSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloRecursosSistema)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRecursosSistemaLayout.createSequentialGroup()
                        .addComponent(panelAgregarRecursosSistemaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRecursosSistemaLayout.createSequentialGroup()
                .addComponent(panelRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        panelRecursosSistemaLayout.setVerticalGroup(
            panelRecursosSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecursosSistemaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tituloRecursosSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(panelRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(panelAgregarRecursosSistemaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        panelDatosProceso.setMaximumSize(new java.awt.Dimension(245, 158));
        panelDatosProceso.setMinimumSize(new java.awt.Dimension(245, 158));
        panelDatosProceso.setOpaque(false);
        panelDatosProceso.setPreferredSize(new java.awt.Dimension(245, 158));

        tituloDatosProceso1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tituloDatosProceso1.setForeground(new java.awt.Color(255, 255, 255));
        tituloDatosProceso1.setText("Datos del Proceso");

        panelDatos.setOpaque(false);
        panelDatos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 8));

        panelID.setMaximumSize(new java.awt.Dimension(250, 30));
        panelID.setMinimumSize(new java.awt.Dimension(250, 30));
        panelID.setOpaque(false);
        panelID.setPreferredSize(new java.awt.Dimension(250, 30));
        panelID.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 4));

        textoID.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        textoID.setForeground(new java.awt.Color(255, 255, 255));
        textoID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textoID.setText("ID del Proceso:");
        textoID.setMaximumSize(new java.awt.Dimension(140, 17));
        textoID.setMinimumSize(new java.awt.Dimension(140, 17));
        textoID.setPreferredSize(new java.awt.Dimension(140, 17));
        panelID.add(textoID);

        idProceso.setEditable(false);
        idProceso.setBackground(new java.awt.Color(255, 255, 255));
        idProceso.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        idProceso.setForeground(new java.awt.Color(0, 0, 0));
        idProceso.setEnabled(false);
        idProceso.setMaximumSize(new java.awt.Dimension(80, 23));
        idProceso.setMinimumSize(new java.awt.Dimension(80, 23));
        idProceso.setPreferredSize(new java.awt.Dimension(80, 23));
        panelID.add(idProceso);

        panelDatos.add(panelID);

        panelRecursosMaximos.setMaximumSize(new java.awt.Dimension(250, 30));
        panelRecursosMaximos.setMinimumSize(new java.awt.Dimension(250, 30));
        panelRecursosMaximos.setOpaque(false);
        panelRecursosMaximos.setPreferredSize(new java.awt.Dimension(250, 30));
        panelRecursosMaximos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 4));

        textoRecursosMaximos2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        textoRecursosMaximos2.setForeground(new java.awt.Color(255, 255, 255));
        textoRecursosMaximos2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textoRecursosMaximos2.setText("Recursos Máximos:");
        textoRecursosMaximos2.setMaximumSize(new java.awt.Dimension(140, 17));
        textoRecursosMaximos2.setMinimumSize(new java.awt.Dimension(140, 17));
        textoRecursosMaximos2.setPreferredSize(new java.awt.Dimension(140, 17));
        panelRecursosMaximos.add(textoRecursosMaximos2);

        recursosMaximos.setBackground(new java.awt.Color(255, 255, 255));
        recursosMaximos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        recursosMaximos.setForeground(new java.awt.Color(0, 0, 0));
        recursosMaximos.setEnabled(false);
        recursosMaximos.setMaximumSize(new java.awt.Dimension(80, 23));
        recursosMaximos.setMinimumSize(new java.awt.Dimension(80, 23));
        recursosMaximos.setPreferredSize(new java.awt.Dimension(80, 23));
        panelRecursosMaximos.add(recursosMaximos);

        panelDatos.add(panelRecursosMaximos);

        panelAgregarProcesoBtn.setBackground(new java.awt.Color(242, 242, 242));
        panelAgregarProcesoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)));
        panelAgregarProcesoBtn.setEnabled(false);
        panelAgregarProcesoBtn.setMaximumSize(new java.awt.Dimension(150, 35));
        panelAgregarProcesoBtn.setMinimumSize(new java.awt.Dimension(150, 35));
        panelAgregarProcesoBtn.setPreferredSize(new java.awt.Dimension(150, 35));
        panelAgregarProcesoBtn.setLayout(new java.awt.BorderLayout());

        btnAgregarProceso.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarProceso.setForeground(new java.awt.Color(19, 34, 50));
        btnAgregarProceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregarProceso.setText("Agregar Proceso");
        btnAgregarProceso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProceso.setEnabled(false);
        btnAgregarProceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarProcesoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarProcesoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarProcesoMouseExited(evt);
            }
        });
        panelAgregarProcesoBtn.add(btnAgregarProceso, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout panelDatosProcesoLayout = new javax.swing.GroupLayout(panelDatosProceso);
        panelDatosProceso.setLayout(panelDatosProcesoLayout);
        panelDatosProcesoLayout.setHorizontalGroup(
            panelDatosProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(panelDatosProcesoLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(panelDatosProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloDatosProceso1)
                    .addComponent(panelAgregarProcesoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panelDatosProcesoLayout.setVerticalGroup(
            panelDatosProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosProcesoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tituloDatosProceso1)
                .addGap(5, 5, 5)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panelAgregarProcesoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelOperacionRecursps.setMaximumSize(new java.awt.Dimension(245, 158));
        panelOperacionRecursps.setMinimumSize(new java.awt.Dimension(245, 158));
        panelOperacionRecursps.setOpaque(false);
        panelOperacionRecursps.setPreferredSize(new java.awt.Dimension(245, 158));

        tituloOperacionRecursps.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tituloOperacionRecursps.setForeground(new java.awt.Color(255, 255, 255));
        tituloOperacionRecursps.setText("Operación de Recursos");

        panelDatosOperaciones.setOpaque(false);
        panelDatosOperaciones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 8));

        panelIDOperacion.setMaximumSize(new java.awt.Dimension(250, 30));
        panelIDOperacion.setMinimumSize(new java.awt.Dimension(250, 30));
        panelIDOperacion.setOpaque(false);
        panelIDOperacion.setPreferredSize(new java.awt.Dimension(250, 30));
        panelIDOperacion.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 4));

        textoIDOperacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        textoIDOperacion.setForeground(new java.awt.Color(255, 255, 255));
        textoIDOperacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textoIDOperacion.setText("ID del Proceso:");
        textoIDOperacion.setMaximumSize(new java.awt.Dimension(140, 17));
        textoIDOperacion.setMinimumSize(new java.awt.Dimension(140, 17));
        textoIDOperacion.setPreferredSize(new java.awt.Dimension(140, 17));
        panelIDOperacion.add(textoIDOperacion);

        idOperacion.setBackground(new java.awt.Color(255, 255, 255));
        idOperacion.setEnabled(false);
        idOperacion.setMinimumSize(new java.awt.Dimension(80, 23));
        idOperacion.setPreferredSize(new java.awt.Dimension(80, 23));
        idOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idOperacionActionPerformed(evt);
            }
        });
        panelIDOperacion.add(idOperacion);

        panelDatosOperaciones.add(panelIDOperacion);

        panelRecursosSolicitados.setMaximumSize(new java.awt.Dimension(250, 30));
        panelRecursosSolicitados.setMinimumSize(new java.awt.Dimension(250, 30));
        panelRecursosSolicitados.setOpaque(false);
        panelRecursosSolicitados.setPreferredSize(new java.awt.Dimension(250, 30));
        panelRecursosSolicitados.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 4));

        textoRecursosSolicitados.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        textoRecursosSolicitados.setForeground(new java.awt.Color(255, 255, 255));
        textoRecursosSolicitados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textoRecursosSolicitados.setText("Recursos Solicitados:");
        textoRecursosSolicitados.setMaximumSize(new java.awt.Dimension(140, 17));
        textoRecursosSolicitados.setMinimumSize(new java.awt.Dimension(140, 17));
        textoRecursosSolicitados.setPreferredSize(new java.awt.Dimension(140, 17));
        panelRecursosSolicitados.add(textoRecursosSolicitados);

        recursosSolicitados.setBackground(new java.awt.Color(255, 255, 255));
        recursosSolicitados.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        recursosSolicitados.setForeground(new java.awt.Color(0, 0, 0));
        recursosSolicitados.setEnabled(false);
        recursosSolicitados.setMaximumSize(new java.awt.Dimension(80, 23));
        recursosSolicitados.setMinimumSize(new java.awt.Dimension(80, 23));
        recursosSolicitados.setPreferredSize(new java.awt.Dimension(80, 23));
        panelRecursosSolicitados.add(recursosSolicitados);

        panelDatosOperaciones.add(panelRecursosSolicitados);

        panelSolicitarRecursoBtn.setBackground(new java.awt.Color(242, 242, 242));
        panelSolicitarRecursoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)));
        panelSolicitarRecursoBtn.setEnabled(false);
        panelSolicitarRecursoBtn.setMaximumSize(new java.awt.Dimension(150, 35));
        panelSolicitarRecursoBtn.setMinimumSize(new java.awt.Dimension(150, 35));
        panelSolicitarRecursoBtn.setPreferredSize(new java.awt.Dimension(100, 35));
        panelSolicitarRecursoBtn.setLayout(new java.awt.BorderLayout());

        btnSolicitarRecurso.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSolicitarRecurso.setForeground(new java.awt.Color(19, 34, 50));
        btnSolicitarRecurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSolicitarRecurso.setText("Solicitar");
        btnSolicitarRecurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSolicitarRecurso.setEnabled(false);
        btnSolicitarRecurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSolicitarRecursoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSolicitarRecursoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSolicitarRecursoMouseExited(evt);
            }
        });
        panelSolicitarRecursoBtn.add(btnSolicitarRecurso, java.awt.BorderLayout.CENTER);

        panelLiberarRecursoBtn.setBackground(new java.awt.Color(242, 242, 242));
        panelLiberarRecursoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)));
        panelLiberarRecursoBtn.setMaximumSize(new java.awt.Dimension(150, 35));
        panelLiberarRecursoBtn.setMinimumSize(new java.awt.Dimension(150, 35));
        panelLiberarRecursoBtn.setPreferredSize(new java.awt.Dimension(100, 35));
        panelLiberarRecursoBtn.setLayout(new java.awt.BorderLayout());

        btnLiberarRecurso.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnLiberarRecurso.setForeground(new java.awt.Color(19, 34, 50));
        btnLiberarRecurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLiberarRecurso.setText("Liberar");
        btnLiberarRecurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLiberarRecurso.setEnabled(false);
        btnLiberarRecurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLiberarRecursoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLiberarRecursoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLiberarRecursoMouseExited(evt);
            }
        });
        panelLiberarRecursoBtn.add(btnLiberarRecurso, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout panelOperacionRecurspsLayout = new javax.swing.GroupLayout(panelOperacionRecursps);
        panelOperacionRecursps.setLayout(panelOperacionRecurspsLayout);
        panelOperacionRecurspsLayout.setHorizontalGroup(
            panelOperacionRecurspsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatosOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(panelOperacionRecurspsLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(panelSolicitarRecursoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(panelLiberarRecursoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(panelOperacionRecurspsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloOperacionRecursps)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOperacionRecurspsLayout.setVerticalGroup(
            panelOperacionRecurspsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionRecurspsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tituloOperacionRecursps)
                .addGap(8, 8, 8)
                .addComponent(panelDatosOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(panelOperacionRecurspsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLiberarRecursoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelSolicitarRecursoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout contenedorDatosLayout = new javax.swing.GroupLayout(contenedorDatos);
        contenedorDatos.setLayout(contenedorDatosLayout);
        contenedorDatosLayout.setHorizontalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(panelRecursosSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 51, Short.MAX_VALUE)
                .addComponent(panelDatosProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 51, Short.MAX_VALUE)
                .addComponent(panelOperacionRecursps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        contenedorDatosLayout.setVerticalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelDatosProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contenedorDatosLayout.createSequentialGroup()
                            .addComponent(panelRecursosSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)))
                    .addComponent(panelOperacionRecursps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(285, 285, 285))
        );

        panelPrincipal.add(contenedorDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 930, 170));
        panelPrincipal.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 880, 10));

        contenedorEstado.setOpaque(false);

        tituloEstadoSistema.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tituloEstadoSistema.setForeground(new java.awt.Color(255, 255, 255));
        tituloEstadoSistema.setText("Estado del Sistema");

        estadoSistema.setEditable(false);
        estadoSistema.setBackground(new java.awt.Color(255, 255, 255));
        estadoSistema.setColumns(20);
        estadoSistema.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        estadoSistema.setForeground(new java.awt.Color(0, 0, 0));
        estadoSistema.setRows(5);
        estadoSistema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jScrollPane2.setViewportView(estadoSistema);

        panelMostrarDatos.setBackground(new java.awt.Color(102, 102, 102));
        panelMostrarDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        panelMostrarDatos.setOpaque(false);
        panelMostrarDatos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 43));

        panelMostrarTotales.setMaximumSize(new java.awt.Dimension(183, 82));
        panelMostrarTotales.setMinimumSize(new java.awt.Dimension(183, 82));
        panelMostrarTotales.setOpaque(false);
        panelMostrarTotales.setPreferredSize(new java.awt.Dimension(183, 82));
        panelMostrarTotales.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        textoTotales.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        textoTotales.setForeground(new java.awt.Color(255, 255, 255));
        textoTotales.setText("Recursos Totales");
        panelMostrarTotales.add(textoTotales);

        mostrarRecursosTotales.setEditable(false);
        mostrarRecursosTotales.setBackground(new java.awt.Color(19, 34, 50));
        mostrarRecursosTotales.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        mostrarRecursosTotales.setForeground(new java.awt.Color(255, 255, 255));
        mostrarRecursosTotales.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mostrarRecursosTotales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        mostrarRecursosTotales.setMaximumSize(new java.awt.Dimension(100, 25));
        mostrarRecursosTotales.setMinimumSize(new java.awt.Dimension(100, 25));
        mostrarRecursosTotales.setPreferredSize(new java.awt.Dimension(100, 25));
        panelMostrarTotales.add(mostrarRecursosTotales);

        panelMostrarDatos.add(panelMostrarTotales);

        panelMostrarDisponibles.setMaximumSize(new java.awt.Dimension(183, 82));
        panelMostrarDisponibles.setMinimumSize(new java.awt.Dimension(183, 82));
        panelMostrarDisponibles.setOpaque(false);
        panelMostrarDisponibles.setPreferredSize(new java.awt.Dimension(183, 82));
        panelMostrarDisponibles.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        textoRecursosDisponibles.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        textoRecursosDisponibles.setForeground(new java.awt.Color(255, 255, 255));
        textoRecursosDisponibles.setText("Recursos Diponibles");
        panelMostrarDisponibles.add(textoRecursosDisponibles);

        mostrarRecursosDisponibles.setEditable(false);
        mostrarRecursosDisponibles.setBackground(new java.awt.Color(19, 34, 50));
        mostrarRecursosDisponibles.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        mostrarRecursosDisponibles.setForeground(new java.awt.Color(255, 255, 255));
        mostrarRecursosDisponibles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mostrarRecursosDisponibles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        mostrarRecursosDisponibles.setMaximumSize(new java.awt.Dimension(100, 25));
        mostrarRecursosDisponibles.setMinimumSize(new java.awt.Dimension(100, 25));
        mostrarRecursosDisponibles.setPreferredSize(new java.awt.Dimension(100, 25));
        panelMostrarDisponibles.add(mostrarRecursosDisponibles);

        panelMostrarDatos.add(panelMostrarDisponibles);

        javax.swing.GroupLayout contenedorEstadoLayout = new javax.swing.GroupLayout(contenedorEstado);
        contenedorEstado.setLayout(contenedorEstadoLayout);
        contenedorEstadoLayout.setHorizontalGroup(
            contenedorEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorEstadoLayout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(tituloEstadoSistema)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorEstadoLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(panelMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        contenedorEstadoLayout.setVerticalGroup(
            contenedorEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorEstadoLayout.createSequentialGroup()
                .addComponent(tituloEstadoSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMostrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        panelPrincipal.add(contenedorEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 930, 340));

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // - - - - - - - - - - - - - - - - - - - Acción de Botónes - - - - - - - - - - - - - - - - - - - //
    //Acción del botón Actualizar Recursos.
    private void btnAgregarRecursosSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarRecursosSistemaMouseClicked
        //Obtiene los datos.
        String recursosText = recursosTotales.getText().trim();

        //Verifica si el campo está vacío.
        if (recursosText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de recursos totales no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Verifica el formato usando expresión regular.
        if (!recursosText.matches("(\\d+\\s*,\\s*)*(\\d+)")) {
            JOptionPane.showMessageDialog(this, "El formato de los recursos totales es inválido. Debe ser algo como 14, 14 14 o 14,14,14.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Divide el texto de los recursos totales en una matriz de cadenas, usando coma o espacio como delimitador.
        String[] recursosStr = recursosText.split("[, ]+");

        //Crea un arreglo de enteros con el mismo tamaño que el número de cadenas obtenidas.
        int[] recursos = new int[recursosStr.length];

        try {
            //Recorre cada cadena en el arreglo de cadenas.
            for (int i = 0; i < recursosStr.length; i++) {
                //Convierte cada cadena a un entero y almacena el valor en el arreglo de enteros.
                recursos[i] = Integer.parseInt(recursosStr[i]);
            }
        } catch (NumberFormatException e) {
            //Si ocurre una excepción durante la conversión (por ejemplo, si una cadena no es un número válido), muestra un mensaje de error y termina la ejecución del método
            JOptionPane.showMessageDialog(this, "Error al analizar los recursos totales.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Actualiza los recursos.
        algoritmo = new AlgoritmoBanquero(recursos);
        mostrarRecursosTotales.setText(arrayToString(algoritmo.getRecursosTotales()));
        mostrarRecursosDisponibles.setText(arrayToString(algoritmo.getRecursosDisponibles()));

        //Habilita componentes después de agregar recursos.
        idProceso.setEnabled(true);
        recursosMaximos.setEnabled(true);
        btnAgregarProceso.setEnabled(true);
        panelAgregarProcesoBtn.setEnabled(true);

        //Deshabilita los componentes después de agregar los recursos.
        recursosTotales.setEnabled(false);
        btnAgregarRecursosSistema.setEnabled(false);
        panelAgregarRecursosSistemaBtn.setEnabled(false);

        //Limpia el campo de recursos totales.
        recursosTotales.setText("");

        //Obtiene el siguiente ID y mostrarlo en el campo correspondiente.
        int siguienteId = algoritmo.obtenerSiguienteId();
        idProceso.setText(String.valueOf(siguienteId));
    }//GEN-LAST:event_btnAgregarRecursosSistemaMouseClicked

    //Acción del botón Agregar Proceso
    private void btnAgregarProcesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProcesoMouseClicked
        //Verifica que este activado.
        if (!btnAgregarProceso.isEnabled()) {
            return;
        }

        //Captura los datos.
        String recursosMaximosText = recursosMaximos.getText().trim();

        //Verifica si el campo está vacío.
        if (recursosMaximosText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de recursos máximos no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Verifica el formato usando expresión regular.
        if (!recursosMaximosText.matches("(\\d+\\s*,\\s*)*(\\d+)")) {
            JOptionPane.showMessageDialog(this, "El formato de los recursos máximos es inválido. Debe ser algo como 14, 14 14 o 14,14,14.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Divide el texto de los recursos máximos en una matriz de cadenas, usando coma o espacio como delimitador.
        String[] recursosMaximosStr = recursosMaximosText.split("[, ]+");

        //Crea un arreglo de enteros con el mismo tamaño que el número de cadenas obtenidas.
        int[] recursosMaximosInt = new int[recursosMaximosStr.length];

        try {
            //Recorre cada cadena en el arreglo de cadenas
            for (int i = 0; i < recursosMaximosStr.length; i++) {
                //Convierte cada cadena a un entero y almacena el valor en el arreglo de enteros.
                recursosMaximosInt[i] = Integer.parseInt(recursosMaximosStr[i]);
            }
        } catch (NumberFormatException e) {
            // Si ocurre una excepción durante la conversión (por ejemplo, si una cadena no es un número válido), muestra un mensaje de error y termina la ejecución del método.
            JOptionPane.showMessageDialog(this, "Error al analizar los recursos máximos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Agrega el proceso.
        algoritmo.agregarProceso(recursosMaximosInt);

        //Muestra el siguiente ID en el campo correspondiente.
        idProceso.setText(String.valueOf(algoritmo.obtenerSiguienteId()));

        //Actualiza el combo box y el estado del sistema.
        actualizarComboBox();
        actualizarEstadoSistema();
        
        // Limpia el campo de recursos solicitados.
        recursosMaximos.setText("");

    }//GEN-LAST:event_btnAgregarProcesoMouseClicked

    //Acción del botón Solicitar Recurso.
    private void btnSolicitarRecursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSolicitarRecursoMouseClicked
        //Verifica que este habilitado.
        if (!btnSolicitarRecurso.isEnabled()) {
            return;
        }

        //Captura los datos.
        String selectedItem = (String) idOperacion.getSelectedItem();
        
        
        //Verifica que se seleccione un ID.
        if (selectedItem == null || selectedItem.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un ID de proceso.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Captura los datos.
        String recursosSolicitadosText = recursosSolicitados.getText().trim();
        
        //Verifica si el campo está vacío.
        if (recursosSolicitadosText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de recursos solicitados no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Verificar formato usando expresión regular.
        if (!recursosSolicitadosText.matches("(\\d+\\s*,\\s*)*(\\d+)")) {
            JOptionPane.showMessageDialog(this, "El formato de los recursos solicitados es inválido. Debe ser algo como 14, 14 14 o 14,14,14.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Convierte el ID del proceso seleccionado de una cadena a un entero.
        int procesoId = Integer.parseInt(selectedItem);

        //Divide el texto de recursos solicitados en un arreglo de cadenas, usando coma o espacio como delimitador.
        String[] recursosSolicitadosStr = recursosSolicitadosText.split("[, ]+");

        //Crea un arreglo de enteros con el mismo tamaño que el número de cadenas obtenidas.
        int[] recursosSolicitadosInt = new int[recursosSolicitadosStr.length];

        try {
            //Recorre cada cadena en el arreglo de cadenas.
            for (int i = 0; i < recursosSolicitadosStr.length; i++) {
                //Convierte cada cadena a un entero y almacena el valor en el arreglo de enteros.
                recursosSolicitadosInt[i] = Integer.parseInt(recursosSolicitadosStr[i]);
            }
        } catch (NumberFormatException e) {
            // Si ocurre una excepción durante la conversión (por ejemplo, si una cadena no es un número válido), muestra un mensaje de error y termina la ejecución del método.
            JOptionPane.showMessageDialog(this, "Error al analizar los recursos solicitados.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Solicita el recurso.
        boolean exito = algoritmo.solicitarRecursos(procesoId, recursosSolicitadosInt);
        
        //Si se solicito con exito actualiza los recursos disponibles si no muestra error.
        if (exito) {
            mostrarRecursosDisponibles.setText(arrayToString(algoritmo.getRecursosDisponibles()));
        }
        
        //Actualiza el Estado del Sistema y los Botones y Campos.
        actualizarEstadoSistema();
        actualizarBotonesYCampos();
        
        // Limpia el campo de recursos solicitados.
        recursosSolicitados.setText("");
    }//GEN-LAST:event_btnSolicitarRecursoMouseClicked

    //Acción del botón Liberar Recurso.
    private void btnLiberarRecursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLiberarRecursoMouseClicked
        //Verifica si el botón está habilitado.
        if (!btnLiberarRecurso.isEnabled()) {
            return;
        }

        try {
            //Obtiene y valida el ID del proceso seleccionado.
            String selectedItem = (String) idOperacion.getSelectedItem();
            if (selectedItem == null || selectedItem.trim().isEmpty()) {
                throw new NumberFormatException("ID de proceso no seleccionado.");
            }
            int procesoId = Integer.parseInt(selectedItem);

            //Intenta liberar los recursos del proceso. Muestra el estado en el área de estado.
            boolean exito = algoritmo.liberarRecursos(procesoId);
            if (!exito) {
                estadoSistema.append("Liberación fallida para Proceso ID " + procesoId + "\n");
            } else {
                estadoSistema.append("Recursos liberados del Proceso ID " + procesoId + "\n");
                mostrarRecursosDisponibles.setText(arrayToString(algoritmo.getRecursosDisponibles()));
            }

            //Actualiza la interfaz gráfica.
            actualizarComboBox();
            actualizarEstadoSistema();
            actualizarBotonesYCampos();
            
            // Limpia el campo de recursos solicitados.
            recursosSolicitados.setText("");
        } catch (NumberFormatException e) {
            //Muestra un mensaje de error si el ID del proceso no es válido.
            JOptionPane.showMessageDialog(this, "Error al liberar recursos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLiberarRecursoMouseClicked

    // - - - - - - - - - - - - - - - - - - - Métodos - - - - - - - - - - - - - - - - - - - //
    //Método para actualizar los botones y campos.
    private void actualizarBotonesYCampos() {
        //Captura el ID del proceso seleccionado.
        String selectedItem = (String) idOperacion.getSelectedItem();
        
        //Si no hay selección válida, deshabilita los botones.
        if (selectedItem == null || selectedItem.trim().isEmpty()) {
            btnLiberarRecurso.setEnabled(false);
            btnSolicitarRecurso.setEnabled(false);
            recursosSolicitados.setEnabled(false);
            return;
        }

        //Guarda el ID.
        int procesoId = Integer.parseInt(selectedItem);

        //Encuentra el proceso correspondiente.
        Proceso proceso = algoritmo.getProcesos().stream()
                .filter(p -> p.getId() == procesoId)
                .findFirst()
                .orElse(null);

        //Si no se encuentra el proceso, deshabilita los botones.
        if (proceso == null) {
            btnLiberarRecurso.setEnabled(false);
            btnSolicitarRecurso.setEnabled(false);
            recursosSolicitados.setEnabled(false);
            return;
        }

        //Verifica si los recursos asignados son iguales a los recursos máximos.
        boolean esCompleto = true;
        for (int i = 0; i < proceso.getRecursosMaximos().length; i++) {
            if (proceso.getRecursosAsignados()[i] < proceso.getRecursosMaximos()[i]) {
                esCompleto = false;
                break;
            }
        }

        //Habilita o deshabilita los botones según el estado del proceso.
        btnLiberarRecurso.setEnabled(esCompleto);
        btnSolicitarRecurso.setEnabled(!esCompleto);
        recursosSolicitados.setEnabled(!esCompleto);
    }

    //Método para actualizar el estado del sistema.
    private void actualizarEstadoSistema() {
        //Limpia el área de texto antes de actualizar.
        estadoSistema.setText("");

        //Añade la información de cada proceso al área de texto 'estadoSistema'.
        for (Proceso p : algoritmo.getProcesos()) {
            estadoSistema.append(p.toString() + "\n\n");
        }

        //Habilita o deshabilita componentes basado en la existencia de procesos.
        boolean hayProcesos = !algoritmo.getProcesos().isEmpty();
        idOperacion.setEnabled(hayProcesos);
        recursosSolicitados.setEnabled(hayProcesos);
        btnSolicitarRecurso.setEnabled(hayProcesos);
        panelSolicitarRecursoBtn.setEnabled(hayProcesos);
        panelLiberarRecursoBtn.setEnabled(hayProcesos);
    }

    //Actualiza el ComboBox.
    private void actualizarComboBox() {
        //Elimina los Items.
        idOperacion.removeAllItems();
        
        //Agrega cada ID al ComboBox.
        for (Proceso p : algoritmo.getProcesos()) {
            idOperacion.addItem(String.valueOf(p.getId()));
        }
    }

    // Convierte un array de enteros en una cadena separada por comas.
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

    // - - - - - - - - - - - - - - - - - - - Diseños - - - - - - - - - - - - - - - - - - - //
    //Diseño del botón Actualizar Recursos.
    private void btnAgregarRecursosSistemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarRecursosSistemaMouseEntered
        if (btnAgregarRecursosSistema.isEnabled()) {
            panelAgregarRecursosSistemaBtn.setBackground(new Color(55, 143, 67));
            btnAgregarRecursosSistema.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_btnAgregarRecursosSistemaMouseEntered

    private void btnAgregarRecursosSistemaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarRecursosSistemaMouseExited
    panelAgregarRecursosSistemaBtn.setBackground(new Color(255, 255, 255));
        btnAgregarRecursosSistema.setForeground(new Color(19, 34, 50));
    }//GEN-LAST:event_btnAgregarRecursosSistemaMouseExited

    //Diseño del botón Agregar Proceso.
    private void btnAgregarProcesoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProcesoMouseEntered
        if (btnAgregarProceso.isEnabled()) {
            panelAgregarProcesoBtn.setBackground(new Color(55, 143, 67));
            btnAgregarProceso.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_btnAgregarProcesoMouseEntered

    private void btnAgregarProcesoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProcesoMouseExited
        panelAgregarProcesoBtn.setBackground(new Color(255, 255, 255));
        btnAgregarProceso.setForeground(new Color(19, 34, 50));
    }//GEN-LAST:event_btnAgregarProcesoMouseExited

    //Diseño del botón Solicitar Recursos.
    private void btnSolicitarRecursoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSolicitarRecursoMouseEntered
        if (btnSolicitarRecurso.isEnabled()) {
            panelSolicitarRecursoBtn.setBackground(new Color(71, 204, 255));
            btnSolicitarRecurso.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_btnSolicitarRecursoMouseEntered

    private void btnSolicitarRecursoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSolicitarRecursoMouseExited
        panelSolicitarRecursoBtn.setBackground(new Color(255, 255, 255));
        btnSolicitarRecurso.setForeground(new Color(19, 34, 50));
    }//GEN-LAST:event_btnSolicitarRecursoMouseExited

    //Diseño del botón Liberar Recursos.
    private void btnLiberarRecursoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLiberarRecursoMouseEntered
        if (btnLiberarRecurso.isEnabled()) {
            panelLiberarRecursoBtn.setBackground(new Color(206, 0, 0));
            btnLiberarRecurso.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_btnLiberarRecursoMouseEntered

    private void btnLiberarRecursoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLiberarRecursoMouseExited
        panelLiberarRecursoBtn.setBackground(new Color(255, 255, 255));
        btnLiberarRecurso.setForeground(new Color(19, 34, 50));
    }//GEN-LAST:event_btnLiberarRecursoMouseExited

    //Action Performed del Combo Box del ID.
    private void idOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idOperacionActionPerformed
        //Obtiene el ID seleccionado del combo box.
        String selectedItem = (String) idOperacion.getSelectedItem();

        //Verifica si se ha seleccionado un ID.
        if (selectedItem != null && !selectedItem.trim().isEmpty()) {
            
            //Convierte el ID seleccionado de cadena a entero.
            int procesoId = Integer.parseInt(selectedItem);

            //Obtiene el proceso con el ID seleccionado.
            Proceso proceso = algoritmo.encontrarProcesoPorId(procesoId);

            if (proceso != null) {
                //Verifica si el proceso tiene recursos asignados al máximo.
                boolean esCompleto = true;
                for (int i = 0; i < proceso.getRecursosMaximos().length; i++) {
                    if (proceso.getRecursosAsignados()[i] < proceso.getRecursosMaximos()[i]) {
                        esCompleto = false;
                        break;
                    }
                }

                //Habilita o deshabilita los botones y campos basado en si el proceso está completo.
                btnLiberarRecurso.setEnabled(esCompleto);
                btnSolicitarRecurso.setEnabled(!esCompleto);
                recursosSolicitados.setEnabled(!esCompleto);
            } else {
                //Si el proceso no existe, desactiva todos los botones y campos relacionados.
                btnLiberarRecurso.setEnabled(false);
                btnSolicitarRecurso.setEnabled(false);
                recursosSolicitados.setEnabled(false);
            }
        } else {
            //Si no hay ID seleccionado, desactiva todos los botones y campos relacionados.
            btnLiberarRecurso.setEnabled(false);
            btnSolicitarRecurso.setEnabled(false);
            recursosSolicitados.setEnabled(false);
        }
    }//GEN-LAST:event_idOperacionActionPerformed

    //Main.
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregarProceso;
    private javax.swing.JLabel btnAgregarRecursosSistema;
    private javax.swing.JLabel btnLiberarRecurso;
    private javax.swing.JLabel btnSolicitarRecurso;
    private javax.swing.JPanel contenedorDatos;
    private javax.swing.JPanel contenedorEstado;
    private javax.swing.JTextArea estadoSistema;
    private javax.swing.JComboBox<String> idOperacion;
    private javax.swing.JTextField idProceso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mostrarRecursosDisponibles;
    private javax.swing.JTextField mostrarRecursosTotales;
    private javax.swing.JPanel panelAgregarProcesoBtn;
    private javax.swing.JPanel panelAgregarRecursosSistemaBtn;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDatosOperaciones;
    private javax.swing.JPanel panelDatosProceso;
    private javax.swing.JPanel panelID;
    private javax.swing.JPanel panelIDOperacion;
    private javax.swing.JPanel panelLiberarRecursoBtn;
    private javax.swing.JPanel panelMostrarDatos;
    private javax.swing.JPanel panelMostrarDisponibles;
    private javax.swing.JPanel panelMostrarTotales;
    private javax.swing.JPanel panelOperacionRecursps;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelRecursos;
    private javax.swing.JPanel panelRecursosMaximos;
    private javax.swing.JPanel panelRecursosSistema;
    private javax.swing.JPanel panelRecursosSolicitados;
    private javax.swing.JPanel panelRecursosTotales;
    private javax.swing.JPanel panelSolicitarRecursoBtn;
    private javax.swing.JTextField recursosMaximos;
    private javax.swing.JTextField recursosSolicitados;
    private javax.swing.JTextField recursosTotales;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel textoID;
    private javax.swing.JLabel textoIDOperacion;
    private javax.swing.JLabel textoRecursosDisponibles;
    private javax.swing.JLabel textoRecursosMaximos2;
    private javax.swing.JLabel textoRecursosSolicitados;
    private javax.swing.JLabel textoRecursosTotales;
    private javax.swing.JLabel textoTotales;
    private javax.swing.JLabel tituloControlProcesos4;
    private javax.swing.JLabel tituloDatosProceso1;
    private javax.swing.JLabel tituloEstadoSistema;
    private javax.swing.JLabel tituloOperacionRecursps;
    private javax.swing.JLabel tituloRecursosSistema;
    // End of variables declaration//GEN-END:variables
}
