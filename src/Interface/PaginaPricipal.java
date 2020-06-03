package Interface;

import java.awt.Image;
import javax.swing.ImageIcon;

public class PaginaPricipal extends javax.swing.JFrame {

    private int Contador = 0, ContadorContenido = 0;
    private Texto ContenidosVetores = new Texto();
    private ImageIcon PROTOCOLO = new ImageIcon(getClass().getResource("/Imagenes/router-inalambrico (1).png"));
    private ImageIcon Html = new ImageIcon(getClass().getResource("/Imagenes/HTML (2).png"));
    private MensajeOculto Ventana = new MensajeOculto();

    public PaginaPricipal() {
        initComponents();
        Invisible();
    }

    public void Invisible() {

        Tema1.setVisible(false);
        LogoTema1.setVisible(false);
        Tema2.setVisible(false);
        LogoTema2.setVisible(false);
        Tema3.setVisible(false);
        LogoTema3.setVisible(false);
        Tema4.setVisible(false);
        LogoTema4.setVisible(false);
        Tema5.setVisible(false);
        LogoTema5.setVisible(false);
        Tema6.setVisible(false);
        LogoTema6.setVisible(false);
        Tema7.setVisible(false);
        LogoTema7.setVisible(false);
        Tema8.setVisible(false);
        LogoTema8.setVisible(false);
        Tema9.setVisible(false);
        LogoTema9.setVisible(false);
        Tema10.setVisible(false);
        LogoTema10.setVisible(false);
        Tema11.setVisible(false);
        LogoTema11.setVisible(false);
        Tema12.setVisible(false);
        LogoTema12.setVisible(false);
        HTMLCONTENDOR.setVisible(false);
        CSSCONTENEDOR.setVisible(false);
        PROTOCOLOSCONTENEDOR.setVisible(false);
        PaginaContenido.setVisible(false);
        Siguiente.setVisible(false);
        Atras.setVisible(false);

    }

    public void Visible() {

        Tema1.setVisible(true);
        LogoTema1.setVisible(true);
        Tema2.setVisible(true);
        LogoTema2.setVisible(true);
        Tema3.setVisible(true);
        LogoTema3.setVisible(true);
        Tema4.setVisible(true);
        LogoTema4.setVisible(true);
        Tema5.setVisible(true);
        LogoTema5.setVisible(true);
        Tema6.setVisible(true);
        LogoTema6.setVisible(true);
        Tema7.setVisible(true);
        LogoTema7.setVisible(true);
        Tema8.setVisible(true);
        LogoTema8.setVisible(true);
        Tema9.setVisible(true);
        LogoTema9.setVisible(true);
        Tema10.setVisible(true);
        LogoTema10.setVisible(true);
        Tema11.setVisible(true);
        LogoTema11.setVisible(true);
        Tema12.setVisible(true);
        LogoTema12.setVisible(true);

        Tema1.setText(String.valueOf(ContenidosVetores.getETIQUETA1().get(Contador)));
        Tema2.setText(String.valueOf(ContenidosVetores.getETIQUETA2().get(Contador)));
        Tema3.setText(String.valueOf(ContenidosVetores.getETIQUETA3().get(Contador)));
        Tema4.setText(String.valueOf(ContenidosVetores.getETIQUETA4().get(Contador)));
        Tema5.setText(String.valueOf(ContenidosVetores.getETIQUETA5().get(Contador)));
        Tema6.setText(String.valueOf(ContenidosVetores.getETIQUETA6().get(Contador)));
        Tema7.setText(String.valueOf(ContenidosVetores.getETIQUETA7().get(Contador)));
        Tema8.setText(String.valueOf(ContenidosVetores.getETIQUETA8().get(Contador)));
        Tema9.setText(String.valueOf(ContenidosVetores.getETIQUETA9().get(Contador)));
        Tema10.setText(String.valueOf(ContenidosVetores.getETIQUETA10().get(Contador)));
        Tema11.setText(String.valueOf(ContenidosVetores.getETIQUETA11().get(Contador)));
        Tema12.setText(String.valueOf(ContenidosVetores.getETIQUETA12().get(Contador)));

        if (Contador == 0) {
            LogoTema1.setIcon(new ImageIcon(PROTOCOLO.getImage().getScaledInstance(LogoTema1.getWidth(), LogoTema1.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema2.setIcon(new ImageIcon(PROTOCOLO.getImage().getScaledInstance(LogoTema2.getWidth(), LogoTema2.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema3.setIcon(new ImageIcon(PROTOCOLO.getImage().getScaledInstance(LogoTema3.getWidth(), LogoTema3.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema4.setIcon(new ImageIcon(PROTOCOLO.getImage().getScaledInstance(LogoTema4.getWidth(), LogoTema4.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema5.setIcon(new ImageIcon(PROTOCOLO.getImage().getScaledInstance(LogoTema5.getWidth(), LogoTema5.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema6.setIcon(new ImageIcon(PROTOCOLO.getImage().getScaledInstance(LogoTema6.getWidth(), LogoTema6.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema7.setIcon(new ImageIcon(PROTOCOLO.getImage().getScaledInstance(LogoTema7.getWidth(), LogoTema7.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema8.setIcon(new ImageIcon(PROTOCOLO.getImage().getScaledInstance(LogoTema8.getWidth(), LogoTema8.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema9.setIcon(new ImageIcon(PROTOCOLO.getImage().getScaledInstance(LogoTema9.getWidth(), LogoTema9.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema10.setIcon(new ImageIcon(PROTOCOLO.getImage().getScaledInstance(LogoTema10.getWidth(), LogoTema10.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema11.setIcon(new ImageIcon(PROTOCOLO.getImage().getScaledInstance(LogoTema11.getWidth(), LogoTema11.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema12.setIcon(new ImageIcon(PROTOCOLO.getImage().getScaledInstance(LogoTema12.getWidth(), LogoTema12.getHeight(), Image.SCALE_SMOOTH)));

        } else if (Contador == 1) {

            LogoTema1.setIcon(new ImageIcon(Html.getImage().getScaledInstance(LogoTema1.getWidth(), LogoTema1.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema2.setIcon(new ImageIcon(Html.getImage().getScaledInstance(LogoTema2.getWidth(), LogoTema2.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema3.setIcon(new ImageIcon(Html.getImage().getScaledInstance(LogoTema3.getWidth(), LogoTema3.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema4.setIcon(new ImageIcon(Html.getImage().getScaledInstance(LogoTema4.getWidth(), LogoTema4.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema5.setIcon(new ImageIcon(Html.getImage().getScaledInstance(LogoTema5.getWidth(), LogoTema5.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema6.setIcon(new ImageIcon(Html.getImage().getScaledInstance(LogoTema6.getWidth(), LogoTema6.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema7.setIcon(new ImageIcon(Html.getImage().getScaledInstance(LogoTema7.getWidth(), LogoTema7.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema8.setIcon(new ImageIcon(Html.getImage().getScaledInstance(LogoTema8.getWidth(), LogoTema8.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema9.setIcon(new ImageIcon(Html.getImage().getScaledInstance(LogoTema9.getWidth(), LogoTema9.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema10.setIcon(new ImageIcon(Html.getImage().getScaledInstance(LogoTema10.getWidth(), LogoTema10.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema11.setIcon(new ImageIcon(Html.getImage().getScaledInstance(LogoTema11.getWidth(), LogoTema11.getHeight(), Image.SCALE_SMOOTH)));
            LogoTema12.setIcon(new ImageIcon(Html.getImage().getScaledInstance(LogoTema12.getWidth(), LogoTema12.getHeight(), Image.SCALE_SMOOTH)));
        }

    }

    public void BotonesVisibles() {
        Siguiente.setVisible(true);
        Atras.setVisible(false);
    }

    public void VisibleProtocolo() {
        HTMLCONTENDOR.setVisible(false);
        PROTOCOLOSCONTENEDOR.setVisible(true);
    }

    public void VisibleHTML() {
        PROTOCOLOSCONTENEDOR.setVisible(false);
        HTMLCONTENDOR.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cursos = new java.awt.Panel();
        Protocolos = new javax.swing.JLabel();
        HTML = new javax.swing.JLabel();
        Css = new javax.swing.JLabel();
        JavaScript = new javax.swing.JLabel();
        PHP = new javax.swing.JLabel();
        Java = new javax.swing.JLabel();
        Python = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ContenedorCursos = new javax.swing.JLabel();
        Buscador = new java.awt.Panel();
        ContenedorBuscador = new javax.swing.JLabel();
        ListadoCursos = new java.awt.Panel();
        Tema1 = new javax.swing.JLabel();
        LogoTema1 = new javax.swing.JLabel();
        Tema2 = new javax.swing.JLabel();
        LogoTema2 = new javax.swing.JLabel();
        Tema3 = new javax.swing.JLabel();
        LogoTema3 = new javax.swing.JLabel();
        Tema4 = new javax.swing.JLabel();
        LogoTema4 = new javax.swing.JLabel();
        Tema5 = new javax.swing.JLabel();
        LogoTema5 = new javax.swing.JLabel();
        Tema6 = new javax.swing.JLabel();
        LogoTema6 = new javax.swing.JLabel();
        Tema7 = new javax.swing.JLabel();
        LogoTema7 = new javax.swing.JLabel();
        Tema8 = new javax.swing.JLabel();
        LogoTema8 = new javax.swing.JLabel();
        Tema9 = new javax.swing.JLabel();
        LogoTema9 = new javax.swing.JLabel();
        Tema10 = new javax.swing.JLabel();
        LogoTema10 = new javax.swing.JLabel();
        Tema11 = new javax.swing.JLabel();
        LogoTema11 = new javax.swing.JLabel();
        Tema12 = new javax.swing.JLabel();
        LogoTema12 = new javax.swing.JLabel();
        HTMLCONTENDOR = new javax.swing.JLabel();
        PROTOCOLOSCONTENEDOR = new javax.swing.JLabel();
        CSSCONTENEDOR = new javax.swing.JLabel();
        ContenedorListadoCursos = new javax.swing.JLabel();
        ContenidoPrincipal = new java.awt.Panel();
        Icono = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Siguiente = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        PaginaContenido = new javax.swing.JLabel();
        ContenidoPrincipalPagina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cursos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Protocolos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/router-inalambrico (1).png"))); // NOI18N
        Protocolos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProtocolosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProtocolosMouseEntered(evt);
            }
        });
        Cursos.add(Protocolos, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 60, 60));

        HTML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HTML (2).png"))); // NOI18N
        HTML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HTMLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HTMLMouseEntered(evt);
            }
        });
        Cursos.add(HTML, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 80, 60, 60));

        Css.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/css (1) (1).png"))); // NOI18N
        Css.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CssMouseClicked(evt);
            }
        });
        Cursos.add(Css, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 150, 60, 60));

        JavaScript.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jabvs (1).png"))); // NOI18N
        Cursos.add(JavaScript, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 220, 60, 60));

        PHP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/php (1).png"))); // NOI18N
        Cursos.add(PHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 290, 60, 60));

        Java.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/java (1) (1).png"))); // NOI18N
        Cursos.add(Java, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 360, 60, 60));

        Python.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/piton (1) (1).png"))); // NOI18N
        Cursos.add(Python, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 430, 60, 60));
        Cursos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 500, 60, 60));
        Cursos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 570, 60, 60));

        ContenedorCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Purple Paradise.png"))); // NOI18N
        Cursos.add(ContenedorCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 800));

        getContentPane().add(Cursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 800));

        Buscador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContenedorBuscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUscardor.png"))); // NOI18N
        Buscador.add(ContenedorBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 50));

        getContentPane().add(Buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 370, 50));

        ListadoCursos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tema1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Tema1.setForeground(new java.awt.Color(255, 255, 255));
        Tema1.setText(String.valueOf(ContenidosVetores.getETIQUETA1().get(0)));
        Tema1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tema1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Tema1MousePressed(evt);
            }
        });
        ListadoCursos.add(Tema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 20, 250, 40));

        LogoTema1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ListadoCursos.add(LogoTema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        Tema2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Tema2.setForeground(new java.awt.Color(255, 255, 255));
        Tema2.setText(String.valueOf(ContenidosVetores.getETIQUETA2().get(0))
        );
        ListadoCursos.add(Tema2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 80, 250, 40));

        LogoTema2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ListadoCursos.add(LogoTema2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 40, 40));

        Tema3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Tema3.setForeground(new java.awt.Color(255, 255, 255));
        Tema3.setText(String.valueOf(ContenidosVetores.getETIQUETA3().get(0))
        );
        ListadoCursos.add(Tema3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 140, 250, 40));

        LogoTema3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ListadoCursos.add(LogoTema3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 40, 40));

        Tema4.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Tema4.setForeground(new java.awt.Color(255, 255, 255));
        Tema4.setText(String.valueOf(ContenidosVetores.getETIQUETA4().get(0))
        );
        ListadoCursos.add(Tema4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 200, 250, 40));

        LogoTema4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ListadoCursos.add(LogoTema4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 40, 40));

        Tema5.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Tema5.setForeground(new java.awt.Color(255, 255, 255));
        Tema5.setText(String.valueOf(ContenidosVetores.getETIQUETA5().get(0))
        );
        Tema5.setName(""); // NOI18N
        ListadoCursos.add(Tema5, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 260, 250, 40));

        LogoTema5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ListadoCursos.add(LogoTema5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 40, 40));

        Tema6.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Tema6.setForeground(new java.awt.Color(255, 255, 255));
        Tema6.setText(String.valueOf(ContenidosVetores.getETIQUETA6().get(0))
        );
        Tema6.setName(""); // NOI18N
        ListadoCursos.add(Tema6, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 320, 280, 40));

        LogoTema6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ListadoCursos.add(LogoTema6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 40, 40));

        Tema7.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Tema7.setForeground(new java.awt.Color(255, 255, 255));
        Tema7.setText(String.valueOf(ContenidosVetores.getETIQUETA7().get(0))
        );
        Tema7.setToolTipText("");
        Tema7.setName(""); // NOI18N
        ListadoCursos.add(Tema7, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 380, 250, 40));

        LogoTema7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ListadoCursos.add(LogoTema7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 40, 40));

        Tema8.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Tema8.setForeground(new java.awt.Color(255, 255, 255));
        Tema8.setText(String.valueOf(ContenidosVetores.getETIQUETA8().get(0)));
        Tema8.setName(""); // NOI18N
        ListadoCursos.add(Tema8, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 440, 250, 40));

        LogoTema8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ListadoCursos.add(LogoTema8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 40, 40));

        Tema9.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Tema9.setForeground(new java.awt.Color(255, 255, 255));
        Tema9.setText(String.valueOf(ContenidosVetores.getETIQUETA9().get(0))
        );
        Tema9.setName(""); // NOI18N
        ListadoCursos.add(Tema9, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 500, 260, 40));

        LogoTema9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ListadoCursos.add(LogoTema9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 40, 40));

        Tema10.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Tema10.setForeground(new java.awt.Color(255, 255, 255));
        Tema10.setText(String.valueOf(ContenidosVetores.getETIQUETA10().get(0)));
        Tema10.setName(""); // NOI18N
        ListadoCursos.add(Tema10, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 560, 250, 40));

        LogoTema10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ListadoCursos.add(LogoTema10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 40, 40));

        Tema11.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Tema11.setForeground(new java.awt.Color(255, 255, 255));
        Tema11.setText(String.valueOf(ContenidosVetores.getETIQUETA11().get(0)));
        Tema11.setName(""); // NOI18N
        ListadoCursos.add(Tema11, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 620, 250, 40));

        LogoTema11.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ListadoCursos.add(LogoTema11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 40, 40));

        Tema12.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Tema12.setForeground(new java.awt.Color(255, 255, 255));
        Tema12.setText(String.valueOf(ContenidosVetores.getETIQUETA12().get(0)));
        Tema12.setName(""); // NOI18N
        ListadoCursos.add(Tema12, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 680, 250, 40));

        LogoTema12.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ListadoCursos.add(LogoTema12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 40, 40));

        HTMLCONTENDOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HTMLCONTENEDOR.png"))); // NOI18N
        ListadoCursos.add(HTMLCONTENDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 750));

        PROTOCOLOSCONTENEDOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PROTOCOLOSCONTENEDOR.png"))); // NOI18N
        ListadoCursos.add(PROTOCOLOSCONTENEDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 750));

        CSSCONTENEDOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CONTENEDORCSS.png"))); // NOI18N
        ListadoCursos.add(CSSCONTENEDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 750));

        ContenedorListadoCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mirage.png"))); // NOI18N
        ListadoCursos.add(ContenedorListadoCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 750));

        getContentPane().add(ListadoCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 370, 750));

        ContenidoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoBalquecino.png"))); // NOI18N
        Icono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IconoMouseExited(evt);
            }
        });
        ContenidoPrincipal.add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 770, 24, 24));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        ContenidoPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 600, -1));

        Siguiente.setBackground(new java.awt.Color(0, 153, 255));
        Siguiente.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Siguiente.setForeground(new java.awt.Color(255, 255, 255));
        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });
        ContenidoPrincipal.add(Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 755, 100, -1));

        Atras.setBackground(new java.awt.Color(0, 153, 255));
        Atras.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Atras.setForeground(new java.awt.Color(255, 255, 255));
        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        ContenidoPrincipal.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 755, 100, -1));

        PaginaContenido.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        PaginaContenido.setForeground(new java.awt.Color(255, 255, 255));
        PaginaContenido.setText(String.valueOf(ContenidosVetores.getContenidoProtocolosTema1().get(ContadorContenido)));
        ContenidoPrincipal.add(PaginaContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 800));

        ContenidoPrincipalPagina.setBackground(new java.awt.Color(255, 255, 255));
        ContenidoPrincipalPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RedesFinal.png"))); // NOI18N
        ContenidoPrincipal.add(ContenidoPrincipalPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 800));

        getContentPane().add(ContenidoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 660, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IconoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconoMouseClicked
        System.exit(0);
    }//GEN-LAST:event_IconoMouseClicked

    private void HTMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HTMLMouseClicked
        Contador = 1;
        VisibleHTML();
        Visible();
    }//GEN-LAST:event_HTMLMouseClicked

    private void CssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CssMouseClicked


    }//GEN-LAST:event_CssMouseClicked

    private void ProtocolosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProtocolosMouseClicked
        Contador = 0;
        VisibleProtocolo();
        Visible();

    }//GEN-LAST:event_ProtocolosMouseClicked

    private void ProtocolosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProtocolosMouseEntered

        Contador = 0;
        VisibleProtocolo();
        Visible();

    }//GEN-LAST:event_ProtocolosMouseEntered

    private void HTMLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HTMLMouseEntered
        Contador = 1;
        VisibleHTML();
        Visible();

    }//GEN-LAST:event_HTMLMouseEntered

    private void IconoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconoMouseEntered
        Ventana.setVisible(true);
    }//GEN-LAST:event_IconoMouseEntered

    private void IconoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconoMouseExited
        Ventana.setVisible(false);
    }//GEN-LAST:event_IconoMouseExited

    private void Tema1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tema1MouseClicked

    }//GEN-LAST:event_Tema1MouseClicked

    private void Tema1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tema1MousePressed

        BotonesVisibles();

        if (Tema1.getText().equals(String.valueOf(ContenidosVetores.getETIQUETA1().get(0)))) {
            ContadorContenido = 0;
            
            PaginaContenido.setText(String.valueOf(ContenidosVetores.getContenidoProtocolosTema1().get(ContadorContenido)));
            PaginaContenido.setVisible(true);

        } else if (Tema1.getText().equals(String.valueOf(ContenidosVetores.getETIQUETA1().get(1)))) {
              ContadorContenido = 0;
            PaginaContenido.setText(String.valueOf(ContenidosVetores.getContenidoHTMLTema1().get(ContadorContenido)));
            PaginaContenido.setVisible(true);
        }
    }//GEN-LAST:event_Tema1MousePressed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed

        switch (Tema1.getText()) {

            case "1 . Introduccion a Redes":
                ContadorContenido++;
                PaginaContenido.setText(String.valueOf(ContenidosVetores.getContenidoProtocolosTema1().get(ContadorContenido)));
                if (ContadorContenido == (ContenidosVetores.getContenidoProtocolosTema1().size() - 1) && ContadorContenido > 0) {
                    Siguiente.setVisible(false);
                    Atras.setVisible(true);
                } else if (ContadorContenido > 0 && (ContadorContenido < ContenidosVetores.getContenidoProtocolosTema1().size() - 1)) {
                    Siguiente.setVisible(true);
                    Atras.setVisible(true);
                } else {
                    Atras.setVisible(false);
                }
                break;
            case "1 . Introduccion a HTML":
                ContadorContenido++;
                PaginaContenido.setText(String.valueOf(ContenidosVetores.getContenidoHTMLTema1().get(ContadorContenido)));
                if (ContadorContenido == (ContenidosVetores.getContenidoHTMLTema1().size() - 1) && ContadorContenido > 0) {
                    Siguiente.setVisible(false);
                    Atras.setVisible(true);
                } else if (ContadorContenido > 0 && (ContadorContenido < ContenidosVetores.getContenidoHTMLTema1().size() - 1)) {
                    Siguiente.setVisible(true);
                    Atras.setVisible(true);
                } else {
                    Atras.setVisible(false);
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_SiguienteActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        switch (Tema1.getText()) {

            case "1 . Introduccion a Redes":
                ContadorContenido--;
                PaginaContenido.setText(String.valueOf(ContenidosVetores.getContenidoProtocolosTema1().get(ContadorContenido)));
                if (ContadorContenido < ContenidosVetores.getContenidoProtocolosTema1().size() && ContadorContenido == 0) {
                    Siguiente.setVisible(true);
                    Atras.setVisible(false);
                } else if (ContadorContenido < ContenidosVetores.getContenidoProtocolosTema1().size() && ContadorContenido != 0) {
                    Siguiente.setVisible(true);
                    Atras.setVisible(true);
                }
                break;
            case "1 . Introduccion a HTML":
                ContadorContenido--;
                PaginaContenido.setText(String.valueOf(ContenidosVetores.getContenidoHTMLTema1().get(ContadorContenido)));
                if (ContadorContenido < ContenidosVetores.getContenidoHTMLTema1().size() && ContadorContenido == 0) {
                    Siguiente.setVisible(true);
                    Atras.setVisible(false);
                } else if (ContadorContenido < ContenidosVetores.getContenidoHTMLTema1().size() && ContadorContenido != 0) {
                    Siguiente.setVisible(true);
                    Atras.setVisible(true);
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_AtrasActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaPricipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPricipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPricipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPricipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPricipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private java.awt.Panel Buscador;
    private javax.swing.JLabel CSSCONTENEDOR;
    private javax.swing.JLabel ContenedorBuscador;
    private javax.swing.JLabel ContenedorCursos;
    private javax.swing.JLabel ContenedorListadoCursos;
    private java.awt.Panel ContenidoPrincipal;
    private javax.swing.JLabel ContenidoPrincipalPagina;
    private javax.swing.JLabel Css;
    private java.awt.Panel Cursos;
    private javax.swing.JLabel HTML;
    private javax.swing.JLabel HTMLCONTENDOR;
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel Java;
    private javax.swing.JLabel JavaScript;
    private java.awt.Panel ListadoCursos;
    private javax.swing.JLabel LogoTema1;
    private javax.swing.JLabel LogoTema10;
    private javax.swing.JLabel LogoTema11;
    private javax.swing.JLabel LogoTema12;
    private javax.swing.JLabel LogoTema2;
    private javax.swing.JLabel LogoTema3;
    private javax.swing.JLabel LogoTema4;
    private javax.swing.JLabel LogoTema5;
    private javax.swing.JLabel LogoTema6;
    private javax.swing.JLabel LogoTema7;
    private javax.swing.JLabel LogoTema8;
    private javax.swing.JLabel LogoTema9;
    private javax.swing.JLabel PHP;
    private javax.swing.JLabel PROTOCOLOSCONTENEDOR;
    private javax.swing.JLabel PaginaContenido;
    private javax.swing.JLabel Protocolos;
    private javax.swing.JLabel Python;
    private javax.swing.JButton Siguiente;
    private javax.swing.JLabel Tema1;
    private javax.swing.JLabel Tema10;
    private javax.swing.JLabel Tema11;
    private javax.swing.JLabel Tema12;
    private javax.swing.JLabel Tema2;
    private javax.swing.JLabel Tema3;
    private javax.swing.JLabel Tema4;
    private javax.swing.JLabel Tema5;
    private javax.swing.JLabel Tema6;
    private javax.swing.JLabel Tema7;
    private javax.swing.JLabel Tema8;
    private javax.swing.JLabel Tema9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}