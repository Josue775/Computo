package Interfaz;
import ConexionBD.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import ConexionBD.crudsql;
import classDAO.AlumnosDAO;
import classDAO.MaestroDAO;
import classVO.AlumnosVO;
import classVO.GrupoVO;
import classVO.MaestrosVO;
import static java.sql.JDBCType.DATE;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JComboBox;
//import java
/**
 * @author Horacio Josue Marroquin Herrera
 */
public class Administrador extends javax.swing.JFrame {
    private final Conexion CON;
    Statement ps;
    private ResultSet rs;
    MaestroDAO DAO = new MaestroDAO();
    
    public Administrador() {
        initComponents();
        setLocationRelativeTo(null);
        CON = Conexion.getInstacia();
        mostrarG();
        mostrarD();
        mostrarA();
        MostrardetPago();
        MostrarPago();
        //LlenarCombobox();
        listarD(horarios);
        listarD(horarios1);
        COPIA.setVisible(false);
        listarAlumnos(alumnos);
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        grado = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Horario = new javax.swing.JTextField();
        GUARDAR = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        GUARDAR2 = new javax.swing.JButton();
        GUARDAR3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        COPIA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Delete = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Maestxt = new javax.swing.JTextField();
        Directxt = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        Nomtxt = new javax.swing.JTextField();
        RFCtxt = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Usertxt = new javax.swing.JTextField();
        PASStxt = new javax.swing.JTextField();
        horarios = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaD = new javax.swing.JTable();
        GuardarM = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        GaYGutxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        GuardarA = new javax.swing.JButton();
        ModificarA = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        IdAlumno = new javax.swing.JTextField();
        DireccionA = new javax.swing.JTextField();
        NombreA = new javax.swing.JTextField();
        TelefonoA = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        horarios1 = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaA = new javax.swing.JTable();
        EliminarA1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        GradoA = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Monto = new javax.swing.JTextField();
        DESC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDet = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPago = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        FECHA = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        idpago = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Id_Alumno = new javax.swing.JTextField();
        alumnos = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "horario", "grado_grupo", "nivel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(Tabla);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 245, 605, 118));

        jLabel1.setText("Detalles del Grupo:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, -1, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 417, -1, -1));

        jLabel15.setText("Grupo");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradoActionPerformed(evt);
            }
        });
        jPanel3.add(grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 76, 96, -1));

        jLabel30.setText("GRADO Y GRUPO:");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, -1, -1));

        jLabel31.setText("NIVEL: ");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel32.setText("HORARIO:");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, -1));

        Horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorarioActionPerformed(evt);
            }
        });
        jPanel3.add(Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 50, 96, -1));

        GUARDAR.setText("Eliminar");
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });
        jPanel3.add(GUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 86, 75, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRINCIPIANTE", "INTERMEDIO", "AVANZADO" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        GUARDAR2.setText("Modificar");
        GUARDAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDAR2ActionPerformed(evt);
            }
        });
        jPanel3.add(GUARDAR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 38, -1, -1));

        GUARDAR3.setText("GUARDAR");
        GUARDAR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDAR3ActionPerformed(evt);
            }
        });
        jPanel3.add(GUARDAR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jButton1.setText("limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));
        jPanel3.add(COPIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 100, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-building-icon-png-image_4421544.jpg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 460));

        jTabbedPane1.addTab("Grupos", jPanel3);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Delete.setText("Eliminar");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 69, 168, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel22.setText("Grado y Grupo:");

        jLabel23.setText("Nombre:");

        jLabel24.setText("Direccion:");

        jLabel25.setText("RFC:");

        Maestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaestxtActionPerformed(evt);
            }
        });

        Directxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirectxtActionPerformed(evt);
            }
        });

        jLabel26.setText("Maestro");

        Nomtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomtxtActionPerformed(evt);
            }
        });

        RFCtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RFCtxtActionPerformed(evt);
            }
        });

        jLabel27.setText("ID Mestro");

        jLabel28.setText("Contraseña:");

        jLabel29.setText("Usuario:");

        Usertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsertxtActionPerformed(evt);
            }
        });

        PASStxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASStxtActionPerformed(evt);
            }
        });

        horarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PASStxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Nomtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(Directxt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(Maestxt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(horarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                    .addComponent(RFCtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Maestxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(horarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(Nomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Directxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RFCtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PASStxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));

        TablaD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "grado_grupo", "nombre", "direccion", "rfc", "usuario", "contrasena"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaD);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 514, 120));

        GuardarM.setText("Guardar");
        GuardarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarMActionPerformed(evt);
            }
        });
        jPanel2.add(GuardarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 11, 168, -1));

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel2.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 40, 168, -1));

        jLabel9.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 210, 20));

        jButton3.setText("limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 160, -1));

        GaYGutxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaYGutxtActionPerformed(evt);
            }
        });
        jPanel2.add(GaYGutxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 10, 20));

        jTabbedPane1.addTab("Maestros", jPanel2);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GuardarA.setText("Guardar");
        GuardarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarAActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 168, -1));

        ModificarA.setText("Modificar");
        ModificarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarAActionPerformed(evt);
            }
        });
        jPanel1.add(ModificarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 168, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setText("Grado y Grupo");

        jLabel17.setText("Nombre");

        jLabel18.setText("Direccion");

        jLabel19.setText("Telefono");

        IdAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdAlumnoActionPerformed(evt);
            }
        });

        DireccionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionAActionPerformed(evt);
            }
        });

        NombreA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreAActionPerformed(evt);
            }
        });

        TelefonoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoAActionPerformed(evt);
            }
        });

        jLabel21.setText("ID");

        jLabel20.setText("Alumno");

        horarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarios1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NombreA)
                    .addComponent(DireccionA)
                    .addComponent(IdAlumno)
                    .addComponent(TelefonoA, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(horarios1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(IdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horarios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(NombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DireccionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        TablaA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "grado_grupo", "nombre", "direccion", "telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaAMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaA);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 514, 130));

        EliminarA1.setText("Eliminar");
        EliminarA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarA1ActionPerformed(evt);
            }
        });
        jPanel1.add(EliminarA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 168, -1));

        jButton5.setText("limpiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 150, -1));

        GradoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradoAActionPerformed(evt);
            }
        });
        jPanel1.add(GradoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 170, -1));

        jTabbedPane1.addTab("Alumnos", jPanel1);

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("ID PAGO:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Monto:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, -1, 26));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("ID ALUMNO:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, -1, 26));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Descripcion:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, 26));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Fecha:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, 26));
        jPanel4.add(Monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 79, 100, -1));
        jPanel4.add(DESC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 100, -1));

        TablaDet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_pago", "fecha", "descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaDet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDetMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDet);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 460, 91));

        jButton9.setText("Guardar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 108, -1, -1));

        TablaPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_pago", "id_alumno", "monto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPagoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TablaPagoMouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(TablaPago);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 462, 91));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("DETALLE DE PAGO: ");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 27));
        jPanel4.add(FECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jButton4.setText("Guardar Detalle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 110, -1, -1));
        jPanel4.add(idpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 3, 100, -1));

        jButton10.setText("Modificar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 108, -1, -1));

        jButton11.setText("Modificar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, -1));

        jButton12.setText("Eliminar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 108, -1, -1));

        jButton13.setText("Eliminar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 75, -1));

        jButton6.setText("limpiar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jButton7.setText("limpiar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));
        jPanel4.add(Id_Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 100, -1));

        jPanel4.add(alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 100, -1));

        jTabbedPane1.addTab("Pago", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    AlumnosDAO AD = new AlumnosDAO();
    AlumnosVO AV = new AlumnosVO();
    
    public void listarD(JComboBox horarios){
        String sql = "select grado_grupo from grupo";
        
        try{
            Connection Conexion = CON.conectar();
            java.sql.Statement st=Conexion.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            
            horarios.removeAllItems();
            while(rs.next()){
                horarios.addItem(rs.getString("grado_grupo"));
                
            }
            Conexion.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    public void listarAlumnos(JComboBox alumnos){
        String sql = "select id_alumno from alumnos";
        try{
            Connection Conexion = CON.conectar();
            java.sql.Statement st=Conexion.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            alumnos.removeAllItems();
            while(rs.next()){
                alumnos.addItem(rs.getString("id_alumno"));
                
            }
            Conexion.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    private void GuardarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarAActionPerformed
        //AD.insertarA(IdAlumno.getText(), GradoA.getText(), NombreA.getText(), DireccionA.getText(), TelefonoA.getText());        
        insertarALUMNO();
        mostrarA();
        listarAlumnos(alumnos);
    }//GEN-LAST:event_GuardarAActionPerformed
    
    private void ModificarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarAActionPerformed
        /*AV.setGrado_grupo(GradoA.getText());
        AV.setNombre(NombreA.getText());
        AV.setDireccion(DireccionA.getText());
        AV.setTelefono(TelefonoA.getText());
        AV.setId_alumno(IdAlumno.getText());
        AD.actualizarA(AV.getGrado_grupo(), AV.getNombre(), AV.getDireccion(), AV.getTelefono(), AV.getId_alumno());
        GradoA.setText("");
        NombreA.setText("");
        DireccionA.setText("");
        TelefonoA.setText("");*/
       modificarALUMNO();
       mostrarA();
        
    }//GEN-LAST:event_ModificarAActionPerformed
    
    
    private void IdAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdAlumnoActionPerformed

    private void GradoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GradoAActionPerformed

    private void DireccionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionAActionPerformed

    private void NombreAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreAActionPerformed

    private void TelefonoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoAActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        
        /*mae.setID_Docente(Maestxt.getText());
        
        DAO.eliminar(mae.getID_Docente());
        Maestxt.setText("");
        GaYGutxt.setText("");
        Nomtxt.setText("");
        Directxt.setText("");
        RFCtxt.setText("");
        Usertxt.setText("");
        PASStxt.setText("");
        limpiarD();*/
        eliminarDOCENTE();
        mostrarD();
    }//GEN-LAST:event_DeleteActionPerformed

    private void MaestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaestxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaestxtActionPerformed

    private void GaYGutxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaYGutxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GaYGutxtActionPerformed

    private void DirectxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirectxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DirectxtActionPerformed

    private void NomtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomtxtActionPerformed

    private void RFCtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RFCtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RFCtxtActionPerformed

    private void UsertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsertxtActionPerformed

    private void PASStxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASStxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PASStxtActionPerformed
    
    private void GuardarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarMActionPerformed
        //DAO.insertar(Maestxt.getText(), GaYGutxt.getText(), Nomtxt.getText(), Directxt.getText(), RFCtxt.getText(), Usertxt.getText(), PASStxt.getText());
        insertarDOCENTE();
        
       mostrarD();
        
    }//GEN-LAST:event_GuardarMActionPerformed
    MaestrosVO mae =new MaestrosVO();
    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        
        /*mae.setGrado_Grupo(GaYGutxt.getText());
        mae.setNombre(Nomtxt.getText());
        mae.setDireccion(Directxt.getText());
        mae.setRFC(RFCtxt.getText());
        mae.setUsuario(Usertxt.getText());
        mae.setContrasena(PASStxt.getText());
        mae.setID_Docente(Maestxt.getText());
        DAO.actualizar(mae.getGrado_Grupo(), mae.getNombre(), mae.getDireccion(), mae.getRFC(), mae.getUsuario(), mae.getContrasena(), mae.getID_Docente());
        
        GaYGutxt.setText("");
        Nomtxt.setText("");
        Directxt.setText("");
        RFCtxt.setText("");
        Usertxt.setText("");
        PASStxt.setText("");*/
        modificarDOCENTE();
        mostrarD();
    }//GEN-LAST:event_ModificarActionPerformed

    private void gradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradoActionPerformed

    private void HorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HorarioActionPerformed
    crudsql objcrud = new crudsql();
    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARActionPerformed
        //objcrud.insertar(Horario.getText(), grado.getText(), jComboBox1.getSelectedItem().toString());
        eliminarGrupo();
        mostrarG();
        grado.enable(true);
        COPIA.setVisible(false);
    }//GEN-LAST:event_GUARDARActionPerformed

    private void EliminarA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarA1ActionPerformed
       /*AV.setId_alumno(IdAlumno.getText());
       AD.eliminarA(AV.getId_alumno());
       IdAlumno.setText("");
       GradoA.setText("");
       NombreA.setText("");
       DireccionA.setText("");
       TelefonoA.setText("");
       limpiarA();*/
       eliminarALUMNO();
       mostrarA();
    }//GEN-LAST:event_EliminarA1ActionPerformed
GrupoVO grup =new GrupoVO();
DefaultTableModel modelo;  
DefaultTableModel modeloD;
    void limpiarGrupo(){
        for (int i =0 ; i<=Tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i = i-1;
        }
    }
    public void mostrarG(){
        String sql= "select * from grupo";
        try {
            Connection Conexion = CON.conectar();
            ps=CON.conectar().createStatement();
            rs = ps.executeQuery(sql);
            Object [] grupo = new Object[3];
            modelo = (DefaultTableModel) Tabla.getModel();
            while(rs.next()){
                grupo [0] = rs.getString("horario");
                grupo [1] = rs.getString("grado_grupo");
                grupo [2] = rs.getString("nivel");
                modelo.addRow(grupo);
            }
            Tabla.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error...");
        }
        
    }
    void insertarGrupo(){
        String horario=Horario.getText();
        String Grado=grado.getText();
        String nivel=(String) jComboBox1.getSelectedItem();
        try{
            if(horario.equals("") || Grado.equals("") || nivel.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos del alumno.");
            }else{
                Connection Conexion = CON.conectar();
                java.sql.Statement ps = Conexion.createStatement();
                String sql = "insert into grupo values('"+horario+"','"+nivel+"','"+Grado+"')";
                ps.execute(sql);
                Conexion.close();
                JOptionPane.showMessageDialog(null, "grupo registrado.");
                limpiarGrupo();             
            }
        }catch(Exception e){
            //System.out.println("Error al insertar");
        }
    }
    
    
    void modificarGrupo(){
        String horario=Horario.getText();
        String Grado=grado.getText();
        String nivel=(String) jComboBox1.getSelectedItem();
        String nuevo = COPIA.getText();
        try{
            if(horario.equals("") || Grado.equals("") || nivel.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos.");
            }else{
                Connection Conexion = CON.conectar();
                java.sql.Statement ps=Conexion.createStatement();
                String sql = "update grupo set horario='" + horario + "',nivel='" + nivel + "',grado_grupo='" + nuevo + "' where grado_grupo='" +Grado+ "'; ";
                ps.executeUpdate(sql);
                Conexion.close();
                JOptionPane.showMessageDialog(null, "grupo actualizado.");
                limpiarGrupo();
            }
           
        }catch(Exception e){
            //System.out.println("Error al modificar");
        }
        
    }
    void eliminarGrupo(){
        String Grado=grado.getText();        
        int fila = Tabla.getSelectedRow();
        try{
            if(fila<0){
               JOptionPane.showMessageDialog(null, "alumno no seleccionado!.");
              
            }else{
                Connection Conexion = CON.conectar();
                java.sql.Statement ps=Conexion.createStatement();
                String sql="delete from grupo where grado_grupo='"+Grado+"'; ";
                ps.executeUpdate(sql);
                Conexion.close();
                JOptionPane.showMessageDialog(null, "grupo eliminado!.");
                limpiarGrupo();
            }
             
        }catch(Exception e){
         
        }
    }
    
    
    
    ///////////////////////////TODO RELACIONADO CON ALUMNO. ////////////////////////////////////////
    DefaultTableModel modelA;      
    void mostrarA(){
        String sql= "select * from alumnos";
        try {
            Connection Conexion = CON.conectar();
            ps=CON.conectar().createStatement();
            rs = ps.executeQuery(sql);
            Object [] alumnos = new Object[5];
            modelA = (DefaultTableModel) TablaA.getModel();
            while(rs.next()){
                alumnos [0] = rs.getString("id_alumno");
                alumnos [1] = rs.getString("grado_grupo");
                alumnos [2] = rs.getString("nombre");
                alumnos [3] = rs.getString("direccion");
                alumnos [4] = rs.getString("telefono");
                modelA.addRow(alumnos);
            }
            TablaA.setModel(modelA);
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error...");
        }        
    }
    void limpiarA(){
        for (int i =0 ; i<=TablaA.getRowCount(); i++){
            modelA.removeRow(i);
            i = i-1;
        }
    }
    
    void insertarALUMNO(){
        classDAO.AlumnosDAO ASU = new classDAO.AlumnosDAO();
        String ID_Alumno=IdAlumno.getText();
        //String Grado_Grupo=GradoA.getText();
        String Nombre=NombreA.getText();
        String Direccion=DireccionA.getText();
        String Telefono=TelefonoA.getText();
        String Grado_Grupo =(String) horarios1.getSelectedItem();
        try{
            if(ID_Alumno.equals("") || Grado_Grupo.equals("") || Nombre.equals("") || Direccion.equals("") || Telefono.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos del alumno.");
                
            }else{
                Connection Conexion = CON.conectar();
                java.sql.Statement ps = Conexion.createStatement();
                //if(ASU.validarA("select * from grupo where grupo='"+horarios1.setL+"' ")==false){
                    //JOptionPane.showMessageDialog(rootPane, " ¡Grupo: '"+horarios1.getSelectedItem()+"' incorrecto!");
                    //limpiarA();
                //}else{
                    String sql = "insert into alumnos values('"+ID_Alumno+"','"+Grado_Grupo+"','"+Nombre+"','"+Direccion+"','"+Telefono+"')";
                
                    ps.execute(sql);
                    Conexion.close();
                    JOptionPane.showMessageDialog(rootPane, "alumno:'"+NombreA.getText()+"' registrado.");
                    limpiarA(); 
                //}
                limpiarA();
            }
        }catch(Exception e){
            //System.out.println("Error al insertar");
        }
    }
    void modificarALUMNO(){
        String ID_Alumno=IdAlumno.getText();
        //String Grado_Grupo=GradoA.getText();
        String Nombre=NombreA.getText();
        String Direccion=DireccionA.getText();
        String Telefono=TelefonoA.getText();
        String Grado_Grupo =(String) horarios1.getSelectedItem();
        try{
            if(ID_Alumno.equals("") || Grado_Grupo.equals("") || Nombre.equals("") || Direccion.equals("") || Telefono.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos.");
            }else{
                Connection Conexion = CON.conectar();
                java.sql.Statement ps=Conexion.createStatement();
                String sql = "update alumnos set grado_grupo='" + Grado_Grupo + "',nombre='" + Nombre + "',direccion='" + Direccion + "',telefono='"+Telefono+"' where id_alumno='" +ID_Alumno+ "'; ";
                ps.executeUpdate(sql);
                Conexion.close();
                JOptionPane.showMessageDialog(null, "ALUMNO actualizado.");
                limpiarA();
            }
            
        }catch(Exception e){
            //System.out.println("Error al modificar");
        }
        
    }
    void eliminarALUMNO(){
        String ID_Alumno = IdAlumno.getText();
        int fila = TablaA.getSelectedRow();
        try{
            if(fila<0){
               JOptionPane.showMessageDialog(null, "alumno no seleccionado!.");
               limpiarA();
            }else{
                Connection Conexion = CON.conectar();
                java.sql.Statement ps=Conexion.createStatement();
                String sql="delete from alumnos where id_alumno="+ID_Alumno+"; ";
                ps.executeUpdate(sql);
                Conexion.close();
                JOptionPane.showMessageDialog(null, "alumno eliminado!.");
                limpiarA();
            }
             
        }catch(Exception e){
         
        }
    
    }
    
    
    //////////////// relacionado con maestro //////////////////////////////////////////////
    void limpiarD(){
        for (int i =0 ; i<=TablaD.getRowCount(); i++){
            modeloD.removeRow(i);
            i = i-1;
        }
    }
    void mostrarD(){
        String sql= "select * from docente";
        try {
            Connection Conexion = CON.conectar();
            ps=CON.conectar().createStatement();
            rs = ps.executeQuery(sql);
            Object [] docente = new Object[7];
            modeloD = (DefaultTableModel) TablaD.getModel();
            while(rs.next()){
                docente [0] = rs.getString("id_docente");
                docente [1] = rs.getString("grado_grupo");
                docente [2] = rs.getString("nombre");
                docente [3] = rs.getString("direccion");
                docente [4] = rs.getString("rfc");
                docente [5] = rs.getString("usuario");
                docente [6] = rs.getString("clave");
                modeloD.addRow(docente);
            }
            TablaD.setModel(modeloD);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error...");
        }
        
    }
    void insertarDOCENTE(){
        String ID_Docente=Maestxt.getText();
        //String Grado_Grupo=GaYGutxt.getText();
        String Nombre=Nomtxt.getText();
        String Direccion=Directxt.getText();
        String RFC=RFCtxt.getText();
        String Usuario=Usertxt.getText();
        String Contrasena=PASStxt.getText();
        classDAO.MaestroDAO mae = new classDAO.MaestroDAO();
        //String Grado_Grupo=(String) horarios.getSelectedItem();
        /*if(mae.validar("select * from grupo where grado_grupo='"+GaYGutxt.getText()+"' ")==false)){
            JOptionPane.showMessageDialog(rootPane, "DATOS incorrectos");
        }else{
        }*/
        //String Grado_Grupo=GaYGutxt.getText();
        String Grado_Grupo=(String) horarios.getSelectedItem();    
        
            try{
                if(ID_Docente.equals("") || Grado_Grupo.equals("") || Nombre.equals("") || Direccion.equals("") || RFC.equals("") || Usuario.equals("") || Contrasena.equals("")){
                    JOptionPane.showMessageDialog(null, "Faltan datos.");
                    
                }else{
                    Connection Conexion = CON.conectar();
                    java.sql.Statement ps = Conexion.createStatement();
                    String sql = "insert into docente values('"+ID_Docente+"','"+Grado_Grupo+"','"+Nombre+"','"+Direccion+"','"+RFC+"','"+Usuario+"','"+Contrasena+"')";
                    ps.execute(sql);
                    Conexion.close();
                    JOptionPane.showMessageDialog(null, "docente registrado.");
                    
                    limpiarD();                
                }
            }catch(Exception e){
                //System.out.println("Error al insertar");
            }
            
            limpiarD(); 
    }
    
    
    
    void modificarDOCENTE(){
        String ID_Docente=Maestxt.getText();
        //String Grado_Grupo=GaYGutxt.getText();
        String Nombre=Nomtxt.getText();
        String Direccion=Directxt.getText();
        String RFC=RFCtxt.getText();
        String Usuario=Usertxt.getText();
        String Contrasena=PASStxt.getText();
        String Grado_Grupo=(String) horarios.getSelectedItem();
        try{
            if(ID_Docente.equals("") || Grado_Grupo.equals("") || Nombre.equals("") || Direccion.equals("") || RFC.equals("") || Usuario.equals("") || Contrasena.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos.");
            }else{
                Connection Conexion = CON.conectar();
                java.sql.Statement ps=Conexion.createStatement();
                String sql = "update docente set grado_grupo='" + Grado_Grupo + "',nombre='" + Nombre + "',direccion='" + Direccion + "',rfc='"+RFC+"',usuario='"+Usuario+"',contrasena='"+Contrasena+"' where id_docente='" +ID_Docente+ "'; ";
                ps.executeUpdate(sql);
                Conexion.close();
                JOptionPane.showMessageDialog(null, "docente actualizado.");
                limpiarD();
            }
            
        }catch(Exception e){
            //System.out.println("Error al modificar");
        }
        
    }
    
    void eliminarDOCENTE(){
        String ID_Docente=Maestxt.getText();
        int fila = TablaD.getSelectedRow();
        try{
            if(fila<0){
               JOptionPane.showMessageDialog(null, "docente no seleccionado!.");
               limpiarD();
            }else{
                Connection Conexion = CON.conectar();
                java.sql.Statement ps=Conexion.createStatement();
                String sql="delete from docente where id_docente='"+ID_Docente+"'; ";
                ps.executeUpdate(sql);
                Conexion.close();
                JOptionPane.showMessageDialog(null, "docente eliminado!.");
                limpiarD();
            }
             
        }catch(Exception e){
         
        }
    
    }
    /////////////////////maestro--------------------------------------------------------------------------------
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Loging log = new Loging();
       log.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void TablaDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDMouseClicked
        
        int fila = TablaD.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "No SE SELECCIONO FILA");
        }else{
            
            String ID_Docente=(String)TablaD.getValueAt(fila, 0);
            String Grado_Grupo=(String)TablaD.getValueAt(fila, 1);
            String Nombre=(String)TablaD.getValueAt(fila, 2);  
            String Direccion=(String)TablaD.getValueAt(fila, 3);
            String RFC=(String)TablaD.getValueAt(fila, 4);
            String Usuario=(String)TablaD.getValueAt(fila, 5);
            String Contrasena=(String)TablaD.getValueAt(fila, 6);
            //idc = Integer.parseInt((String)Tabla.getValueAt(fila,0) .toString());
           
            /*String id_docente = (String)TablaD.getValueAt(fila, 0);
            String grado_grupo = (String)TablaD.getValueAt(fila, 1);       
            String nombre  = (String)TablaD.getValueAt(fila, 2);     
            String direccion = (String)TablaD.getValueAt(fila, 3);
            String rfc = (String)TablaD.getValueAt(fila, 4);
            String usuario = (String)TablaD.getValueAt(fila, 5);
            String contrasena = (String)TablaD.getValueAt(fila, 6);*/
           
            Maestxt.setText(ID_Docente);
            horarios.setSelectedItem(Grado_Grupo);
            //GaYGutxt.setText(Grado_Grupo);
            Nomtxt.setText(Nombre);
            Directxt.setText(Direccion);
            RFCtxt.setText(RFC);
            Usertxt.setText(Usuario);
            PASStxt.setText(Contrasena);
            
            
        }
    }//GEN-LAST:event_TablaDMouseClicked
    
    private void TablaAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAMouseClicked
        int fila = TablaA.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "No SE SELECCIONO FILA");
        }else{
            //idc = Integer.parseInt((String)Tabla.getValueAt(fila,0) .toString());
            String ID_Alumno=(String)TablaA.getValueAt(fila, 0);
            String Grado_Grupo=(String)TablaA.getValueAt(fila, 1);   
            String Nombre=(String)TablaA.getValueAt(fila, 2);  
            String Direccion=(String)TablaA.getValueAt(fila, 3);
            String Telefono=(String)TablaA.getValueAt(fila, 4);
            
            /*String id_alumno = (String)TablaA.getValueAt(fila, 0);
            String grado_grupo = (String)TablaA.getValueAt(fila, 1);       
            String nombre  = (String)TablaA.getValueAt(fila, 2);     
            String direccion = (String)TablaA.getValueAt(fila, 3);
            String telefono = (String)TablaA.getValueAt(fila, 4);*/
            IdAlumno.setText(ID_Alumno);
            //GradoA.setText(Grado_Grupo);
            horarios1.setSelectedItem(Grado_Grupo);
            NombreA.setText(Nombre);
            DireccionA.setText(Direccion);
            TelefonoA.setText(Telefono);
        }
        
    }//GEN-LAST:event_TablaAMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        insertarPago();
        MostrarPago();
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        insertardetPago();
        MostrardetPago();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        modificarPago();
        MostrarPago();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        modificardetPago();
        MostrardetPago();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void GUARDAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDAR2ActionPerformed
        modificarGrupo();
        mostrarG();
        grado.enable(true);
        COPIA.setVisible(false);
        listarD(horarios);
        listarD(horarios1);
    }//GEN-LAST:event_GUARDAR2ActionPerformed

    private void GUARDAR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDAR3ActionPerformed
        insertarGrupo();
        listarD(horarios);
        //listarD(horarios);
        listarD(horarios1);
        mostrarG();
    }//GEN-LAST:event_GUARDAR3ActionPerformed

    private void TablaPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPagoMouseClicked
        int fila = TablaPago.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "No SE SELECCIONO FILA");
        }else{
            //idc = Integer.parseInt((String)Tabla.getValueAt(fila,0) .toString());
            String id_pago=(String)TablaPago.getValueAt(fila, 0);
            String id_alumno=(String)TablaPago.getValueAt(fila, 1);   
            String monto=(String)TablaPago.getValueAt(fila, 2);  
            
            /*String id_alumno = (String)TablaA.getValueAt(fila, 0);
            String grado_grupo = (String)TablaA.getValueAt(fila, 1);       
            String nombre  = (String)TablaA.getValueAt(fila, 2);     
            String direccion = (String)TablaA.getValueAt(fila, 3);
            String telefono = (String)TablaA.getValueAt(fila, 4);*/
            idpago.setText(id_pago);
            //Id_Alumno.setText(id_alumno);
            alumnos.setSelectedItem(id_alumno);
            Monto.setText(monto);
            
        }
    }//GEN-LAST:event_TablaPagoMouseClicked

    private void TablaPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPagoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaPagoMouseExited

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        eliminarPago();
        MostrarPago();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        eliminardetPago();
        MostrardetPago();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void TablaDetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDetMouseClicked
        int fila = TablaDet.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "No SE SELECCIONO FILA");
        }else{
            //idc = Integer.parseInt((String)Tabla.getValueAt(fila,0) .toString());
            String id_pago=(String)TablaDet.getValueAt(fila, 0);
            //String CNS=(String)TablaDet.getValueAt(fila, 1);
            //S fecha =(Date.) TablaDet.getValueAt(fila, 2);      
            String Descripcion=(String)TablaDet.getValueAt(fila, 2);  
          
            idpago.setText(id_pago);
            //cns.setText(CNS);
            DESC.setText(Descripcion);
            //FECHA.setDateFormatString(fecha);
            
        }
    }//GEN-LAST:event_TablaDetMouseClicked

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int fila = Tabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "No SE SELECCIONO FILA");
        }else{
            String horario=(String)Tabla.getValueAt(fila, 0);
            String Grado=(String)Tabla.getValueAt(fila, 1);
            String nivel=(String)Tabla.getValueAt(fila, 2);
            
            Horario.setText(horario);
            grado.setText(Grado);
            jComboBox1.setSelectedItem(nivel);
            
        }
        grado.enable(false);
        COPIA.setVisible(true);
    }//GEN-LAST:event_TablaMouseClicked

     
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Maestxt.setText("");
        GaYGutxt.setText("");
        Nomtxt.setText("");
        Directxt.setText("");
        RFCtxt.setText("");
        Usertxt.setText("");
        PASStxt.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        IdAlumno.setText("");
        GradoA.setText("");
        NombreA.setText("");
        DireccionA.setText("");
        TelefonoA.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        idpago.setText("");
        Id_Alumno.setText("");
        Monto.setText("");
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        idpago.setText("");
        //cns.setText("");
        DESC.setText("");
        
        

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        grado.setText("");
        Horario.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void horariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horariosActionPerformed
        
    }//GEN-LAST:event_horariosActionPerformed

    private void horarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horarios1ActionPerformed
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    void limpiarPago(){
        for (int i =0 ; i<=TablaPago.getRowCount(); i++){
            ModeloP.removeRow(i);
            i = i-1;
        }
    }
    DefaultTableModel ModeloP;
    public void MostrarPago(){
        String sql= "select * from pago";
        try {
            Connection Conexion = CON.conectar();
            ps=CON.conectar().createStatement();
            rs = ps.executeQuery(sql);
            Object [] pg = new Object[3];
            ModeloP = (DefaultTableModel) TablaPago.getModel();
            while(rs.next()){
                pg [0] = rs.getString("id_pago");
                pg [1] = rs.getString("id_alumno");
                pg [2] = rs.getString("monto");
          
                ModeloP.addRow(pg);
            }
            TablaPago.setModel(ModeloP);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error...");
        }
    }
    
    public void insertarPago(){
        String id_pago=idpago.getText();
        //String id_alumno=Id_Alumno.getText();
        String monto=Monto.getText();
        String id_alumno=(String) alumnos.getSelectedItem();
        
        try{
            Connection Conexion = CON.conectar();
            java.sql.Statement ps=Conexion.createStatement();
            String sql = "insert into pago values('"+id_pago+"','"+id_alumno+"','"+monto+"')";
            ps.execute(sql);
            Conexion.close();
            JOptionPane.showMessageDialog(null, "pago registrado.");
            limpiarPago();
        }catch(Exception e){
            //System.out.println("Error al insertar");
        }
        
    }
    void modificarPago(){
        String id_pago=idpago.getText();
        //String id_alumno=Id_Alumno.getText();
        String monto=Monto.getText();
        String id_alumno=(String) alumnos.getSelectedItem();
        try{
            if(id_pago.equals("") || id_alumno.equals("") || monto.equals("") ){
                JOptionPane.showMessageDialog(null, "Faltan datos.");
            }else{
                Connection Conexion = CON.conectar();
                java.sql.Statement ps=Conexion.createStatement();
                String sql = "update pago set id_alumno='" +id_alumno+ "',monto='" + monto + "'where id_pago='" +id_pago+ "'; ";
                ps.executeUpdate(sql);
                Conexion.close();
                JOptionPane.showMessageDialog(null, "pago actualizado.");
                limpiarPago();
            }
            
        }catch(Exception e){
            //System.out.println("Error al modificar");
        }
        
        
    }
    
    void eliminarPago(){
        String id_pago=idpago.getText();
        int fila = TablaPago.getSelectedRow();
        try{
            if(fila<0){
               JOptionPane.showMessageDialog(null, "pago no seleccionado!.");
               
            }else{
                Connection Conexion = CON.conectar();
                java.sql.Statement ps=Conexion.createStatement();
                String sql="delete from pago where id_pago='"+id_pago+"'; ";
                ps.executeUpdate(sql);
                Conexion.close();
                JOptionPane.showMessageDialog(null, "pago eliminado!.");
                limpiarPago();
            }             
        }catch(Exception e){         
        }
       
    }
    
    ////////////////////////////////////det pago/////////////////////////////////////////////////////////////////////////////////
    DefaultTableModel ModelodP;
    public void MostrardetPago(){
        String sql= "select * from det_pago";
        try {
            Connection Conexion = CON.conectar();
            ps=CON.conectar().createStatement();
            rs = ps.executeQuery(sql);
            Object [] detpg = new Object[3];
            ModelodP = (DefaultTableModel) TablaDet.getModel();
            while(rs.next()){
                detpg [0] = rs.getString("id_pago");
                //detpg [1] = rs.getString("cns");
                detpg [1] = rs.getDate("fecha").toString();
                detpg [2] = rs.getString("descripcion");
                ModelodP.addRow(detpg);
            }
            TablaDet.setModel(ModelodP);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error...");
        }
    }
    void limpiardetPago(){
        for (int i =0 ; i<=TablaDet.getRowCount(); i++){
            ModelodP.removeRow(i);
            i = i-1;
        }
    }
    
    public void insertardetPago(){
        classDAO.LoginDAO obj = new classDAO.LoginDAO();
        java.util.Date date = FECHA.getDate();
        String id_pago=idpago.getText();
        //String CNS=cns.getText();
        String Descripcion=DESC.getText();
        
        //if(obj.validar("select * from pago where id_pago='"+idpago.getText()+"' ")==false){
            //JOptionPane.showMessageDialog(rootPane, " ¡id_pago: '"+idpago.getText()+"' no existe!!");
            //limpiardetPago();
        //}else{
            try{
                Connection Conexion = CON.conectar();
                java.sql.Statement ps=Conexion.createStatement();
                if(obj.validar("select * from pago where id_pago='"+idpago.getText()+"' ")==false){
                    JOptionPane.showMessageDialog(rootPane, " ¡id_pago: '"+idpago.getText()+"' no existe!!");
                    limpiardetPago();
                }else{
                    String sql = "insert into det_pago values('"+id_pago+"','"+date+"','"+Descripcion+"')";
                    ps.execute(sql);
                    Conexion.close();
                    JOptionPane.showMessageDialog(null, "DETALLE pago registrado.");
                    limpiardetPago();
                }
                
            }catch(Exception e){
                //System.out.println("Error al insertar");
            }
            
        //}
        //limpiardetPago();
    }
    
    ///////////////////////////detalle pago 
    
    
    void modificardetPago(){
        java.util.Date date = FECHA.getDate();
        String id_pago=idpago.getText();
        //String CNS=cns.getText();
        String Descripcion=DESC.getText();
        try{
            if(id_pago.equals("") || date.equals("") || Descripcion.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos.");
            }else{
                Connection Conexion = CON.conectar();
                java.sql.Statement ps=Conexion.createStatement();
                String sql = "update det_pago set fecha='" + date + "',descripcion='" + Descripcion + "' where id_pago='" +id_pago+ "'; ";
                ps.executeUpdate(sql);
                Conexion.close();
                JOptionPane.showMessageDialog(null, "detalle pago actualizado.");
                limpiardetPago();
            }
            
        }catch(Exception e){
            //System.out.println("Error al modificar");
        }
        
    }
    
    void eliminardetPago(){
        String id_pago=idpago.getText();
        int fila = TablaDet.getSelectedRow();
        try{
            if(fila<0){
               JOptionPane.showMessageDialog(null, "detalle no seleccionado!.");
               limpiardetPago();
            }else{
                Connection Conexion = CON.conectar();
                java.sql.Statement ps=Conexion.createStatement();
                String sql="delete from det_pago where id_pago='"+id_pago+"'; ";
                ps.executeUpdate(sql);
                Conexion.close();
                JOptionPane.showMessageDialog(null, "detalle detalle pago eliminado!.");
                limpiardetPago();
            }             
        }catch(Exception e){         
        }
        
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField COPIA;
    private javax.swing.JTextField DESC;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField DireccionA;
    private javax.swing.JTextField Directxt;
    private javax.swing.JButton EliminarA1;
    private com.toedter.calendar.JDateChooser FECHA;
    private javax.swing.JButton GUARDAR;
    private javax.swing.JButton GUARDAR2;
    private javax.swing.JButton GUARDAR3;
    private javax.swing.JTextField GaYGutxt;
    private javax.swing.JTextField GradoA;
    private javax.swing.JButton GuardarA;
    private javax.swing.JButton GuardarM;
    private javax.swing.JTextField Horario;
    private javax.swing.JTextField IdAlumno;
    private javax.swing.JTextField Id_Alumno;
    private javax.swing.JTextField Maestxt;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton ModificarA;
    private javax.swing.JTextField Monto;
    private javax.swing.JTextField NombreA;
    private javax.swing.JTextField Nomtxt;
    private javax.swing.JTextField PASStxt;
    private javax.swing.JTextField RFCtxt;
    public static javax.swing.JTable Tabla;
    private javax.swing.JTable TablaA;
    private javax.swing.JTable TablaD;
    private javax.swing.JTable TablaDet;
    private javax.swing.JTable TablaPago;
    private javax.swing.JTextField TelefonoA;
    private javax.swing.JTextField Usertxt;
    private javax.swing.JComboBox alumnos;
    private javax.swing.JTextField grado;
    private javax.swing.JComboBox horarios;
    private javax.swing.JComboBox horarios1;
    private javax.swing.JTextField idpago;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
