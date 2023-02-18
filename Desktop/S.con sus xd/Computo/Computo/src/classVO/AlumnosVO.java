package classVO;

/**
 *
 * @author HORACIO JOSUE MARROQUIN HERRERA
 */
public class AlumnosVO {
    private String id_alumno;
    private String grado_grupo;
    private String nombre;
    private String direccion;
    private String telefono;

    public AlumnosVO() {
    }

    public AlumnosVO(String id_alumno, String grado_grupo, String nombre, String direccion, String telefono) {
        this.id_alumno = id_alumno;
        this.grado_grupo = grado_grupo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * @return the id_alumno
     */
    public String getId_alumno() {
        return id_alumno;
    }

    /**
     * @param id_alumno the id_alumno to set
     */
    public void setId_alumno(String id_alumno) {
        this.id_alumno = id_alumno;
    }

    /**
     * @return the grado_grupo
     */
    public String getGrado_grupo() {
        return grado_grupo;
    }

    /**
     * @param grado_grupo the grado_grupo to set
     */
    public void setGrado_grupo(String grado_grupo) {
        this.grado_grupo = grado_grupo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    

   
    
    
}
