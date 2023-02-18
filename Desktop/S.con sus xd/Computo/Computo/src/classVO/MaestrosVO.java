package classVO;

public class MaestrosVO {
    private String ID_Docente;
    private String Grado_Grupo;
    private String Nombre;
    private String Direccion;
    private String RFC;
    private String Usuario;
    private String Contrasena;

    public MaestrosVO() {
    }

    public MaestrosVO(String ID_Docente, String Grado_Grupo, String Nombre, String Direccion, String RFC, String Usuario, String Contrasena) {
        this.ID_Docente = ID_Docente;
        this.Grado_Grupo = Grado_Grupo;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.RFC = RFC;
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
    }
    
    public String getID_Docente() {
        return ID_Docente;
    }

    public void setID_Docente(String ID_Docente) {
        this.ID_Docente = ID_Docente;
    }

    public String getGrado_Grupo() {
        return Grado_Grupo;
    }

    public void setGrado_Grupo(String Grado_Grupo) {
        this.Grado_Grupo = Grado_Grupo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
}
