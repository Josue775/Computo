package ConexionBD;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection conex;
    Statement stmt = null;
    public boolean b;
    private Connection conn;
    public static Conexion instancia;
    private PreparedStatement ps;

    Conexion() {

        this.conn = null;
    }

    
    /*public Conexion() {
     try {
     // Creando un objeto para el driver JDBC
     Class.forName("org.postgresql.Driver");
     // Efectuando la conexion: donde estÃ¡ la BD NombreBD Usuario Password
     conex =DriverManager.getConnection("jdbc:postgresql://localhost/computo","postgres","CCP");
     System.out.println("Conectando a la BDD...");
     stmt = conex.createStatement();
     b = true;
     } catch (Exception e ){
     System.out.println("Error al Conectarse :-(" + e.getMessage() );
     b = false;
     }finally{
     System.out.println("BDD Conectada ;-)");
     }
     }*/

    public Connection conectar() {

        try {

            Class.forName("org.postgresql.Driver");

            this.conex = DriverManager.getConnection("jdbc:postgresql://localhost/computo", "postgres", "12345");

        } catch (ClassNotFoundException | SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);

        }
        return this.conex;

    }
    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    public synchronized static Conexion getInstacia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
    public void desconectar() {
        try {
            this.conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    /*public Statement getConexion() {
        return stmt;
    }

    public Connection getConnection() {
        return conex;
    }
    */
    

}
