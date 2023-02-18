package ConexionBD;

import static java.awt.PageAttributes.MediaType.D;
import classVO.GrupoVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CCP
 */
public class crudsql extends Conexion {
    java.sql.Statement st;
    ResultSet rs;
    GrupoVO grup = new GrupoVO();
    
    public void insertar(String horario, String Nivel, String Grado_Grupo) {
        try {
            Connection Conexion = conectar();
            st = Conexion.createStatement();
            String sql = "insert into grupo values('" + horario + "','" + Grado_Grupo + "','" + Nivel + "')";
            st.execute(sql);
            Conexion.close();
            JOptionPane.showMessageDialog(null, "HORARIO GUARDADO CORRECTAMENTE");
        } catch (Exception e) {
            System.out.println("Error al insertar");
        }
    }
    public DefaultTableModel mostrar1()
    {
        String []  nombresColumnas = {"grado_grupo","horario","nivel"};
        String [] registros = new String[3];
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        String sql = "SELECT * FROM grupo ";
        
        try
        {
            Connection Conexion = conectar();
            st = Conexion.createStatement();                       
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                registros[0] = rs.getString("grado_grupo");
                registros[1] = rs.getString("horario");
                registros[2] = rs.getString("nivel");
                modelo.addRow(registros);
                
            }
            st.execute(sql);
            Conexion.close();    
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar");  
        }
            
         return modelo;
    }
    
    //Administrador yaaa = new Administrador();
    
    public void listargrado(JComboBox gradox){
        String sql = "select grado_grupo from grupo";
        try{
            Connection Conexion = conectar();
            java.sql.Statement st=Conexion.prepareStatement(sql);
            rs = st.executeQuery(sql);
            gradox.removeAllItems();
            while(rs.next()){
                gradox.addItem(rs.getString("grado_grupo"));
            }
            Conexion.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    
    
    
    
    
    
    
    /*public void Mostrar(String Grado_Grupo) {
        
        try {
            Connection Conexion = conectar();
            st = Conexion.createStatement();
            String sql = "select * from grupo where grado_grupo='"+Grado_Grupo+"'";
            rs=st.executeQuery(sql);
            if(rs.next()){
                grup.setGrado_Grupo(rs.getString("grado_grupo"));
                grup.setHorario(rs.getString("horario"));
                grup.setNivel(rs.getString("nivel"));
            }else{
                grup.setGrado_Grupo("");
                grup.setHorario("");
                grup.setNivel("");
                JOptionPane.showMessageDialog(null, "No se encontraron datos.");
            }
            st.close();;
            Conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRR EN EL SISTEM DE BUSQUEDA!.");
        }
    }*/

}
