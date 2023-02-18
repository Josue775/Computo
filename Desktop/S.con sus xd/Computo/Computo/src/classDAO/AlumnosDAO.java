package classDAO;
import ConexionBD.Conexion;
import classVO.AlumnosVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author HORACIO JOSUE MARROQUIN HERRERA
 */
public class AlumnosDAO {
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public AlumnosDAO() {
        CON = Conexion.getInstacia();
    }
    public void insertarA(String id_alumno,String grado_grupo, String nombre,String direccion ,String telefono ){
        try{
            Connection Conexion = CON.conectar();
            java.sql.Statement st=Conexion.createStatement();
            String sql = "insert into alumnos values('"+id_alumno+"','"+grado_grupo+"','"+nombre+"','"+direccion+"','"+telefono+"')";
            st.execute(sql);
            Conexion.close();
            JOptionPane.showMessageDialog(null, "Alumno registrado.");
        }catch(Exception e){
            System.out.println("Error al insertar");
        }
    }
    public void actualizarA(String grado_grupo, String nombre, String direccion,String telefono, String id_alumno) {
        try {
            Connection Conexion = CON.conectar();
            java.sql.Statement st=Conexion.createStatement();
            String sql = "update alumnos set grado_grupo='"+grado_grupo+"',nombre='"+nombre+"',direccion ='"+direccion+"',telefono='"+telefono+"' where id_alumno='"+id_alumno+"';";
            st.executeUpdate(sql);
            st.close();
            Conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void eliminarA(String id_alumno){
        try {
            Connection Conexion = CON.conectar();
            java.sql.Statement st=Conexion.createStatement();
            String sql="delete from alumnos where id_alumno='"+id_alumno+"'; ";
            st.executeUpdate(sql);
            st.close();
            Conexion.close();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente","Eliminado",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro "+ e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean validarA(String sql) {
   
        try {
            ps=CON.conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Consultado..." + e);
            return false;
        }
    }
}
