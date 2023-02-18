package classDAO;

import ConexionBD.Conexion;
import classVO.LoginVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * @author Horacio Josue Marroquin Herrera
 */
public class LoginDAO extends LoginVO{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public LoginDAO() {
        CON = Conexion.getInstacia();
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
    
    
}
