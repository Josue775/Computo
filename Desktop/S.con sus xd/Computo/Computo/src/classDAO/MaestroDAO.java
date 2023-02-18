package classDAO;
import ConexionBD.Conexion;
import classVO.MaestrosVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class MaestroDAO extends MaestrosVO{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public MaestroDAO() {
        CON = Conexion.getInstacia();
    }
    public void insertar(String ID_Docente,String Grado_Grupo, String Nombre,String Direccion ,String RFC ,String Usuario,String Contrasena ){
        try{
            Connection Conexion = CON.conectar();
            java.sql.Statement st=Conexion.createStatement();
            String sql = "insert into docente values('"+ID_Docente+"','"+Grado_Grupo+"','"+Nombre+"','"+Direccion+"','"+RFC+"','"+Usuario+"','"+Contrasena+"')";
            st.execute(sql);
            Conexion.close();
            JOptionPane.showMessageDialog(null, "Maestro registrado.");
        }catch(Exception e){
            System.out.println("Error al insertar");
        }
    }
    public boolean validar(String sql) {
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
    public void actualizar(String Grado_Grupo, String Nombre,String Direccion ,String RFC ,String Usuario,String Contrasena,String ID_Docente) {
        try {
            Connection Conexion = CON.conectar();
            java.sql.Statement st=Conexion.createStatement();
            String sql = "update docente set grado_grupo='" + Grado_Grupo + "',nombre='" + Nombre + "',direccion='" + Direccion + "',rfc='"+RFC+"',usuario='"+Usuario+"',contrasena='"+Contrasena+"' where id_docente='" +ID_Docente+ "'; ";
            st.executeUpdate(sql);
            st.close();
            Conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void eliminar(String ID_Docente){
        try {
            Connection Conexion = CON.conectar();
            java.sql.Statement st=Conexion.createStatement();
            String sql="delete from docente where id_docente='"+ID_Docente+"'; ";
            st.executeUpdate(sql);
            st.close();
            Conexion.close();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente","Eliminado",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro "+ e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void listarD(JComboBox prueba){
        String sql = "select grado_grupo from grupo";
        try{
            Connection Conexion = CON.conectar();
            java.sql.Statement st=Conexion.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while(rs.next()){
                prueba.addItem(rs.getString("grado_grupo"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    
    
}
