package Interface;

import java.util.ArrayList;

public class Texto {

    private ArrayList<String> Para_Tema1;
    private ArrayList<String> Para_Tema2;
    private ArrayList<String> Para_Tema3;
    private ArrayList<String> Para_Tema4;
    private ArrayList<String> Para_Tema5;
    private ArrayList<String> Para_Tema6;
    private ArrayList<String> Para_Tema7;
    private ArrayList<String> Para_Tema8;
    private ArrayList<String> Para_Tema9;
    private ArrayList<String> Para_Tema10;
    private ArrayList<String> Para_Tema11;
    private ArrayList<String> Para_Tema12;

    private ArrayList<String> Contenido_Protocolos_Tema1;
    private ArrayList<String> Contenido_HTML_Tema1;

    public ArrayList getETIQUETA1() {
        String T1_Protocolos = "1 . Introduccion a Redes";
        String T1_Html = "1 . Introduccion a HTML";

        Para_Tema1 = new ArrayList<>();
        Para_Tema1.add(T1_Protocolos);
        Para_Tema1.add(T1_Html);

        return Para_Tema1;
    }

    public ArrayList getETIQUETA2() {
        String T2_Protocolos = "2 . Modelo TCP/IP";
        String T2_Html = "2 . Meta Tags basicos";

        Para_Tema2 = new ArrayList<>();
        Para_Tema2.add(T2_Protocolos);
        Para_Tema2.add(T2_Html);

        return Para_Tema2;
    }

    public ArrayList getETIQUETA3() {
        String T3_Protocolos = "3 . Capa de Aplicacion";
        String T3_Html = "3 . Etiquetas de Texto";

        Para_Tema3 = new ArrayList<>();
        Para_Tema3.add(T3_Protocolos);
        Para_Tema3.add(T3_Html);

        return Para_Tema3;
    }

    public ArrayList getETIQUETA4() {
        String T4_Protocolos = "4 . Capa de Transporte";
        String T4_Html = "4 . Caracteres Especiales";

        Para_Tema4 = new ArrayList<>();
        Para_Tema4.add(T4_Protocolos);
        Para_Tema4.add(T4_Html);

        return Para_Tema4;
    }

    public ArrayList getETIQUETA5() {
        String T5_Protocolos = "5 . Capa de Internet";
        String T5_Html = "5 . Tablas";

        Para_Tema5 = new ArrayList<>();
        Para_Tema5.add(T5_Protocolos);
        Para_Tema5.add(T5_Html);

        return Para_Tema5;
    }

    public ArrayList getETIQUETA6() {
        String T6_Protocolos = "6 . Capa de Interfaz de Red";
        String T6_Html = "6 . Listas";

        Para_Tema6 = new ArrayList<>();
        Para_Tema6.add(T6_Protocolos);
        Para_Tema6.add(T6_Html);

        return Para_Tema6;
    }

    public ArrayList getETIQUETA7() {
        String T7_Protocolos = "7 . Redes Informaticas";
        String T7_Html = "7 . Imagenes";

        Para_Tema7 = new ArrayList<>();
        Para_Tema7.add(T7_Protocolos);
        Para_Tema7.add(T7_Html);

        return Para_Tema7;
    }

    public ArrayList getETIQUETA8() {
        String T8_Protocolos = "8 . Tipos de Redes";
        String T8_Html = "8 . Enlaces";

        Para_Tema8 = new ArrayList<>();
        Para_Tema8.add(T8_Protocolos);
        Para_Tema8.add(T8_Html);

        return Para_Tema8;
    }

    public ArrayList getETIQUETA9() {
        String T9_Protocolos = "9 . Elementos de una Red";
        String T9_Html = "9 . Formularios";

        Para_Tema9 = new ArrayList<>();
        Para_Tema9.add(T9_Protocolos);
        Para_Tema9.add(T9_Html);

        return Para_Tema9;
    }

    public ArrayList getETIQUETA10() {
        String T10_Protocolos = "10 . Topologia de la Red";
        String T10_Html = "10 . Frames";

        Para_Tema10 = new ArrayList<>();
        Para_Tema10.add(T10_Protocolos);
        Para_Tema10.add(T10_Html);

        return Para_Tema10;
    }

    public ArrayList getETIQUETA11() {
        String T11_Protocolos = "11 . Modelo OSI";
        String T11_Html = "11 . JavaScript y HTML";

        Para_Tema11 = new ArrayList<>();
        Para_Tema11.add(T11_Protocolos);
        Para_Tema11.add(T11_Html);

        return Para_Tema11;
    }

    public ArrayList getETIQUETA12() {
        String T12_Protocolos = "12 . Firewall";
        String T12_Html = "12 . Manual";
        Para_Tema12 = new ArrayList<>();
        Para_Tema12.add(T12_Protocolos);
        Para_Tema12.add(T12_Html);

        return Para_Tema12;
    }

    public ArrayList getContenidoProtocolosTema1() {

        String Pagina0 = "<html>"
                + "<body>"
                + "<h1 align = center><FONT SIZE=9><b>Redes de Computadoras</b></font></h1>"
                + "<h2><FONT SIZE=6><b>¿ Que es una Red?</b></font></h2>"
                + "<p>"
                + "Una red de Computadoras (Tambien llamada Red de Computadores o Red <br>"
                + "Informatica) es un conjunto de equipos (Computadoras y/o Dispositivos) conectados<br>"
                + "por medio de cables, señales, ondas o cualquier otro medio de transporte de datos,<br>"
                + "que comparten informacion (archivos), recursos (CD-ROM, Impresoras, etc)<br>"
                + "y servicios (acceso a internet, e-mail, Juegos, chats, etc).<br>"
                + "</p>"
                + "<h2><FONT SIZE=6><b>Componentes de una Red</b></font></h2>"
                + "<p>"
                + "Los Componentes de una Red tienen funciones específicas y se utilizan dependiendo<br>"
                + "de las características físicas(HARDWARE) que tienen. Para elegirlos se requiere <br>"
                + "considerar las necesidades y los recursos económicos de quien se desea conectar a <br>"
                + "la <strong>Red</strong>, por eso deben conocerse las características técnicas de cada componente<br>"
                + "de <strong>Red</strong> a continuacion conoceremos algunos.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6>1 . Servidor </font></h2>"
                + "<p>"
                + "Son computadoras que controlan las <strong>Redes</strong> y se encargan de permitir o no el acceso<br>"
                + "de los usuarios a los recursos, también controlan los permisos que determinan si un<br>"
                + "nodo puede o no pertenecer a una <strong>Red</strong>. La finalidad de los servidores es controlar<br>"
                + "el funcionamiento de una <strong>Red</strong> y los servicios que realice cada una de estas<br>"
                + "computadoras dependerán del diseño de la <strong>Red</strong>. <br>"
                + "</p>"
                + "<h2><FONT SIZE=6>2 . Estación de Trabajo </font></h2>"
                + "<p>"
                + "Es el nombre que reciben las computadoras conectadas a una <strong>Red</strong> pero estas no<br>"
                + "pueden controlarla, ni ninguno de sus nodos o recursos de la misma <strong>Red</strong> cualquier<br>"
                + "computadora puede ser una Estación de Trabajo, siempre que este conectada y se<br>"
                + "comunique a la <strong>Red</strong>.<br>"
                + "</p><br><br>"
                + "</body>"
                + "</html>";

        String Pagina1 = "<html>"
                + "<body>"
                + "<h1 align = center><FONT SIZE=9><b>Redes de Computadoras</b></font></h1>"
                + "<h2><FONT SIZE=6><b>3 . Nodo de Red</b></font></h2>"
                + "<p>"
                + "Nodo de <strong>Red</strong> es cualquier elemento que se encuentre conectado y comunicado<br>"
                + "a una <strong>Red</strong>; a los periféricos que se conectan a una computadora se convierte en<br>"
                + "nodos si están conectados a la red y pueden compartir sus servicios para ser utilizados<br>"
                + "por los usuarios, como impresoras, etc.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6><b>4 . Tarjetas de Red</b></font></h2>"
                + "<p>"
                + "Son tarjetas de circuitos integrados que se insertan en unos órganos de expansión<br>"
                + "de la tarjeta Madre y cuya función es recibir el cable que conecta a la computadora<br>"
                + "con una <strong>Red</strong> informátíca; así todas las computadoras de <strong>Red</strong> podrán intercambiar<br>"
                + "información.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6>Medios de Transmisión</font></h2>"
                + "<p>"
                + "Estos elementos hacen posible la comunicación entre dos computadoras, son cables<br>"
                + "que se conectan a las computadoras y a través de estos viaja la información.<br>"
                + "Los cables son un componente básico en la comunicación entre computadoras.<br>"
                + "Existen diferentes tipos de cable y su elección depende de las necesidades<br>"
                + "de la comunicación de <strong>Red</strong> a continuacion veremos algunos. <br>"
                + "</p>"
                + "<h2><FONT SIZE=6>1 . Cable Coaxial </font></h2>"
                + "<p>"
                + "Esta constituido por un hilo principal de cobre, cubierta por una capa plástica <br>"
                + "rodeada por una película reflejante que reduce las interferencias, alrededor de ella<br>"
                + "existe una malla de hilos metalícos y todo esto esta cubierto por una capa de hule<br>"
                + "que protege a los conductores de la intemperie.<br>"
                + "</p><br><br><br><br>"
                + "</body>"
                + "</html>";
        
        String Pagina2 = "<html>"
                + "<body>"
                + "<h1 align = center><FONT SIZE=9><b>Redes de Computadoras</b></font></h1>"
                + "<h2><FONT SIZE=6><b>2 . Cable Par Trenzado</b></font></h2>"
                + "<p>"
                + "Se utiliza para la conexión de <strong>Redes</strong>, es el que tiene 4 para de cables; <br>"
                + "pero existen 3 variaciones con esta característica y pueden utilizarse para comunicarse<br>"
                + "los nodos de una <strong>Red</strong> y son los siguientes.<br>"
                + "</p>"
                + "<ol>"
                + "<li>UTP (Unshuielded Twisted Pair / Par trenzado no Apantallado)</li>"
                + "<li>STP (Shielded Twisted Pair/ Par trenzado Apantallado)</li>"
                + "<li>FTP (Foiled Twisted Pair / Par trenzado con Pantalla Global)</li>"
                + "</ol>"
                + "<h2><FONT SIZE=6><b>1 . UTP (Par trenzado no Apantallado)</b></font></h2>"
                + "<p>"
                + "Es la variable que es mas utilizada para la conexión de <strong>Red</strong> por su bajo costo,<br>"
                + "porque permite maniobrar sin problemas y porque no requiere de herramientas<br>"
                + "especiales ni complicadas para la conexión de nodos en una <strong>Red</strong>.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6>2 . STP (Par trenzado Apantallado)</font></h2>"
                + "<p>"
                + "Tiene una malla metálica que cubre cada uno de los pares de los cables, que además<br>"
                + "están cubiertos por una película reflejante que evita las interferencias.<br>"
                + "El inconveniente esta, en que es un cable robusto y caro y dificil de instalar.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6>3 . FTP (Par trenzado con Pantalla Global)</font></h2>"
                + "<p>"
                + "Tiene una película reflejante que cubre cada uno de los pares de cables dispone<br>"
                + "de una apantalla global para mejorar su nivel de protección ante interferancias <br>"
                + "externas.<br>"
                + "</p><br><br><br><br><br>"
                + "</body>"
                + "</html>";
        
        String Pagina3 = "<html><body> cambiaste de pagina 3</body></html>";
        String Pagina4 = "<html><body> cambiaste de pagina 4</body></html>";

        Contenido_Protocolos_Tema1 = new ArrayList<>();
        Contenido_Protocolos_Tema1.add(Pagina0);
        Contenido_Protocolos_Tema1.add(Pagina1);
        Contenido_Protocolos_Tema1.add(Pagina2);
        Contenido_Protocolos_Tema1.add(Pagina3);
        Contenido_Protocolos_Tema1.add(Pagina4);

        return Contenido_Protocolos_Tema1;
    }

    public ArrayList getContenidoHTMLTema1() {
        String Pagina0 = "<html><body> cambiaste de pagina 0 html</body></html>";
        String Pagina1 = "<html><body> cambiaste de pagina 1 html</body></html>";
        String Pagina2 = "<html><body> cambiaste de pagina 2 html </body></html>";
        String Pagina3 = "<html><body> cambiaste de pagina 3 html</body></html>";
        String Pagina4 = "<html><body> cambiaste de pagina 4 html</body></html>";
        String Pagina5 = "<html><body> cambiaste de pagina 5 html</body></html>";

        Contenido_HTML_Tema1 = new ArrayList<>();
        Contenido_HTML_Tema1.add(Pagina0);
        Contenido_HTML_Tema1.add(Pagina1);
        Contenido_HTML_Tema1.add(Pagina2);
        Contenido_HTML_Tema1.add(Pagina3);
        Contenido_HTML_Tema1.add(Pagina4);
        Contenido_HTML_Tema1.add(Pagina5);

        return Contenido_HTML_Tema1;
    }
}