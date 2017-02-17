package Examen1_Laboratorio;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TPPrincipal = new javax.swing.JTabbedPane();
        PAgregar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CBEmpleado = new javax.swing.JCheckBox();
        CBEstudiante = new javax.swing.JCheckBox();
        CBPolitico = new javax.swing.JCheckBox();
        TFEdad = new javax.swing.JTextField();
        TFID = new javax.swing.JTextField();
        TFIDBoleto = new javax.swing.JTextField();
        CBDepartamento = new javax.swing.JComboBox<>();
        TFDinero = new javax.swing.JTextField();
        TFOcupacion = new javax.swing.JTextField();
        CBPartidos = new javax.swing.JComboBox<>();
        BGuardar = new javax.swing.JButton();
        BLimpiar = new javax.swing.JButton();
        TFNombre = new javax.swing.JTextField();
        TFCarrera = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PModificar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TFDinero1 = new javax.swing.JTextField();
        BLimpiar1 = new javax.swing.JButton();
        TFID1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TFOcupacion1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        CBPolitico1 = new javax.swing.JCheckBox();
        CBPartidos1 = new javax.swing.JComboBox<>();
        BModificar = new javax.swing.JButton();
        TFIDBoleto1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TFEdad1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        CBDepartamento1 = new javax.swing.JComboBox<>();
        CBEstudiante1 = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        CBEmpleado1 = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        CBNombres = new javax.swing.JComboBox<>();
        TFCarrera1 = new javax.swing.JTextField();
        PEliminar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        PReportes = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaReporte = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        CBNombres1 = new javax.swing.JComboBox<>();
        PCompra = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        PRifa = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Examen Laboratorio");
        setLocationByPlatform(true);

        TPPrincipal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TPPrincipalStateChanged(evt);
            }
        });

        PAgregar.setPreferredSize(new java.awt.Dimension(512, 430));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel5.setText("Programa creado por Walter Oseguera");

        jLabel3.setText("Nombre completo: ");

        jLabel11.setText("Edad: ");

        jLabel12.setText("N° de Identidad: ");

        jLabel13.setText("N° de Boleto: ");

        jLabel14.setText("Departamento: ");

        jLabel15.setText("Dinero disponible: ");

        jLabel16.setText("Ocupación: ");

        CBEmpleado.setText("Empleado");
        CBEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBEmpleadoActionPerformed(evt);
            }
        });

        CBEstudiante.setText("Estudiante");
        CBEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBEstudianteActionPerformed(evt);
            }
        });

        CBPolitico.setText("Politico");
        CBPolitico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPoliticoActionPerformed(evt);
            }
        });

        TFEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFEdadActionPerformed(evt);
            }
        });
        TFEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFEdadKeyTyped(evt);
            }
        });

        TFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFIDActionPerformed(evt);
            }
        });
        TFID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFIDKeyTyped(evt);
            }
        });

        TFIDBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFIDBoletoActionPerformed(evt);
            }
        });
        TFIDBoleto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFIDBoletoKeyTyped(evt);
            }
        });

        CBDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atlántida", "Colón", "Comayagua", "Copán", "Cortes", "Choluteca", "El Paraíso", "Francisco Morazán", "Gracias a Dios", "Intibucá", "Islas de la Bahía", "La Paz", "Lempira", "Ocotepeque", "Olancho", "Santa Bárbara", "Valle", "Yoro" }));
        CBDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBDepartamentoActionPerformed(evt);
            }
        });

        TFDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFDineroActionPerformed(evt);
            }
        });
        TFDinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFDineroKeyTyped(evt);
            }
        });

        CBPartidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Partido Nacional", "Partido Liberal", "Partido Libre", "DC", "PINU", "UD", "PAC", "APH", "FAPER" }));

        BGuardar.setText("Guardar");
        BGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BGuardarMouseClicked(evt);
            }
        });

        BLimpiar.setText("Limpiar");
        BLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BLimpiarMouseClicked(evt);
            }
        });

        TFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNombreActionPerformed(evt);
            }
        });
        TFNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFNombreKeyTyped(evt);
            }
        });

        TFCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCarreraActionPerformed(evt);
            }
        });

        jLabel1.setText("Empleo: ");

        jLabel2.setText("Carrera: ");

        jLabel4.setText("Partido Político: ");

        javax.swing.GroupLayout PAgregarLayout = new javax.swing.GroupLayout(PAgregar);
        PAgregar.setLayout(PAgregarLayout);
        PAgregarLayout.setHorizontalGroup(
            PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PAgregarLayout.createSequentialGroup()
                .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PAgregarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(PAgregarLayout.createSequentialGroup()
                        .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PAgregarLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel1))
                                .addGap(42, 42, 42)
                                .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFIDBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PAgregarLayout.createSequentialGroup()
                                        .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PAgregarLayout.createSequentialGroup()
                                                .addComponent(CBEmpleado)
                                                .addGap(18, 18, 18)
                                                .addComponent(CBEstudiante))
                                            .addGroup(PAgregarLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel2)))
                                        .addGap(18, 18, 18)
                                        .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(CBPolitico)))))
                            .addGroup(PAgregarLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(BGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(BLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PAgregarLayout.createSequentialGroup()
                        .addGap(0, 40, Short.MAX_VALUE)
                        .addComponent(TFOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TFCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PAgregarLayout.setVerticalGroup(
            PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PAgregarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PAgregarLayout.createSequentialGroup()
                        .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(TFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(TFIDBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(CBDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(TFDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(CBEmpleado)
                            .addComponent(CBEstudiante)
                            .addComponent(CBPolitico))
                        .addGap(7, 7, 7)
                        .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))
                    .addGroup(PAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        TPPrincipal.addTab("Agregar", PAgregar);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel6.setText("Programa creado por Walter Oseguera");

        TFDinero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFDinero1ActionPerformed(evt);
            }
        });
        TFDinero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFDinero1KeyTyped(evt);
            }
        });

        BLimpiar1.setText("Limpiar");
        BLimpiar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BLimpiar1MouseClicked(evt);
            }
        });

        TFID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFID1ActionPerformed(evt);
            }
        });
        TFID1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFID1KeyTyped(evt);
            }
        });

        jLabel23.setText("Ocupación: ");

        jLabel18.setText("Edad: ");

        CBPolitico1.setText("Politico");
        CBPolitico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPolitico1ActionPerformed(evt);
            }
        });

        CBPartidos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Partido Nacional", "Partido Liberal", "Partido Libre", "DC", "PINU", "UD", "PAC", "APH", "FAPER" }));

        BModificar.setText("Modificar");
        BModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BModificarMouseClicked(evt);
            }
        });

        TFIDBoleto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFIDBoleto1ActionPerformed(evt);
            }
        });
        TFIDBoleto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFIDBoleto1KeyTyped(evt);
            }
        });

        jLabel17.setText("Nombre completo: ");

        TFEdad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFEdad1ActionPerformed(evt);
            }
        });
        TFEdad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFEdad1KeyTyped(evt);
            }
        });

        jLabel21.setText("Departamento: ");

        CBDepartamento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atlántida", "Colón", "Comayagua", "Copán", "Cortes", "Choluteca", "El Paraíso", "Francisco Morazán", "Gracias a Dios", "Intibucá", "Islas de la Bahía", "La Paz", "Lempira", "Ocotepeque", "Olancho", "Santa Bárbara", "Valle", "Yoro" }));
        CBDepartamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBDepartamento1ActionPerformed(evt);
            }
        });

        CBEstudiante1.setText("Estudiante");
        CBEstudiante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBEstudiante1ActionPerformed(evt);
            }
        });

        jLabel20.setText("N° de Boleto: ");

        CBEmpleado1.setText("Empleado");
        CBEmpleado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBEmpleado1ActionPerformed(evt);
            }
        });

        jLabel22.setText("Dinero disponible: ");

        jLabel19.setText("N° de Identidad: ");

        CBNombres.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBNombresItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout PModificarLayout = new javax.swing.GroupLayout(PModificar);
        PModificar.setLayout(PModificarLayout);
        PModificarLayout.setHorizontalGroup(
            PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PModificarLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PModificarLayout.createSequentialGroup()
                        .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(42, 42, 42)
                        .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFID1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFIDBoleto1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFDinero1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PModificarLayout.createSequentialGroup()
                                .addComponent(CBEmpleado1)
                                .addGap(18, 18, 18)
                                .addComponent(CBEstudiante1)
                                .addGap(18, 18, 18)
                                .addComponent(CBPolitico1))
                            .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CBNombres, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CBDepartamento1, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE))))
                    .addGroup(PModificarLayout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel6)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PModificarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TFOcupacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFCarrera1)
                    .addGroup(PModificarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(CBPartidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        PModificarLayout.setVerticalGroup(
            PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PModificarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(CBNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(TFEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PModificarLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(PModificarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(TFID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(TFIDBoleto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(CBDepartamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(TFDinero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(CBEmpleado1)
                            .addComponent(CBEstudiante1)
                            .addComponent(CBPolitico1))
                        .addGap(18, 18, 18)
                        .addGroup(PModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFOcupacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBPartidos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFCarrera1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addContainerGap())))
        );

        TPPrincipal.addTab("Modificar", PModificar);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel7.setText("Programa creado por Walter Oseguera");

        javax.swing.GroupLayout PEliminarLayout = new javax.swing.GroupLayout(PEliminar);
        PEliminar.setLayout(PEliminarLayout);
        PEliminarLayout.setHorizontalGroup(
            PEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PEliminarLayout.createSequentialGroup()
                .addContainerGap(361, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        PEliminarLayout.setVerticalGroup(
            PEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PEliminarLayout.createSequentialGroup()
                .addContainerGap(428, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        TPPrincipal.addTab("Eliminar", PEliminar);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel10.setText("Programa creado por Walter Oseguera");

        TablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Departamento", "Ocupacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaReporte);

        jLabel24.setText("Nombre completo: ");

        CBNombres1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBNombres1ItemStateChanged(evt);
            }
        });
        CBNombres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBNombres1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PReportesLayout = new javax.swing.GroupLayout(PReportes);
        PReportes.setLayout(PReportesLayout);
        PReportesLayout.setHorizontalGroup(
            PReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PReportesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(PReportesLayout.createSequentialGroup()
                        .addGroup(PReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PReportesLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CBNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(179, 179, 179)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PReportesLayout.setVerticalGroup(
            PReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PReportesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(CBNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        TPPrincipal.addTab("Reportes", PReportes);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel8.setText("Programa creado por Walter Oseguera");

        javax.swing.GroupLayout PCompraLayout = new javax.swing.GroupLayout(PCompra);
        PCompra.setLayout(PCompraLayout);
        PCompraLayout.setHorizontalGroup(
            PCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCompraLayout.createSequentialGroup()
                .addContainerGap(361, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        PCompraLayout.setVerticalGroup(
            PCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCompraLayout.createSequentialGroup()
                .addContainerGap(428, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        TPPrincipal.addTab("Compra", PCompra);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel9.setText("Programa creado por Walter Oseguera");

        javax.swing.GroupLayout PRifaLayout = new javax.swing.GroupLayout(PRifa);
        PRifa.setLayout(PRifaLayout);
        PRifaLayout.setHorizontalGroup(
            PRifaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRifaLayout.createSequentialGroup()
                .addContainerGap(361, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        PRifaLayout.setVerticalGroup(
            PRifaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRifaLayout.createSequentialGroup()
                .addContainerGap(428, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        TPPrincipal.addTab("Rifa", PRifa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TPPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TFDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFDineroActionPerformed
        ((JComponent) evt.getSource()).transferFocus();
    }//GEN-LAST:event_TFDineroActionPerformed

    private void CBDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBDepartamentoActionPerformed
        ((JComponent) evt.getSource()).transferFocus();
    }//GEN-LAST:event_CBDepartamentoActionPerformed

    private void TFIDBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFIDBoletoActionPerformed
        ((JComponent) evt.getSource()).transferFocus();
    }//GEN-LAST:event_TFIDBoletoActionPerformed

    private void TFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFIDActionPerformed
        ((JComponent) evt.getSource()).transferFocus();
    }//GEN-LAST:event_TFIDActionPerformed

    private void TFEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEdadActionPerformed
        ((JComponent) evt.getSource()).transferFocus();
    }//GEN-LAST:event_TFEdadActionPerformed

    private void CBPoliticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPoliticoActionPerformed
        TFOcupacion.setEditable(false);
        TFOcupacion.setEnabled(false);
        TFCarrera.setEditable(false);
        TFCarrera.setEnabled(false);
        CBPartidos.setEnabled(true);
        CBPartidos.setEditable(true);
    }//GEN-LAST:event_CBPoliticoActionPerformed

    private void CBEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBEstudianteActionPerformed
        CBPartidos.setEditable(false);
        CBPartidos.setEnabled(false);
        TFOcupacion.setEnabled(false);
        TFOcupacion.setEditable(false);
        TFCarrera.setEditable(true);
        TFCarrera.setEnabled(true);
    }//GEN-LAST:event_CBEstudianteActionPerformed

    private void CBEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBEmpleadoActionPerformed
        CBPartidos.setEditable(false);
        CBPartidos.setEnabled(false);
        TFCarrera.setEditable(false);
        TFCarrera.setEnabled(false);
        TFOcupacion.setEnabled(true);
        TFOcupacion.setEditable(true);
    }//GEN-LAST:event_CBEmpleadoActionPerformed

    private void TFEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFEdadKeyTyped
        char Dato = evt.getKeyChar();
        if (Character.isLetter(Dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se aceptan números");
        }
    }//GEN-LAST:event_TFEdadKeyTyped

    private void TFIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFIDKeyTyped
        char Dato = evt.getKeyChar();
        if (Character.isLetter(Dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se aceptan números");
        }
    }//GEN-LAST:event_TFIDKeyTyped

    private void TFIDBoletoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFIDBoletoKeyTyped
        char Dato = evt.getKeyChar();
        if (Character.isLetter(Dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se aceptan números");
        }
    }//GEN-LAST:event_TFIDBoletoKeyTyped

    private void TFDineroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFDineroKeyTyped
        char Dato = evt.getKeyChar();
        if (Character.isLetter(Dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se aceptan números");
        }
    }//GEN-LAST:event_TFDineroKeyTyped

    private void TFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNombreActionPerformed
        ((JComponent) evt.getSource()).transferFocus();
    }//GEN-LAST:event_TFNombreActionPerformed

    private void TFNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNombreKeyTyped
        char Dato = evt.getKeyChar();
        if (Character.isDigit(Dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se aceptan letras");
        }
    }//GEN-LAST:event_TFNombreKeyTyped

    private void TFEdad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEdad1ActionPerformed
        ((JComponent) evt.getSource()).transferFocus();
    }//GEN-LAST:event_TFEdad1ActionPerformed

    private void TFEdad1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFEdad1KeyTyped
        char Dato = evt.getKeyChar();
        if (Character.isLetter(Dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se aceptan números");
        }
    }//GEN-LAST:event_TFEdad1KeyTyped

    private void TFID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFID1ActionPerformed
        ((JComponent) evt.getSource()).transferFocus();
    }//GEN-LAST:event_TFID1ActionPerformed

    private void TFID1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFID1KeyTyped
        char Dato = evt.getKeyChar();
        if (Character.isLetter(Dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se aceptan números");
        }
    }//GEN-LAST:event_TFID1KeyTyped

    private void TFIDBoleto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFIDBoleto1ActionPerformed
        ((JComponent) evt.getSource()).transferFocus();
    }//GEN-LAST:event_TFIDBoleto1ActionPerformed

    private void TFIDBoleto1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFIDBoleto1KeyTyped
        char Dato = evt.getKeyChar();
        if (Character.isLetter(Dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se aceptan números");
        }
    }//GEN-LAST:event_TFIDBoleto1KeyTyped

    private void CBDepartamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBDepartamento1ActionPerformed
        ((JComponent) evt.getSource()).transferFocus();
    }//GEN-LAST:event_CBDepartamento1ActionPerformed

    private void TFDinero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFDinero1ActionPerformed
        ((JComponent) evt.getSource()).transferFocus();
    }//GEN-LAST:event_TFDinero1ActionPerformed

    private void TFDinero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFDinero1KeyTyped
        char Dato = evt.getKeyChar();
        if (Character.isLetter(Dato)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se aceptan números");
        }
    }//GEN-LAST:event_TFDinero1KeyTyped

    private void CBEmpleado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBEmpleado1ActionPerformed
        CBPartidos1.setEditable(false);
        CBPartidos1.setEnabled(false);
        TFCarrera1.setEditable(false);
        TFCarrera1.setEnabled(false);
        TFOcupacion1.setEnabled(true);
        TFOcupacion1.setEditable(true);
    }//GEN-LAST:event_CBEmpleado1ActionPerformed

    private void CBEstudiante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBEstudiante1ActionPerformed
        CBPartidos1.setEditable(false);
        CBPartidos1.setEnabled(false);
        TFOcupacion1.setEnabled(false);
        TFOcupacion1.setEditable(false);
        TFCarrera1.setEditable(true);
        TFCarrera1.setEnabled(true);
    }//GEN-LAST:event_CBEstudiante1ActionPerformed

    private void CBPolitico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPolitico1ActionPerformed
        TFOcupacion1.setEditable(false);
        TFOcupacion1.setEnabled(false);
        TFCarrera1.setEditable(false);
        TFCarrera1.setEnabled(false);
        CBPartidos1.setEnabled(true);
        CBPartidos1.setEditable(true);
    }//GEN-LAST:event_CBPolitico1ActionPerformed

    private void TPPrincipalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TPPrincipalStateChanged
        if (this.TPPrincipal.getSelectedIndex() == 1) {
            DefaultComboBoxModel Modelo = new DefaultComboBoxModel();
            for (PersonaDatos Temp : ListaPersonas) {
                Modelo.addElement(Temp);
            }
            CBNombres.setModel(Modelo);
        }
        
        if (this.TPPrincipal.getSelectedIndex() == 3) {
            DefaultComboBoxModel Modelo1 = new DefaultComboBoxModel();
            for (PersonaDatos Temp : ListaPersonas) {
                Modelo1.addElement(Temp);
            }
            CBNombres1.setModel(Modelo1);
        }
        
        if (this.TPPrincipal.getSelectedIndex() == 3) {
            DefaultComboBoxModel Modelo2 = new DefaultComboBoxModel();
            for (PersonaDatos Temp : ListaPersonas) {
                Modelo2.addElement(Temp);
            }
            CBNombres1.setModel(Modelo2);
        }
    }//GEN-LAST:event_TPPrincipalStateChanged

    private void BGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BGuardarMouseClicked
        String Nombre, Departamento;
        int Edad, ID, IDBoleto, Dinero;
        try {
            Nombre = TFNombre.getText();
            Edad = Integer.parseInt(TFEdad.getText());
            ID = Integer.parseInt(TFID.getText());
            IDBoleto = Integer.parseInt(TFIDBoleto.getText());
            Departamento = CBDepartamento.getSelectedItem().toString();
            Dinero = Integer.parseInt(TFDinero.getText());
            if (CBEmpleado.isSelected()) {
                Ocupacion = TFOcupacion.getText();
            } /* Fin if */ else if (CBEstudiante.isSelected()){
                Ocupacion = TFCarrera.getText();
            } /* Fin else if */ else if (CBPolitico.isSelected()){
                Ocupacion = CBPartidos.getSelectedItem().toString();
            } /* Fin else if */
            ListaPersonas.add(new PersonaDatos(Nombre, Edad, ID, IDBoleto, Departamento, Dinero, Ocupacion));
            // Limpiar Componentes
            TFNombre.setText("");
            TFEdad.setText("");
            TFID.setText("");
            TFIDBoleto.setText("");
            CBDepartamento.setSelectedIndex(0);
            TFDinero.setText("");
            TFOcupacion.setText("");
            TFCarrera.setText("");
            CBPartidos.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error: " + e);
        }
    }//GEN-LAST:event_BGuardarMouseClicked

    private void TFCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCarreraActionPerformed
        
    }//GEN-LAST:event_TFCarreraActionPerformed

    private void BLimpiar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BLimpiar1MouseClicked
        TFNombre.setText("");
        TFEdad.setText("");
        TFID.setText("");
        TFIDBoleto.setText("");
        CBDepartamento.setSelectedIndex(0);
        TFDinero.setText("");
        TFOcupacion.setText("");
        TFCarrera.setText("");
        CBPartidos.setSelectedIndex(0);
    }//GEN-LAST:event_BLimpiar1MouseClicked

    private void BLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BLimpiarMouseClicked
        TFNombre.setText("");
        TFEdad.setText("");
        TFID.setText("");
        TFIDBoleto.setText("");
        CBDepartamento.setSelectedIndex(0);
        TFDinero.setText("");
        TFOcupacion.setText("");
        TFCarrera.setText("");
        CBPartidos.setSelectedIndex(0);
    }//GEN-LAST:event_BLimpiarMouseClicked

    private void BModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BModificarMouseClicked
        String Nombre, Departamento, Ocupacion = "";
        int Edad, ID, IDBoleto, Dinero, Pos;
        try {
            Nombre = CBNombres.getSelectedItem().toString();
            Edad = Integer.parseInt(TFEdad.getText());
            ID = Integer.parseInt(TFID.getText());
            IDBoleto = Integer.parseInt(TFIDBoleto.getText());
            Departamento = CBDepartamento.getSelectedItem().toString();
            Dinero = Integer.parseInt(TFDinero.getText());
            if (CBEmpleado.isSelected()) {
                Ocupacion = TFOcupacion.getText();
            } /* Fin if */ else if (CBEstudiante.isSelected()){
                Ocupacion = TFCarrera.getText();
            } /* Fin else if */ else if (CBPolitico.isSelected()){
                Ocupacion = CBPartidos.getSelectedItem().toString();
            } /* Fin else if */
            Pos = CBNombres.getSelectedIndex() - 1;
            ListaPersonas.get(Pos).setNombre(Nombre);
            ListaPersonas.get(Pos).setEdad(Edad);
            ListaPersonas.get(Pos).setID(ID);
            ListaPersonas.get(Pos).setIDBoleto(IDBoleto);
            ListaPersonas.get(Pos).setDepartamento(Departamento);
            ListaPersonas.get(Pos).setDinero(Dinero);
            ListaPersonas.get(Pos).setOcupacion(Ocupacion);
            // Limpiar Componentes
            TFNombre.setText("");
            TFEdad.setText("");
            TFID.setText("");
            TFIDBoleto.setText("");
            CBDepartamento.setSelectedIndex(0);
            TFDinero.setText("");
            TFOcupacion.setText("");
            TFCarrera.setText("");
            CBPartidos.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error: " + e);
        }
    }//GEN-LAST:event_BModificarMouseClicked

    private void CBNombresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBNombresItemStateChanged
        if (evt.getStateChange() == 2) {
            PersonaDatos Datos = (PersonaDatos)CBNombres.getSelectedItem();
            
            TFEdad1.setText("" + Datos.getEdad());
            TFID1.setText("" + Datos.getID());
            TFIDBoleto1.setText("" + Datos.getIDBoleto());
            CBDepartamento1.setSelectedItem(Datos.getDepartamento());
            TFDinero1.setText("" + Datos.getDinero());
            
        }
    }//GEN-LAST:event_CBNombresItemStateChanged

    private void CBNombres1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBNombres1ItemStateChanged
        if (evt.getStateChange() == 2) {
            PersonaDatos Datos = (PersonaDatos)CBNombres1.getSelectedItem();
            
            Object [] newrow = {Datos.getNombre(), Datos.getEdad(), Datos.getDepartamento(), Datos.getOcupacion()};
            DefaultTableModel Modelo3 = (DefaultTableModel) TablaReporte.getModel();
            Modelo3.addRow(newrow);
            TablaReporte.setModel(Modelo3);
        } // Fin if
    }//GEN-LAST:event_CBNombres1ItemStateChanged

    private void CBNombres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBNombres1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBNombres1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BGuardar;
    private javax.swing.JButton BLimpiar;
    private javax.swing.JButton BLimpiar1;
    private javax.swing.JButton BModificar;
    private javax.swing.JComboBox<String> CBDepartamento;
    private javax.swing.JComboBox<String> CBDepartamento1;
    private javax.swing.JCheckBox CBEmpleado;
    private javax.swing.JCheckBox CBEmpleado1;
    private javax.swing.JCheckBox CBEstudiante;
    private javax.swing.JCheckBox CBEstudiante1;
    private javax.swing.JComboBox<String> CBNombres;
    private javax.swing.JComboBox<String> CBNombres1;
    private javax.swing.JComboBox<String> CBPartidos;
    private javax.swing.JComboBox<String> CBPartidos1;
    private javax.swing.JCheckBox CBPolitico;
    private javax.swing.JCheckBox CBPolitico1;
    private javax.swing.JPanel PAgregar;
    private javax.swing.JPanel PCompra;
    private javax.swing.JPanel PEliminar;
    private javax.swing.JPanel PModificar;
    private javax.swing.JPanel PReportes;
    private javax.swing.JPanel PRifa;
    private javax.swing.JTextField TFCarrera;
    private javax.swing.JTextField TFCarrera1;
    private javax.swing.JTextField TFDinero;
    private javax.swing.JTextField TFDinero1;
    private javax.swing.JTextField TFEdad;
    private javax.swing.JTextField TFEdad1;
    private javax.swing.JTextField TFID;
    private javax.swing.JTextField TFID1;
    private javax.swing.JTextField TFIDBoleto;
    private javax.swing.JTextField TFIDBoleto1;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTextField TFOcupacion;
    private javax.swing.JTextField TFOcupacion1;
    private javax.swing.JTabbedPane TPPrincipal;
    private javax.swing.JTable TablaReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    ArrayList<PersonaDatos> ListaPersonas = new ArrayList();
    String Ocupacion = "";
}