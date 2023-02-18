package classVO;

/**
 *
 * @author CCP
 */
public class LoginVO {
    private String usuario;
    private String clave;

    public LoginVO() {
    }

    public LoginVO(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    
    
    
}
